import java.awt.*;

import javax.swing.JLabel;

public class MeuLabel extends JLabel{
	
	private static final long serialVersionUID = 1L;

	private int size = 14;
	private Color cor = Color.BLACK;
	
	
	public MeuLabel(String texto) {
		super(texto); 
		init();
	}
	public MeuLabel(String texto, Color cor) {
		super(texto); 
		this.cor = cor;
		init();
	}
	public MeuLabel(String texto, int size) {
		super(texto);
		this.size = size;
		init();
	}
	
	
	private void init( ) {
		this.setHorizontalAlignment(JLabel.LEFT);
		this.setForeground(cor);  // Color.RED ou new Color(r,g,b)
		this.setPreferredSize(new Dimension(100,300));
		this.setFont(new Font(null, Font.BOLD, size));
		
	}

}
