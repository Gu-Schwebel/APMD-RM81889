import java.awt.*;
import java.util.List;
import javax.swing.*;


public class Tester {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Fiap Movies");
		
		JPanel content = new JPanel(new BorderLayout(10,0));

		JPanel image = new JPanel(); // West
		
        // Image Panel 
		
        image.add(new JLabel(new ImageIcon("src/OffTrack.jpeg")));
        
		// Input Panel
        
        JPanel inputs = new JPanel(new GridLayout(0, 1, 0, 0)); // Center
        
        inputs.setPreferredSize(new Dimension(250, 300));
        
		MeuTextField tituloTextField = new MeuTextField();
		inputs.add(new MeuLabel("Título"));
		inputs.add(tituloTextField);
		
		MeuTextArea sinopseTextArea = new MeuTextArea();
		inputs.add(new MeuLabel("Sinopse"));
		inputs.add(sinopseTextArea);

		String[] Genero = {"Ação", "Aventura", "Cinema de arte", "Chanchada", "Comédia", "Dança", "Documentário", "Drama", "Faroeste", "Fantasia", "Ficção científica", "Musical", "Romance", "Seriado", "Suspense", "Terror", "Thriller"};
		JComboBox<String> movieGender = new JComboBox<String>(Genero);
		inputs.add(new MeuLabel("Gênero"));
		inputs.add(movieGender);
		
		JButton saveButton = new JButton("Salvar");
		JButton cancelButton = new JButton("Cancelar");
		
		JPanel painelBotao = new JPanel(new FlowLayout());
		painelBotao.add(saveButton);
		painelBotao.add(cancelButton);
		inputs.add(painelBotao);
		
		// Option Panel
		
		JPanel options = new JPanel(new GridLayout(0,1,0,0)); // East
		options.setPreferredSize(new Dimension(150, 400));
		
		options.add(new MeuLabel("Onde assistir"));
		
		List<String> listaDeOpcoes = List.of("Netflix", "Prime Video", "Pirate Bay");
		MeuRadioGroup watchOptions = new MeuRadioGroup(listaDeOpcoes);
		options.add(watchOptions);
		
		JCheckBox watched = new JCheckBox("Assistido");
		options.add(watched);
		
		options.add(new MeuLabel("Avaliação"));
		StarRater avaliacao = new StarRater(5);
		
		avaliacao.addStarListener(new StarRater.StarListener() {
			
			@Override
			public void handleSelection(int selection) {
				avaliacao.setRating(selection);
			
			}
		});
		
		options.add(avaliacao);
		content.add(image, BorderLayout.WEST);
		content.add(inputs, BorderLayout.CENTER);
		content.add(options, BorderLayout.EAST);
		
		JTabbedPane abas = new JTabbedPane();
		abas.add("Cadastro", content);
		abas.add("Lista", new JPanel());
		frame.add(abas);	
		
		frame.setSize(600,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		saveButton.addActionListener(new Filme(tituloTextField, sinopseTextArea, watchOptions, movieGender, watched, avaliacao));
	}
}
