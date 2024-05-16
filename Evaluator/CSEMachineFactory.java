/**
 * The Evaluator package contains classes related to the evaluation of RPAL expressions.
 */
package Evaluator;

import java.util.ArrayList;

import AST_Generator.AST;
import AST_Generator.Node;
import Lambda.*;

/**
 * The CSEMachineFactory class is responsible for creating instances of the CSEMachine class
 * and providing methods to generate the control, stack, and environment for the CSEMachine.
 * It also contains methods to convert AST nodes into symbols used by the CSEMachine.
 */
public class CSEMachineFactory {
    private E e0 = new E(0);
    private int i = 1;
    private int j = 0;
    
    public CSEMachineFactory() {
        
    }
    
    /**
     * The `Symbol` class represents a symbol in the RPAL language.
     * It is used to represent different types of symbols such as unary operators, binary operators,
     * special symbols like gamma and tau, identifiers, integers, strings, tuples, booleans, and errors.
     * Each symbol has a specific meaning and behavior in the RPAL interpreter.
     */
    public Symbol getSymbol(Node node) {
        switch (node.getData()) {
            case "not": 
            case "neg":
                return new Uop(node.getData());
            case "+": 
            case "-": 
            case "*": 
            case "/": 
            case "**":
            case "&":
            case "or": 
            case "eq": 
            case "ne": 
            case "ls": 
            case "le": 
            case "gr": 
            case "ge":              
            case "aug":
                return new Bop(node.getData());
            case "gamma":
                return new Gamma();
            case "tau":
                return new Tau(node.children.size());
            case "<Y*>": 
                return new Ystar();
            default:
                if (node.getData().startsWith("<ID:")) { 
                    return new Id(node.getData().substring(4, node.getData().length()-1));
                } else if (node.getData().startsWith("<INT:")) {                    
                    return new Int(node.getData().substring(5, node.getData().length()-1));
                } else if (node.getData().startsWith("<STR:")) {                    
                    return new Str(node.getData().substring(6, node.getData().length()-2));
                } else if (node.getData().startsWith("<nil")) {                    
                    return new Tup();
                } else if (node.getData().startsWith("<true>")) {                    
                    return new Bool("true");
                } else if (node.getData().startsWith("<false>")) {                    
                    return new Bool("false");
                } else if (node.getData().startsWith("<dummy>")) {                    
                    return new Dummy();
                } else {
                    System.out.println("Err node: "+node.getData());
                    return new Err();
                }          
        }
    }
    
    public B getB(Node node) {
        B b = new B();
        b.symbols = this.getPreOrderTraverse(node);
        return b;
    }
    
    /**
     * Represents a lambda function.
     */
    public Lambda getLambda(Node node) {
        Lambda lambda = new Lambda(this.i++);
        lambda.setDelta(this.getDelta(node.children.get(1)));
        if (",".equals(node.children.get(0).getData())) {
            for (Node identifier: node.children.get(0).children) {
                lambda.identifiers.add(new Id(identifier.getData().substring(4, node.getData().length()-1)));
            }
        } else {
            lambda.identifiers.add(new Id(node.children.get(0).getData().substring(4, node.children.get(0).getData().length()-1)));
        }
        return lambda;
    }
    
    /**
     * Returns an ArrayList of symbols obtained by performing a pre-order traversal on the given node.
     * If the node's data is "lambda", it adds the lambda symbol to the list.
     * If the node's data is "->", it adds the delta symbol, beta symbol, and the B symbol to the list.
     * Otherwise, it adds the symbol obtained from the node's data to the list and recursively performs a pre-order traversal on its children.
     *
     * @param node the node to perform the pre-order traversal on
     * @return an ArrayList of symbols obtained from the pre-order traversal
     */
    private ArrayList<Symbol> getPreOrderTraverse(Node node) {
        ArrayList<Symbol> symbols = new ArrayList<Symbol>();
        if ("lambda".equals(node.getData())) {
            symbols.add(this.getLambda(node));
        } else if ("->".equals(node.getData())) {
            symbols.add(this.getDelta(node.children.get(1)));
            symbols.add(this.getDelta(node.children.get(2)));
            symbols.add(new Beta());
            symbols.add(this.getB(node.children.get(0)));
        } else {
            symbols.add(this.getSymbol(node));
            for (Node child: node.children) {
                symbols.addAll(this.getPreOrderTraverse(child));
            }
        }
        return symbols;
    }
    
    /**
     * Represents a delta object that stores the symbols obtained from a pre-order traversal of a given node.
     */
    public Delta getDelta(Node node) {
        Delta delta = new Delta(this.j++);
        delta.symbols = this.getPreOrderTraverse(node);
        return delta;        
    }
    
    /**
     * Returns the control list for the given AST.
     *
     * @param ast The Abstract Syntax Tree representing the program.
     * @return The control list as an ArrayList of Symbol objects.
     */
    public ArrayList<Symbol> getControl(AST ast) {
        ArrayList<Symbol> control = new ArrayList<Symbol>();
        control.add(this.e0);
        control.add(this.getDelta(ast.getRoot()));
        return control;
    }
    
    /**
     * Returns the stack of symbols.
     *
     * @return the stack of symbols
     */
    public ArrayList<Symbol> getStack() {
        ArrayList<Symbol> stack = new ArrayList<Symbol>();
        stack.add(this.e0);
        return stack;
    }
    
    /**
     * Returns the environment of the CSE machine.
     * The environment is represented as an ArrayList of type E.
     * 
     * @return the environment of the CSE machine
     */
    public ArrayList<E> getEnvironment() {
        ArrayList<E> environment = new ArrayList<E>();
        environment.add(this.e0);
        return environment;
    }
    
    /**
     * Represents a CSEMachine, which is responsible for evaluating an Abstract Syntax Tree (AST)
     * using the Control-Stack-Environment (CSE) machine model.
     */
    public CSEMachine getCSEMachine(AST ast) {        
        return new CSEMachine(this.getControl(ast), this.getStack(), this.getEnvironment());
    }
}
