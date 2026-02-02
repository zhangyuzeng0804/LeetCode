package com.zyz.base.easy;

/**
 *
 * @author yz.zhang
 * @since 2026-01-29
 */

public class Function13 {

  public static void main(String[] args) {
    System.out.println(romanToInt("MCMXCIV"));
  }

//  public static int romanToInt(String s) {
//
//    Map<Character, Integer> map = new HashMap<>();
//    map.put('I', 1);
//    map.put('V', 5);
//    map.put('X', 10);
//    map.put('L', 50);
//    map.put('C', 100);
//    map.put('D', 500);
//    map.put('M', 1000);
//
//    int sum = 0;
//
//    for (int i = 0; i < s.length(); i++) {
//      if (i<s.length()-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
//        sum-=map.get(s.charAt(i));
//      }else {
//        sum+=map.get(s.charAt(i));
//      }
//
//    }
//
//    return sum;
//  }

  public static int romanToInt(String s) {
    s = s.replace("IV","a");
    s = s.replace("IX","b");
    s = s.replace("XL","c");
    s = s.replace("XC","d");
    s = s.replace("CD","e");
    s = s.replace("CM","f");

    int result = 0;
    for (int i=0; i<s.length(); i++) {
      result += which(s.charAt(i));
    }
    return result;
  }

  public static int which(char ch) {
    switch(ch) {
      case 'I': return 1;
      case 'V': return 5;
      case 'X': return 10;
      case 'L': return 50;
      case 'C': return 100;
      case 'D': return 500;
      case 'M': return 1000;
      case 'a': return 4;
      case 'b': return 9;
      case 'c': return 40;
      case 'd': return 90;
      case 'e': return 400;
      case 'f': return 900;
    }
    return 0;
  }
}