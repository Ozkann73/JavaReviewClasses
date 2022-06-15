package class16selfstudy;

public class InstanceDemo {
    String str ="instance";

    void changeValue(){
        str="Ozkan";
        System.out.println(str);
    }
    void printValue (){
        System.out.println(str);
    }

    public static void main(String[] args) {
        InstanceDemo id = new InstanceDemo();
        System.out.println(id.str); //instance
        id.printValue();//instance
        id.changeValue(); //method1
        id.printValue(); // method1
    }
}
