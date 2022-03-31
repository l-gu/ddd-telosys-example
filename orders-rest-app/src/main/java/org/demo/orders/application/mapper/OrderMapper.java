/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-01 (00:02:09)
 */
package org.demo.orders.application.mapper;

import java.util.List; 
import org.mapstruct.Mapper;

import org.demo.orders.domain.model.Order;
import org.demo.orders.rest.dto.OrderRestDto;
/**
 * Mapper for entity "Order" 
 * Conversion from domain object to DTO 
 * 
 * @author Telosys
 */
@Mapper(componentModel = "spring", uses = { OrderItemMapper.class, DeliveryAddressMapper.class })
public interface OrderMapper {

	/**
	 * Converts the given domain object to DTO
	 * @param order object to convert
	 * @return
	 */	
	public OrderRestDto toDTO(Order order);
	
	/**
	 * Converts the given domain list to DTO list
	 * @param orderList list to convert
	 * @return
	 */	
	public List<OrderRestDto> toDTOList(List<Order> orderList);

}
