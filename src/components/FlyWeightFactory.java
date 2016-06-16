package components;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by potaychuk on 14.06.2016.
 */
public class FlyWeightFactory<E> {

    /**
     * It's a map of the elements
     */
    private Map<String, LectureElement> map = new HashMap<>();

    /**
     * This method create unique elements or returns already existed
     * @param txt is value of element
     * @return element with txt value
     */
    public LectureElement create(String txt) {
       if(map.containsKey(txt)){
           return  map.get(txt);
       }else {
           LectureElement ne = new Element(txt);
           map.put(txt, ne);
           return ne;
       }
   }


    //getters & setters
    public Map<String, LectureElement> getMap() {
        return map;
    }

    public void setMap(Map<String, LectureElement> map) {
        this.map = map;
    }
}
