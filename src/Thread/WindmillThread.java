package Thread;

import javafx.application.Platform;
import model.ShopProgram;
import ui.ShopProgramGUI;

public class WindmillThread  extends Thread{
	private ShopProgram shopProgram;
	private ShopProgramGUI shGUI;

	public WindmillThread(ShopProgram shopPro,ShopProgramGUI shG) {
		shopProgram = shopPro;
		shGUI=shG;
	}
	
	public void run() {
		while(shopProgram.isSpin()) {
			
			shopProgram.rotateWindmill();
			
			Platform.runLater(new Thread() {
				public void run() {
					shGUI.updateWindMill();
				}
			});
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
