class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int[] weakest = new int[k]; //define our res, and other helpful vars
        int[] count = new int [mat.length];
        int rows = mat.length;
        int columns = mat[0].length;

        for (int index=0; index < rows; index++) { //iterate through our rows
            int temp = 0;
            for(int z=0; z < columns; z++){ //iterate through our columns
                if( mat[index][z] == 1 ){
                    temp++;
                }
                else{
                    break;
                }
        }
        count[index] = temp * 100 + index; //count our soldiers
    }

    Arrays.sort(count); //sort our soldiers

    for (int index=0; index < k; index++){
        weakest[index] = count[index]%100; //Divide by 100 with remainder to return remaining soldier strength
        }
        return weakest; //return our weakest row
    }
}