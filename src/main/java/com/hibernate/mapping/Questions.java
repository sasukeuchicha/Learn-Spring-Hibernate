package com.hibernate.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Questions {
	@Id
	
	@Column(name="quesition_id")
	private int questionId;
	private String question;
	private Answer answer;
	
}
