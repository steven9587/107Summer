package practice;

import java.util.Scanner;

//5. 由命令列輸入一個成績 a，判斷 a 屬那一級。F 級:0-59，C 級:60-69，
//   B 級:70-79，A 級:80-100。
public class five {
    public static void main(String[] args) {
        System.out.print("請輸入成績：");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        int judgement = score / 10;
        if (judgement >= 0 && judgement <= 10) {
            switch (judgement) {
                case 6:
                    System.out.println(score + " 分，屬於 C 級!");
                    break;
                case 7:
                    System.out.println(score + " 分，屬於 B 級!");
                    break;
                case 8:
                    System.out.println(score + " 分，屬於 A 級!");
                    break;
                case 9:
                    System.out.println(score + " 分，屬於 A 級!");
                    break;
                case 10:
                    System.out.println(score + " 分，屬於 A 級!");
                    break;
                default:
                    System.out.println(score + " 分，屬於 F 級!");
                    break;
            }
        }else{
            System.out.println("成績輸入錯誤!");
        }
    }
}
