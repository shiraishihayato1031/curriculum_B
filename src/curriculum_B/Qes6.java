package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {


		//Scannerクラスを展開
		Scanner stbin = new Scanner(System.in);
		//入力された文字列を読み取る文章を展開
		String text = stbin.nextLine();
		//入力した値を、で区切る変数zaikoを展開
		String []zaiko =text.split("、");
		//区切りの、を間に挿入する繰り返し文を作成
		for (String item:zaiko){
			System.out.println(item);
			//ランダム変数を展開
			Random random = new Random();
			//ランダム変数の上限を11に指定
			int randomValue = random.nextInt(11);
			//変数xにランダム変数の値を共有
			int x = randomValue;
			//入力ごとに表示を変え分岐式を展開
			switch(item){
			//パソコンと入力された際の処理を展開
			case "パソコン":
				//パソコンと入力された際の文章を展開
				System.out.println("パソコンの残り台数は" + x + "台です。");
				//処理を中断
				break;
				//冷蔵庫と入力された際の処理を展開
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + x + "台です。");
				//処理を中断
				break;
				//扇風機と入力された際の処理を展開
			case "扇風機":
				System.out.println("扇風機の残り台数は" + x + "台です。");
				//処理を中断
				break;
				//洗濯機と入力された際の処理を展開
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + x + "台です。");
				//処理を中断
				break;
				//加湿器と入力された際の処理を展開
			case "加湿器":
				System.out.println("加湿器の残り台数は" + x + "台です。");
				//処理を中断
				break;
				//テレビと入力された際の処理を展開
			case "テレビ":
				System.out.println("テレビの残り台数は" + x + "台です。");
				//処理を中断
				break;
				//ディスプレイと入力された際の処理を展開
			case "ディスプレイ":
				System.out.println("ディスプレイの残り台数は" + x + "台です。");
				//処理を中断
				break;
				//上記以外が入力された際の処理を展開
			default:
				//上記以外が入力された際の表示文を展開
				System.out.println("『その他商品』は指定の商品ではありません");
				//処理を中断
				break;
			};
			//Scannerを閉じる
			stbin.close();
		};
	};
};
