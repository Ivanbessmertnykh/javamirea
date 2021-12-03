package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.util.List;
import java.util.Random;

public class Main extends Application {


    //TASK11_12
//    @Override
//    public void start(Stage stage) throws Exception{
//        System.out.println("Application starts");
//        GridPane root = new GridPane();
//        final double[] lastNum = {0};
//        final double[] currentNum = {0};
//        final String[] operation = new String[1];
//
//        root.setPadding(new Insets(10, 10, 10, 10));
//        root.setHgap(5);
//        root.setVgap(5);
//
//        TextField a = new TextField();
//        GridPane.setConstraints(a, 0, 0);
//        a.setText("0");
//        root.getChildren().add(a);
//
//        Button btn_plus = new Button("+");
//        GridPane.setConstraints(btn_plus, 0, 1);
//        root.getChildren().add(btn_plus);
//        btn_plus.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                operation[0] = "+";
//                lastNum[0] = Double.parseDouble(a.getText());
//                a.setText("0");
//            }
//        });
//
//        Button btn_minus = new Button("-");
//        GridPane.setConstraints(btn_minus, 0, 2);
//        root.getChildren().add(btn_minus);
//        btn_minus.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                operation[0] = "-";
//                lastNum[0] = Double.parseDouble(a.getText());
//                a.setText("0");
//            }
//        });
//
//        Button btn_multiplicate = new Button("*");
//        GridPane.setConstraints(btn_multiplicate, 0, 3);
//        root.getChildren().add(btn_multiplicate);
//        btn_multiplicate.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                operation[0] = "*";
//                lastNum[0] = Double.parseDouble(a.getText());
//                a.setText("0");
//            }
//        });
//
//        Button btn_delit = new Button("/");
//        GridPane.setConstraints(btn_delit, 0, 4);
//        root.getChildren().add(btn_delit);
//        btn_delit.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                operation[0] = "/";
//                lastNum[0] = Double.parseDouble(a.getText());
//                a.setText("0");
//            }
//        });
//
//        Label lbl = new Label();
//        GridPane.setConstraints(lbl, 1, 0);
//        lbl.setText("Answer: -");
//        root.getChildren().add(lbl);
//
//        Button btn_eq = new Button("=");
//        GridPane.setConstraints(btn_eq, 0, 5);
//        root.getChildren().add(btn_eq);
//        btn_eq.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                if(operation[0] == "+"){
//                    currentNum[0] = Double.parseDouble(a.getText());
//                    lbl.setText("Answer: " + (lastNum[0]+currentNum[0]));
//                }
//                if(operation[0] == "-"){
//                    currentNum[0] = Double.parseDouble(a.getText());
//                    lbl.setText("Answer: " + (lastNum[0]-currentNum[0]));
//                }
//                if(operation[0] == "*"){
//                    currentNum[0] = Double.parseDouble(a.getText());
//                    lbl.setText("Answer: " + (lastNum[0]*currentNum[0]));
//                }
//                if(operation[0] == "/"){
//                    currentNum[0] = Double.parseDouble(a.getText());
//                    lbl.setText("Answer: " + (lastNum[0]/currentNum[0]));
//                }
//            }
//        });
//        //////////////////////////
//        a.setText("0");
//        //////////////////////////
//        Scene scene = new Scene(root, 235, 200);
//        stage.setScene(scene);
//        stage.setTitle("Calculator");
//        stage.show();
//    }

    //TASK13_14
//    private boolean tableIsEmpty(Button[][] buttons){
//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 3; j++){
//                if( buttons[i][j].getText() == "")
//                    return true;
//            }
//        }
//        return false;
//    }
//
//    private String whoIsWinner(Button[][] buttons){
//        if( !tableIsEmpty(buttons) )
//            return "Nothing";
//        String startChar = buttons[0][0].getText();
//        int counter = 0;
//        for (int i = 0; i < 3; i++){
//            if( buttons[i][i].getText() == "" )
//                break;
//            if( buttons[i][i].getText() == startChar )
//                counter++;
//            if( counter == 3  )
//                return startChar;
//        }
//        for (int i = 0; i < 3; i++){
//            if( buttons[i][2-i].getText() == "" )
//                break;
//            if( buttons[i][2-i].getText() == startChar )
//                counter++;
//            if( counter == 3  )
//                return startChar;
//        }
//        for( int i = 0; i < 3; i++ ){
//            counter = 0;
//            startChar = buttons[i][0].getText();
//            for( int j = 0; j < 3; j++ ){
//                if( buttons[i][j].getText() == "" )
//                    break;
//                if( buttons[i][j].getText() == startChar )
//                    counter++;
//                if( counter == 3  )
//                    return startChar;
//            }
//        }
//        for( int i = 0; i < 3; i++ ){
//            counter = 0;
//            startChar = buttons[0][i].getText();
//            for( int j = 0; j < 3; j++ ){
//                if( buttons[j][i].getText() == "" )
//                    break;
//                if( buttons[j][i].getText() == startChar )
//                    counter++;
//                if( counter == 3  )
//                    return startChar;
//            }
//        }
//        return "";
//    }
//
    //krestiki-noliki
//    @Override
//    public void start(Stage stage) throws Exception{
//        System.out.println("Application starts");
//        GridPane root = new GridPane();
//        root.setPadding(new Insets(10, 10, 10, 10));
//        Button[][] btns = new Button[3][3]; //Button btn_plus = new Button("+");
//        Label label = new Label("Winner: ");
//        GridPane.setConstraints(label, 3, 0);
//        root.getChildren().add(label);
//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 3; j++){
//                int localI, localJ;
//                localI = i;
//                localJ = j;
//                btns[i][j] = new Button();
////                btns[i][j].setText(String.valueOf(i*3+j));
//                btns[i][j].setMinSize(40,40);
//                btns[i][j].setMaxSize(80,80);
//                btns[i][j].setOnAction(new EventHandler<ActionEvent>() {
//                    @Override
//                    public void handle(ActionEvent actionEvent) {
//                        if( btns[localI][localJ].getText() == "" & label.getText() == "Winner: ") {
//                            btns[localI][localJ].setText("O");
//                            if (tableIsEmpty(btns)) {
//                                while (true) {
//                                    int r = (int) (Math.random() * 9);
//                                    if (btns[r / 3][r % 3].getText() == "") {
//                                        btns[r / 3][r % 3].setText("X");
//                                        break;
//                                    }
//                                }
//                            }
//                            String res = whoIsWinner(btns);
//                            label.setText("Winner: " + res);
//                        }
//                    }
//                });
//                GridPane.setConstraints(btns[i][j], j, i);
//                root.getChildren().add(btns[i][j]);
//            }
//        }
//
//        Button reset = new Button("R");
//        GridPane.setConstraints(reset, 3, 2);
//        root.getChildren().add(reset);
//        reset.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                for (int i = 0; i < 3; i++){
//                    for (int j = 0; j < 3; j++){
//                        btns[i][j].setText("");
//                    }
//                }
//                label.setText("Winner: ");
//            }
//        });
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.setTitle("Calculator");
//        stage.show();
//    }

    @Override
    public void start(Stage stage) throws Exception{
        System.out.println("Application starts");
        GridPane root = new GridPane();



        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
