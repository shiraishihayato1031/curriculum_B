package curriculum_B;

public class Qes4 {
	public static void main(String[]args){
		for (int i =01;i <= 9;i++) {
			for(int x = 01; x <= 9; x++) {
				System.out.printf("%02d*%02d=%02d", i, x, i * x);
				System.out.print( x == 9 ? "\n" : " || ");

		}	
		}
	}
	};
