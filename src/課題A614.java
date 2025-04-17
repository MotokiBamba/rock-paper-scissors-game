import java.util.Random;
import java.util.Scanner;

public class 課題A614 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		int[] monthInt = {1,2,3,4,5,6,7,8,9,10,11,12};
		String[] monthString = {"January","February","March","April","May","June","July",
				"August","September","October","November","December"};
		System.out.println("英語の月名を入力してください。");
		System.out.println("なお、先頭は大文字で、２文字目以降は小文字とします。");
		int retry;
		int month;
		int v = 12;
		do {
			while(true){
				month = rand.nextInt(12);
				if(v != month) {
					v = month;
				break;
				}
			}
		while(true) {
			System.out.print(monthInt[month]);
			System.out.print("月:");
			String m = stdIn.next();
			
			if(m.equals(monthString[month]))break;
				System.out.println("違います。");
		}
		System.out.print("正解です。");
		do {
			System.out.print("もう一度？ 1…Yes/0…No:");
			retry = stdIn.nextInt();
		}
		while(retry != 0&&retry != 1);
		}
		while(retry == 1);		
	}
}

