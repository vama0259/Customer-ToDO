package com.mycompany.spring_rest_application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="todo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="task_id")
	private int id;
	@Column(name="desc")
	private String desc;
	@Column(name="user")
	private String user;
	@Column(name="isDone")
	private boolean isDone;
}
