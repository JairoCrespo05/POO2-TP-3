package org.example.Ejercicios.Ejercicio1;

public class LibroRegular extends Libro{

    public static final int REGULARES = 0;

    public LibroRegular(String nombre){
     super(nombre, REGULARES);
    }

    @Override
    public Double calcularDeudaLibro(int diasAlquilado) {
        double monto = 2;
        if (diasAlquilado > 2)
            monto += (diasAlquilado - 2) * 1.5;

        return monto;
    }

    @Override
    public int calcularPuntos() {
        return 0;
    }
}
