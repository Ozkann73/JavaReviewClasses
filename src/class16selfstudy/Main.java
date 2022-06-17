package class16selfstudy;

public class Main {

    boolean evenOrOdd(int num1, int num2) {
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            return true;
        } else if (num1 % 2 != 0 || num2 % 2 != 0) {
            return false;
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            return false;
        }else {
            System.out.println("incorrect value");
        }
        return true;
    }

        public static void main (String[]args){
            Main number = new Main();
            System.out.println(number.evenOrOdd(20,15));
        }


}
