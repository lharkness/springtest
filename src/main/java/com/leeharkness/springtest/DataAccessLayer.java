package com.leeharkness.springtest;

import com.google.common.annotations.VisibleForTesting;
import org.springframework.stereotype.Component;

/**
 * Our window into the data access layer
 */
@Component
class DataAccessLayer {

    @VisibleForTesting
    static final String SMALL_MESSAGE = "Small Message";
    @VisibleForTesting
    static final String LARGE_MESSAGE = "Large Message";

    /**
     * Retrieves a small message
     * @return the small message
     */
    String getSmallMessage() {
        return SMALL_MESSAGE;
    }

    /**
     * Retrieves a large message
     * @return the large message
     */
    String getLargeMessage() {
        return LARGE_MESSAGE;
    }
}
