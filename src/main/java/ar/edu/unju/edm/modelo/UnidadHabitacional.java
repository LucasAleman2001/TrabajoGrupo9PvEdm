package ar.edu.unju.edm.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="unidad_habitacional")
public class UnidadHabitacional implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native",strategy="native")
	@Column(name="IDUnidad")
	private Long idUnidadHabitacional;
	@Column(name="DIRECCION")
	private String direccion;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="IDBARRIO")
	private Barrio barrio;
	

}