package com.canteraSofka;

/**
 * Clase que hereda atributos de la clase NaveLanzadera
 * permitiendo el Poliformismo.
 */
public class NaveSaturno extends NaveLanzadera {

    /**
     * Método constructor de la clase NaveSaturno.
     * @param nameNave parámetro de la clase.
     */
    public NaveSaturno(String nameNave){

        /**
         * Se asignan valores a los atributos heredados.
         */
        super(nameNave);
        this.loadCapacity = 118;
        this.weight = 2400;
        this.typeFuel = "Químico sólido";
        this.power = 35000;
    }

    /**
     * Se sobrescribe el método de la clase abstracta.
     * @return devuelve el peso de la nave.
     */
    @Override
    public int pesoNave(){
        weight = 2900;
        return weight;
    }
}
