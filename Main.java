public class Main {
    public static void main(String[] args) {
        Car fred = new Car("black", 2014, "jereke", "jeep");
        fred.printCar();
        System.out.println(fred.getColor());
        fred.setColor("blue");
        System.out.println(fred.getColor());

        int a = 2;

        Car sally = new Car("pink", 1800, "accord", "honda");

        sally.printCar();

        Person harry = new Person("brown", 10, 8, 0, "Harry");

        harry.print();

    }

}