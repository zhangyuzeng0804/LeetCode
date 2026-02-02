package com.zyz.base.function;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yz.zhang
 * @since 2026-01-28
 */

public class Function3 {

  public static void main(String[] args) {
    String s ="abcabcbc";
    System.out.println(lengthOfLongestSubstring(s));
  }

//  public static int lengthOfLongestSubstring(String s) {
//    int max = 0;
//    int start = 0;
//    int end = 0;
//    String str = s.substring(start, end);
//    for (int i = 0; i < s.length(); i++) {
//      char c = s.charAt(i);
//      int index = str.indexOf(c);
//      if (index>=0){
//        start+=index+1;
//      }
//      end++;
//      max= Math.max(end - start, max);
//      str=s.substring(start,end);
//    }
//    return max;
//  }

  public static int lengthOfLongestSubstring(String s) {
    int n = s.length(), ans = 0;
    Map<Character, Integer> map = new HashMap<>();
    for (int end = 0, start = 0; end < n; end++) {
      char alpha = s.charAt(end);
      if (map.containsKey(alpha)) {
        start = Math.max(map.get(alpha), start);
      }
      ans = Math.max(ans, end - start + 1);
      map.put(s.charAt(end), end + 1);
    }
    return ans;
  }

}