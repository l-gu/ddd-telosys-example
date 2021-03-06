/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-01 (00:02:09)
 */
package org.demo.orders.application.mapper;

import java.util.List; 
import org.mapstruct.Mapper;

import org.demo.orders.domain.model.Customer;
import org.demo.orders.rest.dto.CustomerRestDto;
/**
 * Mapper for entity "Customer" 
 * Conversion from domain object to DTO 
 * 
 * @author Telosys
 */
@Mapper(componentModel = "spring", uses = { CustomerAddressMapper.class })
public interface CustomerMapper {

	/**
	 * Converts the given domain object to DTO
	 * @param customer object to convert
	 * @return
	 */	
	public CustomerRestDto toDTO(Customer customer);
	
	/**
	 * Converts the given domain list to DTO list
	 * @param customerList list to convert
	 * @return
	 */	
	public List<CustomerRestDto> toDTOList(List<Customer> customerList);

}

