package kr.co.kyungsik.codingtest;

import kr.co.kyungsik.codingtest.hash.DoNotCompletePlayer;

public class KyungsikApplication {
	public static void main(String[] args) {
		DoNotCompletePlayer doNotCompletePlayer = new DoNotCompletePlayer();
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};

		System.out.println(doNotCompletePlayer.solution(participant, completion));
	}
}
