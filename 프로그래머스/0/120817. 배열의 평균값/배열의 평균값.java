class Solution {
    public double solution(int[] numbers) {
        int total = 0;

        for (int i : numbers) {
            total += i;
        }

        return (double)total / numbers.length;
    }
}