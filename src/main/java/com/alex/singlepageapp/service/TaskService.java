package com.alex.singlepageapp.service;

import com.alex.singlepageapp.domain.Task;

/**
 * Created by Shishkov A.V. on 18.05.18.
 */
public interface TaskService {
	Iterable<Task> list();
}
