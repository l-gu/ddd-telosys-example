/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-01 (00:02:09)
 */
package org.demo.orders.application.common;

import org.demo.orders.application.exception.ErrorCode;

/**
 * Generic exception
 *
 * @author Telosys
 *
 */
public abstract class GenericException extends RuntimeException {

    public GenericException(ErrorCode errorCode) {
        super(errorCode.getMessage());
    }

    public GenericException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getMessage(), cause);
    }
}