/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-03-31 (18:12:14)
 */
package org.demo.orders.infra.mybatis.repository;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import org.demo.orders.infra.mybatis.common.SqlRepository;
import org.demo.orders.infra.mybatis.common.SqlMapper;

import org.demo.orders.domain.model.Product;
import org.demo.orders.domain.repository.ProductRepository;

@Repository
public class ProductSqlRepository extends SqlRepository<Product, String>
		implements ProductRepository {

	@Inject
	private ProductSqlMapper productSqlMapper;

	@Override
	protected SqlMapper<Product, String> getSqlMapper() {
		return productSqlMapper;
	}

	@Override
	protected void insertRelationship(final Product product) {
		// Link : category : Category ( ManyToOne )
		// Link "many to one" not supposed to be inserted
	}

	@Override
	protected void deleteRelationship(final Product product) {
		// Link : category : Category ( ManyToOne / OwningSide : true )
		// Link "many to one" not supposed to be deleted
	}

	// Add here specific methods if necessary 
/*
	@Override
	public List<Product> findAllByXxxx(Integer xxx, 
				Integer page, Integer size, String sort, String order){
		return productSqlMapper.findAllByXxxx(xxx, page * size, size,
				toSnakeCase(sort), order);
	}

	@Override
	public long countByXxxx(Integer xxx) {
		return productSqlMapper.countByXxxx(xxx);
	}
*/

}
