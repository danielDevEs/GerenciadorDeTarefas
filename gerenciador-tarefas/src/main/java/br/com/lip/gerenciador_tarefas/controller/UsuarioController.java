package br.com.lip.gerenciador_tarefas.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.lip.gerenciador_tarefas.model.Usuario;

@RestController
public class UsuarioController {

    @GetMapping("/usuario")
    public Usuario buscarUsuario() {

        Usuario usuario = new Usuario();

        usuario.setId(1L);
        usuario.setNome("Daniel");
        usuario.setSenha("12345");
        usuario.setEmail("Daniel@Email");
        // usuario.addTarefa(null);

        return usuario;
    }

}
