import javax.swing.JFrame;

public class jpanel extends JFrame {
	
  public jpanel(){   
	  Grille g = new Grille();
    this.setTitle("Ma première fenêtre Java");
   
    this.setLocationRelativeTo(null);              
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setContentPane(g);
    this.setSize(((g.Getheight()*10)+30), ((g.GetWeight()*10)+50)); // taille de la grille en fonction du nombre de case à afficher le *10 correspond à la taille en pixel d'un case et + 30 nombre de pixel en bordure
    
    
    this.setVisible(true);
  }    
}