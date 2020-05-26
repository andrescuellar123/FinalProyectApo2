package Thread;

import javafx.application.Platform;
import model.ShopProgram;
import ui.ShopProgramGUI;

public class ImageAppearThread extends Thread{
	private ShopProgram shopProgram;
	private ShopProgramGUI shGUI;

	public ImageAppearThread(ShopProgram shopPro,ShopProgramGUI shG) {
		shopProgram = shopPro;
		shGUI=shG;
	}
	
	public void run() {
		while(shopProgram.isSpin()) {
			
			
			Platform.runLater(new Thread() {
				public void run() {
					shGUI.updateAppear();
					
				}
			});
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
