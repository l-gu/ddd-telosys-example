/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-01 (00:02:09)
 */

package org.demo.orders.application.service.impl;

import java.util.Optional;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import org.demo.orders.domain.model.Foo;
import org.demo.orders.domain.model.FooFactoryRestDto;
import org.demo.orders.domain.model.FooId;
import org.demo.orders.domain.repository.FooRepository;
import org.demo.orders.application.exception.FooException;
import org.demo.orders.application.exception.ErrorCode;
import org.demo.orders.rest.dto.FooRestDto;

/**
 * Service for "COMMANDS" (database write operations)
 * Entity Foo
 *
 * @author @{AUTHOR}
 */
@Component
public class FooCommandService {

	@Inject
	private FooRepository fooRepository;
	
	private FooId buildId(String code, Integer id) {
		return new FooId(code, id);
	}

	/**
	 * Insert a new Foo 
	 * @param fooRestDto Data Transfer Object
	 * @return created aggregate
	 */
	public Foo insertFoo(FooRestDto fooRestDto) {
		Foo foo = FooFactoryRestDto.createFoo(fooRestDto);
		fooRepository.insert(foo);
		return foo;
	}

	/**
	 * Delete Foo with the given id
	 * @param code id
	 * @param id id
	 */
	public void deleteFoo(String code, Integer id) {  

		Optional<Foo> foo = fooRepository.findById(buildId(code, id));

		if (foo.isPresent()) {
			fooRepository.delete(foo.get());
		} else {
			throw new FooException(ErrorCode.DELETE_NOT_FOUND); 
		}
	}
	
	/**
	 * Save Foo (update or create)
	 * @param code id
	 * @param id id
	 * @param fooRestDto Data Transfer Object
	 * @return true if created (else false)
	 */
	public boolean saveFoo(String code, Integer id, FooRestDto fooRestDto) {
		Foo foo = FooFactoryRestDto.createFoo(fooRestDto);
		Foo current = fooRepository.findById(buildId(code, id)).orElse(null);
		if (current == null) {
			// currentEntity not found => create a new one
			fooRepository.insert(foo);
			return true;
		}
		else {
			// currentEntity found => update from given data
			update(current, foo);
			return false;
		}
	}

    private void update(Foo currentEntity, Foo newEntity) {

		//--- You can update partially the existing entity
		// Call here specific update methods
		//// currentEntity.doSomething(newEntity.getXxx(), newEntity.getYyy());
		// Update
		//// fooRepository.update(currentEntity);

		//--- You can also just update the entity using the new one
		fooRepository.update(newEntity);		
    }
}
