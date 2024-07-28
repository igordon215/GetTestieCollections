package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

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

