// Last updated: 2/10/2026, 3:16:28 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < asteroids.length; i++){
           if(asteroids[i] >= 0) st.push(asteroids[i]);
            else {
                 while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])) {
                    st.pop(); // smaller + asteroid destroyed
                }

                // if stack becomes empty OR top is negative -> no collision, push current negative
                if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroids[i]);
                }
                // if equal size -> both destroyed
                else if (st.peek() == Math.abs(asteroids[i])) {
                    st.pop();
                }
                // else: st.peek() > abs(current) -> current destroyed (do nothing)
            }
        }
        int[] result = new int[st.size()];
        for(int i = result.length - 1; i >= 0; i--){
            result[i] = st.pop();
        }
        return result;
    }
}