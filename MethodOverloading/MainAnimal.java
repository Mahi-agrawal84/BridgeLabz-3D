package MethodOverloading;
public class MainAnimal {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.speak();
        myDog.speak();
        myCat.speak();
    }
}
