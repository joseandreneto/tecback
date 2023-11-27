package br.com.fujideia.iesp.tecback.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = NomeValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Nome {

    String message() default "Nome invalido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
