package com.julianqll;

public class Operaciones {
    float n1;
    float n2;
    float suma;
    float resta;
    float multiplicacion;
    float division;

    Operaciones(float _n1, float _n2)
    {
        n1 = _n1;
        n2 = _n2;
        suma = n1 + n2;
        resta = n1 - n2;
        multiplicacion = n1 * n2;
        division = n1 / n2;
    }

    public float getSuma() {
        return suma;
    }

    public float getResta() {
        return resta;
    }

    public String imprimirOperaciones()
    {
        String cadena = "La suma de los numeros es: " + suma + "\n" +
                "La resta de los numeros es: " + resta + "\n" +
                "La multiplicación de los numeros es: " + multiplicacion + "\n" +
                "La division de los numeros es: " + division + "\n";
        return cadena;
    }

}
