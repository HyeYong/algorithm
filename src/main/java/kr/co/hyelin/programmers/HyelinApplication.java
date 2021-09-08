package kr.co.hyelin.programmers;

import kr.co.hyelin.programmers.hash.Lv1;
import kr.co.hyelin.programmers.hash.Lv2;

public class HyelinApplication {
	public static void main(String[] args) {

		/*  Lv1 - 완주하지 못한 선수 */
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};

		System.out.println(Lv1.solution(participant, completion));



		/* Lv2 - 전화번호 목록 */
		String[] phone_book = {"119", "97674223", "1195524421"};

		System.out.println(Lv2.solution(phone_book));
	}
}
