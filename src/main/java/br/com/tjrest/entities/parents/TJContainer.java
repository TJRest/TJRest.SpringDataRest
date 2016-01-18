package br.com.tjrest.entities.parents;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public abstract class TJContainer implements Serializable {

	private String name;
	
}
