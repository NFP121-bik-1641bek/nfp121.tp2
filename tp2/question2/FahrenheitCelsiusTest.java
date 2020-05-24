package question2;


/**
 * Classe-test FahrenheitCelsiusTest.
 *
 * @author  Remy Zakarian
 * @version 21-5-2020
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document © 2002 Robert A. Ballance intitulé
 * «JUnit: Unit Testing Framework».
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le même paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */

import org.junit.rules.ExpectedException;
public class FahrenheitCelsiusTest extends junit.framework.TestCase
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).

    /**
     * Constructeur de la classe-test FahrenheitCelsiusTest
     */
    public FahrenheitCelsiusTest()
    {
       
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements

    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    /**
     * Il ne vous reste plus qu'à définir une ou plusieurs méthodes de test.
     * Ces méthodes doivent vérifier les résultats attendus à l'aide d'assertions
     * assertTrue(<boolean>).
     * Par convention, leurs noms devraient débuter par "test".
     * Vous pouvez ébaucher le corps grâce au menu contextuel "Enregistrer une méthode de test".
     */
    
    
    public void test_fahrenheitEnCelsius() {
        
        assertEquals("    0 °F -> -17.7 °C ? ", -17.7, question2.FahrenheitCelsius.fahrenheitEnCelsius(0), 0.1);
        assertEquals("  100 °F -> 37.7 °C ? ", 37.7, question2.FahrenheitCelsius.fahrenheitEnCelsius(100), 0.1);
        assertEquals(" 2000 °F -> 1093.3 °C ?", 1093.3, question2.FahrenheitCelsius.fahrenheitEnCelsius(2000), 0.1);
        assertEquals("   54 °F -> 12.2 °C ?", 12.2, question2.FahrenheitCelsius.fahrenheitEnCelsius(54), 0.1);
        assertEquals("   60 °F -> 15.5 °C ?", 15.5, question2.FahrenheitCelsius.fahrenheitEnCelsius(60),0.1);
        assertEquals("   -55 °F -> -48.3 °C ?", -48.3, question2.FahrenheitCelsius.fahrenheitEnCelsius(-55),0.1);
        assertEquals("   -1000000 °F -> -555573.3 °C ?", -555573.3, question2.FahrenheitCelsius.fahrenheitEnCelsius(-1000000),0.1);
         
        
        //assertEquals(" ZZZ -> error : For input string: \"ZZZ\" ?" , "error : For input string: \"ZZZ\"", question2.FahrenheitCelsius.main(arr));      
    }
           
    public void testException()
    {
        ExpectedException exception = ExpectedException.none();
        
        //test zzz in main()
        String[] arr1={"ZZZ"};
        exception.expect(NumberFormatException.class);
        question2.FahrenheitCelsius.main(arr1);
        
        
        //test 123 z in main()
        String[] arr2 = {"123" , "z"};
        exception.expect(NumberFormatException.class);
        question2.FahrenheitCelsius.main(arr2);
        
        //test 123 456 5a
        String[] arr3 = {"123","456","5a"};
        exception.expect(NumberFormatException.class);
        question2.FahrenheitCelsius.main(arr3);
        
        
        
    }
}



