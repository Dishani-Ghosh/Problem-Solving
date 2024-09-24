class Solution {
    public boolean isValid(String s) {
        Stack<Character>ss=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='(')
            ss.push(')');
            else if(c=='{')
            ss.push('}');
            else if(c=='[')
            ss.push(']');
            else if(ss.isEmpty()|| ss.pop()!=c)
            return false;
        }
        return ss.isEmpty();
    /*
    (not all test case pass only 38 test case pass out of 90)
       char c[]=s.toCharArray();
       int n=c.length-1;
       for(int i=0;i<c.length;i++)
       {
        if(c[i]=='(')
        {
          while(n>=0)
          {
            if(c[n]==')')
            return true;
            n--;
          }  
          return false;
        }

         if(c[i]=='{')
        {
          while(n>=0)
          {
            if(c[n]=='}')
            return true;
            n--;
          } 
          return false; 
        }

         if(c[i]=='[')
        {
          while(n>=0)
          {
            if(c[n]==']')
            return true;
            n--;
          } 
          return false; 
        }
       } 
       return false;    */
    }
}