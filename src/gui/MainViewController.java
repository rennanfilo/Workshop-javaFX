package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartment;
	@FXML
	private MenuItem menuItemAbount;
	
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("Teste");
		
	}
	
	@FXML
	public void onMenuItemDepartmentAction() {
		
	}
	
	@FXML
	public void onMenuItemAbountAction() {
		
	}
	
	

	@Override
	public void initialize(URL uri, ResourceBundle arg1) {
		
		
	}

}
