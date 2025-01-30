package curriculum_B;

import java.util.ArrayList;

/******************************************************************************
 * [概要]生徒成績管理プログラム
 * [詳細]一人ごと、並びに各科目、全体の平均点を算出する
 */

/*----------------------------------------------------------------------------
 * [概要]スキャナーの宣言、合計点計算式展開の前準備
 ---------------------------------------------------------------------------*/

import java.util.Scanner;

public class Qes7 {
	//arraylist numの前準備
	public static int sum(ArrayList<Integer> list) {
		//変数numに数値を代入
		int sum = 0;
		//arraylist listを変数numに挿入
		for (int num : list) {
			//変数sumに変数numを同期させる
			sum += num;
		}
		//変数numに値を返す
		return sum;
	};

	/*----------------------------------------------------------------------------
	 * [概要]スキャナーの宣言、合計点計算式展開の前準備
 ---------------------------------------------------------------------------*/

	public static void main(String[] args) {
		//Scannerを起動し、人数入力のコンソールを起動
		Scanner stbin = new Scanner(System.in);
		//人数を入力する案内と注意を表示
		System.out.print("生徒の人数を入力してください(2人以上) :");
		//入力された数値を読み取る
		int n = stbin.nextInt();
		//人数を数えるための変数iを宣言
		int i = 1;
		//一人ごとの平均を出すための変数manを宣言
		int man = 1;
		//arraylist numを作成
		ArrayList<Integer> num = new ArrayList<Integer>();
		//arraylist Englishを作成
		ArrayList<Integer> English = new ArrayList<Integer>();
		//arraylist Mathを作成
		ArrayList<Integer> Math = new ArrayList<Integer>();
		//arraylist Scienceを作成
		ArrayList<Integer> Science = new ArrayList<Integer>();
		//arraylist Societyを作成
		ArrayList<Integer> Society = new ArrayList<Integer>();


		//各教科ごとの点数を読み取る条件式を作成
		while(i <= n) {
			//英語の点数読み取りの欄を作成。
			System.out.print(i+"人目の『英語』の点数を入力してください:");
			//入力された数値を読み取る変数を宣言
			int v = stbin.nextInt();
			//arraylist numに入力された値を収納
			num.add(v);
			//arraylist Englishに入力された値を収納
			English.add(v);


			//数学の点数読み取りの欄を作成
			System.out.print(i+"人目の『数学』の点数を入力してください:");
			//入力された数値を読み取る変数を宣言
			v = stbin.nextInt();
			//arraylist numに入力された値を収納
			num.add(v);
			//arraylist Mathに入力された値を収納
			Math.add(v);


			//理科の点数読み取りの欄を作成
			System.out.print(i+"人目の『理科』の点数を入力してください:");
			//入力された数値を読み取る変数を宣言
			v = stbin.nextInt();
			//arraylist numに入力された値を収納
			num.add(v);
			//arraylist Scienceに入力された値を収納
			Science.add(v);


			//社会の点数読み取りの欄を作成
			System.out.print(i+"人目の『社会』の点数を入力してください:");
			//入力された数値を読み取る変数を宣言
			v = stbin.nextInt();
			//arraylist numに入力された値を収納
			num.add(v);
			//arraylist Societyに入力された値を収納
			Society.add(v);
			//表示をわかり約するため、空欄を入れ改行
			System.out.println("");
			//変数iの値を増加させる
			i++;
		};
		//一人ごとの平均点を表示する繰り返し文を作成
		for(int s = 0;s < n; s++) {
			//一人ごとの全科目の平均点を計算する式を作成
			double ave = (English.get(s)+Math.get(s)+Science.get(s)+Society.get(s))/4.00;
			//一人ごとの平均点をコンソールに表示「
			System.out.printf( "%d人目の平均点は%.2f点です。\n",man,ave);
			//変数manの値を増加
			man++;

		};
		//表示のため、一行分改行
		System.out.println("");
		//変数aに変数nを同期させる
		double a = n;
		//変数numの要素数を獲得する変数をお展開
		double con = num.size();
		//英語の平均点を算出する式を展開
		double Eng = sum(English)/a;
		//数学の平均点を算出する式を展開
		double Ma = sum(Math)/a;
		//理科の平均点を算出する式を展開
		double Sci = sum(Science)/a;
		//社会の平均点を算出する式を展開
		double Soc = sum(Society)/a;
		//全科目の平均点を算出する式を展開
		double All = sum(num)/con;
		//英語の平均点をコンソールに表示
		System.out.printf("英語の平均点は%.2fです。\n",Eng);
		//数学の平均点をコンソールに表示
		System.out.printf("数学の平均点は%.2fです。\n",Ma);
		//理科の平均点をコンソールに表示
		System.out.printf("理科の平均点は%.2fです。\n",Sci);
		//社会の平均点をコンソールに表示
		System.out.printf("社会の平均点は%.2fです。\n",Soc);
		//全科目の平均点をコンソールに表示
		System.out.printf("全体の平均点は%.2fです。",All);
		// Scannerをクローズ
		stbin.close();
	};
};
