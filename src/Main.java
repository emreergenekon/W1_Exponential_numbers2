import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, k;
// 2 inputs added to calculate exponential numbers from the user.
        System.out.print("Üssü Alınacak Sayı: ");
        n = input.nextInt();

        System.out.print("Üs Olacak Sayı: ");
        k = input.nextInt();

        int total = 1;
        int i;
//formula for the exponential numbers.
        for (i = 1; i <= k; i++) {
            total *= n;
        }
        //printing final result.
        System.out.println("Cevap: " + total);
    }
}