// Last updated: 2/10/2026, 3:19:55 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> list = new ArrayList<>();
        int last = intervals[0][1];
        int first = intervals[0][0];
        for(int i =1; i< intervals.length; i++){
            if(intervals[i][0] <= last){
                last = last >= intervals[i][1] ? last : intervals[i][1];
                // lst.add(first,end);
                // list.add(lst);
            }
            else{
                list.add(new int[]{first, last});
                first = intervals[i][0];
                last = intervals[i][1];
                // first = intervals[i][0];
            }
        }
        list.add(new int[]{first, last});
        return list.toArray(new int[list.size()][]);
    }
}