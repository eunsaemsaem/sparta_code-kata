class Solution {
    public int[] solution(long n) {
        String str = n+"";
        int[] answer = new int[str.length()];

        String[] strs = str.split("");

        for (int i = 0; i < strs.length; i++) {
            answer[i] = Integer.parseInt(strs[strs.length - i - 1]);
        }
        return answer;
    }
}