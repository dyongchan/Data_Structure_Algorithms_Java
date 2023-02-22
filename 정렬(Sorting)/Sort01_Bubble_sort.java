package Algorithms.Sorting;

/*

Bubble sort (버블정렬)
1. 버블 정렬이란?
- 두 인접한 데이터를 비교해서 앞에 있는 데이터가 뒤에 있는 데이터 보다 크면,
자리를 바꾸는 정렬 알고리즘

2. 배열의 크기에 따른 정렬
- 앞 데이터 와 뒤 데이터의 비교 = 배열의 크기 - 1의 횟수
- 회전 수 = 배열의 크기 - 비교의 횟수
- 비교가 1번도 일어나지 않으면 1회전만으로 정렬을 끝냄

3. 알고리즘 분석
시간 : for문의 두번 반복 = O(n^2)
최약의 경우 : n*(n-1) / 2
완전 정렬 (1회만 회전): O(n)

 */

import java.util.Arrays;

public class Sort01_Bubble_sort {

    public static void swap(int[] arr, int i, int j) {
        int var = arr[i];
        arr[i] = arr[j];
        arr[j] = var;
    }

    public static void main(String args[]) {

        int[] arr = {5,2,3,1};

        int cnt = 0;

        for(int i=1; i< arr.length; i++) {

            for (int j=0; j<arr.length-i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                    cnt++;
                }
                // 시간 복잡도의 단축 (완전 정렬 되어있을 때)
                if(cnt == 0) {
                    break;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
