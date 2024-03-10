package com.hellocodeclub.memorygame;

import java.util.Random;

public class Board {
    // This class represents the game board for a memory game.
    // It manages the population of cells with images and provides methods to check if the game is completed.

    // The 2D array to represent the game board
    public Cell[][] board = new Cell[6][6];
    
    // Method to check if the board is completely filled with images
    private boolean isBoardFull() {
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(board[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    // Method to populate the game board with images
    public void populateMatrix() {
        // Reset the board
        board = new Cell[6][6];
        
        // Array containing image names
        String[] images = {"java", "javascript", "php", "html", "css"};
        
        // Random number generator
        Random randomGenerator = new Random();
        
        // Continue populating the board until it is full
        while(!isBoardFull()) {
            // Select a random image from the array
            int randomImageIndex = randomGenerator.nextInt(images.length);
            String randomImageSelected = images[randomImageIndex];

            // Select random positions for the two cells
            int randomRow1 = randomGenerator.nextInt(6);
            int randomCol1 = randomGenerator.nextInt(6);
            // Ensure that the selected cell is empty
            while(board[randomRow1][randomCol1] != null) {
                randomRow1 = randomGenerator.nextInt(6);
                randomCol1 = randomGenerator.nextInt(6);
            }

            int randomRow2 = randomGenerator.nextInt(6);
            int randomCol2 = randomGenerator.nextInt(6);
            // Ensure that the selected cell for the second image is empty and not the same as the first one
            while((randomRow1 == randomRow2 && randomCol1 == randomCol2)
                    || board[randomRow2][randomCol2] != null) {
                randomRow2 = randomGenerator.nextInt(6);
                randomCol2 = randomGenerator.nextInt(6);
            }

            // Place the selected images in the randomly chosen cells
            board[randomRow1][randomCol1] = new Cell(randomImageSelected, randomRow1, randomCol1);
            board[randomRow2][randomCol2] = new Cell(randomImageSelected, randomRow2, randomCol2);
        }
    }
}
