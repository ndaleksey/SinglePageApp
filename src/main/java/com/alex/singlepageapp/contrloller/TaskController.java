package com.alex.singlepageapp.contrloller;

import com.alex.singlepageapp.domain.Task;
import com.alex.singlepageapp.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shishkov A.V. on 18.05.18.
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	private TaskService taskService;

	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}

	@GetMapping(value = {"", "/"})
	public Iterable<Task> list() {
		return taskService.list();
	}
}
