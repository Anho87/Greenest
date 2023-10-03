import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PalmTreeTest {

    PalmTree palmTree = new PalmTree("TestPalm", 300);

    @Test
    public final void getterTest() {
        assert (palmTree.getName() == "TestPalm");
        assert (palmTree.getHeightInCentimeters() == 300);
        assert (palmTree.getNutrition() == 1.5);
    }
    @Test
    public final void setterTest(){
        assert (palmTree.getName() == "TestPalm");
        palmTree.setName("Palmis");
        assert (palmTree.getName() == "Palmis");
        
        assert (palmTree.getHeightInCentimeters() == 300);
        assert (palmTree.getNutrition() == 1.5);
        palmTree.setHeightInCentimeters(500);
        assert (palmTree.getHeightInCentimeters() == 500);
        assert (palmTree.getNutrition() == 2.5);
    }
}