import java.util.Random;
import java.util.Scanner;

public class 課題B２ {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		String[] hands = {"グー", "チョキ", "パー"};
		int retry;						

		do {
			int comp1 = rand.nextInt(3);
			int comp2 = rand.nextInt(3);
			int comp3 = rand.nextInt(3);
			int user;
			
			do {
				System.out.print("じゃんけんポン");
				for (int i = 0; i < 3; i++)
					System.out.printf("(%d)%s ", i, hands[i]);
				System.out.print("：");
				user = stdIn.nextInt();
			} while (user < 0 || user > 2);

			System.out.println("CPU1は" + hands[comp1] + "で、CPU2は" + 
									 hands[comp2] + "で、CPU3は"+hands[comp3]+"で、あなたは"+hands[user]+"です。");
			
			int[] a = {user,comp1,comp2,comp3};
			String[] player = {"あなた","CPU1","CPU2","CPU3"};
			int n = 0;
			for(int i = 0;i<a.length;i++) {
				int j = i+1;
				Outer:
				for(;j<a.length;j++) {
					if(a[i]==a[j])
						break Outer;
			}
				if(j==a.length)
					n++;
				}
			int[] b = new int[n];
			int v = 0;
			for(int i = 0;i<a.length;i++) {
				int j = i+1;
				Outer:
				for(;j<a.length;j++) {
					if(a[i]==a[j])
						break Outer;
			}
				if(j==a.length)
					b[v]=a[i];
				if(j==a.length)
					v++;
				}
			if(b.length==3||b.length==1)
				System.out.println("引き分け");
			if(b.length==2) {
				for(int i = 0;i<a.length;i++) {
					int judge = 0;
					if(a[i]==0) {
						for(int j = 0;j<a.length;j++) {
							if(a[j]==2){
								judge++;
							}
						}
						if(judge==0)
							System.out.println(player[i]+":"+"勝ち");
						else
							System.out.println(player[i]+":"+"負け");
					}
					if(a[i]==1) {
							for(int j = 0;j<a.length;j++) {
								if(a[j]==0){
									judge++;
								}
							}
							if(judge==0)
								System.out.println(player[i]+":"+"勝ち");
							else
								System.out.println(player[i]+":"+"負け");
					}
					if(a[i]==2) {
							for(int j = 0;j<a.length;j++) {
								if(a[j]==1){
									judge++;
								}
							}
							if(judge==0)
								System.out.println(player[i]+":"+"勝ち");
							else
								System.out.println(player[i]+":"+"負け");
					}
					}
				}
			
			do {
				System.out.print("もう一度？ (0)いいえ (1)はい：");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 1);
	}
}
