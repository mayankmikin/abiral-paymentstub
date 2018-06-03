package com.amex.paymentstub.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;

public class AlphaNumericSpecialCharValidator implements ConstraintValidator<AlphaNumericSpecialChar, String>{
    private java.util.regex.Pattern pattern;

    private boolean optional;
    private int min;
    private int max;

    @Override
    public void initialize(AlphaNumericSpecialChar annotation) {
        optional = annotation.optional();
        min = annotation.min();
        max = annotation.max();
        try {
            pattern = Pattern.compile("^[a-zA-Z0-9\\s\\.\\-\\[\\?\\\\\\],()/!\\|\\$:_@\\*%~#&amp;\\^£¢¤¬]+$");
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Invalid regular expression.", e);
        }
        validateParameters();
    }

    /**
     * Checks that the annotated field value is alphanumeric.
     * 
     * @param value
     *            The string to validate.
     * @param constraintValidatorContext
     *            context in which the constraint is evaluated.
     * 
* @return Returns <code>true</code> if the string is <code>null</code> or the length of <code>value</code> is zero,
* <code>false</code> otherwise.
     */
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (optional && StringUtils.isBlank(value)) {
            return true;
        }
        if (StringUtils.isBlank(value)) {
            return false;
        }
        int length = value.trim().length();
        Matcher patternMatcher = pattern.matcher(value);

return length >= min && length <= max && patternMatcher.matches();
    }

    private void validateParameters() {
if (min < 0) {
            throw new IllegalArgumentException("The min parameter cannot be negative.");
        }
if (max < 0) {
            throw new IllegalArgumentException("The max parameter cannot be negative.");
        }
if (max < min) {
            throw new IllegalArgumentException("The length cannot be negative.");
        }
    }
}