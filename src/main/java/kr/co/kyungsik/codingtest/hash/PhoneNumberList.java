package kr.co.kyungsik.codingtest.hash;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 코딩테스트 연습 > 해시 > 전화번호 목록
 *
 * @author : KSRYU
 * @since 2021/09/08
 **/
public class PhoneNumberList {
	public boolean solution(String[] phone_book) {
		Arrays.sort(phone_book);
		for (int i = 0; i < phone_book.length - 1; i++) {
			if (phone_book[i + 1].startsWith(phone_book[i])) {
				return false;
			}
		}

		return true;
	}

	public boolean hashSolution(String[] phone_book) {
		HashSet<String> set = new HashSet<>(Arrays.asList(phone_book));

		for (String number : set) {
			for (int i = 0; i < number.length(); i++) {
				if (set.contains(number.substring(0, i))) {
					return false;
				}
			}
		}

		return true;
	}
}
