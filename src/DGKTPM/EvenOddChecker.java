package DGKTPM;
import java.util.Scanner;



public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueChecking = true;

        while (continueChecking) {
            System.out.print("Nhập một số nguyên (hoặc nhập -1 để thoát): ");
            int number = scanner.nextInt();

            if (number == -1) {
                continueChecking = false;
            } else {
                checkEvenOdd(number);
            }
        }

        scanner.close();
        System.out.println("Chương trình đã kết thúc.");
    }

    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Số " + number + " là số chẵn.");
        } else {
            System.out.println("Số " + number + " là số lẻ.");
        }
    }
}
