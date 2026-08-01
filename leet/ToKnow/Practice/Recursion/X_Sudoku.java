package akhilshettyym.JAVA.leet.ToKnow.Practice.Recursion;

public class X_Sudoku {
    // Check if number can be placed
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Row and Column check
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0'))
                return false;
            if (board[row][i] == (char) (number + '0'))
                return false;
        }

        // 3x3 grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0'))
                    return false;
            }
        }
        return true;
    }

    // Backtracking function
    public boolean helper(char[][] board, int row, int col) {
        // If we reach past the last row, board is solved
        if (row == board.length)
            return true;

        int nrow = 0;
        int ncol = 0;

        // Move to next cell
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        // Skip filled cells
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        }

        // Try digits 1 to 9
        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {
                board[row][col] = (char) (i + '0');
                if (helper(board, nrow, ncol))
                    return true;
                board[row][col] = '.'; // backtrack
            }
        }
        return false;
    }

    // Solve method
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    // Main method to test the solver
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        X_Sudoku solver = new X_Sudoku();
        solver.solveSudoku(board);

        // Print solved board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }
}