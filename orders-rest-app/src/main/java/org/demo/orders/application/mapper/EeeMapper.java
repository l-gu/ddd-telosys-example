/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-01 (00:02:09)
 */
package org.demo.orders.application.mapper;

import java.util.List; 
import org.mapstruct.Mapper;

import org.demo.orders.domain.model.Eee;
import org.demo.orders.rest.dto.EeeRestDto;
/**
 * Mapper for entity "Eee" 
 * Conversion from domain object to DTO 
 * 
 * @author Telosys
 */
@Mapper(componentModel = "spring", uses = { BbbMapper.class })
public interface EeeMapper {

	/**
	 * Converts the given domain object to DTO
	 * @param eee object to convert
	 * @return
	 */	
	public EeeRestDto toDTO(Eee eee);
	
	/**
	 * Converts the given domain list to DTO list
	 * @param eeeList list to convert
	 * @return
	 */	
	public List<EeeRestDto> toDTOList(List<Eee> eeeList);

}

