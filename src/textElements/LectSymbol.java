package textElements;

/**
 * Created by potaychuk on 13.06.2016.
 */
public class LectSymbol {

    private char value;
    private Type type;

    enum Type{
        RU_TEXT, EN_TEXT, MATH_SYMBOL, SPACE, NUMBER;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }
}
