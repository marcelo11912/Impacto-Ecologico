package impactoecologico;

import java.util.ArrayList;
import java.util.Date;

public class ImpactoEcologico {

    public static void main(String[] args) {
        ArrayList<IImpactoEcologico> impactos = new ArrayList<>();

        Auto auto = new Auto(220.0, 5, "AF34", 6584, 153, 150.00, 200, 2.3);
        Edificio edificio = new Edificio(15.5, 20, 500, "Portoviejo", new Date("15/10/21"), "Hospedaje", 15000.0, 4.2);
        Bicicleta bicicleta = new Bicicleta("Montanera", 52.0, "Aluminio", 3);

        impactos.add(auto);
        impactos.add(edificio);
        impactos.add(bicicleta);

        for (IImpactoEcologico impacto : impactos) {
            System.out.println(impacto);
        }

    }

}
