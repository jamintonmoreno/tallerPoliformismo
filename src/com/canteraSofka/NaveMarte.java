package com.canteraSofka;

/**
 * Clase que hereda atributos de la clase NaveNoTripulate
 * permitiendo el Poliformismo.
 */
public class NaveMarte extends NaveNoTripulate {

    /**
     * Método constructor de la clase NaveMarte.
     * @param nameNave parámetro de la clase.
     */
    public NaveMarte(String nameNave){

        /**
         * Se asignan valores a los atributos heredados.
         */
        super(nameNave);
        this.typeFuel = "Nitrogeno Comprimido";
        this.thrust = 22.44;
        this.travelDistance = 18000;
    }

    /**
     * Se sobrescribe el método de la clase abstarcta.
     * @return devuelve la distancia que puede viajar
     * en el espacio.
     */
    @Override
    public int travelScope(){
        this.travelDistance = 18000;
        return travelDistance;
    }
}
