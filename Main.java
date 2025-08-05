public class Main {
    public static void main(String[] args) {
        Car fred = new Car();
        fred.color = "black";
        fred.year = 2014;
        fred.model = "jereke";
        fred.make = "jeep";
        fred.printCar();

        Car sally = new Car();
        sally.color = "pink";
        sally.year = 1800;
        sally.refurbish();
        sally.model = "accord";
        sally.make = "honda";
        sally.printCar();

    }

}