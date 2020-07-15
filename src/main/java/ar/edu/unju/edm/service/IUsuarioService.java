package ar.edu.unju.edm.service;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.modelo.Usuario;

@Service
public interface IUsuarioService {
	
	public void guardar(Usuario usuario);
	public Usuario mostrar(Usuario usuario);
	public void eliminar(Usuario usuario);
	public Usuario modificar(Usuario usuario);
	
}
