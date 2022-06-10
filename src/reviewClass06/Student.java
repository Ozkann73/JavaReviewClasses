package reviewClass06;

public class Student {

    // define attributes/fields = variables
    String name, lastname, address;
    int studentId, age;
    char grade;

    // define behavior or = methods
    void study() {
        System.out.println(name + " is studying");
    }

    void doHomework() {
        System.out.println(name + " is doing homework");
    }

    // create a method that will return full name of a student in upperCase
    String getFullName() {
        return name.toUpperCase() + " " + lastname.toUpperCase();

    }

    // create a method to display all info of a student
    void printInfo() {
        System.out.println(name + " " + lastname + " is  " + age + " and lives in " + address);
    }

    // creat a method that will returm wether student is great, good,bad or average based on the grade
    String rating() {
        switch (grade) {
            case 'A':
                return "great";

            case 'B':
                return "good";
            case 'C':
                return "average";
            default:
                return "bad";

        }

    }
    void takeSubject (String subject){
        System.out.println(name+" studies " +subject);
    }
}
