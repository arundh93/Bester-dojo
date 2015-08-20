package bester;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void areaShouldBeEqualToLengthyMultipliedByBreadth() throws Exception {
        assertEquals(6.0, new Rectangle(2, 3).area());
        assertEquals(0.0, new Rectangle(0, 1).area());
        assertEquals(3.75, new Rectangle(1.5, 2.5).area());
    }

    @Test
    public void shouldTheAreaOfRectangle1IsBetterThanRectangle() {
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle = new Rectangle(2, 4);

        assertEquals(true, rectangle.isBesterThan(rectangle1));
    }

    @Test
    public void shouldNotTheAreaOfRectangle1IsBetterThanRectangle() {
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle = new Rectangle(2, 4);

        assertEquals(false, rectangle1.isBesterThan(rectangle));
    }
}
