package Evaluator;

import java.util.ArrayList;
import java.util.List;

import AST_Generator.AST;
import AST_Generator.ASTFactory;
import Parser.Node;
import Parser.Parser;
import Scanner.LexicalAnalyzer;
import Scanner.Token;
import Utils.CustomException;

public class Evaluator {
    public static String evaluvate(String filename, boolean isPrintAST){

	      LexicalAnalyzer scanner = new LexicalAnalyzer(filename);
	      List<Token> tokens;
	      List<Node> AST;   
			try {
				tokens = scanner.scan();
				if(tokens.isEmpty()){
					System.out.println("Empty PROGRAM!!!!!!!!");
					return "";
				}
				Parser parser = new Parser(tokens);
				AST=parser.parse();
				
				ArrayList<String> stringAST = parser.convertAST_toStringAST();
				if(isPrintAST){
					for(String string: stringAST){ 
						System.out.println(string);
					}
					return "";
				}

				ASTFactory astf =new  ASTFactory();      
		        AST ast = astf.getAbstractSyntaxTree(stringAST);  
		        
		        ast.standardize();;
				
		        CSEMachineFactory csemfac = new CSEMachineFactory(); 
		        CSEMachine csemachine = csemfac.getCSEMachine(ast);   
		       return csemachine.getAnswer();
			} catch (CustomException e) {
				System.out.println(e.getMessage());
			}

        return null;

    

    }
}
