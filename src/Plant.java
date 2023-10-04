public abstract class Plant {

    private String name;
    protected double heightInCentimeters;


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
    abstract void setHeightInCentimeters(double heightInCentimeters);

    abstract String printToTextArea();

    abstract TypeOfPlant getTypeOfPlant();
}
