package practice;

//21. 試使用For Loop 控制結構完成以下字元二維陣列程式碼
public class twentyOne {
    public static void main(String[] args) {
        String[][] englishchars = new String[5][5];
        int charnumber = 90;
        for (int i = 0; i < 5; i++) {
            for (int f = 0; f <= 4 - i; f++) {
                englishchars[i][f] = String.valueOf((char) charnumber);
                System.out.println("["+i+"]["+f+"]："+englishchars[i][f]);
                charnumber--;
            }
        }
    }
}
