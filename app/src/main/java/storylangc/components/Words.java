package storylangc.components;

public class Words {

  /**
   * Enum for all keywords in StoryLang.
   */
  public enum Keywords {
    // Keywords
    WHEN("when"),
    OTHERWISE("otherwise"),
    WHILE("while"),
    FOR_EVERY("for every"),
    FUNCTION("function"),
    OF("of"),
    RETURNS("returns"),
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
    BOOLEAN("boolean"),
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
    COMBINATION("combination"),
    END_COMBINATION("end-combination"),
    ARRAY("array"),
    END_ARRAY("end-array"),
    SET("set"),
    END_SET("end-set"),
    BELONGS_TO(","), // Acts like : in python
    DOT("."), // Used For Doubles
    SEMICOLON(";"),
    END_STATEMENT("!"),
    // Other
    IDENTIFIER("identifier"),
    NUMBER("number"),
    STOP("stop"); // Exit Program during Composition

    private final String name;

    private Keywords(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }

  /**
   * Enum for all reserved stages in StoryLang.<p>
   * Syntax: run stage,
   */
  public enum Stages {
    // Stages
    MAIN("main"),
    PERIODIC("periodic"),
    END("end");

    private final String name;

    private Stages(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }
}
