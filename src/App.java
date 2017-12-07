import controller.*;
import controller.viewmanager.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;
import model.DBConnection;

import java.io.*;
import java.net.URISyntaxException;

public class App extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        // TODO Setup DBConnection

        // Setup Controllers and ViewManager
        MainController controller = new MainController("/view/main.fxml", null);
        ViewManager vm = new ViewManager(controller);

        primaryStage.setTitle("ADVANDB MCO3 - Distributed Databases");
        primaryStage.setScene(vm.getScene());
        primaryStage.setMaximized(true);
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(800);
        primaryStage.show();
    }

    @Override
    public void stop()
    {
        DBConnection dbc = DBConnection.getInstance();
        dbc.closeConnection();
    }
}