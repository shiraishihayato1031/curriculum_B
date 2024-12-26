package curriculum_B;

import java.util.ArrayList;
import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {
		
	Scanner stbin = new Scanner(System.in);
		
	System.out.print("生徒の人数を入力してください(2人以上) :");
	
	int n = stbin.nextInt();
	
	int i = 1;
	
	System.out.println(n);
	
	ArrayList<Integer> num = new ArrayList<Integer>();
	
	while(i <= n) {
		
		System.out.print(i+"人目の『英語』の点数を入力してください:");
		int v = stbin.nextInt();
		num.add(v);

		System.out.print(i+"人目の『数学』の点数を入力してください:");
		 v = stbin.nextInt();
		 num.add(v);
		
		System.out.print(i+"人目の『理科』の点数を入力してください:");
		 v = stbin.nextInt();
		 num.add(v);
		
		System.out.print(i+"人目の『社会』の点数を入力してください:");
        v = stbin.nextInt();
        num.add(v);
        

		}
	
	for(int x = 0; i < num.length; i ++) {
		System.out.println((x + 1) + "人目のスコアは " + num[x]);
	
        System.out.println("");
        
        System.out.println(num);
        
        System.out.plintln()
        
        i++;
	};
	
	
	
	stbin.close();
	}
}
