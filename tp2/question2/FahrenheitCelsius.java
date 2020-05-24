package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author Remy Zakarian 
 * @version 21-5-2020
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       try{
        for(int i=0;i<args.length;i++){
            int fahrenheit = Integer.parseInt(args[i]);
            float celsius = fahrenheitEnCelsius(fahrenheit);
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                                                                            // format
        } 
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
         
         float celcius = (float) 5/9*(f - 32);
                   
                   float response = ((int)(celcius * 10))/10.0f;
                   
                   return response;
                    
     }

}
