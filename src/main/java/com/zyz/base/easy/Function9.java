package com.zyz.base.easy;

/**
 *
 * @author yz.zhang
 * @since 2026-01-28
 */

public class Function9 {

  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
  }

//  public static boolean isPalindrome(int x) {
//    if (x<0){
//      return false;
//    }
//    String str = String.valueOf(x);
//
//    for (int i = 0; i <= str.length() / 2; i++) {
//      if (str.charAt(i)!=str.charAt(str.length()-i-1)){
//        return false;
//      }
//    }
//    return true;
//
//  }

  public static boolean isPalindrome(int x) {

    if(x < 0) return false;
    int cur =0;
    int num = x;
    while (num>0){
      cur = cur*10+num%10;
      num= num/10;
    }
    return cur==x;

  }

}
