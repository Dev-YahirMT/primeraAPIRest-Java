package com.codigoprueba.api.controller;

import com.codigoprueba.api.medico.DatosListadosMedicos;
import com.codigoprueba.api.medico.DatosRegistroMedico;
import com.codigoprueba.api.medico.Medico;
import com.codigoprueba.api.medico.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public void registrarMedico(@RequestBody @Valid DatosRegistroMedico datosRegistroMedico) {
        medicoRepository.save(new Medico(datosRegistroMedico));
    }

    @GetMapping
    public Page<DatosListadosMedicos> listadoMedicos(@PageableDefault(size = 3, page = 0) Pageable paginacion){
        return medicoRepository.findAll(paginacion).map(DatosListadosMedicos::new);
    }
}
