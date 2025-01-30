package curriculum_B;

import java.util.Random;
import java.util.Scanner;
//問1
public class Qes1_3 {
	public static void main(String[]args) {

		//変数nameを宣言し、文字列を入力
		String name = "12345678901";
		//System.out.println(name);
		//System.out.println(name.length());
		//変数lengthを宣言し、文字数を数値化
		int length = name.length();


		name = "こんにちわ";
		if (name.matches("^[^ -~｡-ﾟ]+$")) {
			System.out.println(name);
			System.out.println("半角英数字で入力してください");
		}else {
			System.out.println("ユーザー名「\"+name+\"」が登録されました。");
		};
		name = "12345678901";
		//文字数10文字以上の場合の条件式を宣言
		if(length >= 10) {
			System.out.println(name);
			//文字数10以上の場合のコンソール表示文を作成
			System.out.println("名前を10文字以内にしてください。");
		}
		//文字が入力されていない場合の条件式を作成
		else if (length <= 0){
			System.out.println(name);
			//入力されていない場合のコンソール表示文を作成
			System.out.println("名前を入力してください");
		}else {
			//正常に入力された場合のコンソール表示文を作成
			System.out.println(name);
			System.out.println("ユーザー名「"+name+"」が登録されました。");
		}

		//変数nameに、文字列を入力
		name = "";
		//System.out.println(name);
		//System.out.println(name.length());
		//変数lengthを宣言し、文字数を数値化
		length = name.length();
		//文字数10文字以上の場合の条件式を宣言
		if(length >= 10) {
			System.out.println(name);
			//文字数10以上の場合のコンソール表示文を作成
			System.out.println("名前を10文字以内にしてください。");
		}
		//文字が入力されていない場合の条件式を作成
		else if (length <= 0){
			System.out.println(name);
			//入力されていない場合のコンソール表示文を作成
			System.out.println("名前を入力してください");
		}else {
			System.out.println(name);
			//正常に入力された場合のコンソール表示文を作成
			System.out.println("ユーザー名「"+name+"」が登録されました。");
		}


		//変数nameに、文字列を入力
		name = "abcd1234";
		//System.out.println(name);
		//System.out.println(name.length());
		//変数lengthを宣言し、文字数を数値化
		length = name.length();
		//文字数10文字以上の場合の条件式を宣言
		if(length >= 10) {
			System.out.println(name);
			//文字数10以上の場合のコンソール表示文を作成
			System.out.println("名前を10文字以内にしてください。");
		}
		//文字が入力されていない場合の条件式を作成
		else if (length <= 0){
			System.out.println(name);
			//入力されていない場合のコンソール表示文を作成
			System.out.println("名前を入力してください");
		}else {
			//正常に入力された場合のコンソール表示文を作成
			System.out.println("ユーザー名「"+name+"」が登録されました。");
		}
		//勝利した数を表示する変数を宣言
		int winCount = 0;
		//じゃんけんの回数をカウントする変数を宣言
		int i = 0;
		//結果ごとの文章を表示する場所を作成
		String result = "";
		//じゃんけんの手を入力する場所を作成
		Scanner stbin = new Scanner(System.in);
		while(winCount < 1) {
			//ユーザー名を登録してことを伝える文章を表示
			System.out.println("ユーザー名「"+name+"」を登録しました。");
			//入力された数値を確認する式を展開
			int userHands = stbin.nextInt();
			//
			while (userHands < 0 || userHands > 2) {

				userHands = stbin.nextInt();

			}
			//相手側のじゃんけんの手を決定する変数を展開
			Random rand = new Random();
			//0から2の数値をランダムに決定する文を展開
			int pcHands = rand.nextInt(3);


			//じゃんけんの結果が愛子だった場合の分岐式を展開
			if(userHands == pcHands){
				//愛子だった歳の表示文を定義
				result = "DRAW あいこ もう一回しましょう";
				//じゃんけんの結果が勝利だった場合の条件式を展開
			} else if ((userHands == 0 && pcHands == 1) ||
					(userHands == 1 && pcHands == 2) ||
					(userHands == 2 && pcHands == 0)) {
				//勝利した際の表示される文章を展開
				result = "やるやん。次は俺にリベンジさせて";
				//変数iの数値を増加
				i++;
				//自分の手がチョキで、相手の手がグーだった場合の条件式を展開
			} else if (userHands == 1 && pcHands == 0 ){
				//グーに負けた場合の表示文を展開
				result = "俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！";
				//変数iの値を増加
				i++;
				//自分がチョキに負けた場合の条件式を展開
			}else if (userHands == 2  && pcHands == 1){
				//チョキに負けた場合の表示文を展開
				result = "俺の勝ち！たかがじゃんけん、そう思ってないですか？それ							やったら次も、俺が勝ちますよ";
				//変数iの数値を増加
				i++;
				//じゃんけんでパーに負けた場合の条件式を展開
			}else if(userHands == 0 && pcHands == 2){
				//パーに負けた場合の表示文を展開
				result ="俺の勝ち！なんで負けたか、明日までに考えといてください。そしたら何かが見えてくるはずです";
				//変数iの数値を増加
				i++;

			}else{}

			// 判定結果の表示
			String[] hands = { "グー", "チョキ", "パー" };
			//自分のじゃんけんの手の結果を表示
			System.out.println( name + "の手は:" + hands[userHands] );
			//相手のじゃんけんの手の結果を表示
			System.out.println( "相手の手は:" + hands[pcHands]);
			//じゃんけんの結果の文を表示
			System.out.println(result);
			//じゃんけんで自分が勝つまでにかかった回数を表示
			System.out.println("勝つまでにかかった回数は" + i + "回です");

		};
		// Scannerをクローズ
		stbin.close();
	}

}
;