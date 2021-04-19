import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MeuRadioGroup extends JPanel {

	private static final long serialVersionUID = 1L;
	
	ButtonGroup grupo = new ButtonGroup();
	private List<String> opcoes;
	private String valorBotao;
	
	public String getValorBotao() {
		return valorBotao;
	}
	public MeuRadioGroup(List<String> opcoes) {
		this.opcoes = opcoes;
		init();
	}
	private void init() {
		// lambda
		
		opcoes.forEach(opcao -> {
			JRadioButton botao = new JRadioButton(opcao);
			botao.setPreferredSize(new Dimension(100,15));
			botao.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed (ActionEvent e) {
					valorBotao=opcao;
			}
				});
			grupo.add(botao);
			this.add(botao);			
		});
		 
	 }
}
