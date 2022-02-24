package com.canteraSofka;

/**
 * Clase abstracta para el tipo de Nave espacial
 * Tripulada.
 */
public abstract class NaveTripulate {

    /**
     * Atributos de las naves espaciales tipo
     * Tripulada.
     */
    public String nameNave;
    public int weight;
    public String used;
    public int crewSize;
    public int scope;

    /**
     * Método constructor de la clase abstracta.
     * @param nameNave parámetro de la nave espacial
     *                 tipo Tripulada.
     */
    public NaveTripulate (String nameNave){
        /**
         * Se inicializa los atributos de la nave tipo
         * Tripulada.
         */
        this.nameNave = nameNave;
        this.weight = 0;
        this.used = "";
        this.crewSize = 0;
        this.scope = 0;
    }

    /**
     * Método de la nave tipo Tripulada
     * @return retorna la altura a la cual opera
     * la nave.
     */
    public int altitudeOrbit(){
        this.scope = 300;
        return scope;
    }
}
