package practice;

import java.util.Scanner;

//1.試寫一個程式，繪製出如下的圖形：（若輸入偶數，將自動少一行 ) 。
//  ps:若輸入偶數，將自動少一行 ,是因為星號數是 1,3,5,7,...,5,3,1 的規律,
//  是以奇數行為成長,所以輸入 8 的話,輸出會和 7 一樣(沒有 8 行的菱形)
//
//                             *
//                            ***
//                           *****
//                          *******
//                           *****
//                            ***
//                             *
public class one {
    public static void main(String[] args) {
        System.out.print("請輸入數字：");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int upnumber = (row+1)/2;
        //控制行數(上)
        for (int i = 0; i < upnumber; i++) {
            //印出空白(上)
            for (int f = 0; f < upnumber-1-i; f++) {
                System.out.print(" ");
            }
            //印出星星(上)
            for (int f = 0; f < 1 + 2 * i; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int downnumber = (row-1)/2;
        //控制行數(下)
        for (int i = 0; i < downnumber; i++) {
            //印出空白(下)
            for (int f = 0; f < 1 + i; f++) {
                System.out.print(" ");
            }
            //印出星星(下)
            for (int f = 0; f < downnumber-2*(i-1); f++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
