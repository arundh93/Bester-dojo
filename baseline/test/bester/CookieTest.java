package bester;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CookieTest {


    @Test
    public void shouldCookie1IsBetterThanCookie2() {
        Cookie cookie1 = new Cookie(5);
        Cookie cookie2 = new Cookie(10);
        assertTrue(cookie2.isBetter(cookie1));
    }

    @Test
    public void shouldCookie1IsNotBetterThanCookie2() {
        Cookie cookie1  = new Cookie(15);
        Cookie cookie2 = new Cookie(10);

        assertFalse(cookie2.isBetter(cookie1));
    }


}
