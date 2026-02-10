// Last updated: 2/10/2026, 3:13:24 PM
import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stack = new ArrayList<>();

        for (int num : nums) {
            stack.add(num);

            // Keep merging while last two numbers are non-coprime
            while (stack.size() >= 2) {
                int a = stack.get(stack.size() - 2);
                int b = stack.get(stack.size() - 1);
                int g = gcd(a, b);

                if (g > 1) {
                    stack.remove(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    long lcm = (long) a / g * b; // avoid overflow
                    stack.add((int) lcm);
                } else {
                    break;
                }
            }
        }

        return stack;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
