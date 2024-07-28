package rocks.zipcode;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class StackTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Big Mac");
        // assertEquals(false, stack.isEmpty());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void stackPopTest() {
        Stack<String> stack = new Stack<>();
        Stack<String> expected = new Stack<>();
        expected.push("Big");
        stack.push("Big");
        stack.push("Mac");
        stack.pop();

        assertEquals(expected, stack);
    }

    @Test
    public void pushStackTest() {
        Stack<String> stack = new Stack<>();
        Stack<String> expected = new Stack<>();
        Stack<String> diffrent = new Stack<>();
        diffrent.push("Big");
        expected.push("Mac");
        stack.push("Mac");

        assertEquals(expected, stack);
        //assertFalse(expected == diffrent);
        assertNotSame(expected, diffrent);
    }

    @Test
    public void peekStackTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Fries");

        assertEquals("Fries", stack.peek());
    }
}
