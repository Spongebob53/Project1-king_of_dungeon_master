package teamp_5;

import java.util.Scanner;

public class Ch {

	static String name, job;									// 유저에 대한 기본 정보들을 담는 변수
	static int level, atk, exp, bosscnt;
	static int maxExp = 9 + level;
    static String[][] tiIven; 
	Story story = new Story();

	void userName() {											// 유저 이름 설정 메소드
		Scanner sc = new Scanner(System.in);
		System.out.println("「나의 이름은 누구지...?」");
		System.out.println("이름을 입력해주세요.");
		name = sc.next();
		sc.nextLine();
	}
	
	void login() {												// 유저 이름 출력 메소드
		userName();
		System.out.println("반갑습니다." + Ch.name + "용사님.");
		System.out.println();
		System.out.println("게임 진행하시겠습니까? Y/N");
	}
	
	void firstCh() {											// 게임 시작전 캐릭터 기본정보 출력 메소드
		if (Dev.yesOrNo()) {
			story.firstStory();
			story.pogressStory();
		}
		if (Dev.yesOrNo()) {
			System.out.println("용사의 스테이터스입니다");
			level = 1; 
			atk = 1;
			exp = 0;
			System.out.println("레벨 : " + level);
			System.out.println("경험치 : " + exp);
			System.out.println("공격력 : " + atk);
			story.pogressStory();
		}
		if (Dev.yesOrNo()) {
			System.out.println("용사의 인벤토리입니다.");
			tiIven = new String[2][12];
			JTInven weapone = new JTInven();
			weapone.showInven();
			story.pogressStory();
		}
		if (Dev.yesOrNo()) {
			System.out.println("용사의 칭호입니다.");
			JTInven title = new JTInven();
			tiIven[1][0]="초보자"; 
			title.showTitle(); 
			story.pogressStory();
		}
		if (Dev.yesOrNo()) {
			System.out.println("현재 직업을 확인합니다.");
			JTInven job = new JTInven();
			job.showJobs();
			story.pogressStory();
		}
		if (Dev.yesOrNo()) {
			story.jobStory();
			story.pogressStory();
		}
		if (Dev.yesOrNo()) {
			System.out.println("「과거의 기억」");
			story.dgStory();
			story.pogressStory();
		}
		if (Dev.yesOrNo()) {
			System.out.println("입장합니다.");
		}
	}
}
