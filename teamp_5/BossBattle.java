package teamp_5;

public class BossBattle {
	Boss boss = new Boss();
	
	void playBoss() {	//보스 진입 확인 메소드
		System.out.println("보스던전 입장? Y/N");
		if (Dev.yesOrNo()) {
			boss.makeBoss();
			Battle();
		}
		System.out.println("마을로 귀환합니다");
		Town.village();
	}
	
	void Battle() {										// 보스 전투 진행 메소드
		int bossLevel = (Ch.bosscnt+1) * 10 + 2;		// 보스는 12, 22, 32, 단위로 레벨이 지정되고
		int bossAtk = bossLevel;						// 공격력은 레벨수치와 동일하게 주어진다
		Story bossStory = new Story();
		bossStory.bossStory();
		System.out.println("전투를 진행하시겠습니까? Y/N");
		if (Dev.yesOrNo()) {							// 보스와 캐릭터의 능력치를 비교하여
			if (bossAtk > Ch.atk) {						// 보스의 능력치가 더 높으면
				boss.loseBoss(bossAtk, Ch.atk);			// 패배하고
			} else if (bossAtk <= Ch.atk) {				// 캐릭터의 능력치가 더 높으면
				boss.killBoss(bossLevel);				// 승리한다
			}
		}
	}
	
}
