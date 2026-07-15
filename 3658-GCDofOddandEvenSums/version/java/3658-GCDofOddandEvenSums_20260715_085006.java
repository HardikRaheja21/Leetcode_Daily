// Last updated: 7/15/2026, 8:50:06 AM
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        int sumOfOdd = 0;
4        int count = 0;
5        int num = 0;
6        while(count < n){
7            if(num % 2 != 0){
8                sumOfOdd += num;
9                count++;
10            }
11            num++;
12        }
13        count = 0;
14        num = 0;
15        int sumOfEven = 0;
16        while(count < n){
17            if(num % 2 == 0){
18                sumOfEven += num;
19                count++;
20            }
21            num++;
22        }
23        return gcd(sumOfOdd, sumOfEven);
24    }
25    public int gcd(int a, int b){
26        while(b != 0){
27            int temp = b;
28            b = a % b;
29            a = temp;
30        }
31        return a;
32    }
33}