package bester;

import java.util.List;

public class Bester {

    public Cookie isBest(List<Cookie> list) {
        Cookie bestCookie = list.get(0);
        for (Cookie aList : list) {
            if (aList.isBetter(bestCookie)) {
                bestCookie = aList;
            }
        }
        return bestCookie;
    }
}
