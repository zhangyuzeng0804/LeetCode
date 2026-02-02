package com.zyz.base.function;

/**
 *
 * @author yz.zhang
 * @since 2026-01-30
 */

public class Function14 {

  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
  }
  public static String longestCommonPrefix(String[] strs) {

    StringBuilder result = new StringBuilder();
    int strLength = strs.length;
    int min=strs[0].length();
    for (int i = 0; i < strLength; i++) {
      min = Math.min(min,strs[i].length());
    }

    for (int i = 0; i < min; i++) {
      int j=0;
      char c = strs[j].charAt(i);
      for (; j < strLength; j++) {
        if (strs[j].charAt(i)!=c){
          break;
        }
      }
      if (j==strLength){
        result.append(c);
      }else {
        break;
      }
    }
    return result.toString();

  }
}



