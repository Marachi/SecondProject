package components;

/**
 * Created by Potaychuk Sviatoslav on 13.06.2016.
 */
public interface LectureElement{

    /**
     * This method will be realized by heirs
     * This method prints inner value
     */
    void printToConsol();


    /**
     * It's enum of types elements
     */
    enum Type{SENTENCE, WORD, SYMBOL }
}
