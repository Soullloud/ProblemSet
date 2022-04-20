package study;

import java.util.Scanner;

public class TikTokToe {
    static int[][] winList = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, {1, 5, 9}, {3, 5, 7}};

    public static void main(String[] args) {
        char[][] gameBoard = new char[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name of First Player: ");
        String FirstPlayer = scanner.nextLine();
        System.out.print("Input name of Second Player: ");
        String SecondPlayer = scanner.nextLine();
        char currentPlayer = 'X';
        while (true) {
            System.out.print("Input number 1 -9: ");
            int n = scanner.nextInt();
            if (gameBoard[getI(n)][getJ(n)] != 0) {
                System.out.println("Input other num!");
                continue;
            }
            gameBoard[getI(n)][getJ(n)] = currentPlayer;
            printGameBoard(gameBoard);

            if (checkWin(gameBoard, currentPlayer)) {
                System.out.println(FirstPlayer + " You Win! ");
                break;
            }else if (checkWin(gameBoard, currentPlayer)){
                System.out.println(SecondPlayer + " You Win!");
                break;
            }

            if (chekDraw(gameBoard)) {
                System.out.println("It is DRAW!");
                break;
            }
            currentPlayer = (currentPlayer == 'X') ? '0' : 'X';

        }
    }

    static void printGameBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                char symbol = gameBoard[i][j];
                if (symbol == 0) {
                    symbol = ' ';
                }
                System.out.print(symbol);
                if (j == 0 || j == 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i == 0 || i == 1) {
                System.out.println("-+-+-");
            }
        }

        System.out.println();
    }

    static int getI(int n) {
        return (n - 1) / 3;
    }

    static int getJ(int n) {
        return (n - 1) % 3;
    }

    static boolean checkWin(char[][] gameBoard, char Player) {
        for (int i = 0; i < winList.length; i++) {
            boolean isWin = true;
            for (int j = 0; j < winList[i].length; j++) {
                int chekingNumber = winList[i][j];
                if (gameBoard[getI(chekingNumber)][getJ(chekingNumber)] != Player) {
                    isWin = false;
                }
            }
            if (isWin) {
                return true;
            }
        }
        return false;
    }

    static boolean chekDraw(char[][] gameBoard) {
        boolean isFull = true;
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                if (gameBoard[i][j] == 0) {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

}
