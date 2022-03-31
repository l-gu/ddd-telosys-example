/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-03-31 (23:44:54)
 */
package org.demo.orders.domain.model;

import java.util.ArrayList;
import java.util.List;
import org.demo.orders.rest.dto.AaaRestDto;
import org.demo.orders.rest.dto.CccRestDto;
import org.demo.orders.rest.dto.BbbRestDto;
import org.demo.orders.rest.dto.EeeRestDto;
import org.demo.orders.rest.dto.DddRestDto;
import org.demo.orders.rest.dto.FffRestDto;
/**
 * Domain factory for aggregate "Aaa" based 
 * based on REST DTO input
 *
 * @author Telosys
 *
 */

//-----------------------------------
// referencedEntitiesForAllLevels : 
// - Ccc 
// - Bbb 
// - Eee 
// - Ddd 
// - Fff 
//-----------------------------------
// 
public final class AaaFactoryRestDto {


	/**
	 * Create a new instance of "Aaa" from "Data Transfer Object"
	 * @param dto
	 * @return created instance
	 */

	public static Aaa createAaa(AaaRestDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("AaaRestDto is null");
		}
		Aaa aaa = new Aaa();
		aaa.setId(dto.getId());
		aaa.setName(dto.getName());
		return aaa;
	}

// - Ccc 
	private static Ccc createCcc(CccRestDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("CccRestDto is null");
		}
		Ccc ccc = new Ccc();
		ccc.setId(dto.getId());
		ccc.setName(dto.getName());
		return ccc;
	}
	private static List<Ccc> createCccList(List<CccRestDto> dtoList) {
		List<Ccc> list = null;
		if (dtoList != null) {
			list = new ArrayList<Ccc>();
			for ( CccRestDto dto : dtoList ) {
				list.add(createCcc(dto));
			}
		}
		return list;
	}
// - Bbb 
	private static Bbb createBbb(BbbRestDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("BbbRestDto is null");
		}
		Bbb bbb = new Bbb();
		bbb.setId(dto.getId());
		bbb.setName(dto.getName());
		return bbb;
	}
	private static List<Bbb> createBbbList(List<BbbRestDto> dtoList) {
		List<Bbb> list = null;
		if (dtoList != null) {
			list = new ArrayList<Bbb>();
			for ( BbbRestDto dto : dtoList ) {
				list.add(createBbb(dto));
			}
		}
		return list;
	}
// - Eee 
	private static Eee createEee(EeeRestDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("EeeRestDto is null");
		}
		Eee eee = new Eee();
		eee.setId(dto.getId());
		eee.setName(dto.getName());
		return eee;
	}
	private static List<Eee> createEeeList(List<EeeRestDto> dtoList) {
		List<Eee> list = null;
		if (dtoList != null) {
			list = new ArrayList<Eee>();
			for ( EeeRestDto dto : dtoList ) {
				list.add(createEee(dto));
			}
		}
		return list;
	}
// - Ddd 
	private static Ddd createDdd(DddRestDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("DddRestDto is null");
		}
		Ddd ddd = new Ddd();
		ddd.setId(dto.getId());
		ddd.setName(dto.getName());
		return ddd;
	}
	private static List<Ddd> createDddList(List<DddRestDto> dtoList) {
		List<Ddd> list = null;
		if (dtoList != null) {
			list = new ArrayList<Ddd>();
			for ( DddRestDto dto : dtoList ) {
				list.add(createDdd(dto));
			}
		}
		return list;
	}
// - Fff 
	private static Fff createFff(FffRestDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("FffRestDto is null");
		}
		Fff fff = new Fff();
		fff.setId(dto.getId());
		fff.setName(dto.getName());
		return fff;
	}
	private static List<Fff> createFffList(List<FffRestDto> dtoList) {
		List<Fff> list = null;
		if (dtoList != null) {
			list = new ArrayList<Fff>();
			for ( FffRestDto dto : dtoList ) {
				list.add(createFff(dto));
			}
		}
		return list;
	}

}