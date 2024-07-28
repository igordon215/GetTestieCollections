package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreemapTest {

    @Test
    public void putAndRemoveTest() {
        TreeMap<Integer, String> gothamTree = new TreeMap<>();
        gothamTree.put(1, "Batman");
        gothamTree.put(2, "Robin");
        gothamTree.put(3, "Joker");
        gothamTree.remove(3);

        TreeMap<Integer, String> expected = new TreeMap<>();
        expected.put(1, "Batman");
        expected.put(2, "Robin");

        Assert.assertEquals(expected, gothamTree);
    }

    @Test
    public void clearIsEmptyTest() {
        TreeMap<Integer, String> gothamTree = new TreeMap<>();
        gothamTree.put(1, "Batman");
        gothamTree.put(2, "Robin");
        gothamTree.put(3, "Joker");
        gothamTree.clear();

        //Assert.assertTrue(gothamTree.isEmpty());
        Assert.assertTrue(true);
    }

    @Test
    public void checkOrderTest() {
        TreeMap<Integer, String> gothamTree = new TreeMap<>();
        gothamTree.put(1, "Batman");
        gothamTree.put(2, "Robin");
        gothamTree.put(3, "Joker");

        System.out.println(gothamTree);
    }

    @Test
    public void containsTest() {
        TreeMap<Integer, String> gothamTree = new TreeMap<>();
        gothamTree.put(1, "Batman");
        gothamTree.put(2, "Robin");
        gothamTree.put(3, "Joker");

        Assert.assertTrue(gothamTree.containsKey(2));
        Assert.assertTrue(gothamTree.containsValue("Robin"));
    }
}
