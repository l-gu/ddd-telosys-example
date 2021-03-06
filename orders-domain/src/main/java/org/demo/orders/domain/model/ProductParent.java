/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-03-31 (18:10:46)
 */
package org.demo.orders.domain.model;

import java.math.BigDecimal;
import org.demo.orders.domain.common.AggregateRoot;

/**
 * Domain parent abstract class for entity "Product"
 *
 * @author Telosys
 *
 */
public abstract class ProductParent extends AggregateRoot {

	private String code;
	private String name;
	private String description;
	private BigDecimal unitPrice;
	private Boolean inStock;
	private Boolean activeForSale;
	private Short categoryId;


    private Category category ;

	/**
	 * Default constructor with restricted visibility
	 * (supposed to be used only by descendant )
	 */
	ProductParent() {
	}




    /**
     * Set the "code" attribute value (restricted visibility)
     * @param code
     */
	void setCode( String code ) {
        this.code = code ;
    }
    /**
     * Get the "code" attribute value
     * @return the attribute value
     */
	public String getCode() {
        return this.code;
    }

    /**
     * Set the "name" attribute value (restricted visibility)
     * @param name
     */
	void setName( String name ) {
        this.name = name ;
    }
    /**
     * Get the "name" attribute value
     * @return the attribute value
     */
	public String getName() {
        return this.name;
    }

    /**
     * Set the "description" attribute value (restricted visibility)
     * @param description
     */
	void setDescription( String description ) {
        this.description = description ;
    }
    /**
     * Get the "description" attribute value
     * @return the attribute value
     */
	public String getDescription() {
        return this.description;
    }

    /**
     * Set the "unitPrice" attribute value (restricted visibility)
     * @param unitPrice
     */
	void setUnitPrice( BigDecimal unitPrice ) {
        this.unitPrice = unitPrice ;
    }
    /**
     * Get the "unitPrice" attribute value
     * @return the attribute value
     */
	public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    /**
     * Set the "inStock" attribute value (restricted visibility)
     * @param inStock
     */
	void setInStock( Boolean inStock ) {
        this.inStock = inStock ;
    }
    /**
     * Get the "inStock" attribute value
     * @return the attribute value
     */
	public Boolean getInStock() {
        return this.inStock;
    }

    /**
     * Set the "activeForSale" attribute value (restricted visibility)
     * @param activeForSale
     */
	void setActiveForSale( Boolean activeForSale ) {
        this.activeForSale = activeForSale ;
    }
    /**
     * Get the "activeForSale" attribute value
     * @return the attribute value
     */
	public Boolean getActiveForSale() {
        return this.activeForSale;
    }

    /**
     * Set the "categoryId" attribute value (restricted visibility)
     * @param categoryId
     */
	void setCategoryId( Short categoryId ) {
        this.categoryId = categoryId ;
    }
    /**
     * Get the "categoryId" attribute value
     * @return the attribute value
     */
	public Short getCategoryId() {
        return this.categoryId;
    }



    //--- GETTERS FOR LINKS
    public Category getCategory() {
        return this.category;
    } 


	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(code);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(description);
        sb.append("|");
        sb.append(unitPrice);
        sb.append("|");
        sb.append(inStock);
        sb.append("|");
        sb.append(activeForSale);
        sb.append("|");
        sb.append(categoryId);
        return sb.toString(); 
    } 

}
