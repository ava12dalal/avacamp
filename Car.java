public class Car {
    public String color;
    public int year;
    public String model;
    public String make;

    public void printCar() {
        System.out.println(this.color + this.year + this.model + this.make);
    }

    public void refurbish() {
        this.year += 10;
    }
}
