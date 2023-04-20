package com.example.users.exceptions;

import java.util.Date;

public class ErrorDetails {


    private String mensaje;

    public ErrorDetails(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
