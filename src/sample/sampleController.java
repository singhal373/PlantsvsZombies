package sample;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import javafx.scene.input.MouseEvent;

public class sampleController {
   public sampleController(){}
   void show_background(){
      Image cir= new Image("file:/home/bawse/IdeaProjects/PlantsvsZombies/src/sample/pics/Background1.jpg");
      ImageView imageView = new ImageView(cir);
   }
   @FXML
   public ImageView zombie_gif;

//   void Zombie_move(ActionEvent event){
//   public static final EventType<MouseEvent> Zombie_move

   public void Zombie_move(MouseEvent event) {
            TranslateTransition zombie_move = new TranslateTransition(Duration.seconds(3), zombie_gif);
            zombie_move.setCycleCount(1);
            zombie_move.setToX(-500);
            zombie_move.play();
   }

}
