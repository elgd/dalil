import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import javax.swing.*;
import java.util.*;
import java.awt.*;

import javax.swing.JPanel;


public  class Grille extends JPanel{
	public void  paintComponent(Graphics g){
	    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
		Graphics2D r = (Graphics2D) g;	
		
		for (int i=0 ; i<10000 ; i = i+10) // boucle pour afficher une ligne
		{
			
			for (int j=0 ; j<1000 ; j=j+10)
			{
				r.drawRect(i,j , 10, 10); // boucle pour afficher une colonne
			}
			
		}
		//System.out.println("la grille se lance"):    
	  }

}
