package com.starburst.repositories;

import com.starburst.models.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by localadmin on 8/17/16.
 */
public interface TaskRepository extends PagingAndSortingRepository<Task, Integer> {
}

