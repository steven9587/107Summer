package practice;

import java.util.Scanner;

//8. 由命令列輸入倍精確浮點數 x，計算 y=x*x-2*x+3，再行輸出y
public class eight {
    public static void main(String[] args) {
        System.out.print("請輸入一浮點數：");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = x * x - 2 * x + 3;
        System.out.println(y);
    }
}
