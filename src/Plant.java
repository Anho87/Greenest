public abstract class Plant implements Nutrition{
    //Inkapslade variablar som man kan ändra med hjälp av getters och setters
    private String name;
    protected double heightInCentimeters;
    
    public Plant(String name, double heightInCentimeters) {
        this.name = name;
        this.heightInCentimeters = heightInCentimeters;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getHeightInCentimeters() {
        return heightInCentimeters;
    }
    
    //Polymorfism
    abstract void setHeightInCentimeters(double heightInCentimeters);
    
    abstract String printToTextArea();

    abstract TypeOfPlant getTypeOfPlant();
}
