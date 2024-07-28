package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    @Test
    public void iteratorTest() {
        ArrayList<String> starks = new ArrayList<>();
        starks.add("Arya");
        starks.add("Bran");
        starks.add("Robb");
        starks.add("Rickon");
        starks.add("Sansa");

        Iterator itr = starks.iterator();

        while (itr.hasNext()) {
            String stark = (String) itr.next();
            System.out.println(stark);
        }
    }

}
