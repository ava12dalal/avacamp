public class Car {

    private String color;
    private int year;
    private String model;
    private String make;

    public Car(String color, int year, String model, String make) {
        this.color = color;
        this.year = year;
        this.model = model;
        this.make = make;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void printCar() {
        System.out.println(this.color + this.year + this.model + this.make);
    }

    public void refurbish() {
        this.year += 10;
    }
}
