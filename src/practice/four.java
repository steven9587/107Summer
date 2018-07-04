package practice;

import java.util.Scanner;

//4. 某人向銀行貸款 50 萬，以複利計算，利率 3 厘，若每月攤還 3 萬元
//  ，請問幾個月才可還清。
public class four {
    public static void main(String[] args) {
        System.out.print("請輸入貸款金額(萬)：");
        Scanner scanner = new Scanner(System.in);
        double money = (scanner.nextInt()) * 10000;
        double totalmoney = money;
        boolean judgement = true;
        int month = 0;
        while (judgement) {
            month += 1;
            totalmoney = (totalmoney * 1.003) - 30000;
            if (totalmoney > 0) {
                System.out.println("第 " + month + " 個月後" + "，還剩下 " + totalmoney + " 元");
            }else{
                System.out.println("第 " + month + " 個月後"+"，還清!");
            }
            if (totalmoney <= 0) {
                System.out.println("若貸款 " + money / 10000 + " 萬元,則 " + month + " 月後可還清");
                judgement = false;
            }
        }
    }
}
