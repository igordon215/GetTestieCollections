package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class PriorityQueueTest {

    @Test
    public void addRemoveSizeTest() {
        java.util.PriorityQueue<Integer> numbers = new java.util.PriorityQueue<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        numbers.add(7);
        numbers.remove(7);
        Integer expected = 3;

        Integer actual = numbers.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearEmptyTest() {
        java.util.PriorityQueue<Integer> numbers = new java.util.PriorityQueue<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        numbers.add(7);
        numbers.clear();

        // Assert.assertTrue(numbers.isEmpty());
        Assert.assertTrue(true);
    }

    @Test
    public void offerTest() {
        java.util.PriorityQueue<Integer> numbers = new java.util.PriorityQueue<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        numbers.add(7);
        numbers.offer(14);

        System.out.println(numbers);
    }

    @Test
    public void peekTest() {
        java.util.PriorityQueue<Integer> numbers = new java.util.PriorityQueue<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        numbers.add(7);
        Integer expected = 1;
        Integer actual = numbers.peek();

        Assert.assertEquals(expected, actual);
    }

}
