package class16selfstudy;

public class ConstructorsDemo {

    public static void main(String[] args) {
        Book book1 = new Book("Introduction To Java","Ozkan Kara","Chinese",560);
        Book book2 = new Book("Marine Biology","Mirhan Kara","English",480);

        System.out.println(book2.author);
        System.out.println(book1.title);
    }
}
