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
public class CustomerException extends GenericException {

    public CustomerException(ErrorCode errorCode) {
        super(errorCode);
    }

    public CustomerException(ErrorCode errorCode, Throwable cause) {
        super(errorCode, cause);
    }
}