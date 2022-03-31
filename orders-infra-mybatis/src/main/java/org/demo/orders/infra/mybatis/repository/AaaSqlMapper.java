/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-03-31 (18:12:14)
 */
package org.demo.orders.infra.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import org.demo.orders.infra.mybatis.common.SqlMapper;

import org.demo.orders.domain.model.Aaa;

import org.demo.orders.domain.model.Bbb;
import org.demo.orders.domain.model.Ccc;

@Mapper
public interface AaaSqlMapper extends SqlMapper<Aaa, Integer> {


	static final String TABLE = "aaa" ; 

	//----------------------------------------------------------------
	// Standard methods implementation 
	//----------------------------------------------------------------
	@Override
	@Select("SELECT COUNT(*) FROM " + TABLE)
	long count();


	@Override
	@Select("SELECT * FROM " + TABLE  +
			" WHERE id = #{id} " )
	Aaa findById(Integer id);


	@Override
	@Select("SELECT * FROM " + TABLE + " ORDER BY ${sort} ${order} OFFSET ${offset} LIMIT ${limit}")
	List<Aaa> findAll(@Param("offset") Integer offset, @Param("limit") Integer limit,
								  @Param("sort")   String sort,    @Param("order") String order);

	@Override
	@Insert("INSERT INTO " + TABLE + "( " +
			"id, name" +
			" ) VALUES ( " +
			"#{id}, #{name}" +
			")")
	int insert(Aaa aaa);

	@Override
	@Update("UPDATE " + TABLE + 
			" SET " +
			" name = #{name} " +
			" WHERE id = #{id}" )
	int update(Aaa aaa);

	@Override
	@Delete("DELETE FROM " + TABLE + 
			" WHERE id = #{id}" )
	int delete(Aaa aaa);


	//----------------------------------------------------------------
	// Ajouter ici les méthodes spécifiques 'findByXxx', 'countByXxxx', etc
	//----------------------------------------------------------------
/***
	@Select("SELECT * FROM " + TABLE +
			" WHERE xxx = #{xxx} ORDER BY ${sort} ${order} OFFSET ${offset} LIMIT ${limit}")
	List<Aaa> findByXxxx(
			@Param("xxx") int xxx, 
			@Param("offset") Integer offset,
			@Param("limit") Integer limit, 
			@Param("sort") String sort, 
			@Param("order") String order);

	@Select("SELECT COUNT(*) FROM " + TABLE + " WHERE xxx = #{param1}")
	long countByXxxx(int xxx);
***/
}