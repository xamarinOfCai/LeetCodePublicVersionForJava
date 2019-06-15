/*
 * @lc app=leetcode.cn id=20 lang=java
 * 
 * 有效的括号
Category	Difficulty	Likes	Dislikes
algorithms	Easy (38.45%)	842	-
Tags
Companies
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:

输入: "()"
输出: true
示例 2:

输入: "()[]{}"
输出: true
示例 3:

输入: "(]"
输出: false
示例 4:

输入: "([)]"
输出: false
示例 5:

输入: "{[]}"
输出: true
 *
 * [20] 有效的括号
 */

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character>saveResult = new Stack<Character>();
        char[]chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(saveResult.size() == 0){
                saveResult.push(chars[i]);
            }else{
                char peekChar = saveResult.peek();
                if(peekChar == '('){
                    if(chars[i] == ')'){
                        saveResult.pop();
                        continue;
                    }
                    saveResult.push(chars[i]);
                }else if(peekChar == '{'){
                        if(chars[i] == '}'){
                            saveResult.pop();
                            continue;
                        }
                        saveResult.push(chars[i]);
                }else if(peekChar == '['){
                    if(chars[i] == ']'){
                        saveResult.pop();
                        continue;
                    }
                    saveResult.push(chars[i]); 
                }
                
            }
        }
        if(saveResult.size() != 0){
            return false;
        }
        return true;
    }
}


class Test{

    // public static void main(String[] args) {
    //     Solution s = new Solution();

    //     // boolean result = s.isValid("()");
    //     boolean result = s.isValid("()[]{}");

    //     System.out.println(result);     
    // }
}

