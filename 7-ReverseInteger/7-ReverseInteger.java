// Last updated: 7/9/2026, 9:53:40 AM
class Solution {
    public int reverse(long x) {
      
      long rev=0;
      while(x!=0){
        long digit=x%10;
        rev=rev*10+digit;
        x=x/10;
      }  
      if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE){
         return 0;
      } 
      return (int)rev;
    }
}