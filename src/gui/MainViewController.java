package gui;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController {
	
	
	@FXML
	private MenuItem menuPesquisar;
	
	@FXML
	private MenuItem menuItemNovo;
	
	@FXML
	private MenuItem menuItemDeletar;
	
	@FXML
	private MenuItem menuItemAlterar;
	
	@FXML
	private MenuItem menuItemPorID;
	
	@FXML
	private MenuItem menuItemPorNome;
	
	@FXML
	private MenuItem menuItemPorCargo;
	
	@FXML
	private MenuItem menuItemPorSalario;
	
	@FXML
	public void onMenuItemNovoAction() {
		loadView("/gui/NovoCadastro.fxml");
	}
	@FXML
	public void onMenuItemDeletarAction() {
		System.out.println("onMenuItemDeletarAction");
	}
	
	@FXML
	public void onMenuItemAlterarAction() {
		System.out.println("onMenuItemAlterarAction");
	}
	@FXML
	public void onMenuItemPorIDAction() {
		System.out.println("onMenuItemPorIDAction");
	}
	
	@FXML
	public void onMenuItemPorNomeAction() {
		System.out.println("onMenuItemPorNomeAction");
	}
	
	@FXML
	public void onMenuItemPorCargoAction() {
		System.out.println("onMenuItemPorCargoAction");
	}
	
	@FXML
	public void onMenuItemPorSalarioAction() {
		System.out.println("onMenuItemPorSalarioAction");
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
