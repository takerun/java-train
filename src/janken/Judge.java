package janken;
/**
 * ジャンケンの審判を表すクラス
 */
public class Judge {

	// ジャンケンの手を表す定数
	public static final int STONE = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;

	// ジャンケンを始める
	public void startJanken(Player player1, Player player2){
		// ジャンケン開始を宣言
		System.out.println("【ジャンケン開始】\n");

		// ジャンケンを３回行う
		for(int cnt = 0; cnt < 3: cnt++){

			// 何回戦か表示する
			System.out.println("【"+ (cnt+1) +"回戦目】");
			// 勝敗判定
			Player winner = judgeJunken(player1, player2);
			if(winner != null){
				System.out.println(winner.getName() + "が勝ちました！\n");
				winner.notifyResult(true);
			} else {
				System.out.println("引き分けです。\n");
			}
			
		}

		// ジャンケン終了を宣言
		System.out.println("【ジャンケン終了】\n");

		// 最終的な勝者の判定
		Player finalWinner = judgeFinalWinner(player1, player2);

		// 結果の表示
		System.out.print(
			player1.getWinCount() +" 対 "+ player2.getWinCount() +"で");
		if(finalWinner != null){
			System.out.println(finalWinner.getName() + "の勝ちです！\n");
		} else {
			System.out.println("引き分けです。\n");
		}
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
