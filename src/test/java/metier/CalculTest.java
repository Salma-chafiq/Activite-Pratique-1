package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul calcul;
    //cmd => mvn test    | dans dossier target
    //cmd => mvn install | dans dossier repository
    //C:\Users\T15\.m2\repository\com\iguider\activite-pratique-sdia-m2\1.0-SNAPSHOT
    //cmd => mvn clean | supprimer dossier target
    @Test
    public void testSomme(){
        calcul = new Calcul();
        double a=5;double b=9;
        double expected=14;
        double res=calcul.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}
