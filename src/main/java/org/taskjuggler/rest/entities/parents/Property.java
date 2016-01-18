package org.taskjuggler.rest.entities.parents;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Property implements Serializable {

	private String name;
	
	@Id
	private UUID id;
	
	@OneToMany
	private Set<Property> properties;
	
	@ManyToOne
	private Property parent;
	
	@ManyToOne
	private Container project;
}
