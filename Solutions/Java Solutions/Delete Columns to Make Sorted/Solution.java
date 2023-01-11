class Solution {
    public int minDeletionSize(String[] strs) {

        int columnLength = strs[0].length(); //define our useful vars
        int stringLength = strs.length;
        int columnsDeleted = 0;

        for( int index = 0; index < columnLength; index++ ) { //iterate through column length...
            for( int z = 1; z < stringLength; z++ ) { //... and iterate through string length.
                if( strs[z-1].charAt(index) > strs[z].charAt(index) ) { //Check if our next letter in the column is not sequential
                    columnsDeleted++; //if not sequential, add +1 count to total columns deleted
                    break; //break the loop from current column and move to next column
                }
            }
        }
        
        return columnsDeleted; //return our result
        
    }
}