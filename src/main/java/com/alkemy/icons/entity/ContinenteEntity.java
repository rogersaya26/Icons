package com.alkemy.icons.entity;

import javax.persistence.*;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name = "continente")
@Getter
@Setter

public class ContinenteEntity {
	
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String imagen;
	
	private String denominacion;

}
