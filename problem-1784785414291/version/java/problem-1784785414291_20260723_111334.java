// Last updated: 7/23/2026, 11:13:34 AM
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        int time = 0;
4        int i = 0;
5        while(tickets[k] > 0){
6            if(tickets[i] > 0){
7                tickets[i]--;
8                time++;
9            }
10            i = (i + 1) % tickets.length;
11        }
12        return time;
13    }
14}