package comosite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kate on 13.06.2016.
 */
public class CompositeElement implements LectureElement {

    /**
     * It's list of elements.
     */
    private List<LectureElement> elements = new ArrayList<>();


    //getters & setters
    public List<LectureElement> getElements() {
        return elements;
    }

    public void setElements(List<LectureElement> elements) {
        this.elements = elements;
    }

    /**
     * This method adds an element for realising composite
     * @param le is element witch will be added
     */
    public void add(LectureElement le) {
        elements.add(le);
    }

    /**
     * This method removes an element from list
     * @param le is element witch will be removed
     */
    public void remove(LectureElement le) {
        elements.remove(le);
    }

}
