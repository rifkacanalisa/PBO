package Animal;

public class Spider extends Animal {
    public Spider(){
        super(8);
    }

    @Override
    void eat() {
        System.out.println("Laba-laba sedang makan");
    }
}
