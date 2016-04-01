package com.gabiksoft.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestUtil {

  public static void main(String[] args) {
    int[] test = new int[100000];
    for (int i = 0; i < test.length; i++) {
      test[i] = randInt(-10000, 10000);
    }
    List<Integer> testArray = new ArrayList<Integer>();
    for (int i = 0; i < test.length; i++) {
      testArray.add(i, test[i]);
    }
    long time1 = System.currentTimeMillis();
    //ArrayCalculationUtil.sortArrayAscending(test);
    Arrays.sort(test);
    long time2 = System.currentTimeMillis();
    System.out.println("Time of sorting [] : " + (time2-time1));
    long time3 = System.currentTimeMillis();
    Collections.sort(testArray);
    long time4 = System.currentTimeMillis();
    System.out.println("Time of sorting array : " + (time4-time3));
  }

  public static int randInt(int min, int max) {
    // NOTE: Usually this should be a field rather than a method
    // variable so that it is not re-seeded every call.
    Random rand = new Random();
    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;
    return randomNum;
  }

}
