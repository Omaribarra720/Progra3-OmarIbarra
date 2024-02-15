import java.awt.Color;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
//OmarIbarra
public class Ventana extends JFrame {
	//Constructor que define los atributos base de la ventana
	public Ventana(){

		this.setTitle("Asd");
		this.setVisible(true);
		this.setSize(300, 300);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana");
		this.setMinimumSize(new Dimension(250,250));
		this.setMinimumSize(new Dimension(750,750));
		this.setResizable(true);

		
		this.setLocationRelativeTo(null);
		this.IniciarComponentes();
	} 
	public void IniciarComponentes() {

		JPanel login = new JPanel();
		login.setSize(this.getWidth(), this.getHeight());
		login.setBackground(Color.RED);
		this.add(login);
	}




}

