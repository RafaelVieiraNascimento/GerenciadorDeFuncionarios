package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class Alerts {

	public static boolean showAlert(String title, String header, AlertType type) {
		Alert alert = new Alert(type);
		alert.setTitle(title);
		alert.setHeaderText(header);

		if (alert.showAndWait().get() == ButtonType.OK) return true;
		else return false;
	}
}
