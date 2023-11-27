package br.com.fujideia.iesp.tecback.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NomeValidator implements ConstraintValidator<Nome,String> {
    @Override
    public void initialize(Nome constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value.length()>3){
            return true;
        }
        return false;
    }
}
