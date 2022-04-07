package szinezheto;

import java.awt.Color;

public interface ISzinezheto {
	static Color alapertelmezettSzin = Color.RED;
	
	Color getSzin();
	void setSzin(Color szin); 
}
