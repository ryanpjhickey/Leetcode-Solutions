class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int length = m + n;
        int indexArrayA = 0; 
        int indexArrayB= 0; 
        int previousNode = 0;          
        int currentNode = 0;        
        int index = 0;       
        
        while(index ++ <= (length / 2)) 
        {     
            
            previousNode = currentNode;          

            if(indexArrayA >= m) 
            {     
                currentNode = nums2[indexArrayB++];   
                continue;                
            } 
            
            if(indexArrayB>= n ) 
            {   
                currentNode = nums1[indexArrayA ++];
                continue;
            } 

            if(nums1[indexArrayA] < nums2[indexArrayB]) 
            {  
                currentNode = nums1[indexArrayA ++];
            }
          
          else 
            {
                currentNode = nums2[indexArrayB++];
            }
        }
        
        if(length % 2 == 0) 
        {   
            return (double) (previousNode  + currentNode) / 2; 
        } 

        else 
        {
            return (double) currentNode;
        }
   }
}