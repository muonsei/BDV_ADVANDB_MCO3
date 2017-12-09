package controller;

import java.io.IOException;
import controller.viewmanager.ViewManagerException;
import java.util.ArrayList;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.DBDecider;
import model.Record;

public class MainController extends Controller {

	private final DBDecider decider = new DBDecider();
	
	public MainController(String fxmlpath, String csspath) throws IOException {
        super(fxmlpath, csspath);
    }
	
	@FXML
    private Button selectButtonGenerate, selectButtonExecute, 
    insertButtonGenerate, insertButtonExecute,
    updateButtonGenerate, updateButtonExecute,
    deleteButtonDelete;
	
	@FXML
	private ComboBox selectRegion, insertRegion, updateRegion, insertCountry, updateCountry;
	
	@FXML
	private TextArea selectQuery, insertQuery, updateQuery;
	
	@FXML
	private TextField insertValue, updateID, updateYear, updateValue;
	
	@FXML
	private TableView selectTableview, insertTableview, updateTableview, deleteTableview;

	
	@Override
	public void load() throws ViewManagerException {
		// TODO Auto-generated method stub
		if(isFirstLoad())
        {
			// TODO retrieve all regions, populate selectRegion/insertRegion/updateRegion
			ObservableList<String> regions = FXCollections.observableArrayList(decider.getAllRegions());
			// TODO add listener to selectRegion/insertRegion/updateRegion to populate 
			selectRegion.setItems(regions);
			insertRegion.setItems(regions);
			updateRegion.setItems(regions);

			insertRegion.valueProperty().addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
					ArrayList<Record> records = decider.getAllCountryRowByRegion(newValue);
					ArrayList<String> countries = new ArrayList<>();
					for (int i = 0; i < records.size(); ++i) {
						countries.add(records.get(i).getCountry());
					}
					ObservableList<String> country = FXCollections.observableArrayList(countries);
					insertCountry.setItems(country);
				}

			});
			
			updateRegion.valueProperty().addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
					ArrayList<Record> records = decider.getAllCountryRowByRegion(newValue);
					ArrayList<String> countries = new ArrayList<>();
					for (int i = 0; i < records.size(); ++i) {
						countries.add(records.get(i).getCountry());
					}
					ObservableList<String> country = FXCollections.observableArrayList(countries);
					updateCountry.setItems(country);
				}

			});
			
			// TODO generate query (select) handler
			selectButtonGenerate.addEventHandler(ActionEvent.ACTION, e -> {
				
			});
			
			
			// TODO execute query (select) handler
			selectButtonExecute.addEventHandler(ActionEvent.ACTION, e -> {
				
			});
			
			
			// TODO generate query (insert) handler
			insertButtonGenerate.addEventHandler(ActionEvent.ACTION, e -> {
				
			});
			
			// TODO execute query (insert) handler
			insertButtonExecute.addEventHandler(ActionEvent.ACTION, e -> {
				
			});
			
			// TODO generate query (update) handler
			updateButtonGenerate.addEventHandler(ActionEvent.ACTION, e -> {
				
			});
			
			// TODO execute query (update) handler
			updateButtonExecute.addEventHandler(ActionEvent.ACTION, e -> {
				
			});
			
			// TODO execute query (delete) handler
			deleteButtonDelete.addEventHandler(ActionEvent.ACTION, e -> {
				
			});
			
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
