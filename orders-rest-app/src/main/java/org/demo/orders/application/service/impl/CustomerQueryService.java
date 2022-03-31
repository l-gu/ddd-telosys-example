/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-01 (00:02:09)
 */
package org.demo.orders.application.service.impl;

import java.util.List;
import java.util.Optional;
import javax.inject.Inject;
import org.springframework.stereotype.Component;

import org.demo.orders.rest.dto.response.CustomerRestResponse;
import org.demo.orders.domain.model.Customer;
import org.demo.orders.domain.repository.CustomerRepository;
import org.demo.orders.application.mapper.CustomerMapper;
import org.demo.orders.rest.dto.CustomerRestDto;

/**
 * Service for "QUERIES" (database read operations)
 * Entity Customer
 *
 * @author Telosys
 */
@Component
public class CustomerQueryService {

	@Inject
	private CustomerRepository customerRepository;
	
	@Inject
	private CustomerMapper customerMapper;

	/**
	 * Get and return a Customer instance for the given id
	 * @param id id
	 * @return entity found (or null if not found)
	 */
	public CustomerRestDto getCustomer(Integer id) {
		Optional<Customer> customer = customerRepository.findById(id);
		if (customer.isPresent()) {
			return customerMapper.toDTO(customer.get());
		}
		else {
			return null;
		}
	}
	
	/**
	 * Get a page of Customer 
	 * @param page page number (from 1 to N)
	 * @param size page size
	 * @param sort
	 * @param order
	 * @return
	 */
	 public CustomerRestResponse findCustomer(Integer page, Integer size, String sort, String order) {

		// Find all in database
		List<Customer> customerList = customerRepository.findAll(page-1, size, sort, order);

		// Count all in database
		long totalElements = customerRepository.count();
		
		// Build API response object
		//return buildResponse(customerList, totalElements, size);
		List<CustomerRestDto> list = customerMapper.toDTOList(customerList);
		return new CustomerRestResponse(list, totalElements, size);

	}


}
