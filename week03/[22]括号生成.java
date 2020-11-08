//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 
//
// 示例： 
//
// 输入：n = 3
//输出：[
//       "((()))",
//       "(()())",
//       "(())()",
//       "()(())",
//       "()()()"
//     ]
// 
// Related Topics 字符串 回溯算法 
// 👍 1383 👎 0


import java.lang.reflect.Array;
import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<String> list =new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(n,0,0,"");
        return list;

    }
    private void generate(int n,int left,int right,String s){
        if(left==n && right ==n ){
            list.add(s);
            return;
        }
        if(left<n){
            generate(n,left+1,right,s+"(");
        }
        if(right<left ){
            generate(n,left,right+1,s + ")");
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
