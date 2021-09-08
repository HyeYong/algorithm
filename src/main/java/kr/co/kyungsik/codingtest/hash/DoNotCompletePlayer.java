package kr.co.kyungsik.codingtest.hash;

import java.util.HashMap;

/**
 * 코딩테스트 연습 > 해시 > 완주하지 못한 선수
 *
 * @author : KSRYU
 * @since 2021/09/08
**/
public class DoNotCompletePlayer {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();

		for (String name : participant)
			map.put(name, map.getOrDefault(name, 0) + 1);
		for (String name : completion)
			map.put(name, map.get(name) - 1);

		for (String key : map.keySet()) {
			if (map.get(key) != 0) {
				answer = key;
			}
		}
		return answer;
	}
}
