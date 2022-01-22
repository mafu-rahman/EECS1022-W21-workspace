package eecs1022.lab8.tictactoe.model;

public class Game {
    String pX;
    String pO;
    String status;
    String winner;

    char chance;
    char[][] board;

    boolean error;
    boolean isGameOver;

    public Game(String x, String o) {
        this.pX = x;
        this.pO = o;
        this.status = "";
        this.winner = "";

        this.chance = 'x';
        this.board = new char[3][3];

        this.error = false;
        this.isGameOver = false;

        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = '_';
            }
        }
    }

    /*
    Helper Methods
     */
    private void errorChecking(int r, int c) {
        if (this.isGameOver && !this.winner.equals("Tie")){
            this.status = "Error: game is already over with a winner.";
        }
        else if (this.isGameOver && this.winner.equals("Tie")){
            this.status = "Error: game is already over with a tie.";
        }
        else if (r > this.board.length || r < 1) {
            this.status = "Error: row " + r + " is invalid.";
            this.error = true;
        } else if (c > this.board.length || c < 1) {
            this.status = "Error: col " + c + " is invalid.";
            this.error = true;
        } else if (this.board[r-1][c-1] != '_') {
            this.status = "Error: slot @ (" + r + ", " + c + ") is already occupied.";
            this.error = true;
        } else {
            this.error = false;
        }
    }

    private void isGameOver() {
        for (int i = 0; i < 3; i++) {
            if (this.board[i][0] == 'x' && this.board[i][1] == 'x' && this.board[i][2] == 'x') {
                this.winner = this.pX;
            } else if (this.board[i][0] == 'o' && this.board[i][1] == 'o' && this.board[i][2] == 'o') {
                this.winner = this.pO;
            } else if (this.board[0][i] == 'x' && this.board[1][i] == 'x' && this.board[2][i] == 'x') {
                this.winner = this.pX;
            } else if (this.board[0][i] == 'o' && this.board[1][i] == 'o' && this.board[2][i] == 'o') {
                this.winner = this.pO;
            } else if (this.board[0][0] == 'x' && this.board[1][1] == 'x' && this.board[2][2] == 'x') {
                this.winner = this.pX;
            } else if (this.board[0][0] == 'o' && this.board[1][1] == 'o' && this.board[2][2] == 'o') {
                this.winner = this.pO;
            }else if (this.board[2][0] == 'x' && this.board[1][1] == 'x' && this.board[0][2] == 'x') {
                this.winner = this.pX;
            }else if (this.board[2][0] == 'o' && this.board[1][1] == 'o' && this.board[0][2] == 'o') {
                this.winner = this.pO;
            }
            else{
                boolean tie = true;
                for (int r = 0; r < this.board.length; r++) {
                    for (int c = 0; c < this.board[r].length; c++) {
                        tie = tie && this.board[r][c] != '_';
                    }
                }
                if (tie){
                    this.winner = "Tie";
                    this.chance = ' ';
                }
            }
        }

        if (this.winner.equals(this.pX) || this.winner.equals(this.pO)) {
            this.status = "Game is over with " + this.winner + " being the winner.";
            this.isGameOver = true;
            this.chance = ' ';
        }
        else if (this.winner.equals("Tie")) {
            this.status = "Game is over with a tie between " + pX + " and " + pO + ".";
            this.isGameOver = true;
            this.chance = ' ';
        }
    }

    /*
    Accessors
     */
    public String getCurrentPlayer() {
        String currentPlayer = null;
        if (this.chance == 'o') {
            currentPlayer = this.pO;
        } else if (this.chance == 'x') {
            currentPlayer = this.pX;
        }
        return currentPlayer;
    }

    public String getStatus() {
        if (!this.error && !this.isGameOver){
            this.status = this.getCurrentPlayer() + "'s turn to play...";
        }
        return this.status;
    }

    public char[][] getBoard() {
        return this.board;
    }

    /*
    Mutators
     */
    public void setWhoPlaysFirst(char c) {
        this.chance = c;
    }

    public void move(int r, int c) {
        this.errorChecking(r,c);

        if (!this.error && !this.isGameOver){
            this.board[r-1][c-1] = this.chance;
            this.isGameOver();
            if (!this.isGameOver){
                if (this.chance=='o'){
                    this.chance = 'x';
                }
                else{
                    this.chance = 'o';
                }
            }
        }
    }
}