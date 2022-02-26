package Cigma.pfe;

import Cigma.pfe.controllers.FactureController;
import Cigma.pfe.models.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunFacture {


  public static void main(String[] args) {
    ApplicationContext context = new
            ClassPathXmlApplicationContext("spring.xml");

    FactureController ctrl = (FactureController)
            context.getBean("ctrlfa");
    ctrl.save(new Facture(10.55));

    ctrl.modify(new Facture(1,20.3));

    ctrl.removeById(1);

    Facture found = ctrl.getById(1);
  }
}
