package br.projetoestoque.validaAnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.OverridesAttribute;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;

@Target({ElementType.FIELD,ElementType.METHOD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy= {})
//[a-zA-Z] significa somente de a à z maius ou min {2} somente 2 caracteres \\d = digitos{4,18} min 4 max 18 e ? se tiver valid senão não
@Pattern(regexp="([a-zA-Z]{2}\\d{4,18})?")
public @interface SKU {
	
	/*
	 * Sobrescreve a mensagem do @pattern atribuindo a mensagem do SKU
	 * */
	@OverridesAttribute(constraint =  Pattern.class, name="message")
	String message() default "{br.projetoestoque.validator.constraints.SKU.message}";
	Class<?>[] groups() default{};
	
	Class<? extends  Payload>[] payload() default{};
}
