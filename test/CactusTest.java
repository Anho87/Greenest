import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CactusTest {
    Plant kaktusTest = new Cactus("Kaktis",100);

    @Test
    public final void getterTest() {
        double expectedNutrition = 2;
        double actualNutrition = kaktusTest.getNutrition();
        Assertions.assertEquals(expectedNutrition, actualNutrition);
    }

    @Test
    public final void setterTest() {
        kaktusTest.setHeightInCentimeters(5000);
        double expectedNutrition = 2;
        double actualNutrition = kaktusTest.getNutrition();
        Assertions.assertEquals(expectedNutrition, actualNutrition);
    }
}