package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author Remy Zakarian
 * @version 21-5-2020
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    
    
    
    public static void main(String[] args) {
        // pour tous les param�tres de la ligne de commande
        
        for(int i=0;i<args.length;i++){
            int fahrenheit = Integer.parseInt(args[i]);
            float celsius = fahrenheitEnCelsius(fahrenheit);
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                                                                            // format
        }                                             // impos�s
    }                                                                      
    

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
                   float celcius = (float) 5/9*(f - 32);
                   
                   float response = ((int)(celcius * 10))/10.0f;
                   
                   return response;
                    
                    
        
    }

}
