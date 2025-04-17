import java.util.Random;
import java.util.Scanner;

public class 課題B１ {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		String[] hands = {"グー", "チョキ", "パー"};
		int retry;						

		do {
			int comp1 = rand.nextInt(3);
			int comp2 = rand.nextInt(3);
			int user;
			
			do {
				System.out.print("じゃんけんポン");
				for (int i = 0; i < 3; i++)
					System.out.printf("(%d)%s ", i, hands[i]);
				System.out.print("：");
				user = stdIn.nextInt();
			} while (user < 0 || user > 2);

			System.out.println("CPU1は" + hands[comp1] + "で、CPU2は" + 
									 hands[comp2] + "で、あなたは"+hands[user]+"です。");
			
			int judge = (user+comp1+comp2)%3;
			if(judge==0) {
				System.out.println("引き分け");
			}
			if(judge==2) { 
				if(comp1==comp2)
					System.out.println("あなた:勝ち\nCPU1:負け\nCPU2:負け");
			    if(user==comp2)
			    	System.out.println("あなた:負け\nCPU1:勝ち\nCPU2:負け");
			    if(user==comp1)
			    	System.out.println("あなた:負け\nCPU1:負け\nCPU2:勝ち");
			}
			if(judge==1) { 
				if(comp1==comp2)
					System.out.println("あなた:負け\nCPU1:勝ち\nCPU2:勝ち");
			    if(user==comp2)
			    	System.out.println("あなた:勝ち\nCPU1:負け\nCPU2:勝ち");
			    if(user==comp1)
			    	System.out.println("あなた:勝ち\nCPU1:勝ち\nCPU2:負け");
			}
				
			do {
				System.out.print("もう一度？ (0)いいえ (1)はい：");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 1);
	}
}
