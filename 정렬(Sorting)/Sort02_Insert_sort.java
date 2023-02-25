package Algorithms.Sorting;

/*

Insert sort (삽입 정렬)
1. 삽입 정렬이란?
- 해당 인덱스(key 값) 앞에 있는 데이터(V)부터 비교하여 key 값이 더 작으면 V값을 뒤 인덱스에 복사한다.
이러한 행위를 Key 값보다 더 작은 데이터를 만날 때 까지 반복하고 작은 데이터 바로 뒤로 Key 값을 이동시킨다.

2. 장점
- 추가적인 메모리 소비가 적다
- 정렬이 거의 되었을 경우 = 최선의 경우는 O(N)의 시간 복잡도를 가진다.

3. 단점
- 역순에 가까울수록 비효율적이다. 최악의 경우 O(N^2)의 시간 복잡도를 가진다.
= 데이터의 상태에 따라 편차가 크다


 */

import java.util.Arrays;

public class Sort02_Insert_sort {

    public static void main(String args[]) {

        int[] arr = {5,3,2,1,4};

        for(int i = 1; i<arr.length; i++) {
            int compare = arr[i];

            int j = i - 1;

            //
            while (j>=0 && compare<arr[j]) {
                    arr[j + 1] = arr[j]; // 원소를 뒤로 미룸
                    j--;
            }

            arr[j + 1] = compare;


        }
        System.out.print(Arrays.toString(arr));
    }
}
