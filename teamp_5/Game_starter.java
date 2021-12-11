package teamp_5;

import java.util.Scanner;

public class Game_starter {		//게임 실행 클래스

	void start_end(){			//게임 메소드
		Ch Char = new Ch();
		Dg dg = new Dg();
		
		Char.login();
		Char.firstCh();
		dg.dungeon();
		}
	
	public static void main(String[] args) {

		Story st = new Story();
		Game_starter gs = new Game_starter(); 
		
		st.startPrint();
		gs.start_end();
		

	}

}
