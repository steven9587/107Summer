package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//12.試寫一個程式 m 進位轉換
//        問題描述：
//        輸入兩個 10 進位正整數 n, m ，輸出 n 的 m 進位表示，如果m>10，則輸出符號以'a', 'b', 'c', …,
//         ‘f’等英文字母表示，本題處理的進制m 小於等於16。
//        輸入說明：
//        從鍵盤輸入兩個正整數 n, m ， n >= 0, m >= 2 。
//        輸出說明：
//        範例：
//        n 的 m 進位表示為 [output].
//        9 2
//        The base 2 representation of 9 is 1001.
public class twelve {
    int number;
    int carryMethod;
    List<String> answers = new ArrayList<String>();

    public twelve(int number, int carryMethod) {
        this.number = number;
        this.carryMethod = carryMethod;
    }

    public static void main(String[] args) {
        System.out.print("請輸入輸入兩個正整數 n, m ， n >= 0, m >= 2：");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] tokens = line.split(",");
        twelve t = new twelve(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
        t.change();
    }

    public void change() {
        int usenumber = number;
        boolean judgement = true;
        while (judgement) {
            String answer = String.valueOf(usenumber % carryMethod);
            switch (answer) {
                case "10":
                    answer = "A";
                    answers.add(answer);
                    break;
                case "11":
                    answer = "B";
                    answers.add(answer);
                    break;
                case "12":
                    answer = "C";
                    answers.add(answer);
                    break;
                case "13":
                    answer = "D";
                    answers.add(answer);
                    break;
                case "14":
                    answer = "E";
                    answers.add(answer);
                    break;
                case "15":
                    answer = "F";
                    answers.add(answer);
                    break;
                default:
                    answers.add(answer);
                    break;
            }

            usenumber = usenumber / carryMethod;
            if (usenumber == 0) {
                judgement = false;
                break;
            }
        }
        System.out.print("The base "+carryMethod+" representation of "+number+" is ");
        for (int i = answers.size() - 1; i >= 0; i--) {
            System.out.print(answers.get(i));
        }
        System.out.println(" .");
    }
}
