package com.alex.singlepageapp.repository;

import com.alex.singlepageapp.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shishkov A.V. on 18.05.18.
 */
@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}
