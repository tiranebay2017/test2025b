package GUI;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
/// cdscvsdvsdvsdvdsv
public class MainController {
	 @Override
	    public void start(Stage primaryStage) throws Exception {
	        // יצירת חיבור למסד נתונים
	       /* databaseConnection = new DatabaseConnection();
	        conn = databaseConnection.getconnection();

	        if (conn == null) {
	            throw new IllegalStateException("Cannot connect to the database");
	        }*/
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
	        Scene scene1 = new Scene(loader.load());
	     
	     // Set the first screen as the initial scene
	        primaryStage.setTitle("Scene Switcher Example");
	        primaryStage.setScene(scene1);
	        primaryStage.show();
	       // AppController aFrame = loader.getController();// create StudentFrame
	      //  aFrame.setStage(primaryStage);

			/*
	        // טעינת ממשק המשתמש הראשי
	        URL fxmlLocation = getClass().getResource("/com/screen/main.fxml");  // עדכון נתיב ה-FXML
	        if (fxmlLocation == null) {
	            throw new IllegalStateException("FXML file not found.");
	        }

	        FXMLLoader loader = new FXMLLoader(fxmlLocation);
	        Parent root = loader.load();

	        // העברת החיבור למסד הנתונים למחלקת הבקרה
	        AppController controller = loader.getController();
	        controller.getClass();

	        primaryStage.setTitle("Wine Database Application");
	        primaryStage.setScene(new Scene(root));
	        primaryStage.show();
	*/
	        // סגירת החיבור למסד הנתונים ביציאה
	    /*    primaryStage.setOnCloseRequest(event -> {
	            try {
	                if (conn != null && !conn.isClosed()) {
	                    conn.close();
	                    System.out.println("Database connection closed.");
	                }
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });*/
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
}

//finish we can start new branch