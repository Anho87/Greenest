public abstract class Plant implements Nutrition{
    //Inkapslade variablar
    private String name;
    private double heightInCentimeters;
    
    public Plant(String name, double heightInCentimeters) {
        this.name = name;
        this.heightInCentimeters = heightInCentimeters;
    }
    public String getName() {
        return name;
    }
    public double getHeightInCentimeters() {
        return heightInCentimeters;
    }
    
    //Polymorfism
    abstract String printToTextArea();

    abstract TypeOfPlant getTypeOfPlant();
}
