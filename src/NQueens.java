import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        NQueens s = new NQueens();
        System.out.println(s.solve(4));
    }

    private List<List<String>> solve(int n) {
        // Build board n*n all with '.'
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> res = new ArrayList<>();
        dfs(board, 0, res);
        return res;
    }

    private void dfs(char[][] board, int colIndex, List<List<String>> res) {
        if (colIndex == board.length) {
            res.add(compute(board));
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isValid(board, i, colIndex)) {
                board[i][colIndex] = 'Q'; // set
                dfs(board, colIndex + 1, res);
                board[i][colIndex] = '.'; // reset
            }
        }
    }

    private boolean isValid(char[][] board, int x, int y) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < y; j++) {
                if (board[i][j] == 'Q' && (x == i || x + j == y + i || x + y == i + j))
                    return false;
            }
        }
        return true;
    }

    private List<String> compute(char[][] board) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }
}
