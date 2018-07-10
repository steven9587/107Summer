package practice;
//17. 請使用 for loop 寫一個程式，輸入一個正整數 N，計算 1 + 2! + 3! ...+ N! 的結果。

import java.util.Scanner;

public class seventeen {
    public static void main(String[] args) {
        System.out.print("請輸入一個數字：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int answer = 0;
        int n = 1;
        for (int i = 1; i <= number; i++) {
            n = 1;
            for (int f = 1; f <= i; f++) {
                n = n * f;
            }
            answer+=n;
        }
        System.out.println("答案；"+answer);
    }
}
