package Kiemtra.lab;

import java.util.Scanner;

import Demo.giaithua;

public class test1108 {
    public static void SelectionSort(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int miniindex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[miniindex] > nums[j]) {
                    miniindex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[miniindex];
            nums[miniindex] = temp;
        }
    }

    public static void giaithua(int n) {
        int giaithua = 1;
        for (int i = n; i >= 1; i--) {
            giaithua = giaithua * i;
        }
        System.out.println("So giai thua cua n la: "+ giaithua);
        if(giaithua %2 ==0){
            System.out.println("La so chan");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 5, 1, 3, 6, 7, 8 };
        SelectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Nhap so n: ");
        int n = sc.nextInt();
        sc.nextLine();
        giaithua(n);

    }
}
