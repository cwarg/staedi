package io.xlate.edi.stream;

public enum EDIStreamValidationError {
    NONE(null),

    UNRECOGNIZED_SEGMENT_ID(EDIStreamEvent.SEGMENT_ERROR),
    UNEXPECTED_SEGMENT(EDIStreamEvent.SEGMENT_ERROR),
    MANDATORY_SEGMENT_MISSING(EDIStreamEvent.SEGMENT_ERROR),
    LOOP_OCCURS_OVER_MAXIMUM_TIMES(EDIStreamEvent.SEGMENT_ERROR),
    SEGMENT_EXCEEDS_MAXIMUM_USE(EDIStreamEvent.SEGMENT_ERROR),
    SEGMENT_NOT_IN_DEFINED_TRANSACTION_SET(EDIStreamEvent.SEGMENT_ERROR),
    SEGMENT_NOT_IN_PROPER_SEQUENCE(EDIStreamEvent.SEGMENT_ERROR),
    SEGMENT_HAS_DATA_ELEMENT_ERRORS(EDIStreamEvent.SEGMENT_ERROR),
    IMPLEMENTATION_UNUSED_SEGMENT_PRESENT(EDIStreamEvent.SEGMENT_ERROR),
    // Not yet supported: IMPLEMENTATION_DEPENDENT_SEGMENT_MISSING(EDIStreamEvent.SEGMENT_ERROR),
    IMPLEMENTATION_LOOP_OCCURS_UNDER_MINIMUM_TIMES(EDIStreamEvent.SEGMENT_ERROR),
    IMPLEMENTATION_SEGMENT_BELOW_MINIMUM_USE(EDIStreamEvent.SEGMENT_ERROR),
    // Not yet supported: IMPLEMENTATION_DEPENDENT_UNUSED_SEGMENT_PRESENT(EDIStreamEvent.SEGMENT_ERROR),
    CONDITIONAL_REQUIRED_SEGMENT_MISSING(EDIStreamEvent.SEGMENT_ERROR),
    SEGMENT_EXCLUSION_CONDITION_VIOLATED(EDIStreamEvent.SEGMENT_ERROR),

    REQUIRED_DATA_ELEMENT_MISSING(EDIStreamEvent.ELEMENT_OCCURRENCE_ERROR),
    CONDITIONAL_REQUIRED_DATA_ELEMENT_MISSING(EDIStreamEvent.ELEMENT_OCCURRENCE_ERROR),
    TOO_MANY_DATA_ELEMENTS(EDIStreamEvent.ELEMENT_OCCURRENCE_ERROR),
    EXCLUSION_CONDITION_VIOLATED(EDIStreamEvent.ELEMENT_OCCURRENCE_ERROR),
    TOO_MANY_REPETITIONS(EDIStreamEvent.ELEMENT_OCCURRENCE_ERROR),
    TOO_MANY_COMPONENTS(EDIStreamEvent.ELEMENT_OCCURRENCE_ERROR),
    // Not yet supported: IMPLEMENTATION_DEPENDENT_DATA_ELEMENT_MISSING(EDIStreamEvent.ELEMENT_OCCURRENCE_ERROR),
    IMPLEMENTATION_UNUSED_DATA_ELEMENT_PRESENT(EDIStreamEvent.ELEMENT_OCCURRENCE_ERROR),
    IMPLEMENTATION_TOO_FEW_REPETITIONS(EDIStreamEvent.ELEMENT_OCCURRENCE_ERROR),
    // Not yet supported: IMPLEMENTATION_DEPENDENT_UNUSED_DATA_ELEMENT_PRESENT(EDIStreamEvent.ELEMENT_OCCURRENCE_ERROR),

    DATA_ELEMENT_TOO_SHORT(EDIStreamEvent.ELEMENT_DATA_ERROR),
    DATA_ELEMENT_TOO_LONG(EDIStreamEvent.ELEMENT_DATA_ERROR),
    INVALID_CHARACTER_DATA(EDIStreamEvent.ELEMENT_DATA_ERROR),
    INVALID_CODE_VALUE(EDIStreamEvent.ELEMENT_DATA_ERROR),
    INVALID_DATE(EDIStreamEvent.ELEMENT_DATA_ERROR),
    INVALID_TIME(EDIStreamEvent.ELEMENT_DATA_ERROR),
    IMPLEMENTATION_INVALID_CODE_VALUE(EDIStreamEvent.ELEMENT_DATA_ERROR),
    IMPLEMENTATION_PATTERN_MATCH_FAILURE(EDIStreamEvent.ELEMENT_DATA_ERROR),

    // Control number and counter validation errors
    CONTROL_REFERENCE_MISMATCH(EDIStreamEvent.ELEMENT_DATA_ERROR),
    CONTROL_COUNT_DOES_NOT_MATCH_ACTUAL_COUNT(EDIStreamEvent.ELEMENT_DATA_ERROR)
    ;

    private EDIStreamEvent category;

    private EDIStreamValidationError(EDIStreamEvent category) {
        this.category = category;
    }

    public EDIStreamEvent getCategory() {
        return category;
    }
}
