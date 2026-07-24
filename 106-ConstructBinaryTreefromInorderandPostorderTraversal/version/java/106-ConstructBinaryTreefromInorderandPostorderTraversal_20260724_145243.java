// Last updated: 7/24/2026, 2:52:43 PM
1class Solution {
2    public int reversePairs(int[] nums) {
3        return mergeSort(nums, 0, nums.length - 1);
4    }
5
6    public int countReversePairs(int[] nums, int low, int mid, int high) {
7        int count = 0;
8        int right = mid + 1;
9
10        for (int i = low; i <= mid; i++) {
11
12            while (right <= high &&
13                    (long) nums[i] > nums[right] * 2L) {
14                right++;
15            }
16
17            count += (right - (mid + 1));
18        }
19
20        return count;
21    }
22
23    public int mergeSort(int[] nums, int low, int high) {
24
25        int count = 0;
26
27        if (low >= high)
28            return count;
29
30        int mid = low + (high - low) / 2;
31
32        count += mergeSort(nums, low, mid);
33
34        count += mergeSort(nums, mid + 1, high);
35
36        count += countReversePairs(nums, low, mid, high);
37
38        merge(nums, low, mid, high);
39
40        return count;
41    }
42
43    public void merge(int[] arr, int low, int mid, int high) {
44
45        int[] temp = new int[high - low + 1];
46
47        int index = 0;
48        int left = low;
49        int right = mid + 1;
50
51        while (left <= mid && right <= high) {
52
53            if (arr[left] <= arr[right]) {
54                temp[index++] = arr[left++];
55            } else {
56                temp[index++] = arr[right++];
57            }
58        }
59
60        while (left <= mid)
61            temp[index++] = arr[left++];
62
63        while (right <= high)
64            temp[index++] = arr[right++];
65
66        for (int i = low; i <= high; i++)
67            arr[i] = temp[i - low];
68    }
69}