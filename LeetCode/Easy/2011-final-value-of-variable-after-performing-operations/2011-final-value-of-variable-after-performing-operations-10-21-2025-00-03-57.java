class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;

        for(String operation: operations){
            if(operation.equals("X++") || operation.equals("++X"))
                X = X + 1;
            else if(operation.equals("X--") || operation.equals("--X"))
                X = X - 1;
            System.out.println(X);
        }
        return X;
    }
}