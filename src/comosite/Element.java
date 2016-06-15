package comosite;

/**
 * Created by Kate on 13.06.2016.
 */
public class Element implements LectureElement{
    static int counter= 0;

    private String value;
    private int id;

    public Element(String element) {
        counter++;
        id = counter;
        value = element;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void add(LectureElement element) {

    }

    @Override
    public String toString() {
        return value+" id = "+id;
    }
}
