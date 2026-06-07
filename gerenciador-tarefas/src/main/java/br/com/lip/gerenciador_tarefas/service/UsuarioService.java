package br.com.lip.gerenciador_tarefas.service;
import br.com.lip.gerenciador_tarefas.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
	List<Usuario> usuarios = new ArrayList<>();
	
	public List<Usuario> buscarUsuario() {
		usuarios.clear();
		
		Usuario usuario1 = new Usuario();
		
		usuario1.setId(1L);
        usuario1.setNome("Daniel");
        usuario1.setSenha("12345");
        usuario1.setEmail("Daniel@Email");
        
        usuarios.add(usuario1);
        
        Usuario usuario2 = new Usuario();
        
        usuario2.setId(2L);
        usuario2.setNome("Camila");
        usuario2.setSenha("13022006");
        usuario2.setEmail("camilasantoss@Email");
        
        usuarios.add(usuario2);
        return usuarios;
	}
	
	public Usuario buscarPorId(Long id) {
		for(Usuario usuario : usuarios) {
			if (usuario.getId().equals(id)) {
				return usuario;
			}
		}
		return null;
	}
}
