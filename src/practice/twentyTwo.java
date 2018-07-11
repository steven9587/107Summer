package practice;

//22. 試使用For Loop 控制結構完成以下字元三維陣列程式碼
public class twentyTwo {
    public static void main(String[] args) {
        String[][][] englishchars = new String[5][5][5];
        int charnumber;
        for (int k = 0; k < 2; k++) {
            if (k == 1) {
                charnumber=75;
                for (int i = 0; i < 2; i++) {
                    for (int f = 0; f < 2 - i; f++) {
                      //  System.out.println(charnumber);
                        englishchars[k][i][f] = String.valueOf((char) charnumber);
                        System.out.println("[" + k + "][" + i + "][" + f + "]：" + englishchars[k][i][f]);
                        charnumber--;
                    }
                }
            } else if (k == 0) {
                charnumber = 90;
                for (int i = 0; i < 5; i++) {
                    for (int f = 0; f <= 4 - i; f++) {
                      //  System.out.println(charnumber);
                        englishchars[k][i][f] = String.valueOf((char) charnumber);
                        System.out.println("[" + k + "][" + i + "][" + f + "]：" + englishchars[k][i][f]);
                        charnumber--;
                    }
                }
            }
        }
    }
}
