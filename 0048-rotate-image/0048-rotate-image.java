class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        //transpose matrix: basicaly we dont change value when row and column same, otherwise i-j we swap
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                //swap
                int temp=matrix[i][j];//[row=0][col=1]=2
                matrix[i][j]=matrix[j][i];//[col=0][row=1]=4
                matrix[j][i]=temp;//2 swap done

            }
        }
        /*
        after transpose
        [ [1,4,7]
          [2,5,8]
          [3,6,9]
        ]
        */
        
        //now reverse
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)// here why we use n/2 bcz middile element we dont need to reverse
            {
                //reverse
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];//here we use [n-1-j] bcz in reverse we change j value
                matrix[i][n-1-j]=temp;
            }
        }

    }
}