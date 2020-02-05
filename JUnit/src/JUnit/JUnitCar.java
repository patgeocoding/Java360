package JUnit;

public class JUnitCar {
    String make;
    String model;
    int year;
    int tires;
    boolean convertible;
    boolean fourWheelDrive;
    String[] arr;

    public JUnitCar(){

    }

    public JUnitCar(String make, String model, int year, int tires, boolean convertible, boolean fourWheelDrive, String[] arr){
        this.make = make;
        this.model = model;
        this.year = year;
        this.tires = tires;
        this.convertible = convertible;
        this.fourWheelDrive = fourWheelDrive;
        this.arr = arr;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public boolean getConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean getFWD() {
        return fourWheelDrive;
    }

    public void setFWD(boolean fwd) {
        this.fourWheelDrive = fwd;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }
}
