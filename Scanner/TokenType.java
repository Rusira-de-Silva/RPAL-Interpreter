package Scanner;

/**
 * Represents the different types of tokens in the RPAL interpreter.
 * The TokenType enum defines the following token types:
 * - KEYWORD: Represents a keyword token.
 * - IDENTIFIER: Represents an identifier token.
 * - INTEGER: Represents an integer token.
 * - OPERATOR: Represents an operator token.
 * - STRING: Represents a string token.
 * - PUNCTUATION: Represents a punctuation token.
 * - DELETE: Represents a delete token.
 * - EndOfTokens: Represents the end of tokens.
 */
public enum TokenType {
	KEYWORD,
    IDENTIFIER,
    INTEGER,
    OPERATOR,
    STRING,
    PUNCTUATION,
    DELETE,
    EndOfTokens
}