package Random;

// Object & Class Refersher
public class Dog {
    
    String name;
    int age;
    String breed;

    public Dog(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public void Sit(){
        System.out.println("The puppy sits!");
    }

    public void layDown(){
        System.out.println("The puppy laid down!");
    }

    public String toString(){
        return  "Name : " + name + " Age : " + age + " Breed : " + breed;
    }




}
