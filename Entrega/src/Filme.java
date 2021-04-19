import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Filme implements ActionListener {

	private MeuTextField tituloFilme;
	private MeuTextArea sinopseFilme;
	private MeuRadioGroup canais;
	private JComboBox generoFilme;
	private JCheckBox assistido;
	private StarRater classificacao;
	
	public Filme(MeuTextField tituloFilme, MeuTextArea sinopseFilme, MeuRadioGroup canais, JComboBox generoFilme,
			JCheckBox assistido, StarRater classificacao) {
		this.tituloFilme = tituloFilme;
		this.sinopseFilme = sinopseFilme;
		this.canais = canais;
		this.generoFilme = generoFilme;
		this.assistido = assistido;
		this.classificacao = classificacao;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Título: "+tituloFilme.getText());
		System.out.println("Sinopse: "+sinopseFilme.getText());
		System.out.println("Disponível: "+ canais.getValorBotao());
		System.out.println("Gênero: "+generoFilme.getSelectedItem());
		System.out.println("Assistido: "+ assistido.isSelected());
		System.out.println("Classificação:  "+ classificacao.getRating());

	}

}
