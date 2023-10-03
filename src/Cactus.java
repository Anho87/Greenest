
public class Cactus extends Plant {

    private final int nutrition;

    protected TypeOfPlant typeOfPlant = TypeOfPlant.CACTUS;

    public Cactus(String name,double heightInCentimeters) {
        super(name, heightInCentimeters);
        nutrition = 2;
    }
    public TypeOfPlant getTypeOfPlant() {
        return typeOfPlant;
    }
    public String getFormattedHeightInCentimeters(){
        return String.format("%.0f", heightInCentimeters);
    }
    public int getNutrition() {
        return nutrition;
    }
    @Override
    public void setHeightInCentimeters(double heightInCentimeters){
        this.heightInCentimeters = heightInCentimeters;
    }

    @Override
    public String printToTextArea() {
        return "Typ: " + getTypeOfPlant().typeOfPlant +
                "\nNamn: " + getName() + "\n" + "Höjd: " + getFormattedHeightInCentimeters() + "cm\n" + "Näring: " +
                getNutrition() + "cl mineralvatten/dag";
    }
}
