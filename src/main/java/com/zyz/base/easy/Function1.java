package com.zyz.base.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yz.zhang
 * @since 2026-01-26
 */

public class Function1 {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> hashtable = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (hashtable.containsKey(target-nums[i])){
        return new int[]{hashtable.get(target-nums[i]),i};
      }
      hashtable.put(nums[i],i);
    }
    return nums;
  }

}



