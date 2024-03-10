package com.hellocodeclub.memorygame;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AppController {
    // This class serves as the controller for the memory game application.
    
    @FXML
    public GridPane gameMatrix;
    
    @FXML
    public Button restart; 

    // Instance of the Board class to manage the game board
    Board board = new Board();

    // Variables to keep track of the currently selected cards
    Cell firstCard = null;
    Cell secondCard = null;

    // Method called upon initialization of the controller
    @FXML
    public void initialize() throws FileNotFoundException {
        // Populate the game board
        board.populateMatrix();

        // Initialize each cell in the game matrix with a question mark image
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                FileInputStream input = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\ensiasd\\memorygame-master\\images\\question.jpg");
                Image image = new Image(input);
                ImageView imageView = new ImageView(image);
                imageView.setFitWidth(90);
                imageView.setFitHeight(90);
                imageView.setUserData(row+","+col);
                imageView.setOnMouseClicked(event -> {
                    try {
                        cardListener(event);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                });
                gameMatrix.add(imageView, row, col);
            }
        }
        System.out.println("hello jadir");
    }
    
    // Method to handle the restart button action
    @FXML
    public void handleRestartButton(ActionEvent event) throws FileNotFoundException {
        Button clickedButton = (Button) event.getSource();
        if (clickedButton.getId().equals("restart")) {
            // The restart button is clicked
            System.out.println("Restart button clicked!");
            gameMatrix.getChildren().clear(); 
            initialize(); // Call the resetGame method when the restart button is clicked
        }
    }

    // Method to handle the click event on a card
    public void cardListener(MouseEvent event) throws FileNotFoundException {
        Node sourceComponent = (Node) event.getSource();
        String rowAndColumn = (String)sourceComponent.getUserData();
        
        int rowSelected = Integer.parseInt(rowAndColumn.split(",")[0]);
        int colSelected = Integer.parseInt(rowAndColumn.split(",")[1]);

        String image = board.board[rowSelected][colSelected].value;

        FileInputStream imageFile = new FileInputStream("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\ensiasd\\\\memorygame-master\\images\\"+image+".png");

        Image selectedImage = new Image(imageFile);
        ((ImageView)sourceComponent).setImage(selectedImage);
        checkIfMatchingPairWasFound(rowSelected,colSelected);
    }

    // Method to check if a matching pair was found
    public void checkIfMatchingPairWasFound(int rowSelected, int colSelected) throws FileNotFoundException {
        if(firstCard == null){
            firstCard = board.board[rowSelected][colSelected];
        }else if(secondCard == null){
            secondCard = board.board[rowSelected][colSelected];
        }else {
            if(firstCard.value.equals(secondCard.value)){
                // Matching pair found
                board.board[firstCard.row][firstCard.col].wasGuessed = true;
                board.board[secondCard.row][secondCard.col].wasGuessed = true;
            } else {
                // No matching pair found, flip back the cards
                int indexFirstCardInList = (firstCard.row * 6) + firstCard.col;

                FileInputStream questionFile = new FileInputStream("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\ensiasd\\\\memorygame-master\\images\\question.jpg");
                Image questionImage = new Image(questionFile);
                ((ImageView)gameMatrix.getChildren().get(indexFirstCardInList)).setImage(questionImage);

                int indexSecondCardInList = (secondCard.row * 6) + secondCard.col;
                ((ImageView)gameMatrix.getChildren().get(indexSecondCardInList)).setImage(questionImage);
            }

            firstCard = board.board[rowSelected][colSelected];
            secondCard = null;
        }
    }
}
