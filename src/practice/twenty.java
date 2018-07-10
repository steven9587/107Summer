package practice;
//20. Math 套件（package）內有許多數學上常用的函數。請使用 Math.pow 及Math.sqrt 撰寫程式，
//    顯示【輸入第1 組的 x 和 y 座標：】，提示使用者首先 輸入第一組座標(x1, y1)，x 與 y座標
//    的輸入以一空格鍵分隔，其資料型態皆為正整數。3.要求輸入第2 組座標(x2, y2)。兩組座標輸入
//    完畢，輸出兩組座標之間的距離。

import java.util.Scanner;

public class twenty {
    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2;
        double distance;
        System.out.println("***x 與 y座標的輸入以一空格鍵分隔***");
        System.out.print("輸入第1 組的 x 和 y 座標：");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] tokens = line.split(" ");
        x1 = Integer.parseInt(tokens[0]);
        y1 = Integer.parseInt(tokens[1]);
        System.out.print("輸入第2 組的 x 和 y 座標：");
        line = scanner.nextLine();
        tokens = line.split(" ");
        x2 = Integer.parseInt(tokens[0]);
        y2 = Integer.parseInt(tokens[1]);
        distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.println(distance);
    }
}
