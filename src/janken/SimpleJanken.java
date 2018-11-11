package janken;

/**
 * オブジェクト思考を使用しないプログラム
 */

public class SimpleJanken {

	public static final int STONE = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;

	public static void main (String[] args){

		// 変数
		int player1WinCount = 0;
		int player2WinCount = 0;
		int player1Hand = 0;
		int player2Hand = 0;
		double randomNum = 0;

		// ジャンケン開始
		System.out.println("【ジャンケン開始】");

		// ジャンケン３回勝負
		for(int cnt=0; cnt<3; cnt++){
			// 何回戦？
			System.out.println("【" + (cnt+1) + "回戦目】");

			// プレイヤー１手番
			randomNum = Math.random() * 3;
			if(randomNum < 1){
				player1Hand = STONE;
				System.out.print("グー");
			} else if(randomNum < 2){
				player1Hand = SCISSORS;
				System.out.print("チョキ");
			} else if(randomNum < 3){
				player1Hand = PAPER;
				System.out.print("パー");
			}

			System.out.print(" vs. ");

                        // プレイヤー２手番
                        randomNum = Math.random() * 3;
                        if(randomNum < 1){
                                player2Hand = STONE;
                                System.out.print("グー");
                        } else if(randomNum < 2){
                                player2Hand = SCISSORS;
                                System.out.print("チョキ");
                        } else if(randomNum < 3){
                                player2Hand = PAPER;
                                System.out.print("パー");
                        }

			// 勝敗判定
			if((player1Hand == STONE && player2Hand == SCISSORS)
			   || (player1Hand == SCISSORS && player2Hand == PAPER)
			   || (player1Hand == PAPER && player2Hand == STONE)){
				System.out.println("\nプレイヤー１が勝ちました。\n");
				player1WinCount++;
			} else if((player1Hand == STONE && player2Hand == PAPER)
                           || (player1Hand == SCISSORS && player2Hand == STONE)
                           || (player1Hand == PAPER && player2Hand == SCISSORS)){
				System.out.println("\nプレイヤー２が勝ちました。\n");
                                player2WinCount++;
			} else {
				System.out.println("\n引き分けです。\n");
			}
		}

		// トータル勝敗判定
		System.out.println("【ジャンケン終了】");
		if(player1WinCount > player2WinCount){
			System.out.println(player1WinCount +"対"+ player2WinCount
						 +"でプレイヤー１の勝ちです。");
		} else if(player1WinCount < player2WinCount){
			System.out.println(player1WinCount +"対"+ player2WinCount
                                                 +"でプレイヤー２の勝ちです。");
		} else {
			System.out.println(player1WinCount +"対"+ player2WinCount
                                                 +"で引き分けです。");
		}
	}
}
