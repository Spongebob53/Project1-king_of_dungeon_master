package teamp_5;

public class JTInven {
	
	void showTitle(){												// 칭호 출력 메소드
		for (int i = 0; i <= 9; i++) {
			if(Ch.tiIven[1][i]!=null) {
				System.out.println("보유칭호: "+Ch.tiIven[1][i]);
			}else if(Ch.tiIven[1][i]==null) {
					System.out.println("보유칭호: 추가 획득 가능");
					break;
			}
		}
	}
	
	void showInven() {												// 인벤토리 출력 메소드
		for (int i = 0; i <= 9; i++) {
			if (Ch.tiIven[0][i]!= null) {							// 인벤토리에 저장된 값이 있으면
				System.out.println("보유무기: " + Ch.tiIven[0][i]);	// 해당 정보를 출력해주고
			} else if (Ch.tiIven[0][i] == null) {					// 없을 경우 추가획득 가능을 출력
				System.out.println("보유무기: 추가 획득 가능");
				break;												// 추가 획득 문구는 한번만 출력이 가능하도록 설정
			}
		}
	}
	
	void showJobs() {												// 직업 출력 메소드
		if(Ch.level>=1&&Ch.level<=10) {
			Ch.job="모험가";
			System.out.println("직업: "+Ch.job);
		}else if(Ch.level>=11&&Ch.level<=30){
			Ch.job="견습 용사";
			System.out.println("직업: "+Ch.job);
		}else if(Ch.level>=31&&Ch.level<=60){
			Ch.job="중급 용사";
			System.out.println("직업: "+Ch.job);
		}else if(Ch.level>=61&&Ch.level<=80){
			Ch.job="고급 용사";
			System.out.println("직업: "+Ch.job);
		}else if(Ch.level>=81){
			Ch.job="King of DunGeon master";
			System.out.println("직업: "+Ch.job);
		}else {
			
		}
	}
	
	
}
