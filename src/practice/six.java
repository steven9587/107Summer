package practice;

import java.util.Scanner;

//6. 由命令列輸入二整數 a、b，求最大公因數與最小公倍數。
public class six {
    public static void main(String[] args) {
        System.out.print("請輸入第一個數字：");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.print("請輸入第二個數字：");
        scanner = new Scanner(System.in);
        int number2 = scanner.nextInt();
        boolean judgement = true;
        int left = number1;
        int right = number2;
        while (judgement) {
            //最大公因數
            if (left > right) {
                left = left - right;
            }
            if (right > left) {
                right = right - left;
            }
            if (right == left) {
                right = right - left;
                System.out.println("最大公因數："+left);
                //最小公倍數
                System.out.println("最小公倍數："+(number1/left)*(number2/left)*left);
                judgement=false;
            }
        }
    }
}
