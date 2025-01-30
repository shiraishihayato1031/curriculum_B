package curriculum_B;

public class Qes4 {
	public static void main(String[]args){
		//変数iの値が9になるまでの繰り返し文を定義
		for (int i =1;i <= 9;i++) {
			//変数xの値が9になるまでの繰り返し文を定義
			for(int x = 1; x <= 9; x++) {
				//変数iとxの掛け算の式をコンソールに表示
				System.out.printf("%02d*%02d=%02d", i, x, i * x);
				//変数xの条件が達成された際に改行する文を展開
				System.out.print( x == 9 ? "\n" : " || ");

			}	
		}
	}
};
