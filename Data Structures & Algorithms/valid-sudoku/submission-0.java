class Solution {
    public boolean isValidSudoku(char[][] board) {
       
            Map<Integer, Set<Character>> row= new HashMap<>();
             Map<Integer, Set<Character>> column= new HashMap<>();
              Map<String, Set<Character>> square= new HashMap<>();

              for (int i=0;i<board.length;i++)
              {
                for(int j=0;j<board[i].length;j++)
                {
                    if(board[i][j]=='.')
                    continue;
                    String squareKey= (i/3)+ "," + (j/3);
                    if(!row.computeIfAbsent(i,k-> new HashSet<>()).add(board[i][j]) ||
                       !column.computeIfAbsent(j,k-> new HashSet<>()).add(board[i][j]) ||
                !square.computeIfAbsent(squareKey,k-> new HashSet<>()).add(board[i][j])
                    )
                    return false;
                }
    }
         return true;
}
}
