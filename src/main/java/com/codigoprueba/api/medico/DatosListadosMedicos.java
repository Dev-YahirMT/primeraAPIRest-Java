package com.codigoprueba.api.medico;

public record DatosListadosMedicos(
        String nombre,
        String especialidad,
        String documento,
        String email
) {
    public DatosListadosMedicos(Medico medico){
        this(medico.getNombre(),medico.getEspecialidad().toString(),medico.getDocumento(),medico.getEmail());
    }
}
