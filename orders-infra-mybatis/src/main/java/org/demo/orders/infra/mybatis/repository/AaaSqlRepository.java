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

import org.demo.orders.domain.model.Aaa;
import org.demo.orders.domain.repository.AaaRepository;

@Repository
public class AaaSqlRepository extends SqlRepository<Aaa, Integer>
		implements AaaRepository {

	@Inject
	private AaaSqlMapper aaaSqlMapper;

	@Override
	protected SqlMapper<Aaa, Integer> getSqlMapper() {
		return aaaSqlMapper;
	}

	@Override
	protected void insertRelationship(final Aaa aaa) {
		// Link : bbb : Bbb ( ManyToOne )
		// Link "many to one" not supposed to be inserted
		// Link : ccc : Ccc ( ManyToOne )
		// Link "many to one" not supposed to be inserted
	}

	@Override
	protected void deleteRelationship(final Aaa aaa) {
		// Link : bbb : Bbb ( ManyToOne / OwningSide : true )
		// Link "many to one" not supposed to be deleted
		// Link : ccc : Ccc ( ManyToOne / OwningSide : true )
		// Link "many to one" not supposed to be deleted
	}

	// Add here specific methods if necessary 
/*
	@Override
	public List<Aaa> findAllByXxxx(Integer xxx, 
				Integer page, Integer size, String sort, String order){
		return aaaSqlMapper.findAllByXxxx(xxx, page * size, size,
				toSnakeCase(sort), order);
	}

	@Override
	public long countByXxxx(Integer xxx) {
		return aaaSqlMapper.countByXxxx(xxx);
	}
*/

}
