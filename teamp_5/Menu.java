package teamp_5;

import java.util.Scanner;

public class Menu {
	
	static void pickMenu() {	//메뉴 메소드
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : " + Ch.name);
		System.out.println("스테이터스 S , 인벤토리 I , 마을 귀환 V , 전투진행 Y , 보스도전 B , 칭호확인 T");
		String answer = sc.nextLine();
		while (true) {
			if (answer.equals("S") || answer.equals("s")) {		//유저 입력값에 따른 메소드 실행
				System.out.println("이름 : " + Ch.name);
				JTInven job = new JTInven();
				job.showJobs();
				System.out.println("레벨 : " + Ch.level);
				System.out.println("경험치 : " + Ch.exp);
				System.out.println("공격력 : " + Ch.atk);
				pickMenu();
				break;
			} else if (answer.equals("I") || answer.equals("i")) {
				JTInven weapone = new JTInven();
				weapone.showInven();
				pickMenu();
				break;
			} else if (answer.equals("T") || answer.equals("t")) {
				JTInven title = new JTInven();
				title.showTitle();
				pickMenu();
				break;
			} else if (answer.equals("V") || answer.equals("v")) {
				Town.village();
			} else if (answer.equals("Y") || answer.equals("y")) {
				break;
			} else if (answer.equals("B") || answer.equals("b")) {
				if (Ch.level >= 10) {
					BossBattle bossbattle = new BossBattle();
					bossbattle.playBoss();
				} else if (Ch.level <= 9) {									// 보스 도전 레벨을 10레벨 부터로 제한
					System.out.println("레벨이 부족합니다.");
					System.out.println("일정 레벨 이상일 경우 도전가능합니다.");
					pickMenu();
					break;
				}
			} else {
				System.out.println("다시 입력해주세요.");
				pickMenu();
				break;
			}
		}
	}
}
