package com.alex.singlepageapp.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by Shishkov A.V. on 18.05.18.
 */
@Entity
@Data
//@AllArgsConstructor
public class Task {
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate dueDate;

	private Boolean completed;

	public Task() {
	}

	public Task(String name, LocalDate dueDate, Boolean completed) {
		this.name = name;
		this.dueDate = dueDate;
		this.completed = completed;
	}
}
