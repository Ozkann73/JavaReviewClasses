package class16selfstudy;

public class TesterClass {
    public static void main(String[] args) {
        AccessModifiersDemo acs = new AccessModifiersDemo();
    //     System.out.println(acs.password);  --> error because its private
        System.out.println(acs.name);
        System.out.println(acs.ssn);
    }
}
