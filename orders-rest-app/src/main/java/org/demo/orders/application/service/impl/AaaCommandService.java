/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-01 (00:02:09)
 */

package org.demo.orders.application.service.impl;

import java.util.Optional;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import org.demo.orders.domain.model.Aaa;
import org.demo.orders.domain.model.AaaFactoryRestDto;
import org.demo.orders.domain.repository.AaaRepository;
import org.demo.orders.application.exception.AaaException;
import org.demo.orders.application.exception.ErrorCode;
import org.demo.orders.rest.dto.AaaRestDto;

/**
 * Service for "COMMANDS" (database write operations)
 * Entity Aaa
 *
 * @author @{AUTHOR}
 */
@Component
public class AaaCommandService {

	@Inject
	private AaaRepository aaaRepository;
	

	/**
	 * Insert a new Aaa 
	 * @param aaaRestDto Data Transfer Object
	 * @return created aggregate
	 */
	public Aaa insertAaa(AaaRestDto aaaRestDto) {
		Aaa aaa = AaaFactoryRestDto.createAaa(aaaRestDto);
		aaaRepository.insert(aaa);
		return aaa;
	}

	/**
	 * Delete Aaa with the given id
	 * @param id id
	 */
	public void deleteAaa(Integer id) {  

		Optional<Aaa> aaa = aaaRepository.findById(id);

		if (aaa.isPresent()) {
			aaaRepository.delete(aaa.get());
		} else {
			throw new AaaException(ErrorCode.DELETE_NOT_FOUND); 
		}
	}
	
	/**
	 * Save Aaa (update or create)
	 * @param id id
	 * @param aaaRestDto Data Transfer Object
	 * @return true if created (else false)
	 */
	public boolean saveAaa(Integer id, AaaRestDto aaaRestDto) {
		Aaa aaa = AaaFactoryRestDto.createAaa(aaaRestDto);
		Aaa current = aaaRepository.findById(id).orElse(null);
		if (current == null) {
			// currentEntity not found => create a new one
			aaaRepository.insert(aaa);
			return true;
		}
		else {
			// currentEntity found => update from given data
			update(current, aaa);
			return false;
		}
	}

    private void update(Aaa currentEntity, Aaa newEntity) {

		//--- You can update partially the existing entity
		// Call here specific update methods
		//// currentEntity.doSomething(newEntity.getXxx(), newEntity.getYyy());
		// Update
		//// aaaRepository.update(currentEntity);

		//--- You can also just update the entity using the new one
		aaaRepository.update(newEntity);		
    }
}