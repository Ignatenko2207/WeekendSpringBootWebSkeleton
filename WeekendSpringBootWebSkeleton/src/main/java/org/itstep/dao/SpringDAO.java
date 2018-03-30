package org.itstep.dao;

import java.util.List;

import org.itstep.model.SpringPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//@Repository
public interface SpringDAO extends JpaRepository<SpringPojo, Integer> {

//	@Query(value = "SELECT name FROM spring-pojo WHERE id=?1", nativeQuery=true)
	String customMethod(Integer id);
	
	List<SpringPojo> findAllByNameAndCondition(String name, Boolean condition);

}
