package class16selfstudy;

public class StaticDemo {
   static int noOfEmployees=10;
    String name;

    static void method(){
        System.out.println(noOfEmployees);
      //  System.out.println(name); --> we can not use an instance variable inside a static method
    }
    void method1 (){
       // System.out.println(noOfEmployees);
        System.out.println(name);
    }

    public static void main(String[] args) {
        StaticDemo st = new StaticDemo();
        st.name="Omid";

        StaticDemo st1 = new StaticDemo();
        st1.name= "Karla";
        st1.method1();
    }
}
