package gui;

import java.io.IOException;

import application.Main;
import entities.Position;
import entities.Employee;
import gui.util.Alerts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class MainViewController {
	
	
	@FXML
	private MenuItem menuResearch
;
	
	@FXML
	private MenuItem menuItemNew;
	
	@FXML
	private MenuItem menuItemDelete;
	
	@FXML
	private MenuItem menuItemChange;
	
	@FXML
	private MenuItem menuItemIDResearch;
	
	@FXML
	private MenuItem menuItemNameResearch;
	
	@FXML
	private MenuItem menuItemPositionResearch;
	
	@FXML
	private MenuItem menuItemSalaryResearch;
	
	@FXML
	private TextField name;
	
	@FXML
	private TextField position;
	
	@FXML
	private TextField salary;
	
	@FXML
	private Button register;
	
	@FXML
	private Button ok;
	
	@FXML
	private Label ID;
	
	
	@FXML
	public void register(ActionEvent register) {
		
			if(Alerts.showAlert("Confirmar cadastro", "Deseja cadastrar o funcionário?", AlertType.CONFIRMATION)== true) {
				
				String employeeName = name.getText();
				Position employeePosition = Position.valueOf(position.getText());
				double employeeSalary = Double.valueOf(salary.getText());
				Employee employee = new Employee (employeeName, employeePosition, employeeSalary);
				
				if(employee.putMap(employee) == true) {
					Alerts.showAlert("Cadastro confirmado", "Funcionário cadastrado com sucesso", AlertType.INFORMATION);
				}
			}
		ID.setText("ID: " + Employee.getID());
		name.clear();
		position.clear();
		salary.clear();
	}
	
	

	
	@FXML
	public void onMenuItemNewAction() {
		loadView("/gui/NewRegister.fxml");
	}
	@FXML
	public void onMenuItemDeleteAction() {
		System.out.println("onMenuItemDeleteAction");
	}
	
	@FXML
	public void onMenuItemChangeAction() {
		System.out.println("onMenuItemChangeAction");
	}
	@FXML
	public void onMenuItemIDResearchAction() {
		System.out.println("onMenuItemIDResearchAction");
	}
	
	@FXML
	public void onMenuItemNameResearchAction() {
		System.out.println("onMenuItemNameResearchAction");
	}
	
	@FXML
	public void onMenuItemPositionResearchAction() {
		System.out.println("onMenuItemPositionResearchAction");
	}
	
	@FXML
	public void onMenuItemSalaryResearchAction() {
		System.out.println("onMenuItemSalaryResearchAction");
	}

	private synchronized void loadView(String absoluteName) {
		try {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
		VBox newVbox = loader.load();
		
		Scene mainScene = Main.getMainScene();
		VBox mainVBox = (VBox)((ScrollPane) mainScene.getRoot()).getContent();
		
		Node mainMenu = mainVBox.getChildren().get(0);
		mainVBox.getChildren().clear();
		mainVBox.getChildren().add(mainMenu);
		mainVBox.getChildren().addAll(newVbox.getChildren());
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
