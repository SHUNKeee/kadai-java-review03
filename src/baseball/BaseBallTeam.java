package baseball;

public class BaseBallTeam {
    //フィールド
    private String name;
    private int win ;
    private int lose;
    private int draw;

public BaseBallTeam(String name,int win,int lose,int draw) {
    this.name = name;
    this.win = win;
    this.lose = lose;
    this.draw = draw;

}

//勝率を出すメソッド
 private double getRate() {
    double rate = (double)win/(double)(win + lose);
        return rate;
}

 //チームの結果を表示するメソッド
 public void report() {
     System.out.println(name+"の2022年の成績は "+win+"勝 "+lose+"敗 "+draw+"分、勝率は "+getRate()+"です。");

 }

}
