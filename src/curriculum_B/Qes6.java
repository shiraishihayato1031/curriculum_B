package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		

		
		Scanner stbin = new Scanner(System.in);
		
		String text = stbin.nextLine();
	
		String []zaiko =text.split("、");
		
		for (String item:zaiko){
			  System.out.println(item);
			  
				Random random = new Random();
				int randomValue = random.nextInt(11);
				
				int x = randomValue;
			  
				switch(item){
				  case "パソコン":
				  System.out.println("パソコンの残り台数は" + x + "台です。");
				    break;
				  case "冷蔵庫":
					  System.out.println("冷蔵庫の残り台数は" + x + "台です。");
				    break;
				  case "扇風機":
				  	  System.out.println("扇風機の残り台数は" + x + "台です。");
				  	break;
				  case "洗濯機":
				  	  System.out.println("洗濯機の残り台数は" + x + "台です。");	  	  
				  	break;
				  case "加湿器":
				  	  System.out.println("加湿器の残り台数は" + x + "台です。");	 		  	
				  	break;
				  case "テレビ":
				  	  System.out.println("テレビの残り台数は" + x + "台です。");	 		  	
				  	break;				  	
				  case "ディスプレイ":
				  	  System.out.println("ディスプレイの残り台数は" + x + "台です。");	 		  	
				  	break;				  	
				  default:
					  System.out.println("『その他商品』は指定の商品ではありません");
					  break;
				}
stbin.close();
			}
		
		


	}
	}
