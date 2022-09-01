package gui;

import java.net.URL;
import java.util.ResourceBundle;

import entities.Employee;
import entities.Position;
import gui.util.Alerts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class NewRegisterController implements Initializable{
	
	@FXML
	private TextField name;
	
	@FXML
	private TextField salary;
	
	@FXML
	private Button register;
	
	@FXML
	private Label ID;
	
	@FXML
	private ChoiceBox<Position> position =  new ChoiceBox<Position>();
	
	
	public void initialize(URL url, ResourceBundle rb) {
		position.getItems().setAll(Position.values());
	}
	
	@FXML
	public void register(ActionEvent register) {
		
			if(Alerts.showAlert("Confirmar cadastro", "Deseja cadastrar o funcionário?", AlertType.CONFIRMATION)== true) {
				
				String employeeName = name.getText();
				Position employeePosition = position.getValue();
				double employeeSalary = Double.valueOf(salary.getText());
				Employee employee = new Employee (employeeName, employeePosition, employeeSalary);
				
				if(employee.putMap(employee) == true) {
					Alerts.showAlert("Cadastro confirmado", "Funcionário cadastrado com sucesso", AlertType.INFORMATION);
					ID.setText("ID: " + Employee.getID());
				}
				else Alerts.showAlert("Erro ao cadastrar", "Cadastro não pode ser realizado", AlertType.WARNING);
			}
		name.clear();
		position.setValue(null);
		salary.clear();
	}
}
