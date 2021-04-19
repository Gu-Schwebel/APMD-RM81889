import javax.swing.JTextArea;

public class MeuTextArea extends JTextArea{

		private static final long serialVersionUID = 1L;
		
		private int linhas = 5;
		private int colunas = 20;
		
		public MeuTextArea() {
			super();
			init();
		}

		private void init() {
			this.setRows(linhas);
			this.setColumns(colunas);
			this.setBorder(BordaFactory.criar());
		}
}

