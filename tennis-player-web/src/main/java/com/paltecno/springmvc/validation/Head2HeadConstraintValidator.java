package com.paltecno.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Head2HeadConstraintValidator implements ConstraintValidator<HeadToHead,String> {

	@Override
	public void initialize(HeadToHead arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String headtoHeadScore, ConstraintValidatorContext context) {
		boolean isValid=headtoHeadScore.matches("[0-9]{1,2}-[0-9]{1,2}");
		return isValid;
	}

}
