package com.hibernate.mapping;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	
}
