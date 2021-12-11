package teamp_5;

import java.util.Scanner;

public class Dev {	//개발의 편의를 위한 클래스
	
	static int randomNum(int range) {	//범위값 파라미터로 지정한 랜덤번호 추출 메소드 
		return(int)(Math.random()*range);
	}

	static boolean yesOrNo() {	//yes or no 입력, 확인 메소드
		do {
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			if (answer.equals("Y") || answer.equals("y")) {
				return true;
			} else if (answer.equals("N") || answer.equals("n")) {
				return false;
			} else {
				System.out.println("Y / N 로 다시 입력해주세요");
			}
		} while (true);
	}
}
