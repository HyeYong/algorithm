package kr.co.hyelin.programmers.hash;

import java.util.Arrays;
import java.util.HashSet;

public class Lv2 {

    public static boolean solution(String[] phone_book) {

//        HashSet<String> phoneBookSet = new HashSet<>();
//
//        for(String phoneNumber : phone_book) {
//            phoneBookSet.add(phoneNumber);
//        }
//
//        for(String phoneNumber : phoneBookSet) {
//            for (int i = 1; i < phoneNumber.length(); i++) {
//                if(phoneBookSet.contains(phoneNumber.substring(0, i))) {
//                    return false;
//                }
//            }
//        }
//
//        return true;

        Arrays.sort(phone_book);

        for(int i=0; i<phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }

}
