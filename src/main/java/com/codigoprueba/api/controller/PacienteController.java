package com.codigoprueba.api.controller;

import com.codigoprueba.api.paciente.DatosRegistroPaciente;
import com.codigoprueba.api.paciente.Paciente;
import com.codigoprueba.api.paciente.PacienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void registrar(@RequestBody DatosRegistroPaciente datos) {
        repository.save(new Paciente(datos));
    }
}
