package impactoecologico;

public class Auto implements IImpactoEcologico {

    Double velocidadMax;
    int numerPasajeros;
    String placa;
    int numChasis;
    int numMotor;
    double consumoCombustible;
    double distanciaRecorrida;
    Double factorEmision;

    public Auto(Double velocidadMax, int numerPasajeros, String placa, int numChasis, int numMotor, double consumoCombustible, double distanciaRecorrida, Double factorEmision) {
        this.velocidadMax = velocidadMax;
        this.numerPasajeros = numerPasajeros;
        this.placa = placa;
        this.numChasis = numChasis;
        this.numMotor = numMotor;
        this.consumoCombustible = consumoCombustible;
        this.distanciaRecorrida = distanciaRecorrida;
        this.factorEmision = factorEmision;
    }

   

    void cambiarMarcha() {
    }

    void encenderLuces() {
    }

    void abrirPuertas() {
    }

    void bajarVentajas() {
    }

    @Override
    public double obtenerImpactoEcologico() {
        Double emisionesCarbono = this.consumoCombustible * this.distanciaRecorrida * factorEmision;
        return emisionesCarbono;
    }

    @Override
    public String toString() {
        return "La emision de carbono del "
                + "Auto{" + "velocidadMax=" + velocidadMax + ", numerPasajeros=" + numerPasajeros + ", placa=" + placa + ", numChasis=" + numChasis + ", numMotor=" + numMotor + '}'
                + " es de " + this.obtenerImpactoEcologico();
    }
 
    
   
    
}
