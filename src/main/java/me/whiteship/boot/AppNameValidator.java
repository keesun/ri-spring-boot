package me.whiteship.boot;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

/**
 * @author Keeun Baik
 */
public class AppNameValidator implements ConstraintValidator<AppName, String> {

    private List<String> invalidNames = Arrays.asList("apple", "google");


    @Override
    public void initialize(AppName constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return !invalidNames.contains(value);
    }
}
