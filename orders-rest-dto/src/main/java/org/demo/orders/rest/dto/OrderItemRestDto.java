/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-03-31 (23:44:54)
 */
package org.demo.orders.rest.dto;

import java.io.Serializable;

import java.math.BigDecimal;

/**
 * REST DTO for entity "OrderItem"
 * 
 * @author Telosys
 *
 */
public class OrderItemRestDto implements Serializable
{
    private static final long serialVersionUID = 1L;

    private long id; // ID
    private Integer orderNo; 
    private String productCode; 
    private BigDecimal quantity; 
    private BigDecimal unitPrice; 
    private BigDecimal discount; 
    private String comment; 


    /**
     * Default constructor
     */
    public OrderItemRestDto() {
        super();
    }
    
    /**
     * Set the "id" field value
     * @param id
     */
	public void setId( long id ) {
        this.id = id ;
    }
    /**
     * Get the "id" field value
     * @return the field value
     */
	public long getId() {
        return this.id;
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
     * Set the "productCode" field value
     * @param productCode
     */
	public void setProductCode( String productCode ) {
        this.productCode = productCode ;
    }
    /**
     * Get the "productCode" field value
     * @return the field value
     */
	public String getProductCode() {
        return this.productCode;
    }

    /**
     * Set the "quantity" field value
     * @param quantity
     */
	public void setQuantity( BigDecimal quantity ) {
        this.quantity = quantity ;
    }
    /**
     * Get the "quantity" field value
     * @return the field value
     */
	public BigDecimal getQuantity() {
        return this.quantity;
    }

    /**
     * Set the "unitPrice" field value
     * @param unitPrice
     */
	public void setUnitPrice( BigDecimal unitPrice ) {
        this.unitPrice = unitPrice ;
    }
    /**
     * Get the "unitPrice" field value
     * @return the field value
     */
	public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    /**
     * Set the "discount" field value
     * @param discount
     */
	public void setDiscount( BigDecimal discount ) {
        this.discount = discount ;
    }
    /**
     * Get the "discount" field value
     * @return the field value
     */
	public BigDecimal getDiscount() {
        return this.discount;
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



    @Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(id);
        sb.append("|");
        sb.append(orderNo);
        sb.append("|");
        sb.append(productCode);
        sb.append("|");
        sb.append(quantity);
        sb.append("|");
        sb.append(unitPrice);
        sb.append("|");
        sb.append(discount);
        sb.append("|");
        sb.append(comment);
        return sb.toString(); 
    } 

}
