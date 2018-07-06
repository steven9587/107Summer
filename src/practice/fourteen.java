package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//14.如果有一數n，其真因數（Proper factor）的總和等於n，則稱之為完美數
//   （Perfect Number），例如以下幾個數都是完美數：
//    6 = 1 + 2 + 3
//    28 = 1 + 2 + 4 + 7 + 14
//    496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248
//    請輸入一個小於999 的整數，判別後列印出是否為完美數(Y/N)
public class fourteen {
    public static void main(String[] args) {
        List<Integer> answers = new ArrayList<>();
        System.out.print("請輸入一個小於999 的整數：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                answers.add(i);
            }
        }
        int answer = 0;
        for (int i = 0; i < answers.size(); i++) {
            answer+=answers.get(i);
        }
        if (answer==number) {
            System.out.println("true");
        } else {
            System.out.println("flase");
        }
    }
}
