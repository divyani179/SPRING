package com.test.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.test.bean.*;

public class CustomerValidator implements Validator {

	//specifies which class can use this validator
	@Override
	public boolean supports(Class<?> myclass) {
		return Customer.class.equals(myclass);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		/*configure in resource bundle*/
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cust_id", "id.required");
		Customer customer=(Customer)obj;
		if(customer.getCust_id()<=0){
			errors.rejectValue("cust_id","negativeValue",
					new Object[]{"'CustomerId'"}, "id can't be negative");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name", "name.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"city", "city.required");
		if(customer.getAge()<20 ||customer.getAge()>80){
			errors.rejectValue("age","age.match", new Object[]{"'Age'"}, "Your Age is not matching");
		}
	}

}
