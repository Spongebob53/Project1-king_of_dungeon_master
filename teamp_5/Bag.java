package teamp_5;

public class Bag {
	
	boolean checkWeapon(String weapon) {				// 무기 획득시 인벤토리에 동일한 무기가 있는지 체크하는 메소드
		for(int i = 0; i < Ch.tiIven.length; i++) {		// 인벤토리 전부의 범위에서
			if(Ch.tiIven[0][i] != null) {				// 인벤토리에 정보가 있을 때
				if(Ch.tiIven[0][i].equals(weapon)) {	// 획득한 무기와 비교하여 같으면
					return false;						// false를 반환하여 실행하지 않는다
				}
			}
		}
		return true;									// 그렇지 않을 경우 true를 반환하여 실행한다
	}
	
	void inputBag (String weapon, String tile) {		// 아이템 또는 칭호를 캐릭터 정보에 저장하는 메소드
		Ch.tiIven[1][Ch.bosscnt] = tile;				// 보스처치시 해당하는 칭호를 캐릭터 정보에 저장하고
		for (int i = 0; i < Ch.tiIven.length; i++) {	// 모든 보유 타이틀의 범위에서
			if (Ch.tiIven[0][i] == null && weapon != null) {	// 인벤토리가 비어있는 공간을 찾고, 드랍한 무기가 있다면
				if(i == 0) {
					Ch.tiIven[0][i] = weapon;					// 첫번째 무기 획득시에는 그냥 저장하고
					break;
				}else if(Ch.tiIven[0][i-1] != weapon){			// 두번째부터는 무기가 획득한 무기와 같지 않다면
					Ch.tiIven[0][i] = weapon;					// 인벤토리에 저장한다
					break;
				}		
			}
		}
	}
}
