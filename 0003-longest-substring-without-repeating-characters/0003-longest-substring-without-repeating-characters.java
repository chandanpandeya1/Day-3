class Solution {
    public int lengthOfLongestSubstring(String s) {

        int start = 0;
        int maxlength = 0;
        HashSet<Character> set = new HashSet<>();

        for( int end = 0;end<s.length();end++){
            char CurrentChar = s.charAt(end);

            while(set.contains(CurrentChar)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(CurrentChar);
             maxlength = Math.max(maxlength,end-start+1);
        }
        return maxlength;
       
        
    }
}