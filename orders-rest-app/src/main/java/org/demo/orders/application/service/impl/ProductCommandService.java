/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-01 (00:02:09)
 */

package org.demo.orders.application.service.impl;

import java.util.Optional;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import org.demo.orders.domain.model.Product;
import org.demo.orders.domain.model.ProductFactoryRestDto;
import org.demo.orders.domain.repository.ProductRepository;
import org.demo.orders.application.exception.ProductException;
import org.demo.orders.application.exception.ErrorCode;
import org.demo.orders.rest.dto.ProductRestDto;

/**
 * Service for "COMMANDS" (database write operations)
 * Entity Product
 *
 * @author @{AUTHOR}
 */
@Component
public class ProductCommandService {

	@Inject
	private ProductRepository productRepository;
	

	/**
	 * Insert a new Product 
	 * @param productRestDto Data Transfer Object
	 * @return created aggregate
	 */
	public Product insertProduct(ProductRestDto productRestDto) {
		Product product = ProductFactoryRestDto.createProduct(productRestDto);
		productRepository.insert(product);
		return product;
	}

	/**
	 * Delete Product with the given id
	 * @param code id
	 */
	public void deleteProduct(String code) {  

		Optional<Product> product = productRepository.findById(code);

		if (product.isPresent()) {
			productRepository.delete(product.get());
		} else {
			throw new ProductException(ErrorCode.DELETE_NOT_FOUND); 
		}
	}
	
	/**
	 * Save Product (update or create)
	 * @param code id
	 * @param productRestDto Data Transfer Object
	 * @return true if created (else false)
	 */
	public boolean saveProduct(String code, ProductRestDto productRestDto) {
		Product product = ProductFactoryRestDto.createProduct(productRestDto);
		Product current = productRepository.findById(code).orElse(null);
		if (current == null) {
			// currentEntity not found => create a new one
			productRepository.insert(product);
			return true;
		}
		else {
			// currentEntity found => update from given data
			update(current, product);
			return false;
		}
	}

    private void update(Product currentEntity, Product newEntity) {

		//--- You can update partially the existing entity
		// Call here specific update methods
		//// currentEntity.doSomething(newEntity.getXxx(), newEntity.getYyy());
		// Update
		//// productRepository.update(currentEntity);

		//--- You can also just update the entity using the new one
		productRepository.update(newEntity);		
    }
}
