package com.nt.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.InvtBank;
import com.nt.entity.UserEntity;

@Service
@Transactional
public class UserService {

	@Autowired(required = true)
	@PersistenceContext
	private EntityManager entityManager;

	public List<UserEntity> getAllDataFromData() {

		return entityManager.createQuery("from UserEntity").getResultList();

		// entityManager.createNativeQuery("SELECT *FROM UserEntity full outer join
		// InvtAddress full outer join InvtBank where InvtBank.active='y'
		// ").getResultList();
	}

	public UserEntity postDatainDatabse(UserEntity userEntity) {
		entityManager.persist(userEntity);
		return userEntity;
	}

	public UserEntity FindByIdMethod(int id) {

		return entityManager.find(UserEntity.class, id);

		// return this.userRepository.findById(id).orElseThrow(() -> new
		// EntityNotFoundException());
	}

	public String deleteById(int id) {

		// this.userRepository.deleteById(id);

		UserEntity find = entityManager.find(UserEntity.class, id);

		entityManager.remove(find);

		return "Delete Successfully";
	}

	public String deleteAll() {
		// this.userRepository.deleteAll();
		// EntityManager.createQuery("DELETE FROM UserEntity").executeUpdate();

		entityManager.createQuery("Delete from UserEntity").executeUpdate();
		return "All Record is Deleted successfully";
	}

	public UserEntity updateUser(UserEntity userEntity, int id) {

		UserEntity entity = entityManager.find(UserEntity.class, id);
		if (entity != null) {
			userEntity.setInvtId(id);
			return entityManager.merge(userEntity);
		} else {
			return null;
		}
		// UPDATE table_name
		// SET column1 = value1, column2 = value2, ...
		// WHERE condition;

//		    return userRepository.findById(id).map(logger ->{
//		    	logger.setInvtName(userEntity.getInvtName());
//		    	logger.setInvtEmail(userEntity.getInvtEmail());
//		    	logger.setInvtMobile_No(userEntity.getInvtMobile_No());
//		    	logger.setInvtDateOfBirth(userEntity.getInvtDateOfBirth());
//		    	logger.setInvtPIR(userEntity.getInvtPIR());
//		    	logger.setInvtpref_Name(userEntity.getInvtpref_Name());
//		    	logger.setInvtAddress(userEntity.getInvtAddress());
//		    	logger.setInvtBank(userEntity.getInvtBank());
//		    	return userRepository.save(logger);
//		      })
//		      .orElseGet(() -> {
//		        userEntity.setInvtId(id);
//		        return userRepository.save(userEntity);
//		      });
//			
//			
//		
//		
	}

	public List<InvtBank> userBankUpdata() {

		return entityManager.createNativeQuery(" SELECT *FROM invt_bank where active='y' ").getResultList();
	}

	public InvtBank updateBankYesNo(InvtBank invtBank, int id) {

		InvtBank bank = entityManager.find(InvtBank.class, id);
		if (bank != null) {
			invtBank.setAccountNo(id);
			return entityManager.merge(invtBank);
		}

		return null;
	}

}
