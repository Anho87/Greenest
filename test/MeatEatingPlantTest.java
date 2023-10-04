import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MeatEatingPlantTest {
   Plant köttätareTest = new MeatEatingPlant("Köttis", 50);
    
    @Test
    public final void getterTest() {
        double expectedNutrition = 0.2;
        double actualNutrition = köttätareTest.getNutrition();
        Assertions.assertEquals(expectedNutrition, actualNutrition);
    }
}