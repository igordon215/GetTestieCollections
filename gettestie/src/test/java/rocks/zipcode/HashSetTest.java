package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    @Test
    public void hashSetSizeAndAddTest() {
        Integer expected = 2;
        Set<String> set = new HashSet<>();
        set.add("firefox");
        set.add("chrome");

        Integer actual = set.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hashSetContainsTest() {
        Set<String> set = new HashSet<>();
        set.add("firefox");

        Assert.assertTrue(set.contains("firefox"));
    }

    @Test
    public void hashSetRemoveTest() {
        Set<String> set = new HashSet<>();
        Set<String> compare = new HashSet<>();
        compare.add("firefox");
        set.add("chrome");
        set.add("firefox");
        set.remove("chrome");

        Assert.assertEquals(compare, set);
    }

    @Test
    public void hashSetClearTest() {
        Set<String> set = new HashSet<>();
        set.add("firefox");
        set.add("chrome");
        set.clear();

        Assert.assertTrue(set.isEmpty());
    }
}
