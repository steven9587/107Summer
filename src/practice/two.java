package practice;

import java.util.Scanner;

//2.由命令列輸入里程，算出車資。計程車車資，其里程在 1000 公尺以下皆
//  80元，每超過 500 公尺加5 元，不足 500 公尺以 500 公尺計算。
public class two {
    public static void main(String[] args) {
        System.out.print("請輸入里程：");
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int price = 80;
        if (distance <= 1000) {
            System.out.println(price + "元");
        } else {
            if ((distance - 1000) % 500 == 0) {
                price = 80 + ((distance - 1000) / 500)*5;
                System.out.println(price + "元");
            }else{
                price = 80 + (1+(distance - 1000) / 500)*5;
                System.out.println(price + "元");
            }
        }
    }
}
