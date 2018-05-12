package io.usersjpa.model;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserDao extends CrudRepository<User,Integer> {
		
}
