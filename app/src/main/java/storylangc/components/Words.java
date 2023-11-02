package storylangc.components;

public class Words {

  /**
   * Enum for all keywords in StoryLang.
   */
  public enum Keyword {
    // Keywords
    WHEN("when"),
    OTHERWISE("otherwise"),
    WHILE("while"),
    FOR("for"),
    FUNCTION("function"),
    GIVE("give"),
    BREAK("break"),
    CONTINUE("continue"),
    TRUE("true"),
    FALSE("false"),
    NULL("null"),
    VOID("void"),
    // Types
    INTEGER("integer"),
    DOUBLE("double"),
    STRING("string"),
    BOOL("bool"),
    // Operators
    PLUS("plus"),
    MINUS("minus"),
    MULTIPLY("times"),
    DIVIDE("divided by"),
    MODULO("modulo"),
    ASSIGN("assign"),
    EQUAL("is equal to"),
    NOT_EQUAL("is not equal to"),
    GREATER_THAN("is greater than"),
    LESS_THAN("is less than"),
    GREATER_THAN_OR_EQUAL("is less than or equal to"),
    LESS_THAN_OR_EQUAL("is less than or equal to"),
    AND("and"),
    OR("or"),
    // Symbols
    LEFT_PARENTHESIS("("),
    RIGHT_PARENTHESIS(")"),
    LEFT_BRACE("{"),
    RIGHT_BRACE("}"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    BELONGS_TO(","),
    DOT("."),
    SEMICOLON(";"),
    END_STATEMENT("!"),
    // Other
    IDENTIFIER("identifier"),
    NUMBER("number"),
    STOP("stop");

    private final String name;

    private Keyword(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }

  /**
   * Enum for all reserved stages in StoryLang.
   */
  public enum Stage {
    // Stages
    MAIN("main"),
    END("end");

    private final String name;

    private Stage(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }
}
