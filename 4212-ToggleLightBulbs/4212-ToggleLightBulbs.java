// Last updated: 2/19/2026, 12:05:09 PM
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] status = new boolean[101];
        Arrays.fill(status, false);
        for(int i = 0; i < bulbs.size(); i++){
            if(status[bulbs.get(i)]) status[bulbs.get(i)] = false;
            else status[bulbs.get(i)] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i < 101; i++){
            if(status[i]) ans.add(i);
        }
        Collections.sort(ans);
        return ans;
    }
}