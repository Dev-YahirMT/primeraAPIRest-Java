package com.codigoprueba.api.paciente;

import com.codigoprueba.api.direccion.DatosDireccion;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroPaciente(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefono,
        @NotBlank
        String documentoIdentidad,
        @NotNull @Valid
        DatosDireccion direccion
) {
}
