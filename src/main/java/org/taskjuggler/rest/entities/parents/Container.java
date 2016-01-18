package org.taskjuggler.rest.entities.parents;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Container implements Serializable {

	@Id
	private UUID id;
	
	private String name;
	
	@OneToMany
	private Set<Property> properties;
	
}
