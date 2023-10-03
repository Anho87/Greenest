import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeatEatingPlantTest {
    MeatEatingPlant köttätare = new MeatEatingPlant("Köttis", 50);

    @Test
    public final void getterTest() {
        assert (köttätare.getName() == "Köttis");
        assert (köttätare.getHeightInCentimeters() == 50);
        assert (köttätare.getNutrition() == 0.2);
    }

    @Test
    public final void setterTest() {
        assert (köttätare.getName() == "Köttis");
        köttätare.setName("Köttätare");
        assert (köttätare.getName() == "Köttätare");

        assert (köttätare.getHeightInCentimeters() == 50);
        assert (köttätare.getNutrition() == 0.2);
        köttätare.setHeightInCentimeters(100);
        assert (köttätare.getHeightInCentimeters() == 100);
        assert (köttätare.getNutrition() == 0.30000000000000004);
    }
}