package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//10. 從鍵盤重複輸入姓名、國文成績、英文成績、數學成績，每欄中間一個逗點符號，
//    計算後輸出:姓名、國文成績、英文成績、數學成績，總分、平均。
public class ten {
    public static void main(String[] args) {
        //輸入&讀取資料
        List<tenStudentData> stndentdatas = new ArrayList<>();
        boolean judgement = true;
        while (judgement) {
            System.out.print("請輸入資料(或按q結算)：");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            if (line.equals("q")) {
                judgement = false;
                break;
            } else {
                String[] tokens = line.split(",");
                tenStudentData t =
                        new tenStudentData(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
                stndentdatas.add(t);
            }
        }
        //結束&print資料
        for (int i = 0; i < stndentdatas.size(); i++) {
            System.out.println("姓名：" + stndentdatas.get(i).getName() + "  " + "國文成績：" + stndentdatas.get(i).getChinese() + "  " + "英文成績：" + stndentdatas.get(i).getEnglish() + "  " + "數學成績：" + stndentdatas.get(i).getMath() + "  " + "總分：" + stndentdatas.get(i).totalscore() + "  " + "平均：" + stndentdatas.get(i).score());
        }
    }
}

