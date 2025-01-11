class Solution {
    public int strStr(String haystack, String needle) {
        

        //first find first char matching to haystackor not 
        for(int i = 0; i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){

                //find substring
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                    
                }
                
            }
        }
        return -1;
    }
}