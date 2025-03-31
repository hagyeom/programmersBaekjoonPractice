function solution(num_list) {
    // 마지막 원소와 그 전 원소를 비교
    let lastElement = num_list[num_list.length - 1];
    let secondLastElement = num_list[num_list.length - 2];
    // 조건에 따라 값을 추가
    if (lastElement > secondLastElement) {
        lastElement -= secondLastElement;
    } else {
        lastElement *= 2;
    }
    // 새 배열 생성 및 값 추가
    let answer = [...num_list, lastElement];
    return answer;
}