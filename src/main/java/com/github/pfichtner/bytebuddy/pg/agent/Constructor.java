package com.github.pfichtner.bytebuddy.pg.agent;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;

import net.bytebuddy.asm.Advice;

public class Constructor {

	@Advice.OnMethodExit
	static void exitConstructor(@Advice.Origin String method, @Advice.This Object thisObj) throws Exception {
		validate(thisObj);
	}

	public static void validate(Object obj) {
		Set<ConstraintViolation<Object>> validationResult = Validation.buildDefaultValidatorFactory().getValidator()
				.validate(obj);
		if (!validationResult.isEmpty()) {
			throw new ConstraintViolationException(validationResult);
		}
	}

}