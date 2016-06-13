package comosite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kate on 13.06.2016.
 */
public class CompositeElement implements LectureElement {
    List<LectureElement> elements = new ArrayList<>();


    @Override
    public void add(LectureElement element) {
        elements.add(element);
    }
}
