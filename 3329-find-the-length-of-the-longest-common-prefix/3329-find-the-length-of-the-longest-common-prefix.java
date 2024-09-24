class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        // Build a Trie from arr1
        TrieNode root = new TrieNode();
        for (int num : arr1) {
            insert(root, Integer.toString(num));
        }

        int maxLength = 0;

        // For each number in arr2, search for the longest common prefix in the Trie
        for (int num : arr2) {
            int currentLength = searchLongestPrefix(root, Integer.toString(num));
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
      static class TrieNode {
        TrieNode[] children = new TrieNode[10];  // Since digits are 0-9
    }

    // Insert a number into the Trie
    private void insert(TrieNode root, String num) {
        TrieNode current = root;
        for (char digit : num.toCharArray()) {
            int index = digit - '0';  // Convert character to index (0-9)
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
    }

    // Find the longest common prefix between a number and the Trie
    private int searchLongestPrefix(TrieNode root, String num) {
        TrieNode current = root;
        int prefixLength = 0;
        for (char digit : num.toCharArray()) {
            int index = digit - '0';
            if (current.children[index] != null) {
                prefixLength++;
                current = current.children[index];
            } else {
                break;  // Stop when there's no matching prefix
            }
        }
        return prefixLength;
    }

}  
      /* time limit exceeded--

      int maxlength=0;  
      for(int num1:arr1)
      {
        for(int num2:arr2)
        {
            //convert both numbers to string
            String str1=Integer.toString(num1);
            String str2=Integer.toString(num2);

            int ComparePrefLen=ComparePrefLen(str1,str2);
            maxlength=Math.max(maxlength,ComparePrefLen);
        }
      }
      return maxlength;
    }
    //to compare prefix
    private int ComparePrefLen(String str1,String str2)
    {
        int length=0;
        // Compare characters of both strings until they differ or one string ends
        for(int i=0;i<Math.min(str1.length(),str2.length());i++)
        {
            if(str1.charAt(i)==str2.charAt(i))
            length++;
            else
            break;
        }
        return length;
        
    }
}
*/