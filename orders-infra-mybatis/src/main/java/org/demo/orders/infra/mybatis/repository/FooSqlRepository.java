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

import org.demo.orders.domain.model.Foo;
import org.demo.orders.domain.model.FooId;
import org.demo.orders.domain.repository.FooRepository;

@Repository
public class FooSqlRepository extends SqlRepository<Foo, FooId>
		implements FooRepository {

	@Inject
	private FooSqlMapper fooSqlMapper;

	@Override
	protected SqlMapper<Foo, FooId> getSqlMapper() {
		return fooSqlMapper;
	}

	@Override
	protected void insertRelationship(final Foo foo) {
	}

	@Override
	protected void deleteRelationship(final Foo foo) {
	}

	// Add here specific methods if necessary 
/*
	@Override
	public List<Foo> findAllByXxxx(Integer xxx, 
				Integer page, Integer size, String sort, String order){
		return fooSqlMapper.findAllByXxxx(xxx, page * size, size,
				toSnakeCase(sort), order);
	}

	@Override
	public long countByXxxx(Integer xxx) {
		return fooSqlMapper.countByXxxx(xxx);
	}
*/

}
