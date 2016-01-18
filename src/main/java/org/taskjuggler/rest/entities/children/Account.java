package org.taskjuggler.rest.entities.children;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;
import org.taskjuggler.rest.entities.parents.Property;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
//@Table(name="account")
@RestResource(rel="{projectId}/accounts", path="{projectId}/accounts", exported=false)
public class Account extends Property implements Serializable {

//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO, generator="account_id_seq_gen")
//	@SequenceGenerator(name="account_id_seq_gen", sequenceName="account_id_seq")
//	@Column(name="account_id")
//	private Long accountId;
	
	private String name;
	
}
