package lesson3;

import java.util.Arrays;
import java.util.Random;

public class ThirdTask {

  public static void main(String[] args) {
    final int ARRAY_SIZE = 10;
    final int ARRAY_SIZE2 = 4;
    final int LEN = 4;
    final int INITIAL_VALUE = 10;
    oneArr();
    emptyArr(ARRAY_SIZE);
    arrMult();
    twoArr(ARRAY_SIZE2);
    int[] arr = getArr(LEN,INITIAL_VALUE);
    System.out.println(Arrays.toString(arr));
    checkMax(ARRAY_SIZE);
    checkMin(ARRAY_SIZE);
  }

  static void oneArr() {
    int[] arr = {0,1,1,1,1,0,0,1};
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == 0){
          arr[i] = 1;
      } else if (arr[i] == 1){
        arr[i] = 0;
      }
    }
    System.out.println(Arrays.toString(arr));
  }

  static void emptyArr(int ARRAY_SIZE) {
    int n = 1;
    int [] arr = new int[ARRAY_SIZE];
    for (int i = 0; i < ARRAY_SIZE; i++) {
      arr[i] = n++;

    }
    System.out.println(Arrays.toString(arr));
  }

  static void arrMult() {
    int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] < 6){
        arr[i] = arr[i]*2;
      }

    }
    System.out.println(Arrays.toString(arr));
  }

  static void twoArr(int array_size) {
    int[][] deepData = new int[array_size][array_size];
    for (int i = 0; i < deepData.length; i++) {
      for (int j = 0; j < deepData[i].length; j++) {
        if (i == j){
          deepData[i][j] = 1;
          deepData[i][deepData[i].length-j-1] = 1;
        }
      }
    }
    System.out.println(Arrays.deepToString(deepData));

  }

  static int[] getArr(int len, int initialValue) {
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
      Arrays.fill(arr, initialValue);
    } return arr;

  }

  static void checkMax(int array_size) {
    int max;
    Random random = new Random();
    int[] arr = new int[array_size];
    max = arr[0];
    for (int i = 0; i < array_size; i++) {
      arr[i] = random.nextInt(100);
      if (max < arr[i]){
        max = arr[i];
      }

    }
    System.out.println(max);

  }

  static void checkMin(int array_size) {
    int min;
    Random random = new Random();
    int[] arr = new int[array_size];
    min = arr[0];
    for (int i = 0; i < array_size; i++) {
      arr[i] = random.nextInt(100);
      if (min > arr[i]){
        min = arr[i];
      }

    }
    System.out.println(min);
  }


}
