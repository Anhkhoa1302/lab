package Kiemtra.lab;

import java.util.Scanner;

public class test3007 {
    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;

        while (a <= n) {
            System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void sodoixung(int m) {
        int sodao = 0;
        int kq = 0;
        int kqss = m;
        while (m > 0) {
            sodao = m % 10;
            kq = kq * 10 + sodao;
            m = m / 10;
            if (kq == kqss) {
                System.out.println(" La so doi xung: " + kqss);
            } else {
                System.out.println("Khong phai la so doi xung: " + kqss);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap so nguyen: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        fibonacci(n);
        int m = sc.nextInt();
        sc.nextLine();
        sodoixung(m);

    }

}
