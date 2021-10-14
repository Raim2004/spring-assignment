package peaksoft;

public class Dog implements Animal {


    private String greed;
    private String color;
    private int age;

    public Dog(){
    }

    public Dog(String greed, String color, int age) {
        this.greed = greed;
        this.color = color;
        this.age = age;

    }


    public String getGreed() {
        return greed;
    }

    public void setGreed(String greed) {
        this.greed = greed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void animalPlus() {
        System.out.println("good dog");
    }

    @Override
    public void animalMinus() {
        System.out.println("bad dog");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "greed='" + greed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
