class Solution {

    boolean backTrack(int si, int i, int j, char[][] board, String word, boolean vis[][], int rows, int cols) {

    if (i < 0 || i >= rows || j < 0 || j >= cols || vis[i][j] || word.charAt(si) != board[i][j])
      return false;

    if (si == word.length() - 1)
      return true;

    vis[i][j] = true;
    boolean left = backTrack(si + 1, i, j - 1, board, word, vis, rows, cols);
    boolean right = backTrack(si + 1, i, j + 1, board, word, vis, rows, cols);
    boolean up = backTrack(si + 1, i + 1, j, board, word, vis, rows, cols);
    boolean down = backTrack(si + 1, i - 1, j, board, word, vis, rows, cols);
    boolean isPresent = left || right || up || down;

    vis[i][j] = false;

    return isPresent;

  }

    public boolean exist(char[][] board, String word) {

        boolean isPresent = false;
    int rows = board.length;
    int cols = board[0].length;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (board[i][j] == word.charAt(0)) {
          isPresent = isPresent | backTrack(0, i, j, board, word, new boolean[rows][cols], rows, cols);
        }
      }
    }

    return isPresent;
        
    }
}
