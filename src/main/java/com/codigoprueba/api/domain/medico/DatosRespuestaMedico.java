package com.codigoprueba.api.domain.medico;

public record DatosRespuestaMedico(
        String nombre,
        String email,
        String documento,
        String telefono,
        Especialidad especialidad
       ) {
}
