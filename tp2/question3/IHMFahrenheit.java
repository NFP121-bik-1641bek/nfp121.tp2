package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JLabel applet = new JLabel(" Applet");
    
    private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degré Celsius. */
  private JTextField sortie = new JTextField( 6 );

  private JPanel panel1 = new JPanel();
  private JPanel panel2 = new JPanel();
  private JPanel panel3 = new JPanel();
  private JLabel appletdemarree = new JLabel("Applet demarree.");
  
  public IHMFahrenheit(){
    super("Remy Zakarian Fahrenheit Celsius Applet");
    GridBagConstraints gbc = new GridBagConstraints();
    setLayout(new BorderLayout());
    
    panel1.setLayout(new BorderLayout());
    panel1.add(applet,BorderLayout.WEST);
    add(panel1 , BorderLayout.PAGE_START);
    
    panel2.add(entree);
    panel2.add(boutonDeConversion);
    panel2.add(sortie);
    sortie.setEditable(false);
    
    add(panel2 , BorderLayout.CENTER);
    
    
    panel3.setBackground(Color.white);
    panel3.setLayout(new BorderLayout());
    panel3.add(appletdemarree , BorderLayout.WEST);
    
    add(panel3 , BorderLayout.PAGE_END);
    
    //gbc.gridx = 0;
    //gbc.gridy = 0;
    //add(applet,gbc);
    
    //gbc.gridx = 0;
    //gbc.gridy = 1;
    //add( entree , gbc); 
    
    //gbc.gridx = 1;
    //gbc.gridy = 1;
    //add( boutonDeConversion , gbc); 
    
    //gbc.gridx = 2;
    //gbc.gridy = 1;
    //add( sortie , gbc);
    
    
    
    //sortie.setEditable( false );
    getContentPane().setBackground(hex2Rgb("c0c0c0"));
    getContentPane().setPreferredSize(new Dimension(400,100));
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * méthode déclenchée lorsque le bouton de conversion est appuyé. 
   * remarquer que le champs de droite (les degrés Celsius) n'est pas éditable.
   * @param ae l'événement transmis
   */
  public void actionPerformed( ActionEvent ae ){
    try{
        
        int fahrenheit = Integer.parseInt(entree.getText());
       float celsius = question2.FahrenheitCelsius.fahrenheitEnCelsius(fahrenheit);
       
       if(celsius < -273.1f) celsius = -273.1f;
      sortie.setText( Float.toString( celsius));
    }catch(NumberFormatException nfe){
      sortie.setText("error ! ");
    }
  }
  
  public static Color hex2Rgb(String colorStr) {
    return new Color(
            Integer.valueOf( colorStr.substring( 0, 2 ), 16 ),
            Integer.valueOf( colorStr.substring( 2, 4 ), 16 ),
            Integer.valueOf( colorStr.substring( 4, 6 ), 16 ) );
}
  
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
}
