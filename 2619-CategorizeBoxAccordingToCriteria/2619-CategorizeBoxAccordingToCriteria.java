// Last updated: 2/10/2026, 3:12:39 PM
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol = (long) length * width * height;

        boolean isBulky = false;
        boolean isHeavy = false;

        if(length >= 10000 || width >= 10000 || height >= 10000){
            isBulky = true;
        }

        if (vol >= 1000000000){
            isBulky = true;
        }

        if(mass >= 100){
            isHeavy = true;
        }

        if(isBulky && isHeavy){
            return "Both";
        }
        else if(isBulky){
            return "Bulky";
        }
        else if(isHeavy){
            return "Heavy";
        }
        else{
            return "Neither";
        }
    }
}