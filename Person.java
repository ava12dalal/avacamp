public class Person {
    private String haircolor;
    private int height;
    private int weight;
    private int age;
    private String name;

    public Person(String haircolor, int height, int weight, int age, String name) {
        this.height = height;
        this.haircolor = haircolor;
        this.weight = weight;
        this.age = age;
        this.name = name;

    }

    public void dyeHair(String color) {
        this.haircolor = color;
    }

    public void weightChange(int change) {
        this.weight += change;
    }

    public void grow(int change) {
        this.height += change;
    }

    public void ageUp() {
        this.age++;
    }

    public void print() {
        System.out.println(this.name + "is a big guy who weighs" + this.weight + "and is" + height + "tall. He has"
                + this.haircolor + "and is not nice.");
    }

}
