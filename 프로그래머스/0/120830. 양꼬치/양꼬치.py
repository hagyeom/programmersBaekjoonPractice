import math
def solution(n, k):
    answer = n*12000+k*2000-math.floor(n/10)*2000
    return answer