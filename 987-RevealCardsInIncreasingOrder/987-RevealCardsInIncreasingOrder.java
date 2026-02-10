// Last updated: 2/10/2026, 3:15:45 PM
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = deck.length - 1; i >= 0; i--){
            if(!dq.isEmpty()){
                dq.addFirst(dq.removeLast());
            }
            dq.addFirst(deck[i]);
        }
        int[] result = new int[deck.length];
        int idx = 0;
        for(int x : dq){
            result[idx++] = x;
        }
        return result;
    }
}