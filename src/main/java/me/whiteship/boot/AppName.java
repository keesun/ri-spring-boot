package me.whiteship.boot;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Keeun Baik
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=AppNameValidator.class)
public @interface AppName {


    String message() default "{me.whiteship.boot.AppName.messge}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
