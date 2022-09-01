package gui;

import entities.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class IDSearchController {

	@FXML
	private TextField ID;

	@FXML
	private Button search;

	@FXML
	private TableView<Employee> employeeTable;
	


	@FXML
	public void employeeSearch(ActionEvent search) {
		
		employeeTable.getItems().clear();
		employeeTable.getColumns().clear();
		
		TableColumn name = new TableColumn<Employee,String>("Name");
		name.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		employeeTable.getColumns().addAll(name);
		employeeTable.getItems().add(Employee.getEmployee(Integer.valueOf(ID.getText())));
	}
}
