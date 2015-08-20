package bester;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BesterTest {

    private Cookie cookie1;
    private Cookie cookie2;
    private Cookie cookie3;
    private Bester bester;

    @Before
    public void setUp() {
        cookie1 = new Cookie(10);
        cookie2 = new Cookie(15);
        cookie3 = new Cookie(20);
        bester = new Bester();

    }
    @Test
    public void shouldReturnTheBesterCookie() {
        List<Cookie> list = new ArrayList<Cookie>();
        list.add(cookie1);
        list.add(cookie2);
        list.add(cookie3);

        assertEquals(cookie3, bester.isBest(list));
    }

}
