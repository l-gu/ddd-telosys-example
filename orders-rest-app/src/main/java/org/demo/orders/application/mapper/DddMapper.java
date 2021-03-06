/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-01 (00:02:09)
 */
package org.demo.orders.application.mapper;

import java.util.List; 
import org.mapstruct.Mapper;

import org.demo.orders.domain.model.Ddd;
import org.demo.orders.rest.dto.DddRestDto;
/**
 * Mapper for entity "Ddd" 
 * Conversion from domain object to DTO 
 * 
 * @author Telosys
 */
@Mapper(componentModel = "spring", uses = { CccMapper.class, FffMapper.class })
public interface DddMapper {

	/**
	 * Converts the given domain object to DTO
	 * @param ddd object to convert
	 * @return
	 */	
	public DddRestDto toDTO(Ddd ddd);
	
	/**
	 * Converts the given domain list to DTO list
	 * @param dddList list to convert
	 * @return
	 */	
	public List<DddRestDto> toDTOList(List<Ddd> dddList);

}

