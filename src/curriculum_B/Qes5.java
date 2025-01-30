package curriculum_B;

public class Qes5 {
	public static void main(String[]args){
		//変数iを定義し、変数iの値が9になるまでの繰り返し文を展開
		for (int i =1;i <= 9;i++) {
			//変数xを定義し、変数xの値が20になるまでの繰り返し文を展開
			for(int x = 1; x <= 20; x++) {
				//変数iとxの掛け算の式をコンソールに表示
				System.out.printf("%03d*%03d=%03d", x, i, i * x);
				//変数xの条件が達成された際に改行する文を展開
				System.out.print( x == 20 ? "\n" : " || ");

			};
		};
	};

};
