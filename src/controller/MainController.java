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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
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
	RadioButton radioSelect1, radioInsert1, radioUpdate1, radioDelete1, 
		radioSelect2, radioInsert2, radioUpdate2, radioDelete2;

	@FXML
	ComboBox comboSelectRegion1, comboInsertRegion1, comboInsertCountry1, 
		comboUpdateRegion1, comboUpdateCountry1, comboUpdateYear1, 
		comboDeleteRegion1, comboDeleteCountry1, comboDeleteYear1, 
		comboSelectRegion2, comboInsertRegion2, comboInsertCountry2, 
		comboUpdateRegion2, comboUpdateCountry2, comboUpdateYear2, 
		comboDeleteRegion2, comboDeleteCountry2, comboDeleteYear2;
	
	@FXML
	TextField textfieldInsertYear1, textfieldInsertValue1, textfieldUpdateValue1,
		textfieldDeleteValue1, textfieldInsertYear2, textfieldInsertValue2,
		textfieldUpdateValue2, textfieldDeleteValue2;
	
	@FXML
	Button buttonRefreshTable, buttonGenerateQueries, buttonLocalRun, buttonGlobalRun;
	
	@FXML
	CheckBox checkboxTransaction1, checkboxTransaction2;
	
	@FXML
	TextArea textareaTransaction1, textareaTransaction2;
	
	@FXML
	TableView tableview;
	
	@SuppressWarnings("unchecked")
	@Override
	public void load() throws ViewManagerException {
		// TODO Auto-generated method stub
		if(isFirstLoad())
        {
			// TODO retrieve all regions, populate selectRegion/insertRegion/updateRegion
			ObservableList<String> regions = FXCollections.observableArrayList(decider.getAllRegions());
			// TODO add listener to selectRegion/insertRegion/updateRegion to populate 
			comboSelectRegion1.setItems(regions);
			comboInsertRegion1.setItems(regions);
			comboUpdateRegion1.setItems(regions);
			comboDeleteRegion1.setItems(regions);
			comboSelectRegion2.setItems(regions);
			comboInsertRegion2.setItems(regions);
			comboUpdateRegion2.setItems(regions);
			comboDeleteRegion2.setItems(regions);

			// INSERT - REGION (TRANSACTION 1)
			comboInsertRegion1.valueProperty().addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
					ArrayList<Record> records = decider.getAllCountryRowByRegion(newValue);
					ArrayList<String> countries = new ArrayList<>();
					for (int i = 0; i < records.size(); ++i) {
						countries.add(records.get(i).getCountry());
					}
					ObservableList<String> country = FXCollections.observableArrayList(countries);
					comboInsertCountry1.setItems(country);
				}

			});

			// INSERT - REGION (TRANSACTION 2)
			comboInsertRegion2.valueProperty().addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
					ArrayList<Record> records = decider.getAllCountryRowByRegion(newValue);
					ArrayList<String> countries = new ArrayList<>();
					for (int i = 0; i < records.size(); ++i) {
						countries.add(records.get(i).getCountry());
					}
					ObservableList<String> country = FXCollections.observableArrayList(countries);
					comboInsertCountry2.setItems(country);
				}

			});
			
			// UPDATE - REGION (TRANSACTION 1)
			comboUpdateRegion1.valueProperty().addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
					ArrayList<Record> records = decider.getAllCountryRowByRegion(newValue);
					ArrayList<String> countries = new ArrayList<>();
					for (int i = 0; i < records.size(); ++i) {
						countries.add(records.get(i).getCountry());
					}
					ObservableList<String> country = FXCollections.observableArrayList(countries);
					comboUpdateCountry1.setItems(country);
				}

			});
			
			// UPDATE - REGION (TRANSACTION 2)
			comboUpdateRegion2.valueProperty().addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
					ArrayList<Record> records = decider.getAllCountryRowByRegion(newValue);
					ArrayList<String> countries = new ArrayList<>();
					for (int i = 0; i < records.size(); ++i) {
						countries.add(records.get(i).getCountry());
					}
					ObservableList<String> country = FXCollections.observableArrayList(countries);
					comboUpdateCountry2.setItems(country);
				}

			});
			
			// DELETE - REGION (TRANSACTION 1)
			comboDeleteRegion1.valueProperty().addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
					ArrayList<Record> records = decider.getAllCountryRowByRegion(newValue);
					ArrayList<String> countries = new ArrayList<>();
					for (int i = 0; i < records.size(); ++i) {
						countries.add(records.get(i).getCountry());
					}
					ObservableList<String> country = FXCollections.observableArrayList(countries);
					comboDeleteCountry1.setItems(country);
				}

			});
			
			// DELETE - REGION (TRANSACTION 2)
			comboDeleteRegion2.valueProperty().addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
					ArrayList<Record> records = decider.getAllCountryRowByRegion(newValue);
					ArrayList<String> countries = new ArrayList<>();
					for (int i = 0; i < records.size(); ++i) {
						countries.add(records.get(i).getCountry());
					}
					ObservableList<String> country = FXCollections.observableArrayList(countries);
					comboDeleteCountry2.setItems(country);
				}

			});
			
			// TODO add listener to country to retrieve year
			
			// TODO generate query (select) handler
			buttonGenerateQueries.addEventHandler(ActionEvent.ACTION, e -> {
				
			});
			
			// TODO generate refresh handler
			buttonRefreshTable.addEventHandler(ActionEvent.ACTION, e -> {
				
			});

			// TODO local run handler
			buttonLocalRun.addEventHandler(ActionEvent.ACTION, e -> {
				
			});
			
			// TODO local run handler
			buttonGlobalRun.addEventHandler(ActionEvent.ACTION, e -> {
				
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
