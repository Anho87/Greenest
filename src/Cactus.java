
public class Cactus extends Plant {
    //Inkapslade variablar
    private double nutrition;
    private TypeOfPlant typeOfPlant = TypeOfPlant.CACTUS;

    public Cactus(String name,double heightInCentimeters) {
        super(name, heightInCentimeters);
        nutrition = setNutrition();
    }
    public String getFormattedHeightInCentimeters(){
        return String.format("%.0f", getHeightInCentimeters());
    }
    public String getFormattedNutrition() {
        return String.format("%.0f", nutrition);
    }
    
    //Polymorfism
    @Override
    public double setNutrition() {
        return 2;
    }
    @Override
    public double getNutrition() {
        return nutrition;
    }
    @Override
    public TypeOfPlant getTypeOfPlant() {
        return typeOfPlant;
    }
    @Override
    public String printToTextArea() {
        return "Typ: " + getTypeOfPlant().typeOfPlant +
                "\nNamn: " + getName() + "\n" + "Höjd: " + getFormattedHeightInCentimeters() + "cm\n" + "Näring: " +
                getFormattedNutrition() + "cl mineralvatten/dag";
    }
}
