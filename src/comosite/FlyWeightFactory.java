package comosite;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by potaychuk on 14.06.2016.
 */
public class FlyWeightFactory<E> {
   Map<E, LectureElement> map = new HashMap<E, LectureElement>();

    LectureElement create(E element) {
       if(map.containsKey(element)){
           return  map.get(element);
       }else {
           LectureElement ne = new Element(element);
           map.put(element, ne);
           return ne;
       }
   }
}
