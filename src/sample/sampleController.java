package sample;

import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

import javafx.scene.input.MouseEvent;

import java.awt.*;

public class sampleController {
   public sampleController(){}
   void show_background(){
      Image cir= new Image("file:/home/bawse/IdeaProjects/PlantsvsZombies/src/sample/pics/Background1.jpg");
      ImageView imageView = new ImageView(cir);
   }
   @FXML
   public ImageView zombie_gif;
   public GridPane grid;
   public ImageView sun_icon;
   public Label sun_counter;
   public AnchorPane anchor;
   public ImageView zombie_head;
   public ImageView sunflower_gif;
//   public ImageView lawnmower;
//   public ImageView projectile;
//   void Zombie_move(ActionEvent event){
//   public static final EventType<MouseEvent> Zombie_move
    public void Sun_move(MouseEvent event) {

           Image cir= new Image("file:/home/bawse/IdeaProjects/PlantsvsZombies/src/sample/pics/Sun.png");
        ImageView sun = new ImageView(cir);
        TranslateTransition move = new TranslateTransition();
        anchor.getChildren().add(sun);
        sun.setFitHeight(85);
        sun.setFitWidth(85);
        sun.setVisible(true);
        sun.setPreserveRatio(true);
        sun.translateXProperty().setValue(500);
        sun.translateYProperty().set(-100);
        move.setNode(sun);
        move.setCycleCount(Animation.INDEFINITE);
        move.setDuration(Duration.seconds(15));
        move.setToY(800);
        move.play();
        sun.setOnMouseClicked((event1) -> {
        sun.setVisible(false);
        sun_counter.setText(String.valueOf(Integer.valueOf(sun_counter.getText()) + 25));
        });}

        public void Zombie_head_timer(MouseEvent event){
            TranslateTransition move = new TranslateTransition();
            move.setDuration(Duration.seconds(30));
            move.setNode(zombie_head);
            move.setToX(450);
            move.play();
        }
        public void sun_produced(MouseEvent event){
            Image cir= new Image("file:/home/bawse/IdeaProjects/PlantsvsZombies/src/sample/pics/Sun.png");
            ImageView sun = new ImageView(cir);
            grid.add(sun,1,1);
            sun.setFitHeight(20);
            sun.setFitWidth(20);
            sun.translateXProperty().set(50);
            sun.translateYProperty().set(20);
            ScaleTransition scaleTransition = new ScaleTransition();
            scaleTransition.setNode(sun);
            scaleTransition.setDuration(Duration.seconds(2));
            scaleTransition.setToX(4);
            scaleTransition.setToY(4);
            scaleTransition.play();
            sun.setOnMouseClicked((event1) -> {
                sun.setVisible(false);
                sun_counter.setText(String.valueOf(Integer.valueOf(sun_counter.getText()) + 25));

            });
    }



   public void Zombie_move(MouseEvent event) {
            TranslateTransition zombie_move = new TranslateTransition(Duration.seconds(3), zombie_gif);
            zombie_move.setCycleCount(1);
            zombie_move.setDuration(Duration.seconds(20));
            zombie_move.setToX(-500);
            zombie_move.play();
   }
    public void Lawnmower_move(MouseEvent event) {
        Node lawnmower = (Node) event.getSource();
        TranslateTransition move = new TranslateTransition(Duration.seconds(3), lawnmower);
        move.setCycleCount(1);
        move.setToX(1500);
        move.play();
    }
    public void Projectile_move(MouseEvent event) {
        Image cir= new Image("file:/home/bawse/IdeaProjects/PlantsvsZombies/src/sample/pics/ProjectilePea.png");
        ImageView projectile = new ImageView(cir);
        TranslateTransition move = new TranslateTransition();
        grid.add(projectile,0,0,GridPane.REMAINING,1);
        projectile.translateXProperty().setValue(70);
        projectile.translateYProperty().set(-25);
        move.setNode(projectile);
        move.setDuration(Duration.seconds(4));
        move.setCycleCount(Animation.INDEFINITE);
        move.setToX(800);
        move.play();
    }
}
