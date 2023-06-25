package impactoecologico;

import java.util.Date;

public class Edificio implements IImpactoEcologico {

    Double altura;
    int numerosPisos;
    int capacidadMaxPersonas;
    String dirección;
    Date fechaConstruccion;
    String uso;
    Double consumoEnergia;
    Double factorEmision;

    public Edificio(Double altura, int numerosPisos, int capacidadMaxPersonas, String dirección, Date fechaConstruccion, String uso, Double consumoEnergia, Double factorEmision) {
        this.altura = altura;
        this.numerosPisos = numerosPisos;
        this.capacidadMaxPersonas = capacidadMaxPersonas;
        this.dirección = dirección;
        this.fechaConstruccion = fechaConstruccion;
        this.uso = uso;
        this.consumoEnergia = consumoEnergia;
        this.factorEmision = factorEmision;
    }

    

    void agregarPiso() {
    }

    void eliminarPiso() {
    }

    void obtenerAltura() {
    }

    void obtenerNumeroPisos() {
    }

    @Override
    public double obtenerImpactoEcologico() {
        Double emisionesCarbono = this.consumoEnergia * factorEmision;

        return emisionesCarbono;
    }

    @Override
    public String toString() {
        return "La emision de carbono del "+
                "Edificio{" + "altura=" + altura + ", numerosPisos=" + numerosPisos + ", capacidadMaxPersonas=" + capacidadMaxPersonas + ", direcci\u00f3n=" + dirección + ", uso=" + uso + '}'
                + " es de " + this.obtenerImpactoEcologico();
    }

   

   
}
