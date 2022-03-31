/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-01 (00:02:09)
 */

package org.demo.orders.application.exception;

import org.demo.orders.application.common.GenericException;

/**
 * Error code
 *
 * @author Telosys
 *
 */
public class ProductException extends GenericException {

    public ProductException(ErrorCode errorCode) {
        super(errorCode);
    }

    public ProductException(ErrorCode errorCode, Throwable cause) {
        super(errorCode, cause);
    }
}
