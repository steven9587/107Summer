package practice;

import java.util.Scanner;

//3.一竹桿長 10 公尺，每日截取一半，過多少日後，竹桿長度才會少於20公分。
public class three {
    public static void main(String[] args) {
        System.out.print("請輸入竹竿長度(公尺)：");
        Scanner scanner = new Scanner(System.in);
        float length = (scanner.nextInt())*100;
        boolean judgement = true;
        int days=0;
        while (judgement){
            days+=1;
            length=length/2;
            System.out.println("第 "+days+" 天，長度為 "+length+" 公分");
            if (length<20){
                judgement=false;
                System.out.println("經過"+days+"日，竹竿長度將少於20公分");
            }
        }
    }
}
