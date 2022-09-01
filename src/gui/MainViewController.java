package gui;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController {
	
	
	@FXML
	private MenuItem menuSearch;
	
	@FXML
	private MenuItem menuItemNew;
	
	@FXML
	private MenuItem menuItemDelete;
	
	@FXML
	private MenuItem menuItemChange;
	
	@FXML
	private MenuItem menuItemIDSearch;
	
	@FXML
	private MenuItem menuItemNameSearch;
	
	@FXML
	private MenuItem menuItemPositionSearch;
	
	@FXML
	private MenuItem menuItemSalarySearch;
	
	@FXML
	private Button ok;
	

	
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
	public void onMenuItemIDSearchAction() {
		loadView("/gui/IDSearch.fxml");
	}
	
	@FXML
	public void onMenuItemNameSearchAction() {
		System.out.println("onMenuItemNameSearchAction");
	}
	
	@FXML
	public void onMenuItemPositionSearchAction() {
		System.out.println("onMenuItemPositionSearchAction");
	}
	
	@FXML
	public void onMenuItemSalarySearchAction() {
		System.out.println("onMenuItemSalarySearchAction");
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
