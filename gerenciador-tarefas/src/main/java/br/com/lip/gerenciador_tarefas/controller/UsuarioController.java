package br.com.lip.gerenciador_tarefas.controller;
import br.com.lip.gerenciador_tarefas.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import br.com.lip.gerenciador_tarefas.model.Usuario;
import java.util.List;

@RestController
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@GetMapping("/usuarios")
    public List<Usuario> listarUsuarios() {

        return usuarioService.buscarUsuario();
    }
	
	@GetMapping("/usuarios/{id}")
	public Usuario buscarPorId(@PathVariable Long id) {
		return usuarioService.buscarPorId(id);
	}
}
