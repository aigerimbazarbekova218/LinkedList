
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat("Molli",2);
        Cat cat1=new Cat("katya",2);

        LinkedList<Cat>cats=new LinkedList<>();
        cats.add(cat);
        cats.add(cat1);

        Cat cat2 = new Cat(cats);
        cat2.FoundByAge(2);


    }
}