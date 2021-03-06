/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-03-31 (23:44:54)
 */
package org.demo.orders.rest.dto;

import java.io.Serializable;

import java.time.LocalDate;
import java.util.List;

/**
 * REST DTO for entity "Order"
 * 
 * @author Telosys
 *
 */
public class OrderRestDto implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer orderNo; // ID
    private LocalDate orderDate; 
    private short status; 
    private String comment; 
    private Integer customerId; 

    //--- Relationships
    private List<OrderItemRestDto> items ;
    private DeliveryAddressRestDto deliveryAddress ; 

    /**
     * Default constructor
     */
    public OrderRestDto() {
        super();
    }
    
    /**
     * Set the "orderNo" field value
     * @param orderNo
     */
	public void setOrderNo( Integer orderNo ) {
        this.orderNo = orderNo ;
    }
    /**
     * Get the "orderNo" field value
     * @return the field value
     */
	public Integer getOrderNo() {
        return this.orderNo;
    }

    /**
     * Set the "orderDate" field value
     * @param orderDate
     */
	public void setOrderDate( LocalDate orderDate ) {
        this.orderDate = orderDate ;
    }
    /**
     * Get the "orderDate" field value
     * @return the field value
     */
	public LocalDate getOrderDate() {
        return this.orderDate;
    }

    /**
     * Set the "status" field value
     * @param status
     */
	public void setStatus( short status ) {
        this.status = status ;
    }
    /**
     * Get the "status" field value
     * @return the field value
     */
	public short getStatus() {
        return this.status;
    }

    /**
     * Set the "comment" field value
     * @param comment
     */
	public void setComment( String comment ) {
        this.comment = comment ;
    }
    /**
     * Get the "comment" field value
     * @return the field value
     */
	public String getComment() {
        return this.comment;
    }

    /**
     * Set the "customerId" field value
     * @param customerId
     */
	public void setCustomerId( Integer customerId ) {
        this.customerId = customerId ;
    }
    /**
     * Get the "customerId" field value
     * @return the field value
     */
	public Integer getCustomerId() {
        return this.customerId;
    }


    //--- Relationships
    public List<OrderItemRestDto> getItems() {
        return this.items;
    } 
    public void setItems(List<OrderItemRestDto> items) {
        this.items = items;
    } 
	
    public DeliveryAddressRestDto getDeliveryAddress() {
        return this.deliveryAddress;
    } 
    public void setDeliveryAddress(DeliveryAddressRestDto deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    } 
	

    @Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(orderNo);
        sb.append("|");
        sb.append(orderDate);
        sb.append("|");
        sb.append(status);
        sb.append("|");
        sb.append(comment);
        sb.append("|");
        sb.append(customerId);
        return sb.toString(); 
    } 

}
