package peaksoft;

public class Person {
    private Dog dog;
    private String name;
    private int age;

    public Person(){
    }

    public Person(Dog dog, String name, int age) {
        this.dog = dog;
        this.name = name;
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "animal=" + dog +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
