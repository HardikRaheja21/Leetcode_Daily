// Last updated: 2/10/2026, 3:10:12 PM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] finishing = new int[friends.length];
        int idx = 0;
        Set<Integer> hs = new HashSet<>();
        for(int friend : friends){
            hs.add(friend);
        }
        for(int i = 0;i < order.length; i++){
            if(hs.contains(order[i])){
                finishing[idx++] = order[i];
            }
        }
        return finishing;
    }
}