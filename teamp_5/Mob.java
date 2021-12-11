package teamp_5;

public class Mob {
	
	void mobAppear(int level) {		//일반던전 몬스터 정보 구축 메소드
		String[] mobs = { "트롤", "그렘린", "고블린", "님프", "서큐버스", "드워프", "리자드맨", "미믹", "베히모스", "슬라임", "세이렌", "앤트", "예티",
				"오크", "오우거" }; 							// 출현 몬스터 배열
		String mob = mobs[Dev.randomNum(mobs.length)];		// 몬스터의 배열에서 랜덤으로 등장
		Dg.mobLevel = (level/5)*5;							// 레벨은 5단위로 끊기면서
		if(Dg.mobLevel < 1) {								// 1레벨때는
			Dg.mobLevel = 1;								// 몹의 레벨이 1로 고정
		}
		Dg.mobAtk = Dev.randomNum(5)+level-3;				// 몹의 공격력은 20% 확률로 유저보다 강하게 설정
		if(Dg.mobAtk < 1) {
			Dg.mobAtk = 1;									// 역시 1레벨때는 1로 고정
		}
		mobPrint(mob, Dg.mobLevel, Dg.mobAtk);
	}

	void mobPrint(String mob, int mobLevel, int mobAtk) {	// 몬스터 출현 메소드
		System.out.println();
		System.out.println("====================");
		System.out.println();
		System.out.println(mob + " 이/가 등장했습니다!!");
		System.out.println();
		System.out.println("레벨\t공격력");
		System.out.println(mobLevel + "\t" + mobAtk);
		System.out.println();
		System.out.println("====================");
		System.out.println();
	}
	
	void mobPrint(String mob) {								// 보스 몬스터 출현 메소드
		System.out.println();
		System.out.println("====================");
		System.out.println();
		System.out.println(mob + " 이/가 등장했습니다!!");
		System.out.println();
		System.out.println("레벨\t공격력");					// 보스 몬스터의 능력치는 비공개
		System.out.println("???\t???");
		System.out.println();
		System.out.println("====================");
		System.out.println();
	}
	
}
