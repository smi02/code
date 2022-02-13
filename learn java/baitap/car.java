package baitap;
public class Car {
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;
    
    public Car(){
    }

    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }
    public String getColour() {
    return colour;
    }

    public void setColour(String colour) {
    this.colour = colour;
    }

    public int getEnginePowerOf(){
    return enginePower;
    }

    public void setEnginePower(int enginePower) {
    this.enginePower = enginePower;
    }

    public boolean isConvertible() {
    return convertible;
    }

    public void setConvertible( boolean convertible) {
    this.convertible = convertible;
    } 

    public boolean isParkingBrake() {
    return parkingBrake;
    }
    
    public void setParkingBrake(boolean parkingBrake) {
    this.parkingBrake = parkingBrake;
    }  

    public void pressStartButton() {
        if (parkingBrake == true) {
            System.out.println("The car start when pressing the Start Button");
        }
    }

    public void pressAccelaratorButton() {
        if (parkingBrake == false) {
        System.out.println( "the direction determined by the transmission setting");
        } else {
        System.out.println("None");
        }
    }
    
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", enginePower=" + enginePower +
                ", convertible=" + convertible +
                ", parkingBrake=" + parkingBrake +
                '}';
    } 
}
