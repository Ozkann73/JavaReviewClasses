package class16selfstudy;

public class TeslaEmployees {

    String name;
    double salary ;
    static int noOfEmployees;
    static String companyName="Tesla";

    void displayEmployeeInfo (){
        System.out.println("Name "+name+" Company Name "+companyName+" No Of Employees "+noOfEmployees+" Salary "+salary);
    }

    public static void main(String[] args) {
        TeslaEmployees emp1 = new TeslaEmployees();
        emp1.name="Ozkan";
        emp1.salary=150000;
        emp1.noOfEmployees=1;
        emp1.displayEmployeeInfo();

        TeslaEmployees emp2 = new TeslaEmployees();
        emp2.name="Mirhan";
        emp2.salary=180000;
        emp2.noOfEmployees=2;
        emp2.displayEmployeeInfo();

    }
}
