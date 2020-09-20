import fr.alasdiablo.lib.tuple.Couple;
import fr.alasdiablo.lib.tuple.Quadruple;
import fr.alasdiablo.lib.tuple.Triple;
import org.junit.Test;
import static org.junit.Assert.*;

public class TupleTest {

    @Test
    public void test_couple() {
        Couple<String, String> couple = new Couple<>("left", "right");

        assertEquals("Left give a wrong value", "left", couple.getLeft());
        assertEquals("Right give a wrong value", "right", couple.getRight());

        assertEquals("The couple need to be equals to him self", couple, couple);

        Couple<String, String> couple2 = new Couple<>("left", "right");
        assertEquals("The couple need to be equals to another couple with the same value", couple, couple2);
    }

    @Test
    public void test_triple() {
        Triple<String, String, String> triple = new Triple<>("left", "middle", "right");

        assertEquals("Left give a wrong value", "left", triple.getLeft());
        assertEquals("Middle give a wrong value", "middle", triple.getMiddle());
        assertEquals("Right give a wrong value", "right", triple.getRight());

        assertEquals("The triple need to be equals to him self", triple, triple);

        Triple<String, String, String> triple2 = new Triple<>("left", "middle", "right");
        assertEquals("The triple need to be equals to another couple with the same value", triple, triple2);
    }

    @Test
    public void test_quadruple() {
        Quadruple<String, String, String, String> quadruple = new Quadruple<>("left", "middleLeft", "middleRight", "right");

        assertEquals("Left give a wrong value", "left", quadruple.getLeft());
        assertEquals("Middle give a wrong value", "middleLeft", quadruple.getMiddleLeft());
        assertEquals("Middle give a wrong value", "middleRight", quadruple.getMiddleRight());
        assertEquals("Right give a wrong value", "right", quadruple.getRight());

        assertEquals("The quadruple need to be equals to him self", quadruple, quadruple);

        Quadruple<String, String, String, String> quadruple2 = new Quadruple<>("left", "middleLeft", "middleRight", "right");
        assertEquals("The quadruple need to be equals to another couple with the same value", quadruple, quadruple2);
    }
}
