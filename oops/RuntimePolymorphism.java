interface Animal { 
    void noise();
    
}

class Lion implements Animal
{

    @Override
    public void noise() {
        System.out.println("lion noise");
    }
    
}

class Tiger implements Animal
{

    @Override
    public void noise() {
        System.out.println("Tiger noise");
    } 
}

public class RuntimePolymorphism {

    public static void makeSound(Animal a)
    {
        a.noise();
    }

    public static void main(String[] args) {
        makeSound((Animal) new Lion());
        makeSound((Tiger) new Tiger()); // where Tiger already implements Animal
       
    }
}