class Solution {
    public int myAtoi(String s) {
        boolean neg = false;
        int i = 0;
        long ans = 0;
        s = s.trim();
        if(s.length() == 0) return 0;

        switch(s.charAt(0)) {
            case '-' :
                neg = true;
                i = 1;
            
            case '+' :
                i = 1;
                break;
        }

        if(s.length() == i) return 0;
        while(i < s.length()  && s.charAt(i) == '0') i++ ;

        while(i < s.length()){
            if(!Character.isDigit(s.charAt(i))) break;      //any other than digit
            ans = (ans * 10) + (s.charAt(i) - '0');

            if(ans > Integer.MAX_VALUE) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE ;
            }
            i++;
        }
        return neg ? -(int)ans : (int)ans ;
    }
}