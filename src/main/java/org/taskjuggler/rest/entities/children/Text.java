package org.taskjuggler.rest.entities.children;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity 
//@Table(name="text")
public class Text implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="text_id_seq_gen")
	@SequenceGenerator(name="text_id_seq_gen", sequenceName="text_id_seq")
	@Column(name="text_id")
	private Long textId;
	private String value;
	private String pattern;

	private String fieldOrder;
	
}
