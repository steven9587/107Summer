package practice;
//18. 請使用 for loop 寫一個程式，輸入一個正整數 N，計算 1 + 1/2 + 2/3 ...+(N-1)/ N 的結果。

import java.util.Scanner;

public class eighteen {
    public static void main(String[] args) {
        System.out.print("請輸入數字n：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int backup;
        int backdown;
        int finalup = 1;
        int finaldown = 1;
        boolean judgement = true;
        if (n == 1) {
            System.out.println("總和： " + finalup + "/" + finaldown);
        } else {
            for (int i = 2; i <= n; i++) {
                    //兩分數相加
                    backup = i-1;
                    backdown = i;
                    judgement = true;
                    //暫存兩數的分母
                    int a = finaldown;
                    int b = backdown;
                    while (judgement) {
                    //最大公因數
                    if (finaldown > backdown) {
                        finaldown = finaldown - backdown;
                    }
                    if (backdown > finaldown) {
                        backdown = backdown - finaldown;
                    }
                    if (backdown == finaldown) {
                        backdown = backdown - finaldown;
                        //最小公倍數
                        int finalmom = (a / finaldown) * (b / finaldown) * finaldown;
                        finaldown = a;
                        backdown = b;
                        finalup =finalup*(finalmom/finaldown)+backup*(finalmom/backdown);
                        finaldown = finalmom;
                        judgement = false;
                    }
                }
            }
            System.out.println("答案：" + finalup + "/" + finaldown);
        }
    }
}
