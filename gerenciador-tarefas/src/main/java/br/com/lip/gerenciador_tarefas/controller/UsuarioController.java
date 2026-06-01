package br.com.lip.gerenciador_tarefas.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.lip.gerenciador_tarefas.model.Usuario;

@RestController
public class UsuarioController {

    @GetMapping("/usuario")
    public String buscarUsuario() {
        return "Maria Camila";
    }

}
