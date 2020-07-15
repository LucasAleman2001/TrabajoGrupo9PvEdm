package ar.edu.unju.edm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.modelo.Usuario;
import ar.edu.unju.edm.repository.IUsuario;

@Repository
public class UsuarioServiceImp implements IUsuarioService {
	
	@Autowired
	IUsuario iusuario;

	@Override
	public void guardar(Usuario usuario) {
		iusuario.save(usuario);
	}

	@Override
	public Usuario mostrar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Usuario usuario) {
		iusuario.delete(usuario);
	}

	@Override
	public Usuario modificar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
