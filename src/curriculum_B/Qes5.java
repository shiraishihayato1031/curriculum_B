package curriculum_B;

public class Qes5 {
	public static void main(String[]args){
		for (int i =01;i <= 9;i++) {
			for(int x = 01; x <= 20; x++) {
				System.out.printf("%03d*%03d=%03d", x, i, i * x);
				System.out.print( x == 20 ? "\n" : " || ");

		}	
		}
	}

}
