/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String s = String.valueOf(x);
        int len =s.length();
        for(int i=0,j = len -1; i < j;  ){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }

        return true;
    }
}


class Test{
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean result = s.isPalindrome(-121);
        System.out.println("结果为："+result);
    }
}
