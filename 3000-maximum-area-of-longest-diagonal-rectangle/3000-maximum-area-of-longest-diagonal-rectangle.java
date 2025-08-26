class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDaigonal = 0;
        int maxArea = 0;
        for (int i = 0; i < dimensions.length; i++) {
            double daigonal = Math.sqrt(dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1]);
            int area = dimensions[i][0] * dimensions[i][1];
            if( daigonal > maxDaigonal){
                maxDaigonal = daigonal;
                maxArea = area;
            }if(daigonal == maxDaigonal){
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}