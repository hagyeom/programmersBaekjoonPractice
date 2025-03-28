function solution(arr, delete_list) {
    var set=new Set(delete_list);
    var answer=arr.filter(element=>!set.has(element));
    return answer;
}