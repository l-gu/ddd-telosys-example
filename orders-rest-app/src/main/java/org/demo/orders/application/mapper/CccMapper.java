/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-01 (00:02:09)
 */
package org.demo.orders.application.mapper;

import java.util.List; 
import org.mapstruct.Mapper;

import org.demo.orders.domain.model.Ccc;
import org.demo.orders.rest.dto.CccRestDto;
/**
 * Mapper for entity "Ccc" 
 * Conversion from domain object to DTO 
 * 
 * @author Telosys
 */
@Mapper(componentModel = "spring")
public interface CccMapper {

	/**
	 * Converts the given domain object to DTO
	 * @param ccc object to convert
	 * @return
	 */	
	public CccRestDto toDTO(Ccc ccc);
	
	/**
	 * Converts the given domain list to DTO list
	 * @param cccList list to convert
	 * @return
	 */	
	public List<CccRestDto> toDTOList(List<Ccc> cccList);

}

