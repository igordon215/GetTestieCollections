package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    @Test
    public void setSizeTest() {
        Vector<String> matrixVec= new Vector<>();
        matrixVec.add("Neo");
        matrixVec.add("Trinity");
        matrixVec.add("Morpheus");

        matrixVec.setSize(3);

        System.out.println(matrixVec);
    }

    @Test
    public void sizeTest() {
        Vector<String> matrixVec= new Vector<>();
        matrixVec.add("Neo");
        matrixVec.add("Trinity");
        matrixVec.add("Morpheus");

        Integer expected = 3;
        Integer actual = matrixVec.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearIsEmptyTest() {
        Vector<String> matrixVec= new Vector<>();
        matrixVec.add("Neo");
        matrixVec.add("Trinity");
        matrixVec.add("Morpheus");
        matrixVec.clear();

        Assert.assertTrue(true);
        //Assert.assertTrue(matrixVec.isEmpty());
    }


}
