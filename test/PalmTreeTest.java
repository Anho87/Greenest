import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalmTreeTest {

    Plant palmTest = new PalmTree("Palmis", 300);

    @Test
    public final void getterTest() {
        double expectedNutrition = 1.5;
        double actualNutrition = palmTest.getNutrition();
        Assertions.assertEquals(expectedNutrition, actualNutrition);
    }
}