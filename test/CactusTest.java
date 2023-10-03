import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CactusTest {
    Cactus cactusTest = new Cactus("KaktusTest",100);

    @Test
    public final void getterTest() {
        assert (cactusTest.getName() == "KaktusTest");
        assert (cactusTest.getHeightInCentimeters() == 100);
        assert (cactusTest.getNutrition() == "2cl mineralvatten/dag");
    }

    @Test
    public final void setterTest() {
        assert (cactusTest.getName() == "KaktusTest");
        cactusTest.setName("Taggis");
        assert (cactusTest.getName() == "Taggis");

        assert (cactusTest.getHeightInCentimeters() == 100);
        assert (cactusTest.getNutrition() == "2cl mineralvatten/dag");
        cactusTest.setHeightInCentimeters(5000);
        assert (cactusTest.getHeightInCentimeters() == 5000);
        assert (cactusTest.getNutrition() == "2cl mineralvatten/dag");
    }

}