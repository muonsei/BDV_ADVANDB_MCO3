package controller;

import java.io.IOException;
import controller.viewmanager.ViewManagerException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class MainController extends Controller {

	public MainController(String fxmlpath, String csspath) throws IOException {
        super(fxmlpath, csspath);
    }
	
	@FXML
    private Button selectButtonGenerate, selectButtonExecute, 
    insertButtonGenerate, insertButtonExecute,
    updateButtonGenerate, updateButtonExecute,
    deleteButtonDelete;
	
	@FXML
	private ComboBox selectRegion, insertRegion, updateRegion;
	
	@FXML
	private TextArea selectQuery, insertQuery, updateQuery;
	
	@FXML
	private TableView selectTableview, insertTableview, updateTableview, deleteTableview;

	
	@Override
	public void load() throws ViewManagerException {
		// TODO Auto-generated method stub
		if(isFirstLoad())
        {
			/*
			// TODO generate query (select) handler
			selectButtonGenerate.addEventHandler(ActionEvent.ACTION, e -> {
				System.out.println("selectButtonGenerate");
			});
			
			// TODO execute query (select) handler
			selectButtonExecute.addEventHandler(ActionEvent.ACTION, e -> {
				System.out.println("selectButtonExecute");
			});
			
			// TODO generate query (insert) handler
			insertButtonGenerate.addEventHandler(ActionEvent.ACTION, e -> {
				System.out.println("insertButtonGenerate");
			});
			
			// TODO execute query (insert) handler
			insertButtonExecute.addEventHandler(ActionEvent.ACTION, e -> {
				System.out.println("insertButtonExecute");
			});
			
			// TODO generate query (update) handler
			updateButtonGenerate.addEventHandler(ActionEvent.ACTION, e -> {
				System.out.println("updateButtonGenerate");
			});
			
			// TODO execute query (update) handler
			updateButtonExecute.addEventHandler(ActionEvent.ACTION, e -> {
				System.out.println("updateButtonExecute");
			});
			
			// TODO execute query (delete) handler
			deleteButtonDelete.addEventHandler(ActionEvent.ACTION, e -> {
				System.out.println("deleteButtonDelete");
			});
			*/
			
			System.out.println("First load!");
        }
	}

	/**
	 * Clears all contents in preparation for new query
	 */
	@Override
	public void clear() {
		// TODO reset ComboBoxes back to prompt

		// TODO clear all TextViews and TextFields
		
		// TODO clear all TableViews
	}

}
