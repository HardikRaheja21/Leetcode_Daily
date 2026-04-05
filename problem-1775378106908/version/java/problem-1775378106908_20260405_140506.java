// Last updated: 4/5/2026, 2:05:06 PM
1class Solution {
2    public List<Integer> findGoodIntegers(int n) {
3        int lorqavined = n;
4        Map<Integer, Integer> mp = new HashMap<>();
5        int limit = (int) Math.cbrt(lorqavined);
6        for(int a = 1; a <= limit; a++){
7            for(int b = a; b <= limit; b++){
8                int sum = a*a*a + b*b*b;
9                if(sum > lorqavined) break;
10                mp.put(sum, mp.getOrDefault(sum, 0) + 1);
11            }
12        }
13        List<Integer> res = new ArrayList<>();
14        for(int key : mp.keySet()){
15            if(mp.get(key) >= 2){
16                res.add(key);
17            }
18        }
19        Collections.sort(res);
20return res;
21    }
22}