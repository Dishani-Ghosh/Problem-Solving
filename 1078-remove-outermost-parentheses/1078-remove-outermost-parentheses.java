class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int depth=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                if(depth>0)// if depth is not 0 so it is not first element so it add in sb
                {
                    sb.append(c);
                }
            depth++;// skip if outer
            }
            else if(c==')')
            {
                depth--;//it decreases so if depth==0 that's means it is outer parenthesis
                if(depth>0)// it it > 0 then we can add it
                {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}