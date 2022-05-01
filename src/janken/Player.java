package janken;
/**
 * ジャンケンのプレイヤーを表すクラス
 */
public class Player {

	// ジャンケンの手を表す定数
	public static final int STONE = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;

	// プレイヤー名
	private String name_;
	// プレイヤーの勝った回数
	private int winCount_ = 0;

	// コンストラクタ
	public Player(String name){
		name_ = name;
	}

	// ジャンケンの手を出す
	public int showHand(){
		int hand = 0;
		double randomNum = Math.random() * 3;
		if(randomNum < 1){
			hand = STONE;
		} else if(randomNum < 2){
			hand = SCISSORS;
		} else if(randomNum < 3){
			hand = PAPER;
		}
		return hand;
	}

	// 審判から勝敗を聞く
	public void notifyResult(boolean result){
		if(result == true){
			winCount_ += 1;
		}
	}

	// 自分の勝った回数を答える
	public int getWinCount(){
		return winCount_;
	}

	// 名前を答える
	public String getName(){
		return name_;
	}

	// テストコード
	/*
	public static void main(String[] args){
		Player p = new Player();
		System.out.println(p.showHand());
		p.notifyResult(true);
		p.notifyResult(true);
		p.notifyResult(false);
		System.out.println(p.getWinCount());
	}
	*/
}
