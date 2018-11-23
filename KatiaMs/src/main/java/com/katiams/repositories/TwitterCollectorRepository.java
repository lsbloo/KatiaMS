package com.katiams.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.katiams.models.TwitterCollector;

@Repository
public interface TwitterCollectorRepository extends CrudRepository<TwitterCollector,Integer>{

	
}
