/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-01 (00:02:09)
 */
package org.demo.orders.application.service.impl;

import java.util.List;
import java.util.Optional;
import javax.inject.Inject;
import org.springframework.stereotype.Component;

import org.demo.orders.rest.dto.response.AaaRestResponse;
import org.demo.orders.domain.model.Aaa;
import org.demo.orders.domain.repository.AaaRepository;
import org.demo.orders.application.mapper.AaaMapper;
import org.demo.orders.rest.dto.AaaRestDto;

/**
 * Service for "QUERIES" (database read operations)
 * Entity Aaa
 *
 * @author Telosys
 */
@Component
public class AaaQueryService {

	@Inject
	private AaaRepository aaaRepository;
	
	@Inject
	private AaaMapper aaaMapper;

	/**
	 * Get and return a Aaa instance for the given id
	 * @param id id
	 * @return entity found (or null if not found)
	 */
	public AaaRestDto getAaa(Integer id) {
		Optional<Aaa> aaa = aaaRepository.findById(id);
		if (aaa.isPresent()) {
			return aaaMapper.toDTO(aaa.get());
		}
		else {
			return null;
		}
	}
	
	/**
	 * Get a page of Aaa 
	 * @param page page number (from 1 to N)
	 * @param size page size
	 * @param sort
	 * @param order
	 * @return
	 */
	 public AaaRestResponse findAaa(Integer page, Integer size, String sort, String order) {

		// Find all in database
		List<Aaa> aaaList = aaaRepository.findAll(page-1, size, sort, order);

		// Count all in database
		long totalElements = aaaRepository.count();
		
		// Build API response object
		//return buildResponse(aaaList, totalElements, size);
		List<AaaRestDto> list = aaaMapper.toDTOList(aaaList);
		return new AaaRestResponse(list, totalElements, size);

	}


}
