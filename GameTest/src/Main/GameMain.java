package Main;
//helloooooooo
import java.sql.Connection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameMain extends Application{
    private Connection conn;
   // private DatabaseConnection databaseConnection;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // יצירת חיבור למסד נתונים
       /*databaseConnection = new DatabaseConnection();
       conn = databaseConnection.getconnection();

        if (conn == null) {
            throw new IllegalStateException("Cannot connect to the database");
        }
        */
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Scene scene1 = new Scene(loader.load());
     
     // Set the first screen as the initial scene
        primaryStage.setTitle("Scene Switcher Example");
        primaryStage.setScene(scene1);
        primaryStage.show();
       // AppController aFrame = loader.getController();// create StudentFrame
        //aFrame.setStage(primaryStage);


        // סגירת החיבור למסד הנתונים ביציאה
        primaryStage.setOnCloseRequest(event -> {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                    System.out.println("Database connection closed.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
