package kr.co.kyungsik.codingtest;

import kr.co.kyungsik.codingtest.hash.DoNotCompletePlayer;
import kr.co.kyungsik.codingtest.hash.PhoneNumberList;

public class KyungsikApplication {
	public static void main(String[] args) {
		// 코딩테스트 > 해시 > 완주하지 못한 선수
		DoNotCompletePlayer doNotCompletePlayer = new DoNotCompletePlayer();
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		System.out.println(doNotCompletePlayer.solution(participant, completion));

		// 코딩테스트 > 해시 > 전화번호 목록
		PhoneNumberList phoneNumberList = new PhoneNumberList();
		String[] phone_book = {"119", "97674223", "1195524421"};
		System.out.println(phoneNumberList.solution(phone_book));
	}
}
