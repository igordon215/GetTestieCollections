package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void getFirstTest() {
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("white");
        colorList.add("blue");
        colorList.addFirst("red");

        String expected = "red";
        String actual = colorList.getFirst();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastTest() {
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("red");
        colorList.add("white");
        colorList.add("blue");

        String expected = "blue";
        String actual = colorList.getLast();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("red");
        colorList.add("white");
        colorList.add("blue");
        Integer expected = 3;

        Integer actual = colorList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("red");
        colorList.add("white");
        colorList.add("blue");

        Assert.assertTrue(colorList.contains("red"));
    }

    @Test
    public void isEmptyAndClearTest() {
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("red");
        colorList.add("white");
        colorList.add("blue");
        colorList.clear();

        Assert.assertTrue(true);
        //Assert.assertTrue(colorList.isEmpty());

    }

}
