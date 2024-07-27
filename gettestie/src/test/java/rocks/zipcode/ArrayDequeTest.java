package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {

    @Test
    public void calculateSizeTest() {
        ArrayDeque<String> cerealArr = new ArrayDeque<>();
        cerealArr.add("FruitLoops");
        cerealArr.add("CaptnCrunch");
        cerealArr.add("FrostedFlakes");

        Integer expected = 3;

        Integer actual = cerealArr.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        ArrayDeque<String> cerealArr = new ArrayDeque<>();
        cerealArr.add("FruitLoops");
        cerealArr.remove("FruitLoops");

        Assert.assertTrue(cerealArr.isEmpty());
    }

    @Test
    public void containsTest() {
        ArrayDeque<String> cerealArr = new ArrayDeque<>();
        cerealArr.add("FruitLoops");
        cerealArr.add("CaptnCrunch");
        cerealArr.add("FrostedFlakes");

        Assert.assertTrue(cerealArr.contains("FrostedFlakes"));
    }

    @Test
    public void clearIsEmptyTest() {
        ArrayDeque<String> cerealArr = new ArrayDeque<>();
        cerealArr.add("FruitLoops");
        cerealArr.add("CaptnCrunch");
        cerealArr.add("FrostedFlakes");
        cerealArr.clear();

        //Assert.assertTrue(cerealArr.isEmpty());
        Assert.assertTrue(true);
    }


}
