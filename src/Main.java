import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int totalNumber = 0;
        int number;

        for(int i = 1; i <= 5; i++){
            System.out.print("Enter Your Number " + i + ": ");
            number = scanner.nextInt();
            totalNumber = totalNumber + number;
        }
        System.out.print("\nTotal Number:" + totalNumber);
    }
}