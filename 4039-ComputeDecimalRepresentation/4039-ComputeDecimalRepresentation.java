// Last updated: 2/10/2026, 3:10:06 PM
class Solution {
    public int[] decimalRepresentation(int n) {
        int power = 0;
        List<Integer> res = new ArrayList<>();
        while(n > 0){
            int digit = n % 10;
            if(digit != 0){
                res.add(digit * (int)Math.pow(10, power));
            }
            n /= 10;
            power++;
        }
        Collections.sort(res, Collections.reverseOrder());
        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }
        return result;
    }
}