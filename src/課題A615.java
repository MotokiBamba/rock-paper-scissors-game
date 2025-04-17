import java.util.Random;
import java.util.Scanner;

public class 課題A615 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] a = {"月","火","水","木","金","土","日"};
		String[] b = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		System.out.println("英語の曜日名を小文字で入力してください。");
		int retry;
		int month;
		int v = 7;
		do {
			while(true) {
				month = rand.nextInt(7);
				if(v != month) {
					v = month;
					break;
				}
			}
			while(true) {
				System.out.print(a[month]);
				System.out.print("曜日:");
				String m = stdIn.next();

				if(m.equals(b[month]))break;
				System.out.println("違います。");
			}
			System.out.print("正解です。");
			do {
				System.out.print("もう一度？ 1…Yes/0…No:");
				retry = stdIn.nextInt();
			}while(retry != 0&&retry != 1);
		}
		while(retry == 1);		
	}
}

