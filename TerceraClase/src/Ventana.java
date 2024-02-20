import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//OmarIbarra
public class Ventana extends JFrame {
	
	//Constructor que define los atributos base de la ventana
	public Ventana(){

		this.setTitle("Asd");
		this.setVisible(true);
		this.setSize(1000, 300);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana");
		this.setMinimumSize(new Dimension(250,250));
		this.setMinimumSize(new Dimension(750,750));
		this.setResizable(true);

		
		this.setLocationRelativeTo(null);
		this.IniciarComponentes();
		this.setLayout(null);
	} 
	public void IniciarComponentes() {

		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setBackground(Color.BLUE);
		login.setLayout(null);
		
		JLabel titulo = new JLabel("Acceder",0);
		titulo.setSize(300, 80);
		
		titulo.setFont(new Font("Arial",Font.BOLD,24));
		titulo.setForeground(Color.white);
		titulo.setLocation(100, 100);
		titulo.setBackground(Color.GREEN);
		titulo.setOpaque(true);
		login.add(titulo);
		
		
		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setLocation(500, 0);
		registro.setBackground(Color.RED);
		
		
		
		//this.add(registro);
		this.add(login);
		
	}




}