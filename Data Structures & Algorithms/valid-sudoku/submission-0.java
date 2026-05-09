class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i <= 8; i++) {
      boolean alreadyPresent[] = new boolean[10];
      for (int j = 0; j <= 8; j++) {
        if (board[i][j] != '.') {
          if (alreadyPresent[board[i][j] - '0']) {
            return false;
          }
          alreadyPresent[board[i][j] - '0'] = true;
        }
      }
    }

    // col check
    for (int i = 0; i <= 8; i++) {
      boolean alreadyPresent[] = new boolean[10];
      for (int j = 0; j <= 8; j++) {
        if (board[j][i] != '.') {
          if (alreadyPresent[board[j][i] - '0']) {
            return false;
          }
          alreadyPresent[board[j][i] - '0'] = true;
        }
      }
    }

    // 3x3 check
    for (int i_change = 0; i_change < 8; i_change += 3) {
      for (int j_change = 0; j_change < 8; j_change += 3) {
        boolean alreadyPresent[] = new boolean[10];
        for (int i = i_change; i <= i_change + 2; i++) {
          for (int j = j_change; j <= j_change + 2; j++) {
            if (board[i][j] != '.') {
              if (alreadyPresent[board[i][j] - '0']) {
                return false;
              }
              alreadyPresent[board[i][j] - '0'] = true;
            }

          }

        }

      }
    }
    return true;
        
    }
}
