import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueChecking = true;

        while (continueChecking) {
            System.out.print("Nhap 1 so nguyenn (hoac nhap -1 de thoat chuong trinh): ");
            int number = scanner.nextInt();

            if (number == -1) {
                continueChecking = false;
            } else {
                checkEvenOdd(number);
            }
        }

        scanner.close();
        System.out.println("Chuong trinh da ket thuc.");
    }

    public static String checkEvenOdd(int number) {
//        if (number % 2 == 0) {
//            System.out.println("So " + number + " la so chan.");
//        } else {
//            System.out.println("So " + number + " la so le.");
//        }
		return null;
    }
    
    
    public static String checkEvenOdd(String input) {
        try {
            int number = Integer.parseInt(input);
            return checkEvenOdd(number);
        } catch (NumberFormatException e) {
            return "Dau vao khong hop le";
        }
    }
}



