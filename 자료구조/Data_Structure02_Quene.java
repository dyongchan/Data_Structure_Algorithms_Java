package Algorithms.Data_Structure;

/*
큐 (Quene) : 가장 먼저 넣은 데이터를 가장 먼저 꺼낼수 있는 자료구조
- 줄을 서는 행위와 동일
- FIFO (First In First Out) / LILO (Last In Last Out): 선입선출
- Stack 과는 정 반대의 순서
- 한 쪽 끝(front) = 삽입 연산 / 반대 쪽 끝(rear) = 삭제 연산

필요성
- 그래프 넓이 우선 탐색(BFS)에서 사용
- 멀티 태스킹을 위한 프로세스 스케줄링 방식에서 많이사용 - 운영체제

한계
- 데이터의 입출력만이 존재하기 때문에 특정 데이터를 정해서 출력하는 것이 불가능하다.

기능
1. Enquene : 데이터를 넣는 기능
2. Dequene : 데이터를 꺼내는 기능


다양한 Quene
- LifoQuene : 나중에 입력된 데이터가 먼저 출력 되는 구조(Stack과 유사)
- PriorityQuene : 우선순위를 결정하고 우선순위가 높은 순으로 출력

 */

import java.util.LinkedList;
import java.util.Queue;

public class Data_Structure02_Quene {


    public static void main(String args[]) {

        // 먼저 들어간 데이터가 먼저 나오는것을 유의

        Queue<Integer> queue = new LinkedList<>();
        Queue<String> queue1 = new LinkedList<>();

        queue.add(1); // 삽입 성공 true / 실패  IllegalStateException
        queue.offer(2); // 삽입 성공 true / 실패 false

        queue.remove(); // 헤드요소(큐 내부 중 가장 먼저 넣은 요소) 조회 및 제거 / 큐 비어있으면 예외 발생
        queue.poll(); // 헤드요소 조회 및 제거 / 큐 비어있으면 null 반환

        queue.element(); // 헤드요소의 조회 및 반환 / 큐 비어있으면 예외 발생
        queue.peek(); // 헤드요소의 조회 및 반환 / 큐 비어있으면 null 반환

        queue.clear(); // 큐 내부의 데이터 모두 제거
    }
}
