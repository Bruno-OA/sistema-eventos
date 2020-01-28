package br.com.mastertech.sistema.eventos.controller;

import br.com.mastertech.sistema.eventos.model.eventosModel;
import br.com.mastertech.sistema.eventos.service.eventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class eventosController {

    @Autowired
    private eventosService service;

    @GetMapping
    public String mostrarHome(){
        return "index";
    }

    @PostMapping("/cadastrar")
    public String cadastrarEvento(eventosModel evento){
        service.cadastrarEvento(evento);
        return "index";
    }

}
