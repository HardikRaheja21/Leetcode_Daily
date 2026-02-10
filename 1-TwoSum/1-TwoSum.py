# Last updated: 2/10/2026, 3:20:48 PM
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        for i in range(0, n-1):
            for j in range (i+1, n):
                if (nums[i]+ nums[j] == target):
                    return [i, j]
        return []
