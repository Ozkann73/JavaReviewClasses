package class16selfstudy;

public class AccessModifiersDemo {
  private  String password ="pass123";
   int ssn = 123456;
  public   String name ="Karla";

    public static void main(String[] args) {
        AccessModifiersDemo ac = new AccessModifiersDemo();
        System.out.println(ac.password);
        System.out.println(ac.ssn);
        System.out.println(ac.name);
    }
}
