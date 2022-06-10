package reviewClass06;

public class College {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name="Ozkan";
        stu.lastname="Kara";
        stu.address="California";
        stu.studentId=213;
        stu.age=31;
        stu.grade='C';
        stu.study();
        stu.doHomework();
        System.out.println(stu.getFullName());
        stu.printInfo();
        String ratingg =stu.rating();
        System.out.println(stu.name+" is a "+ratingg+" student ");
    }
}
