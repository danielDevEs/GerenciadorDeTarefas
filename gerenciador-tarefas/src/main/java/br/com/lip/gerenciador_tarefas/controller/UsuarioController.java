package br.com.lip.gerenciador_tarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping("/usuario")
    public String buscarUsuario() {
        return "Maria Camila";
    }

}
