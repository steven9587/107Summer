package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//15、成績計算:設計一個成績計算程式。成績計算公式如下:
//        總成績=平時成績*0.3+期中考成績*0.3+期末考成績*0.4
//        學號 平時成績 期中考成績 期末考成績
//        98101001 80 90 70
//        98101002 40 80 60
//        98101003 80 80 75
//        98101004 20 40 30
//        98101005 10 15 40
//        98101006 18 80 32
//        98101007 90 80 60
//        98101008 30 50 50
//        98101009 60 70 50
//        98101010 92 88 95
//        (2). 畫面輸出全班總成績的平均值、最高分、最低分，及標準差。
//        平均成績: 58.72
//        最高分: 92
//        最低分: 23.5
//        標準差: 22.88
//        (3). 畫面輸出各成績級距及所佔比例各有多少人，如下所示
//        0-20: 0 人 0%
//        20-40: 2 人 20%
//        40-60: 3 人 30%
//        60-80: 4 人 40%
//        80-100: 1 人 10%
public class fifteen {
    public static void main(String[] args) {
        List<fifteenStudent> students = new ArrayList<>();
        List<Float> studentsScores = new ArrayList<>();
        //read data
        try {
            FileReader fileReader = new FileReader("SemesterGrade.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] tokens = line.split(",");
                //collect averages
                float average = (float) (Integer.parseInt(tokens[1]) * 0.3 + Integer.parseInt(tokens[2]) * 0.3 + Integer.parseInt(tokens[3]) * 0.4);
                studentsScores.add(average);
                //collect score & id
                fifteenStudent s =
                        new fifteenStudent(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
                students.add(s);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("(1)");
        //print data
        for (int i = 0; i < students.size(); i++) {
            System.out.println("學號：" + students.get(i).getId() + "  平時成績：" + students.get(i).getUsualGrades() + "  其中成績：" + students.get(i).getMidtermExam() + "  期末成績：" + students.get(i).getFinalExam() + "  學期成績：" + students.get(i).getAverage());
        }
        System.out.println("(2)");
        //print average
        float averageScore = 0;
        float totalScore = 0;
        for (int i = 0; i < studentsScores.size(); i++) {
            totalScore += studentsScores.get(i);
            averageScore = totalScore / studentsScores.size();
        }
        System.out.println("平均成績:" + averageScore);
        //print max
        float maxScore = 0;
        for (int i = 0; i < studentsScores.size(); i++) {
            if (studentsScores.get(i) > maxScore) {
                maxScore = studentsScores.get(i);
            }
        }
        System.out.println("最高分:" + maxScore);
        //print min
        float minScore = 100;
        for (int i = 0; i < studentsScores.size(); i++) {
            if (studentsScores.get(i) < minScore) {
                minScore = studentsScores.get(i);
            }
        }
        System.out.println("最低分:" + minScore);
        //print Standard deviation
        float standard = 0;
        float totalStandard = 0;
        for (int i = 0; i < studentsScores.size(); i++) {
            //double  相減
            BigDecimal a1 = new BigDecimal(Float.toString(studentsScores.get(i)));
            BigDecimal a2 = new BigDecimal(Float.toString(averageScore));
            double a3 = a1.subtract(a2).floatValue();
            //開平方相加
            totalStandard += Math.pow(a3, 2);
            standard = (float) Math.sqrt(totalStandard / studentsScores.size());
        }
        System.out.println("標準差:" + standard);
        //print 組距
        System.out.println("(3)");
        int statistics = 0;
        for (int f = 0; f < 5; f++) {
            statistics = 0;
            for (int i = 0; i < studentsScores.size(); i++) {
                if (studentsScores.get(i) >=  f * 20 && studentsScores.get(i) < (f + 1) * 20) {
                    statistics += 1;
                }
            }
            System.out.println(f*20+"-"+(f + 1) * 20+"："+statistics+"人 "+statistics*100/studentsScores.size()+"%");
        }
    }
}
