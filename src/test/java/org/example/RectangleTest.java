package org.example;// RectangleTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testCalculateAreaPositiveValues() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50, rectangle.calculateArea(), "Area should be 50 for length 5 and width 10.");
    }

    @Test
    void testCalculatePerimeterPositiveValues() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(30, rectangle.calculatePerimeter(), "Perimeter should be 30 for length 5 and width 10.");
    }

    @Test
    void testGetLength() {
        Rectangle rectangle = new Rectangle(8, 15);
        assertEquals(8, rectangle.getLength(), "Length should be 8.");
    }

    @Test
    void testGetWidth() {
        Rectangle rectangle = new Rectangle(8, 15);
        assertEquals(15, rectangle.getWidth(), "Width should be 15.");
    }

    @Test
    void testNegativeLengthThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, 10));
        assertEquals("Length and width must be positive numbers.", exception.getMessage());
    }

    @Test
    void testNegativeWidthThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, -10));
        assertEquals("Length and width must be positive numbers.", exception.getMessage());
    }
    // Failing test
    @Test
    void testCalculateAreaWithIncorrectExpectedValue() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(45, rectangle.calculateArea(), "This test is designed to fail. Expected area is intentionally incorrect.");
    }
}
