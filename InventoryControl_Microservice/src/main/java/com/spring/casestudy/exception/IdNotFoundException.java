package com.spring.casestudy.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class IdNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String errorMessage;
    
	public IdNotFoundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
    
}
