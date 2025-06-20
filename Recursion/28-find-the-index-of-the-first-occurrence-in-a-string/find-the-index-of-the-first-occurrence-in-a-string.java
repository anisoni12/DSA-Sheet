class Solution {
    public int strStr(String haystack, String needle) {
        int hsize = haystack.length();
        int nsize = needle.length();

        for(int i = 0; i <= hsize-nsize; i++){
            if(haystack.substring(i , i + nsize).equals(needle)){
                return i ;
            }
        }
        return -1;
    }
}