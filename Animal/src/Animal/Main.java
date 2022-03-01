package Animal;
public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Cat cat = new Cat("Fluffy");
        Animal a = new Fish(); //Polymorphism
        Animal e = new Spider(); //Polymorphism
        Pet pet = new Cat();
        fish.play();
        cat.play();
        e.eat();
        e.walk(); //spider tidak punya method walk jadi ngambil dari aslinya walk() Animal
        a.walk(); //Ikan punya method walk jadi yang diambil override dari class Fish()
    }
}
