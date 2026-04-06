// Last updated: 4/6/2026, 4:35:33 PM
class Solution {
    public List<Integer> findGoodIntegers(int n) {
        int lorqavined = n;
        Map<Integer, Integer> mp = new HashMap<>();
        int limit = (int) Math.cbrt(lorqavined);
        for(int a = 1; a <= limit; a++){
            for(int b = a; b <= limit; b++){
                int sum = a*a*a + b*b*b;
                if(sum > lorqavined) break;
                mp.put(sum, mp.getOrDefault(sum, 0) + 1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int key : mp.keySet()){
            if(mp.get(key) >= 2){
                res.add(key);
            }
        }
        Collections.sort(res);
return res;
    }
}