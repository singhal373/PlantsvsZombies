package sample;
import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Stack;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Scene root =  FXMLLoader.load(getClass().getResource("sample.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        Image cir= new Image("file:/home/bawse/IdeaProjec ts/PlantsvsZombies/src/sample/pics/ProjectilePea.png");
//        ImageView imageView = new ImageView(cir);
////        int width= 0;
//        //int upper_right=
//        //Setting the position of the image
//        imageView.setX(50);
//        imageView.setY(25);
//
//        //setting the fit height and width of the image view
//        imageView.setFitHeight(45);
//        imageView.setFitWidth(50);
//
//        //Setting the preserve ratio of the image view
//        imageView.setPreserveRatio(true);
//
//        //Creating a Group object
////        Group root = new Group(imageView);
//        //Pane root = new Pane(cir);
////        root.getChildren(imageView);
//        //Background image
//        BackgroundImage myBI= new BackgroundImage(new Image("file:/home/bawse/IdeaProjects/PlantsvsZombies/src/sample/pics/Background1.jpg",600,600,false,false),
//                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
//                BackgroundSize.DEFAULT);
//        Region region = new Region();
//        region.setBackground(new Background(myBI));
//
//        StackPane stackpane= new StackPane();
//
//
//        FlowPane flow = new FlowPane();
//        //flow.setPadding(new Insets(5, 0, 5, 0));
//        flow.setVgap(4);
//        flow.setHgap(4);
//        flow.setPrefWrapLength(170); // preferred width allows for two columns
//        flow.setStyle("-fx-background-color: DAE6F3;");
//
//        ImageView pages[] = new ImageView[8];
//        for (int i=0; i<1; i++) {
//            pages[i] = new ImageView(
//                    new Image("file:/home/bawse/IdeaProjects/PlantsvsZombies/src/sample/pics/"+ "flow"+(i+1)+".png"));
////            pages[i]=imageView;
//            flow.getChildren().add(pages[i]);
//        }
//        stackpane.getChildren().addAll(flow,region);
//        TranslateTransition transition = new TranslateTransition();
//        transition.setDuration(Duration.seconds(2));
//        transition.setToX(500);
//
//        //Setting the position of the image
//        transition.setToY(500); //max y
//        transition.setAutoReverse(true);
//        transition.setCycleCount(Animation.INDEFINITE);
//        //transition.setNode(imageView); //linking to object
//        transition.play();
        //Scene scene = new Scene(root, 600, 600);
//        scene.getStylesheets().add(getClass().getResource("stylesheet.css").toExternalForm());
        primaryStage.setScene(root);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
