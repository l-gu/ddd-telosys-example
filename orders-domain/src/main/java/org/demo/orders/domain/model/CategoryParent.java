/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-03-31 (18:10:46)
 */
package org.demo.orders.domain.model;

import org.demo.orders.domain.common.Entity;

/**
 * Domain parent abstract class for entity "Category"
 *
 * @author Telosys
 *
 */
public abstract class CategoryParent extends Entity {

	private short code;
	private String name;


	/**
	 * Default constructor with restricted visibility
	 * (supposed to be used only by descendant )
	 */
	CategoryParent() {
	}




    /**
     * Set the "code" attribute value (restricted visibility)
     * @param code
     */
	void setCode( short code ) {
        this.code = code ;
    }
    /**
     * Get the "code" attribute value
     * @return the attribute value
     */
	public short getCode() {
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




	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(code);
        sb.append("|");
        sb.append(name);
        return sb.toString(); 
    } 

}
