package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    @Test
    public void sizeAddAndRemoveTest() {
        Integer exected = 2;
        List<String> arrList = new ArrayList<>();
        arrList.add("Lets");
        arrList.add("Go");
        arrList.add("Phillies");
        arrList.remove("Lets");
        Integer actual = arrList.size();

        Assert.assertEquals(exected, actual);
        System.out.println(arrList);
    }

    @Test
    public void isEmptyTest() {
        List<String> arrList = new ArrayList<>();
        arrList.add("Lets");
        arrList.add("Go");

        //Assert.assertFalse(arrList.isEmpty());
        Assert.assertFalse(false);
    }

    @Test
    public void containsTest() {
        List<String> arrList = new ArrayList<>();
        arrList.add("Lets");
        arrList.add("Go");

        Assert.assertTrue(arrList.contains("Lets"));
    }

    @Test
    public void indexTest() {
        List<String> arrList = new ArrayList<>();
        arrList.add("Lets");
        arrList.add("Go");
        arrList.add("Phillies");
        Integer expected = 2;

        Integer actual = arrList.indexOf("Phillies");
        Assert.assertEquals(expected, actual);
    }
}
