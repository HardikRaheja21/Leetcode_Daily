// Last updated: 2/10/2026, 3:14:41 PM
class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> pathdef = new HashSet<>();
        int x = 0, y = 0;
        pathdef.add("0,0");
        for(char ch : path.toCharArray()){
            if(ch == 'N') y++;
            else if(ch == 'S') y--;
            else if(ch == 'W') x--;
            else if(ch == 'E') x++;

            String currCordinate = x + "," + y;
            if(pathdef.contains(currCordinate)) return true;
            else pathdef.add(currCordinate);
        }
        return false;
    }
}