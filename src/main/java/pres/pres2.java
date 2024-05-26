package pres;
import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
         /*
            Injection des dépendances par
            instanciation dynamique => new
         */
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        //Charger la classe au mémoire
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();
        //System.out.println(dao.getData());

        String metierClassName = scanner.nextLine();
        Class cMeier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMeier.newInstance();


        Method method=cMeier.getMethod("setDao",IDao.class);
        // metier.setDao(dao) => statique
        method.invoke(metier,dao); // dynamique
        System.out.println("Résultat=>"+metier.calcul());
    }
}
