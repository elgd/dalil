import javax.swing.JFrame;

public class jpanel extends JFrame {
	
  public jpanel(){               
    this.setTitle("Ma première fenêtre Java");
    this.setSize(500, 500);
    this.setLocationRelativeTo(null);              
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setContentPane(new Grille());
    this.setVisible(true);
  }    
}