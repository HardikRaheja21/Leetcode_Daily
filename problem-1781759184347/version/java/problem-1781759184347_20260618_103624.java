// Last updated: 6/18/2026, 10:36:24 AM
1class Solution {
2    public double angleClock(int hour, int minutes) {
3        double hourAngle = (hour % 12) * 30 + minutes * 0.5;
4        double minuteAngle = minutes * 6;
5        double angle = Math.abs(hourAngle - minuteAngle);
6        return Math.min(angle, 360 - angle);
7    }
8}