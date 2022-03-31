/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-03-31 (18:10:46)
 */
package org.demo.orders.domain.model;

import org.demo.orders.domain.common.Entity;

/**
 * Domain parent abstract class for entity "Ccc"
 *
 * @author Telosys
 *
 */
public abstract class CccParent extends Entity {

	private Integer id;
	private String name;


	/**
	 * Default constructor with restricted visibility
	 * (supposed to be used only by descendant )
	 */
	CccParent() {
	}




    /**
     * Set the "id" attribute value (restricted visibility)
     * @param id
     */
	void setId( Integer id ) {
        this.id = id ;
    }
    /**
     * Get the "id" attribute value
     * @return the attribute value
     */
	public Integer getId() {
        return this.id;
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
        sb.append(id);
        sb.append("|");
        sb.append(name);
        return sb.toString(); 
    } 

}
