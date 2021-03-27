package com.mayconbertucci.mc.service.exceptions;

import java.util.ArrayList;
import java.util.List;

import com.mayconbertucci.mc.resources.exceptions.StandardError;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();
	
	public ValidationError(Integer status, String msg, Long tineStamp) {
		super(status, msg, tineStamp);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String messagem) {
		errors.add(new FieldMessage(fieldName, messagem));
	}
	
	
}
