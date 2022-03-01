package Animal;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }
    abstract void eat();
    public void walk(){
        System.out.println("Hewan ini berjalan dengan " + legs + " kaki.");
    }
}
