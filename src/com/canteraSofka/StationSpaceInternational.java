package com.canteraSofka;

/**
 * Clase que hereda atributos de la clase NaveTripulate
 * permitiendo el Poliformismo.
 */
public class StationSpaceInternational extends NaveTripulate{

    /**
     * Método constructor de la clase StationSpaceInternational.
     * @param nameNave parámetro de la clase.
     */
    public StationSpaceInternational(String nameNave){
        /**
         * Se asignan valores a los atributos heredados.
         */
        super(nameNave);
        this.weight = 420;
        this.used = "Investigación";
        this.crewSize = 7;
        this.scope = 386;
    }
}
