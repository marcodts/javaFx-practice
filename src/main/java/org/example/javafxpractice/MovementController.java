package org.example.javafxpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;

public class MovementController {
    @FXML
    private Circle circle;
    private double xPos;
    private double yPos;

    public void moveUpward() {
        circle.setCenterY(yPos -= 10);
    }

    public void moveDownward() {
        circle.setCenterY(yPos += 10);
    }

    public void moveLeft() {
        circle.setCenterX(xPos -= 10);
    }

    public void moveRight() {
        circle.setCenterX(xPos += 10);
    }


}



//public void moveUpward(ActionEvent event) {
//    circle.setCenterY(yPos -= 10);
//}
//
//public void moveDownward(ActionEvent event) {
//    circle.setCenterY(yPos += 10);
//}
//
//public void moveLeft(ActionEvent event) {
//    circle.setCenterX(xPos -= 10);
//}
//
//public void moveRight(ActionEvent event) {
//    circle.setCenterX(xPos += 10);
//}