import java.util.LinkedList;
import java.util.Objects;
import java.util.stream.IntStream;

public class Cat {
    private String name;
    private int age;
    LinkedList<Cat>cats;

    public Cat(LinkedList<Cat> cats) {
        this.cats = cats;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

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

    public LinkedList<Cat> getCats() {
        return cats;
    }

    public void setCats(LinkedList<Cat> cats) {
        this.cats = cats;
    }
    public void FoundByName(String name){
        for (Cat cat:cats){
         if(Objects.equals(cat.getName(), name)){
             System.out.println(cat);
         }

        }
    }
    public void FoundByAge(int age){
        for (Cat cat:cats)
            if (age == cat.getAge()) {
                System.out.println(cat);
            }

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cats=" + cats +
                '}';
    }
}
