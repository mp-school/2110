package Random;

public class Keko {
    Dog keko = new Dog("Keko", 7, "Pom");

    public void Shakes(){
        System.out.println("The puppy shakes your hand!");
    }
    public static void main(String[] args){


    Dog keko = new Dog("Keko", 7, "Pom");
    Keko kek = new Keko();

    System.out.println(keko.toString());

    keko.Sit();
    keko.layDown();
    kek.Shakes();
    


    }   
}
