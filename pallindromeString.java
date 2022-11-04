public class pallindromeString {
    class Solution {
        public boolean isPalindrome(String s) {
             if (s == null) return false;
            if (s.isEmpty()) return true;
            s = s.toLowerCase();
            String str=s.replaceAll("[^A-Za-z0-9]", "");
            String temp="";
            
         for(int i=str.length()-1;i>=0;--i){
            temp=temp+str.charAt(i);
             
         }
            if(temp.equals(str)){
                return true;
            }else{
                return false;
            }
        }
    }
}
