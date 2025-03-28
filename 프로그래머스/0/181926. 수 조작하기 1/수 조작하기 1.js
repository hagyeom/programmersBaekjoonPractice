function solution(n, control) {
    var answer = 0;
    
    for (let ch of control) {
        if (ch == 'w') {
            n += 1;
        }
        if (ch == 's') {
            n -= 1;
        }
        if (ch == 'd') {
            n += 10;
        }
        if (ch == 'a') {
            n -= 10;
        }
    }
    
    answer = n;
    
    return answer;
}