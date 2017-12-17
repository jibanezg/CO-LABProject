package edu.cs544.colab.office.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by Grimg on 12/16/2017.
 */
public enum OfficeStatus {
    
    FOR_LEASING("FOR LEASING"),
    DEFAULT("DEFAULT");

    private final String text;

    /**
     * @param text
     */
    OfficeStatus(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    @JsonValue
    public String toString() {
        return text;
    }
}
