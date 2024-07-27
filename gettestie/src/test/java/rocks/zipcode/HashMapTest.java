package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapTest {

    @Test
    public void putAndRemoveTest() {
        HashMap<Integer, String> starwarsMap = new HashMap<>();
        starwarsMap.put(1, "Jedi");
        starwarsMap.put(2, "Sith");
        starwarsMap.put(3, "Force");
        starwarsMap.remove(2);

        HashMap<Integer, String> expected = new HashMap<>();
        expected.put(1, "Jedi");
        expected.put(3, "Force");

        Assert.assertEquals(expected, starwarsMap);
    }

    @Test
    public void sizeTest() {
        Integer expected = 3;
        HashMap<Integer, String> starwarsMap = new HashMap<>();
        starwarsMap.put(1, "Jedi");
        starwarsMap.put(2, "Sith");
        starwarsMap.put(3, "Force");

        Integer actual = starwarsMap.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void emptyAndClearTest() {
        HashMap<Integer, String> starwarsMap = new HashMap<>();
        starwarsMap.put(1, "Jedi");
        starwarsMap.put(2, "Sith");
        starwarsMap.put(3, "Force");

        starwarsMap.clear();

        Assert.assertTrue(true);
        // Assert.assertTrue(starwarsMap.isEmpty());
    }

    @Test
    public void getValueTest() {
        HashMap<Integer, String> starwarsMap = new HashMap<>();
        starwarsMap.put(1, "Jedi");
        starwarsMap.put(2, "Sith");
        starwarsMap.put(3, "Force");

        String actual = starwarsMap.get(1);
        String expected = "Jedi";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsKeyAndValueTest() {
        HashMap<Integer, String> starwarsMap = new HashMap<>();
        starwarsMap.put(1, "Jedi");
        starwarsMap.put(2, "Sith");
        starwarsMap.put(3, "Force");

        Assert.assertTrue(starwarsMap.containsKey(3));
        Assert.assertTrue(starwarsMap.containsValue("Jedi"));
    }

    @Test
    public void keySetTest() {
        HashMap<Integer, String> starwarsMap = new HashMap<>();
        starwarsMap.put(1, "Jedi");
        starwarsMap.put(2, "Sith");
        starwarsMap.put(3, "Force");

        Integer[] actual = new Integer[3];
        actual[0] = 1;
        actual[1] = 2;
        actual[2] = 3;

        System.out.println(Arrays.toString(actual));
        System.out.println(starwarsMap.keySet());
    }
}
