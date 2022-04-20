package study;

import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {
        char[][] gameBoard = new char[][]{{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name of First Player: ");
        String FirstPlayer = scanner.nextLine();
        System.out.print("Input name of Second Player: ");
        String SecondPlayer = scanner.nextLine();
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("First Player input 1-9: ");
            int firstPlayer = scanner.nextInt();
            firstPlayer(gameBoard, firstPlayer);
            printGameBoard(gameBoard);
            System.out.print("Second Player input 1-9: ");
            int secondPlayer = scanner.nextInt();
            secondPlayer(gameBoard, secondPlayer);
            printGameBoard(gameBoard);
        }
    }

    static void printGameBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }

    static void firstPlayer(char[][] gameBoard, int firstPlayer) {
        char symbol = 'X';
        switch (firstPlayer) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    static void secondPlayer(char[][] gameBoard, int secondPlayer) {
        char symbol = 'O';
        switch (secondPlayer) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

}