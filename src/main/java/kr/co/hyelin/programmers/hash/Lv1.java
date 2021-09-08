package kr.co.hyelin.programmers.hash;

import java.util.Arrays;
import java.util.HashMap;

public class Lv1 {
    public static String solution(String[] participant, String[] completion) {
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        int i;
//
//        for(i=0; i<completion.length; i++) {
//            if(!participant[i].equals(completion[i]))
//                return participant[i];
//        }
//
//        return participant[i];


        HashMap<String, Integer> participantHash = new HashMap<>();

        for(String player : participant) {
            participantHash.put(player, participantHash.getOrDefault(player, 0) + 1);
        }
        for(String player : completion) {
            participantHash.put(player, participantHash.get(player) - 1);
        }

        for(String key : participantHash.keySet()) {
            if(participantHash.get(key) != 0) {
                return key;
            }
        }

        return "";
    }
}
