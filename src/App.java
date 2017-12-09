import controller.*;
import controller.viewmanager.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;
import model.DBConnection;
import model.DBDecider;
import model.DBHelper;
import model.Record;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;

import bitronix.tm.BitronixTransactionManager;
import bitronix.tm.TransactionManagerServices;

public class App extends Application
{
    public static void main(String[] args)
    {
        //launch(args);
    	BitronixTransactionManager btm = TransactionManagerServices.getTransactionManager();
    	DBDecider dbdecider = new DBDecider(btm);
    	
//    	ArrayList<String> s= dbdecider.getAllRegions();
//    	System.out.println(s.size());
//    	
//    	for(int i=0; i<s.size(); i++){
//    		System.out.println(s.get(i));
//    	}
//    	
//    	ArrayList<Record> c= dbdecider.getAllCountryRowByRegion("East Asia & Pacific");
//    	System.out.println(c.size());
//    	
//    	for(int i=0; i<c.size(); i++){
//    		System.out.println(c.get(i).getCountry());
//    	}
    	
    	
    	Record r = new Record();
    	r.setId(256);
    	r.setCountry("BOI");
    	r.setRegion("Europe & Central Asia");
    	r.setYear("2005");
    	r.setValue(1.299);
    	
    	dbdecider.deleteRecord(r);
    	
    	btm.shutdown();
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