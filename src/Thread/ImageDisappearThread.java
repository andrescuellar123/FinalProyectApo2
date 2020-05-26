package Thread;

import javafx.application.Platform;
import model.ShopProgram;
import ui.ShopProgramGUI;

public class ImageDisappearThread extends Thread{
	private ShopProgram shopProgram;
	private ShopProgramGUI shGUI;

	public ImageDisappearThread(ShopProgram shopPro,ShopProgramGUI shG) {
		shopProgram = shopPro;
		shGUI=shG;
	}
	
	public void run() {
		while(shopProgram.isSpin()) {
			
			
			Platform.runLater(new Thread() {
				public void run() {
					shGUI.updateDisappear();
					
				}
			});
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

