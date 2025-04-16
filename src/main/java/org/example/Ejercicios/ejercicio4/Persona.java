package org.example.Ejercicios.ejercicio4;

public record Persona(String nombre, String apellido) {

    public static final String NOMBRE_VACIO = "Nombre No puede estar vacio";
    public static final String NOMBRE_INVALIDO = "El Nombre no es Valido";
    public static final String APELLIDO_VACIO = "Apellido No puede estar vacio";
    public static final String APELLIDO_INVALIDO = "El Apellido no es Valido";


    public Persona {
        checkName(nombre);
        checkApellido(apellido);
    }

    public void checkName(String nombre){
        if (nombre.isBlank()){throw new RuntimeException(NOMBRE_VACIO);}
        if (!nombre.matches("[a-zA-Z]+")){throw new RuntimeException(NOMBRE_INVALIDO);}
    }
    public void checkApellido(String apellido){
        if (apellido.isBlank()){throw new RuntimeException(APELLIDO_VACIO);}
        if (!apellido.matches("[a-zA-Z]+")){throw new RuntimeException(APELLIDO_INVALIDO);}
    }
}
