package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringXML {
    public static void main(String[] args) {
        /*
            Injection des dépendances on utilise en spring framwork
            Version XML
        */
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier=(IMetier)context.getBean("metier");
        System.out.println("Résultat=>"+metier.calcul());
    }
}
