package practice;

import java.util.Scanner;

//11. 已知圓之面積 Area = π * r * r，求半徑 r
public class eleven {
    public static void main(String[] args) {
        System.out.print("請輸入圓形面積：");
        Scanner scanner = new Scanner(System.in);
        int area = scanner.nextInt();
        double r =  Math.sqrt(area/Math.PI);
        System.out.println(r);
    }
}
