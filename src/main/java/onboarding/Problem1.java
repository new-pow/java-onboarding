package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    // 각 자리수 배열로 출력
    static List<Integer> jarisoo(int num) {
        List<Integer> numArr = new ArrayList<Integer>();
        while(num > 0){
            numArr.add(num % 10);
            num /= 10;
        }
        return numArr;
    }

    }
}