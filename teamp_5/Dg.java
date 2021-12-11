package teamp_5;

import java.util.Scanner;

public class Dg {

	static int mobLevel, mobAtk;
	Mob mob = new Mob();
	
	void dungeon() {	//던전 플레이 메소드
outer:		do {
				Menu.pickMenu();
				for(int i = 0; i < Dev.randomNum(10); i++) {			// 불규칙적인 상황을 구현하기 위해
					if(i == 3) {										// 걷는 횟수를 랜덤으로
						System.out.println("계속 걸으시겠습니까? Y/N");
						if(!Dev.yesOrNo()) {
							System.out.println("던전을 빠져나갑니다");
							break outer;
						}
					}else if(i%2==0) {
						System.out.println("터벅터벅...");
					}else {
						System.out.println("터벅..터벅..");
					}
				}
				mob.mobAppear(Ch.level);								// 전투 진행
				System.out.println("전투를 진행하시겠습니까? Y/N");
				if(Dev.yesOrNo()) {
					if(mobAtk > Ch.atk) {								// 몹의 능력치가 유저보다 우세할 경우
						System.out.println("간신히 도망쳤다..!");
						break;
					}else if(mobAtk == Ch.atk) {						// 몹의 능력치가 동일할 경우
						System.out.println("허억, 허억, 치열한 전투였다");
					}
					Ch.exp += mobLevel;									// 경험치 획득
					System.out.println(mobLevel + "경험치를 획득합니다");
				}else {
					System.out.println("던전을 빠져나갑니다");
					break;
				}		
				levelUp();
			}while(true);
			Town.village();
	}

	void levelUp() {													// 레벨업 메소드
	      while(Ch.exp >= Ch.maxExp){									// 획득 후 경험치가 경험치 총량을 넘었을 경우
	         Ch.exp -= Ch.maxExp;										// 경험치 초과분만 남기고
	         Ch.level ++;												// 레벨과 공격력을 1씩 증가시킨다
	         Ch.atk ++;
	         System.out.println("레벨이 증가했습니다");
	      }
	      System.out.println("레벨 " + Ch.level);
	      System.out.println("경험치 " + Ch.exp);
	   }
}
