/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-03-31 (23:44:54)
 */
package org.demo.orders.domain.model;

import java.util.ArrayList;
import java.util.List;
import org.demo.orders.rest.dto.ProductRestDto;
import org.demo.orders.rest.dto.CategoryRestDto;
/**
 * Domain factory for aggregate "Product" based 
 * based on REST DTO input
 *
 * @author Telosys
 *
 */

//-----------------------------------
// referencedEntitiesForAllLevels : 
// - Category 
//-----------------------------------
// 
public final class ProductFactoryRestDto {


	/**
	 * Create a new instance of "Product" from "Data Transfer Object"
	 * @param dto
	 * @return created instance
	 */

	public static Product createProduct(ProductRestDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("ProductRestDto is null");
		}
		Product product = new Product();
		product.setCode(dto.getCode());
		product.setName(dto.getName());
		product.setDescription(dto.getDescription());
		product.setUnitPrice(dto.getUnitPrice());
		product.setInStock(dto.getInStock());
		product.setActiveForSale(dto.getActiveForSale());
		product.setCategoryId(dto.getCategoryId());
		return product;
	}

// - Category 
	private static Category createCategory(CategoryRestDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("CategoryRestDto is null");
		}
		Category category = new Category();
		category.setCode(dto.getCode());
		category.setName(dto.getName());
		return category;
	}
	private static List<Category> createCategoryList(List<CategoryRestDto> dtoList) {
		List<Category> list = null;
		if (dtoList != null) {
			list = new ArrayList<Category>();
			for ( CategoryRestDto dto : dtoList ) {
				list.add(createCategory(dto));
			}
		}
		return list;
	}

}
