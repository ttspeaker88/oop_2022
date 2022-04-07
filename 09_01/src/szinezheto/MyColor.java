package szinezheto;

import java.awt.Color;

public class MyColor extends Color {
	
	public MyColor(Color color) {
		super(color.getRed(), color.getGreen(), color.getBlue());
	}

	@Override
	public String toString() {
		if(this.equals(BLUE)) return "k�k";
		else if(this.equals(GREEN)) return "z�ld";
		else if(this.equals(RED)) return "piros";
		else if(this.equals(BLACK)) return "fekete";
		else return "?";
	}
}
