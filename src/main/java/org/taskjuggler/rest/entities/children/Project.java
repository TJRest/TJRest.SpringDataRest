package org.taskjuggler.rest.entities.children;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;
import org.taskjuggler.rest.entities.parents.Container;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity 
//@Table(name="project")
//@JsonHyperSchema(pathStart = "/profile/projects/", 
//	links = {  
//	    @Link(href = "{projectId}/accounts", rel = "account", targetSchema = Account.class)
//	}
//)
@Inheritance(strategy=InheritanceType.JOINED)
public class Project extends Container implements Serializable{

//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO, generator="project_id_seq_gen")
//	@SequenceGenerator(name="project_id_seq_gen", sequenceName="project_id_seq")
//	@Column(name="project_id")
//	private Long projectId; 

	private String alias;
	
//	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
//	@JoinColumn(name="text_id")
//	private Text name;
	
	private String currency;

	private String timezone;

	private String currencyFormat;

	private String timeFormat;

	private String numberFormat;

	private long startDateMili;

	private long endDateMili;
	
	
}
