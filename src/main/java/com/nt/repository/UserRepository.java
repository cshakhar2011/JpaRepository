package com.nt.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nt.entity.UserEntity;

@Repository
@EnableJpaRepositories
@Transactional
@Component
public interface UserRepository extends CrudRepository<UserEntity,Integer>{

	




	


  



	

}
