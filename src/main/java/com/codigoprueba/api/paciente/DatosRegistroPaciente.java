package com.codigoprueba.api.paciente;

import com.codigoprueba.api.direccion.DatosDireccion;

public record DatosRegistroPaciente(
        String nombre,
        String email,
        String telefono,
        String documentoIdentidad,
        DatosDireccion direccion
) {
}
