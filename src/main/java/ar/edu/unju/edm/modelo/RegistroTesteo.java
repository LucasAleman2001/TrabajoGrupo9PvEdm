package ar.edu.unju.edm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Component
@Entity
public class RegistroTesteo implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Long idRegistroTesteo;
	@Column
	private LocalDateTime fechahora;
	List<PersonaTesteada> personasTesteadas= new ArrayList<PersonaTesteada>();
	
	public RegistroTesteo() {
		
	}

	public RegistroTesteo(long idRegistroTesteo, LocalDateTime fechahora, List<PersonaTesteada> personasTesteadas) {
		super();
		this.idRegistroTesteo = idRegistroTesteo;
		this.fechahora = fechahora;
		this.personasTesteadas = personasTesteadas;
	}

	public long getIdRegistroTesteo() {
		return idRegistroTesteo;
	}

	public void setIdRegistroTesteo(long idRegistroTesteo) {
		this.idRegistroTesteo = idRegistroTesteo;
	}

	public LocalDateTime getFechahora() {
		return fechahora;
	}

	public void setFechahora(LocalDateTime fechahora) {
		this.fechahora = fechahora;
	}

	public List<PersonaTesteada> getPersonasTesteadas() {
		return personasTesteadas;
	}

	public void setPersonasTesteadas(List<PersonaTesteada> personasTesteadas) {
		this.personasTesteadas = personasTesteadas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechahora == null) ? 0 : fechahora.hashCode());
		result = prime * result + ((idRegistroTesteo == null) ? 0 : idRegistroTesteo.hashCode());
		result = prime * result + ((personasTesteadas == null) ? 0 : personasTesteadas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroTesteo other = (RegistroTesteo) obj;
		if (fechahora == null) {
			if (other.fechahora != null)
				return false;
		} else if (!fechahora.equals(other.fechahora))
			return false;
		if (idRegistroTesteo == null) {
			if (other.idRegistroTesteo != null)
				return false;
		} else if (!idRegistroTesteo.equals(other.idRegistroTesteo))
			return false;
		if (personasTesteadas == null) {
			if (other.personasTesteadas != null)
				return false;
		} else if (!personasTesteadas.equals(other.personasTesteadas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RegistroTesteo [idRegistroTesteo=" + idRegistroTesteo + ", fechahora=" + fechahora
				+ ", personasTesteadas=" + personasTesteadas + "]";
	}

	
}