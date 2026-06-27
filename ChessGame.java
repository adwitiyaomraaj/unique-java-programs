


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ChessGame extends JFrame {
    
    private static final int BOARD_SIZE = 8;
    private static final int SQUARE_SIZE = 50;

    private Piece[][] board;
    private boolean isWhiteTurn;
    private Piece selectedPiece;
    private ArrayList<Piece> whitePieces;
    private ArrayList<Piece> blackPieces;

    
    public ChessGame() {
        super("Chess Game");
        setSize(BOARD_SIZE * SQUARE_SIZE, BOARD_SIZE * SQUARE_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        board = new Piece[BOARD_SIZE][BOARD_SIZE];
        
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = null;
            }
        }

        
        whitePieces = new ArrayList<>();
        blackPieces = new ArrayList<>();
        createPieces();

        
        JPanel boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                JButton square = new JButton();
                square.addActionListener(new SquareActionListener(i, j));
                boardPanel.add(square);
            }
        }
        add(boardPanel, BorderLayout.CENTER);

        
        isWhiteTurn = true;
        selectedPiece = null;
    }

    
    private void createPieces() {
        
        whitePieces.add(new King("White", 0, 0));
        whitePieces.add(new Queen("White", 0, 1));
        whitePieces.add(new Rook("White", 0, 2));
        whitePieces.add(new Bishop("White", 0, 3));
        whitePieces.add(new Knight("White", 0, 4));
        whitePieces.add(new Pawn("White", 1, 0));
        whitePieces.add(new Pawn("White", 1, 1));
        whitePieces.add(new Pawn("White", 1, 2));
        whitePieces.add(new Pawn("White", 1, 3));
        whitePieces.add(new Pawn("White", 1, 4));

        
        blackPieces.add(new King("Black", 7, 0));
        blackPieces.add(new Queen("Black", 7, 1));
        blackPieces.add(new Rook("Black", 7, 2));
        blackPieces.add(new Bishop("Black", 7, 3));
        blackPieces.add(new Knight("Black", 7, 4));
        blackPieces.add(new Pawn("Black", 6, 0));
        blackPieces.add(new Pawn("Black", 6, 1));
        blackPieces.add(new Pawn("Black", 6, 2));
        blackPieces.add(new Pawn("Black", 6, 3));
        blackPieces.add(new Pawn("Black", 6, 4));
    }

    private class SquareActionListener implements ActionListener {
        private int x;
        private int y;

        
        public SquareActionListener(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        
        public void actionPerformed(ActionEvent e) {
            
            if (selectedPiece != null) {
                
                if (selectedPiece.isValidMove(x, y, board)) {
                    
                    board[x][y] = selectedPiece;
                    board[selectedPiece.x][selectedPiece.y] = null;
                    selectedPiece.x = x;
                    selectedPiece.y = y;

                    
                    isWhiteTurn = !isWhiteTurn;
                    selectedPiece = null;
                }
            } else {
                
                Piece piece = board[x][y];
                if (piece != null && piece.color.equals(isWhiteTurn ? "White" : "Black")) {
                    selectedPiece = piece;
                }
            }
        }
    }

    private abstract class Piece {
        protected String color;
        protected int x;
        protected int y;

        
        public Piece(String color, int x, int y) {
            this.color = color;
            this.x = x;
            this.y = y;
        }

        public abstract boolean isValidMove(int newX, int newY, Piece[][] board);
    }

    private class King extends Piece {
        
        public King(String color, int x, int y) {
            super(color, x, y);
        }

                @Override
        
        public boolean isValidMove(int newX, int newY, Piece[][] board) {
            
            if (Math.abs(newX - x) <= 1 && Math.abs(newY - y) <= 1) {
                if (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                    if (board[newX][newY] == null || !board[newX][newY].color.equals(color)) {
                        
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private class Queen extends Piece {
        
        public Queen(String color, int x, int y) {
            super(color, x, y);
        }

        @Override
        
        public boolean isValidMove(int newX, int newY, Piece[][] board) {
            
            if (Math.abs(newX - x) == Math.abs(newY - y)) {
                
                int dx = (newX - x) / Math.abs(newX - x);
                int dy = (newY - y) / Math.abs(newY - y);
                int x1 = x + dx;
                int y1 = y + dy;
                
                while (x1 != newX) {
                    if (board[x1][y1] != null) {
                        return false;
                    }
                    x1 += dx;
                    y1 += dy;
                }
            } else if (newX == x) {
                
                int dy = (newY - y) / Math.abs(newY - y);
                int y1 = y + dy;
                while (y1 != newY) {
                    if (board[x][y1] != null) {
                        return false;
                    }
                    y1 += dy;
                }
            } else if (newY == y) {
                
                int dx = (newX - x) / Math.abs(newX - x);
                int x1 = x + dx;
                while (x1 != newX) {
                    if (board[x1][y] != null) {
                        return false;
                    }
                    x1 += dx;
                }
            } else {
                return false;
            }
            if (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                if (board[newX][newY] == null || !board[newX][newY].color.equals(color)) {
                    return true;
                }
            }
            return false;
        }
    }

    private class Rook extends Piece {
        
        public Rook(String color, int x, int y) {
            super(color, x, y);
        }

        @Override
        
        public boolean isValidMove(int newX, int newY, Piece[][] board) {
            
            if (newX == x) {
                
                int dy = (newY - y) / Math.abs(newY - y);
                int y1 = y + dy;
                while (y1 != newY) {
                    if (board[x][y1] != null) {
                        return false;
                    }
                    y1 += dy;
                }
            } else if (newY == y) {
                
                int dx = (newX - x) / Math.abs(newX - x);
                int x1 = x + dx;
                while (x1 != newX) {
                    if (board[x1][y] != null) {
                        return false;
                    }
                    x1 += dx;
                }
            } else {
                return false;
            }
            if (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                if (board[newX][newY] == null || !board[newX][newY].color.equals(color)) {
                    return true;
                }
            }
            return false;
        }
    }

    private class Bishop extends Piece {
        
        public Bishop(String color, int x, int y) {
            super(color, x, y);
        }

        @Override
        
        public boolean isValidMove(int newX, int newY, Piece[][] board) {
            
            if (Math.abs(newX - x) == Math.abs(newY - y)) {
                
                int dx = (newX - x) / Math.abs(newX - x);
                int dy = (newY - y) / Math.abs(newY - y);
                int x1 = x + dx;
                int y1 = y + dy;
                                while (x1 != newX) {
                    if (board[x1][y1] != null) {
                        return false;
                    }
                    x1 += dx;
                    y1 += dy;
                }
            } else {
                return false;
            }
            if (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                if (board[newX][newY] == null || !board[newX][newY].color.equals(color)) {
                    return true;
                }
            }
            return false;
        }
    }

    private class Knight extends Piece {
        
        public Knight(String color, int x, int y) {
            super(color, x, y);
        }

        @Override
        
        public boolean isValidMove(int newX, int newY, Piece[][] board) {
            
            int dx = Math.abs(newX - x);
            int dy = Math.abs(newY - y);
            if ((dx == 2 && dy == 1) || (dx == 1 && dy == 2)) {
                if (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                    if (board[newX][newY] == null || !board[newX][newY].color.equals(color)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private class Pawn extends Piece {
        
        public Pawn(String color, int x, int y) {
            super(color, x, y);
        }

        @Override
        
        public boolean isValidMove(int newX, int newY, Piece[][] board) {
            
            if (color.equals("White")) {
                if (x == 1 && newX == 3 && newY == y && board[2][y] == null && board[3][y] == null) {
                    return true;
                } else if (newX == x + 1 && newY == y && board[newX][newY] == null) {
                    return true;
                } else if (newX == x + 1 && Math.abs(newY - y) == 1 && board[newX][newY] != null && !board[newX][newY].color.equals(color)) {
                    return true;
                }
            } else {
                if (x == 6 && newX == 4 && newY == y && board[5][y] == null && board[4][y] == null) {
                    return true;
                } else if (newX == x - 1 && newY == y && board[newX][newY] == null) {
                    return true;
                } else if (newX == x - 1 && Math.abs(newY - y) == 1 && board[newX][newY] != null && !board[newX][newY].color.equals(color)) {
                    return true;
                }
            }
            return false;
        }
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            
            public void run() {
                ChessGame game = new ChessGame();
                game.setVisible(true);
            }
        });
    }
}