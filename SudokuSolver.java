import java.util.Scanner;

public class SudokuSolver {

    static final int UNASSIGNED = 0;
    static final int N = 9;

    boolean isSafe(int row, int col, int[][] board, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num || board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num) {
                return false;
            }
        }
        return true;
    }

    boolean solve(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == UNASSIGNED) {
                    for (int num = 1; num <= 9; num++) {
                        if (isSafe(i, j, board, num)) {
                            board[i][j] = num;
                            if (solve(board)) {
                                return true;
                            } else {
                                board[i][j] = UNASSIGNED;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean solveSudoku(int[][] grid) {
        return solve(grid);
    }

    void printGrid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] grid = new int[N][N];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Enter: ");
                grid[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original Sudoku:");
        SudokuSolver sudokuSolver = new SudokuSolver();
        sudokuSolver.printGrid(grid);

        if (sudokuSolver.solveSudoku(grid)) {
            System.out.println("\nSolution:");
            sudokuSolver.printGrid(grid);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
