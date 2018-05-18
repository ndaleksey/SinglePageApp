package com.alex.singlepageapp.service;

import com.alex.singlepageapp.domain.Task;
import com.alex.singlepageapp.repository.TaskRepository;
import org.springframework.stereotype.Controller;

/**
 * Created by Shishkov A.V. on 18.05.18.
 */
@Controller
public class TaskServiceImlp implements TaskService {

	private TaskRepository taskRepository;

	public TaskServiceImlp(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@Override
	public Iterable<Task> list() {
		return taskRepository.findAll();
	}
}
