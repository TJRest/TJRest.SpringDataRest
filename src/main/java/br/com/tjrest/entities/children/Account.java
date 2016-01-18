package br.com.tjrest.entities.children;

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

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="account")
public class Account implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="account_id_seq_gen")
	@SequenceGenerator(name="account_id_seq_gen", sequenceName="account_id_seq")
	@Column(name="account_id")
	private Long accountId;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(
	        name = "account_rel",
	        joinColumns = @JoinColumn(name = "acc_owner_id"),
	        inverseJoinColumns = @JoinColumn(name = "account_id")
	)
	private Set<Account> accounts;
	
	@ManyToOne
	@JoinTable(
	        name = "project_accounts",
	        joinColumns = @JoinColumn(name = "account_id"),
	        inverseJoinColumns = @JoinColumn(name = "project_id")
	)
	private Project project;
	private String name;
	
}
