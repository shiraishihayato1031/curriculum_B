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

		int winCount = 0;

		int i = 0;
		
		String result = "";

		Scanner stbin = new Scanner(System.in);
		while(winCount < 1) {

			System.out.println("ユーザー名「"+name+"」を登録しました。");

			int userHands = stbin.nextInt();

		while (userHands < 0 || userHands > 2) {

			 userHands = stbin.nextInt();

			}

				Random rand = new Random();

				int pcHands = rand.nextInt(3);

				

			if(userHands == pcHands){

				 result = "DRAW あいこ もう一回しましょう";

			} else if ((userHands == 0 && pcHands == 1) ||
	                	(userHands == 1 && pcHands == 2) ||
	                	(userHands == 2 && pcHands == 0)) {

				result = "やるやん。次は俺にリベンジさせて";

				i++;

				} else if (userHands == 1 && pcHands == 0 ){

				result = "俺の勝ち！負けは次につながるチャンスです！ネバーギブ					アップ！";

				i++;

				}else if (userHands == 2  && pcHands == 1){

				result = "俺の勝ち！たかがじゃんけん、そう思ってないですか？それ							やったら次も、俺が勝ちますよ";

				i++;

				}else if(userHands == 0 && pcHands == 2){

					result ="俺の勝ち！なんで負けたか、明日までに考えといてください。そしたら何かが見えてくるはずです";

				i++;

				}else{}

					// 判定結果の表示
			String[] hands = { "グー", "チョキ", "パー" };
			System.out.println( name + "の手は:" + hands[userHands] );

			System.out.println( "相手の手は:" + hands[pcHands]);

			System.out.println(result);

			System.out.println("勝つまでにかかった回数は" + i + "回です");

			};
		// Scannerをクローズ
			stbin.close();
			}

		}
;