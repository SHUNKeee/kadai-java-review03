package baseball;

public class Review03 {

	public static void main(String[] args) {
		
		BaseBallTeam bb1 = new BaseBallTeam();
		BaseBallTeam bb2 = new BaseBallTeam();
		BaseBallTeam bb3 = new BaseBallTeam();
		BaseBallTeam bb4 = new BaseBallTeam();
		BaseBallTeam bb5 = new BaseBallTeam();
		BaseBallTeam bb6 = new BaseBallTeam();
		
		bb1.name = "東京ヤクルトスワローズ";
		bb1.win = 80;
		bb1.lose = 59;
		bb1.draw = 4;
		
		bb2.name = "横浜DeNAベイスターズ";
		bb2.win = 73;
		bb2.lose = 68;
		bb2.draw = 2;
		
		bb3.name = "阪神タイガース";
		bb3.win = 68;
		bb3.lose = 71;
		bb3.draw = 4;
		
		bb4.name = "読売ジャイアンツ";
		bb4.win = 68;
		bb4.lose = 72;
		bb4.draw = 3;
		
		bb5.name = "広島東洋カープ";
		bb5.win = 66;
		bb5.lose = 74;
		bb5.draw = 3;
		
		bb6.name = "中日ドラゴンズ";
		bb6.win = 66;
		bb6.lose = 75;
		bb6.draw = 2;
		
		bb1.report();
		bb2.report();
		bb3.report();
		bb4.report();
		bb5.report();
		bb6.report();
	

	}

}
