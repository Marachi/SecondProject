package components;

import mvc.View;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Potaychuk Sviatoslav on 13.06.2016.
 */
public class Element implements LectureElement, Comparable {

    /**
     * Text of element
     */
    private String value;

    /**
     * Type of element
     */
    private Type type;

    /**
     * Constructor
     * @param element
     */
    Element(String element, Type type) {
        value = element;
        this.type=type;
    }

    /**
     * This method returns ratio of no vowels to vowels symbols in word of element
     * @param element
     * @return ratio
     */
    private static double ratioVowels(Element element){
        int vowelsCount =0;
        Matcher m = Pattern.compile(View.VOWELS_SYMBOLS).matcher(element.value);
        while (m.find()){
            ++vowelsCount;
        }
        return (double)vowelsCount/element.value.length();
    }

    //setters & getters
    public String getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        Element e = (Element) o;
        return (int) Math.signum(ratioVowels(e)-ratioVowels(this));
    }
    @Override
    public String toString() {
        return value;
    }
    @Override
    public int hashCode() {
        return value.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return this == obj || !(obj == null || getClass() != obj.getClass()) && this.value.equals(((Element) obj).getValue());

    }

    @Override
    public void printToConsol() {
        System.out.println(value);
    }
}
