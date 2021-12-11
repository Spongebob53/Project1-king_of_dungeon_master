package teamp_5;

import java.util.Scanner;

public class Town {		//마을 구현 클래스
	
	static void village() {
		Scanner sc = new Scanner(System.in);
		System.out.println("여기는 모험가의 쉼터입니다.");
		System.out.println("당신의 기력은 모두 회복되었습니다. ");
		System.out.println("던전으로 돌아가시겠다면 D를 눌러주세요 ");
		String answer = sc.nextLine();
		while (true) {
			if (answer.equals("D") || answer.equals("d")) {
				System.out.println("던전으로 돌아갑니다.");
				Dg dg = new Dg();
				dg.dungeon();
			} else {
				System.out.println("아직 휴식이 필요합니다.");
				village();
			}
		}
	}
}
