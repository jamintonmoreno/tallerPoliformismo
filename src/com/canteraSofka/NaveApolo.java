package com.canteraSofka;

/**
 * Clase que hereda atributos de la clase NaveTripulate
 * permitiendo el Poliformismo.
 */
public class NaveApolo extends NaveTripulate {

    /**
     * Método constructor de la clase NaveApolo.
     * @param nameNave parámetro de la clase.
     */
    public NaveApolo(String nameNave){

        /**
         * Se asignan valores a los atributos heredados.
         */
        super(nameNave);
        this.weight = 77;
        this.used = "Centro de Investigación";
        this.crewSize = 3;
        this.scope = 430;
    }

    /**
     * Se sobrescribe el método de la clase abstracta.
     * @return devuelve la altura sobre la cuál permanece
     * la nave espacial.
     */
    @Override
    public int altitudeOrbit(){
        scope = 435;
        return scope;
    }
}
