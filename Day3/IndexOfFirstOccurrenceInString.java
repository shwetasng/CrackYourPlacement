package Day3;

class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            // check if first letter is present
            if(haystack.charAt(i)==needle.charAt(0)){
                //now check if the substring matches
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
            
        }
        return -1;
    }
}
