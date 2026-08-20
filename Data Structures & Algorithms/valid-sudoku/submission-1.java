class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows[]=new int[9];
        int columns[]=new int[9];
        int grid[]=new int[9];

        for (int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]== '.')
                continue;

                int num=board[i][j]-'1';

                int mask =1<<num;
            
                if(((rows[i] & mask )>0) || ((columns[j] & mask )>0) || ((grid[(i/3)*3 + (j/3)] & mask )>0 ))
                return false;

                rows[i]|=mask;
                columns[j]|= mask;
                grid[(i/3)*3 + (j/3)] |= mask;
            }
        }
        return true;
        
    }
}
