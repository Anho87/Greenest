

public class MeatEatingPlant extends Plant {
    //Inkapslade variablar som man kan ändra med hjälp av getters och setters
    private double nutrition;

    protected TypeOfPlant typeOfPlant = TypeOfPlant.MEATEATINGPLANT;

    public MeatEatingPlant(String name, double heightInCentimeters) {
        super(name, heightInCentimeters);
        this.nutrition = setNutrition();
    }

    public String getFormattedNutrition() {
        return String.format("%.2f", nutrition);
    }

    public String getFormattedHeightInCentimeters() {
        return String.format("%.0f", heightInCentimeters);
    }
    //Polymorfism
    @Override
    public TypeOfPlant getTypeOfPlant() {
        return typeOfPlant;
    }
    @Override
    public void setHeightInCentimeters(double heightInCentimeters) {
        this.heightInCentimeters = heightInCentimeters;
        this.nutrition = setNutrition();
    }
    @Override
    public double setNutrition() {
        return 0.1 + ((getHeightInCentimeters() / 100) * 0.2);
    }
    @Override
    public double getNutrition() {
        return nutrition;
    }
    @Override
    public String printToTextArea() {
        return "Typ: " + getTypeOfPlant().typeOfPlant +
                "\nNamn: " + getName() + "\n" + "Höjd: " + getFormattedHeightInCentimeters() + "cm\n" + "Näring: " +
                getFormattedNutrition() + " liter proteindryck/dag";
    }
}
