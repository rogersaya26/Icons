package com.alkemy.icons.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "icon")
@Setter
@Getter

public class IconEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String imagen;
	
	private String denominacion;
	
	 @Column(name = "fecha_creacion")
	 @DateTimeFormat(pattern = "yyyy/MM/dd")
	 private LocalDate fechaCreacion;
	 
	 private Long altura; 
	 
	 private String historia;
	 
	 @ManyToMany(mappedBy = "icons", cascade = CascadeType.ALL)
	 private List<PaisEntity> paises = new ArrayList<>();
	 
	 
	 
	 
	
	
	
}
