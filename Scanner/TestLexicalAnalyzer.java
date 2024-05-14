package Scanner;

import java.util.List;

import Utils.CustomException;

public class TestLexicalAnalyzer {
    public static void main(String[] args) {

      String inputFileName = "t1.txt";
      LexicalAnalyzer scanner = new LexicalAnalyzer(inputFileName);
      List<Token> tokens;
		try {
			tokens = scanner.scan();
			
	        for (Token token : tokens) {
	            System.out.println("<" + token.type + ", " + token.value + ">");
	        }
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}

      
  }
}
