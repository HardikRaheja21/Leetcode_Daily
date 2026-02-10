// Last updated: 2/10/2026, 3:13:42 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        int sum = 0;
        for(String operation : operations){
            if(operation.equals("++X")){
                sum++;
            }
            else if(operation.equals("X++")){
                sum++;
            }
            else if(operation.equals("--X")){
                sum--;
            }
            else{
                sum--;
            }
        }        
        return sum;
    }
}