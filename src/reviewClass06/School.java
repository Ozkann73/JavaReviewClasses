package reviewClass06;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "Samira";
        student1.lastname = "Pashayeva";
        student1.address = "Virginia";

        student1.studentId = 101;
        student1.age = 23;
        student1.grade = 'A';

        Student student2 = new Student();
        // Accessing variables of Student class
        student2.name = "Omid";
        student2.lastname = "Mahmoodi";
        student2.address = "California";
        student2.age = 18;
        student2.studentId = 102;
        student2.grade = 'F';
        // accessing methods of Student class
        student2.study();
        student2.doHomework();
        student1.study();
        student1.doHomework();

        String fullName = student1.getFullName();
        System.out.println(fullName);
        String fullname = student2.getFullName();
        System.out.println(fullname);

        student1.printInfo();
        student2.printInfo();
        student1.takeSubject("Java");
        student2.takeSubject("Biology");


    }

}
