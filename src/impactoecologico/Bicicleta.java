package impactoecologico;

public class Bicicleta implements IImpactoEcologico {

    String tipoBicicleta;
    Double tamMarco;
    String materialMarco;
    int numVelocidad;

    public Bicicleta(String tipoBicicleta, Double tamMarco, String materialMarco, int numVelocidad) {
        this.tipoBicicleta = tipoBicicleta;
        this.tamMarco = tamMarco;
        this.materialMarco = materialMarco;
        this.numVelocidad = numVelocidad;
    }

    void pedalear() {
    }

    void inflarNeumatico() {
    }

    void ajustarAlturaSillin() {
    }

    @Override
    public double obtenerImpactoEcologico() {
        return 0;
    }

    @Override
    public String toString() {
        return "Las bicicletas no generan carbono.";
    }

}
