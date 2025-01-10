class Solution {
   public String comman (String s1,String s2){
    int n = Math.min(s1.length(),s2.length());

    StringBuilder  sb = new StringBuilder();
    for ( int i = 0; i<n ; i++){
        if(s1.charAt(i)==s2.charAt(i)){
            sb.append(s1.charAt(i));
        }
        else
        break;
    }
    return sb.toString();

   }

    public String longestCommonPrefix(String[] strs) {
       // strs = ["flower","flow","flight"]  we are assumeing flower is result and later   comparing with  others
        String res = strs[0];

        for ( int i = 1 ; i<strs.length;i++){
           res = comman(res,strs[i]);

        }
        return res;
    }
}