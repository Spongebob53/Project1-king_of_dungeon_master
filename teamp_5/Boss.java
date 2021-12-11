package teamp_5;

public class Boss {
	String bossName, weapon, tile;
	String[][] bossDrop = { { "가고일", "신승용의 검", "초급 모험가" }, { "그리폰", null, "중급 모험가" }, { "나이트메어", null, "모험가" },
			{ "스핑크스", null, "초급 탐험가" }, { "메두사", "방어구", "중급 탐험가" }, { "리치", null, "탐험가" }, { "듀라한", null, "개척자" },
			{ "발록", null, "안내자" }, { "데빌", null, "구원자" }, { "사탄", null, "성인" }, { "드래곤", null, "현인" } };
	Mob mob = new Mob();
	
	void makeBoss() {											// 보스의 정보를 구축하는 메소드
		if (Ch.level > 9 && Ch.bosscnt < bossDrop.length) {		// 캐릭터 레벨이 10이상일 때부터 보스를 도전할 수 있고
			bossName = bossDrop[Ch.bosscnt][0];					// 배열에서 보스의 이름을 가져오기
			weapon = bossDrop[Ch.bosscnt][1];					// 배열에서 보스의 드랍 무기를 가져오기
			tile = bossDrop[Ch.bosscnt][2];						// 배열에서 보스의 드랍 칭호를 가져오기
		}else if(Ch.bosscnt > bossDrop.length-1) {				// 마지막 보스를 구분해서 오류를 방지하기 위해 따로 설정
			bossName = bossDrop[bossDrop.length-1][0];			
			weapon = bossDrop[bossDrop.length-1][1];
			tile = bossDrop[bossDrop.length-1][2];
		}
		mob.mobPrint(bossName);
	}
	
	void loseBoss(int bossAtk, int atk) {						// 보스 패배시 출력 메소드
		Ch.level--;												// 레벨 감소 패널티
		if (bossAtk == atk + 1) {								// 보스와의 능력치 차이가 근소한 상태에서 패배했을때 출력 문구
			System.out.println("해치웠나?");
			System.out.println(Ch.name + "은/는 패배하였습니다.");
		} else {												// 패배 시 출력 문구
			System.out.println(Ch.name + "은/는 패배하였습니다.");
			System.out.println("아직은 부족한가.. 수련이 더 필요해.");
			System.out.println("수련이 더 필요합니다");
		}
	}

	
	void killBoss(int bossLevel) {								// 보스 승리 시 출력메소드
		Dg dg = new Dg();
		Bag bag = new Bag();
		System.out.println();
		System.out.println("====================");
		System.out.println();
		System.out.println(Ch.name + "은/는 승리하였습니다.");
		if (weapon != null && bag.checkWeapon(weapon)) {		// 드랍하는 무기가 있고 인벤토리 확인 과정을 거쳐
			System.out.println("아이템 \"" + weapon + "\" 을/를 획득합니다");
			Ch.atk+=5;											// 무기 획득 당 공격력 5 증가
		}
		System.out.println("칭호 \"" + tile + "\" 을/를 획득합니다");
		System.out.println("경험치 " + bossLevel + " 을/를 획득합니다");
		System.out.println();
		System.out.println("====================");
		System.out.println();
		System.out.println("너는 내 상대가 되지 못해!");
		Ch.exp += bossLevel;									// 경험치 획득
		Ch.bosscnt ++;											// 다음 보스 도전 가능
		Ch.atk++;												// 칭호 획득 시 공격력 1 증가
		dg.levelUp();											// 경험치, 레벨업 체크
		bag.inputBag(weapon, tile);								// 무기와 타이틀을 캐릭터 정보에 저장
		if (bossLevel > 100) {									// 마지막 보스 클리어 시
			Game_starter gs = new Game_starter();				
			Ch.bosscnt = 0;										// 보스 클리어 정보를 리셋하고
			gs.start_end();										// 용사는 다시 기억을 잃고 진행한다
		}
	}
}