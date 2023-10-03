import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CactusTest {
    Cactus kaktusTest = new Cactus("Kaktis",100);

    @Test
    public final void getterTest() {
        int expectedNutrition = 2;
        int actualNutrition = kaktusTest.getNutrition();
        Assertions.assertEquals(expectedNutrition, actualNutrition);
    }

    @Test
    public final void setterTest() {
        kaktusTest.setHeightInCentimeters(5000);
        int expectedNutrition = 2;
        int actualNutrition = kaktusTest.getNutrition();
        Assertions.assertEquals(expectedNutrition, actualNutrition);
    }

}