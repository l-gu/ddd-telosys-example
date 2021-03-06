/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-03-31 (23:44:54)
 */
package org.demo.orders.domain.model;

import org.demo.orders.rest.dto.FooRestDto;
/**
 * Domain factory for aggregate "Foo" based 
 * based on REST DTO input
 *
 * @author Telosys
 *
 */

//-----------------------------------
// referencedEntitiesForAllLevels : 
//-----------------------------------
// 
public final class FooFactoryRestDto {


	/**
	 * Create a new instance of "Foo" from "Data Transfer Object"
	 * @param dto
	 * @return created instance
	 */

	public static Foo createFoo(FooRestDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("FooRestDto is null");
		}
		Foo foo = new Foo();
		foo.setCode(dto.getCode());
		foo.setId(dto.getId());
		foo.setFirstName(dto.getFirstName());
		foo.setLastName(dto.getLastName());
		return foo;
	}


}
