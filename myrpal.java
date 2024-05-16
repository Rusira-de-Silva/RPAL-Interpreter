import Evaluator.Evaluator;

/**
 * The `myrpal` class is the entry point for the RPAL interpreter program.
 * It provides a `main` method that accepts command-line arguments and executes the interpreter.
 */
public class myrpal {
    
    /**
     * The main method is the entry point for the RPAL interpreter program.
     * It accepts command-line arguments and executes the interpreter.
     * 
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {  
        String fn;
        boolean isPrintAST=false;
        if(args.length==0){
            fn = "sample_test.txt"; 
            isPrintAST = false;
        }
        else if(args.length==2){
            fn=args[1];
            if(args[0].equalsIgnoreCase("-ast")){
                isPrintAST=true;
            }
            else{
                System.out.println("Invalid Arguments Passing!");
                return;
            }
        }
        else if(args.length==1){
            fn = args[0];
        }
        else{
            System.out.println("Invalid Arguments Passing!");
            return;
        }
        System.out.println(Evaluator.evaluvate(fn,isPrintAST));                                  
    }
}
