package Algorithms.Data_Structure;

/*

링크드 리스트(Linked List) : 연결된 리스트
배열의 단점 (미리 선언되는 공간의 제약)을 극복한 자료구조

1. 기본구조
- 노드(Node) : 데이터 저장 단위 (데이터값, 포인터)로 구성
- 포인터(pointer) : 각 노드 안에서 다음이나 이전의 노드와의 연결정보를 가지고 있는 공간
포인터가 다음이나 이전 노드의 주소값을 가리킨다.

2. 특징
- 첫 번째 노드(헤더)의 값만 알아도 다음 노드의 주소값을 파악하여 찾고 싶은값에 대한 계속적인 주소값을 알 수 있다.

3. 장점
- 배열과 다르게 크기를 선언하지 않고 지속적인 값 추가가 가능하다.

4. 단점
- 연결을 위한 별도의 데이터 공간이 필요하여 저장공간의 효율이 높지 않다.
- 연결 정보에 대한 연결정보를 찾는 시간이 필요하여 접근 속도가 느리다.
- 중간 데이터의 삭제 시, 앞뒤 데이터의 연결을 재구성하는 부가적 작업이 필요하다.

 */

import java.util.LinkedList;

/*
타 언어와 다르게 자바의 링크드 리스트는 주소값의 지정이 필요없이 추가하는 인덱스 앞뒤의 주소값을 자동으로 설정
= 따로 설정해야하는 포인터의 개념이 존재하지 않기 때문
 */

public class Data_Structure04_LinkedList {

    public static void main(String args[]) {

        LinkedList<Integer> Li = new LinkedList<>(); // int 형태의 링크드 리스트 선언

        Li.add(1); // LinkedList에 값 추가 헤더 ~ 지속적으로 넣는 값

        Li.removeFirst(); // 가장 앞의 데이터 제거
        Li.removeLast(); // 가장 마지막 데이터 제거
        Li.remove(); // index 0번쨰 (헤더)의 값 제거
        Li.remove(1); // index 1번째 값 제거
        Li.clear(); // 모든 값 제거

        Li.size(); // 리스트의 크기 (노드의 개수) 출력

        Li.contains(1); // 리스트 내부에 value = 1 이 존재하는 지 체크 존재 시 true 출력
        Li.indexOf(1); // 1이 존재하는 index 반환 없으면 -1 출력


    }
}
