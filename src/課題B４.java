import java.util.Random;
import java.util.Scanner;

public class 課題B４ {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		String[] hands = {"グー", "チョキ", "パー"};
		int retry;
		int[] c; 

		do {
			System.out.print("CPUの数:");
			int x = stdIn.nextInt();
			
			do {
		    int user;
			int[] a = new int[x];
			for(int i = 0;i<a.length;i++) {
				int y = rand.nextInt(3);
				a[i] = y;
			}
			
			do {
				System.out.print("じゃんけんポン");
				for (int i = 0; i < 3; i++)
					System.out.printf("(%d)%s ", i, hands[i]);
				System.out.print("：");
				user = stdIn.nextInt();
			} while (user < 0 || user > 2);
			
			for(int i = 0;i<a.length;i++) {
				System.out.print("CPU"+(i+1)+"は"+hands[a[i]]+"で、");
			}
			System.out.println("あなたは"+hands[user]+"です。");
			

			String[] player = new String[x+1];
			player[0] = "あなた";
			for(int i = 1;i<player.length;i++) {
				player[i] = "CPU"+i;
			}
			int[] b = new int[x+1];
			b[0] = user;
			for(int i = 0;i<a.length;i++) {
				b[i+1]=a[i];
			}
			int n = 0;
			for(int i = 0;i<b.length;i++) {
				int j = i+1;
				Outer:
				for(;j<b.length;j++) {
					if(b[i]==b[j])
						break Outer;
			}
				if(j==b.length)
					n++;
				}
			 c = new int[n];
			int v = 0;
			for(int i = 0;i<b.length;i++) {
				int j = i+1;
				Outer:
				for(;j<b.length;j++) {
					if(b[i]==b[j])
						break Outer;
			}
				if(j==b.length)
					c[v]=b[i];
				if(j==b.length)
					v++;
				}
			if(c.length==3||c.length==1)
				System.out.println("引き分け");
			if(c.length==2) {
				for(int i = 0;i<b.length;i++) {
					int judge = 0;
					if(b[i]==0) {
						for(int j = 0;j<b.length;j++) {
							if(b[j]==2){
								judge++;
							}
						}
						if(judge==0)
							System.out.println(player[i]+":"+"勝ち");
						else
							System.out.println(player[i]+":"+"負け");
					}
					if(b[i]==1) {
							for(int j = 0;j<b.length;j++) {
								if(b[j]==0){
									judge++;
								}
							}
							if(judge==0)
								System.out.println(player[i]+":"+"勝ち");
							else
								System.out.println(player[i]+":"+"負け");
					}
					if(b[i]==2) {
							for(int j = 0;j<b.length;j++) {
								if(b[j]==1){
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
			}while(c.length==3||c.length==1);
			
			do {
				System.out.print("もう一度？ (0)いいえ (1)はい：");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 1);
	}
}
