package com.ejercicio2;

public class MainEjercicio {

    //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

    public static void main(String[] args) {

        int iva1 = getIva(200);
        int iva2 = getIva(500);

        System.out.println("iva de 200 " + iva1);
        System.out.println("iva de 500 " + iva2);
    }
    
    static int getIva(int price){

        int iva = price * 21 / 100;

        return iva;
    }

}
