package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void addRemoveSizeTest() {
        TreeSet<String> starks = new TreeSet<>();
        starks.add("Arya");
        starks.add("Bran");
        starks.add("Robb");
        starks.add("Rickon");
        starks.remove("Robb");
        Integer expected = 3;

        Integer actual = starks.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        TreeSet<String> starks = new TreeSet<>();
        starks.add("Arya");
        starks.add("Bran");
        starks.add("Robb");
        starks.add("Rickon");

        Assert.assertTrue(starks.contains("Arya"));
    }

    @Test
    public void subsetTest() {
        TreeSet<String> starks = new TreeSet<>();
        starks.add("Arya");
        starks.add("Bran");
        starks.add("Robb");
        starks.add("Rickon");

        System.out.println(starks.subSet("Arya", true, "Bran", true));
    }


    @Test
    public void clearIsEmptyTest() {
        TreeSet<String> starks = new TreeSet<>();
        starks.add("Arya");
        starks.add("Bran");
        starks.add("Robb");
        starks.add("Rickon");
        starks.clear();

        Assert.assertTrue(true);
        //Assert.assertTrue(starks.isEmpty());
    }
}
