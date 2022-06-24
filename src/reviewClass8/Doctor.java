package reviewClass8;

public class Doctor {
    String firstName , lastName , speciality;
    int experience;
    double salary;
   static String hospital;

    public Doctor(String firstName, String lastName, String speciality, int experience, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.experience = experience;
        this.salary = salary;
    }
    void printInfo(){
        System.out.println(firstName+" "+lastName+" "+speciality+" "+experience+" "+salary);
    }
}
