package com.gabiksoft.arrays;

public class ArrayCalculationUtil {

  private ArrayCalculationUtil() {}

  public static void sortArrayDescending(int[] num) {
    int j;
    boolean flag = true; // set flag to true to begin first pass
    int temp; // holding variable
    while (flag) {
      flag = false; // set flag to false awaiting a possible swap
      for (j = 0; j < num.length - 1; j++) {
        if (num[j] < num[j + 1]) // change to > for ascending sort
        {
          temp = num[j]; // swap elements
          num[j] = num[j + 1];
          num[j + 1] = temp;
          flag = true; // shows a swap occurred
        }
      }
    }
  }

  public static void sortArrayAscending(int[] num) {
    int j;
    boolean flag = true;
    int temp;
    while (flag) {
      flag = false;
      for (j = 0; j < num.length - 1; j++) {
        if (num[j] > num[j + 1]) {
          temp = num[j];
          num[j] = num[j + 1];
          num[j + 1] = temp;
          flag = true;
        }
      }
    }
  }

  public static int getMaxValue(int[] num) {
    int result = 0;
    for (int i = 0; i < num.length; i++) {
      int currentValue = num[i];
      if (currentValue >= result) {
        result = currentValue;
      }
    }
    return result;
  }

  public static int getMinValue(int[] num) {
    int result = num[0];
    for (int i = 0; i < num.length; i++) {
      int currentValue = num[i];
      if (currentValue <= result) {
        result = currentValue;
      }
    }
    return result;
  }

  public static int getArraySum(int[] num) {
    int result = 0;
    for (int i = 0; i < num.length; i++) {
      result += num[i];
    }
    return result;
  }

}
