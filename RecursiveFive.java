package methods;

import java.util.Scanner;

public class RecursiveFive {

    static void five(int number) {
        int temp = number;
        while (temp > 0) {
            System.out.print(temp + " ");
            temp -= 5;
        }

        while (temp <= number) {
            System.out.print(temp + " ");
            temp += 5;
        }

    }


    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        N = scanner.nextInt();
        System.out.print("Çıktısı : ");
        five(N);

    }
}
