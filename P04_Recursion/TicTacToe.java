package P04_Recursion;
import java.util.Scanner;

public class TicTacToe {
    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initializeBoard();
        char currentPlayer = 'X';
        boolean gameWon = false;

        System.out.println("Welcome to Tic Tac Toe!");
        printBoard();

        for (int turns = 0; turns < 9; turns++) {
            System.out.println("Player " + currentPlayer + ", enter row (0-2) and column (0-2): ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            // Check if cell is empty
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Invalid move. Try again.");
                turns--; // retry same player's turn
                continue;
            }

            board[row][col] = currentPlayer;
            printBoard();

            if (checkWin(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
                break;
            }

            // Switch player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        if (!gameWon) {
            System.out.println("It's a draw!");
        }
        sc.close();
    }

    // Fill board with spaces
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Print board
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Check win condition
    public static boolean checkWin(char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }
}
