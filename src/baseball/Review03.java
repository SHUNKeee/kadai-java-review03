package baseball;

public class Review03 {

    public static void main(String[] args) {

        BaseBallTeam bb1 = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        BaseBallTeam bb2 = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        BaseBallTeam bb3 = new BaseBallTeam("阪神タイガース",68,71,4);
        BaseBallTeam bb4 = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        BaseBallTeam bb5 = new BaseBallTeam("広島東洋カープ",66,74,3);
        BaseBallTeam bb6 = new BaseBallTeam("中日ドラゴンズ",66,75,2);


        bb1.report();
        bb2.report();
        bb3.report();
        bb4.report();
        bb5.report();
        bb6.report();


    }

}
