package class16selfstudy;

public class Dog {
    String name;
    String color;
   static int noOfLegs=4;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name="Hirco";
        dog1.color="Blue";

        Dog dog2 = new Dog();
        dog2.name="Ziro";
        dog2.color="white";
        dog2.noOfLegs=6;

        Dog dog3 = new Dog();
        dog3.name="Sero";
        dog3.color="Brown";

        System.out.println(dog1.name);
        System.out.println(dog2.name);
        System.out.println(dog3.name);
        System.out.println(dog3.noOfLegs);
        System.out.println(dog1.noOfLegs);
        System.out.println(dog2.noOfLegs);
       ;
    }

}
