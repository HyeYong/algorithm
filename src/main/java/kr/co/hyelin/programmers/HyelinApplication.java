package kr.co.hyelin.programmers;

import kr.co.hyelin.programmers.hash.Lv1;

public class HyelinApplication {
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};

		System.out.println(Lv1.solution(participant, completion));
	}
}
