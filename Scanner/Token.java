package Scanner;

/**
 * Represents a token in the RPAL interpreter.
 */
public class Token {
    public TokenType type;
    public String value;

    /**
     * Constructs a new Token object with the specified type and value.
     * 
     * @param type  the type of the token
     * @param value the value of the token
     */
    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }
}