package Algorithms.Sorting;


/*

Selection sort (선택 정렬)
1. 선택 정렬이란?
주어진 데이터에서 최솟값을 찾은 후, 최솟값과 맨 앞자리를 교환하는 방식을 반복한다.

2. 장점
- 추가적인 메모리의 소비가 적다.

3. 단점
- 시간복잡도는 항상 O(N^2)을 가진다.
- 안정 정렬이 불가능하다. (특정 조건을 가진 정렬에서 데이터의 정렬이 흐뜨러진다.)

 */


import java.util.Arrays;

public class Sort3_Selection_sort {

    public static void swap(int[] a,int i,int j) {
        int num = a[i];
        a[i] = a[j];
        a[j] = num;
    }

    public static void main(String args[]) {

        int[] arr = {5,2,4,1,3,6};

        for (int i=0; i<arr.length-1; i++) {
            int min_index = i;
            // 숫자가 가장 작은 인덱스를 추출

            for (int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[min_index]) {
                    min_index = j;
                }

            }

            swap(arr,i,min_index);

        }

        System.out.print(Arrays.toString(arr));

    }
}
