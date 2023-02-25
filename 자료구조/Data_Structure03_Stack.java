package Algorithms.Data_Structure;

/*
스택(Stack) : 데이터를 제한적으로 접근할 수 있는 구조
- 한 쪽 끝에서만 데이터의 입출력이 가능하다.
- LIFO (Last In First Out) / FILO ( First in Last Out)
처음에 넣은 데이터가 마지막 / 마지막에 넣은 데이터가 처음

필요성
- 컴퓨터 내부 프로세스 구조의 함수 동작 방식이다. // 재귀적 함수 호출 시 이용된다.
- 그래프의 깊이 우선 탐색(DFS)에 사용된다.


 */

import java.util.LinkedList;
import java.util.Stack;

public class Data_Structure03_Stack {
    /*
    Stack의 기본 크기 = 10
    push를 통해 기본 크기가 넘어갈 경우 해당 크기의 2배 크기의
    Stack을 생성하고 값을 복사한다.
     */


    public static void main(String args[]) {

        Stack<Integer> st = new Stack<>();

        st.push(1); // 데이터 넣기

        st.pop(); // 데이터 꺼내기
        st.clear(); // 스택 내부의 값 모두 제거(초기화)

        st.size(); // 스택 내부의 크기
        st.empty(); // 스택이 비어있는지를 체크 한후 비어있다면 true 값이 존재한다면 false 출력
        st.contains(10); // 스택 내부에 10이 있는지 체크 한후 있다면 true 출력

    }
}
