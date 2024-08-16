package baseball;

public class BaseBallTeam {
	//フィールド
	protected String name;
	protected int win ;
	protected int lose;
	protected int draw;

//勝率を出すメソッド
 double getRate() {
	double rate = (double)win/(double)(win + lose);
		return rate;
}
 
 //チームの結果を表示するメソッド
 void report() {
	 System.out.println(name+"の2022年の成績は "+win+"勝 "+lose+"敗 "+draw+"分、勝率は "+getRate()+"です。");
		 
 }

}
