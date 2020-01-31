package com.easytestit.generatexml.parser;

import java.io.IOException;

/**
 * Copied from GSON library
 *
 * Internal-only APIs of JsonReader available only to other classes in Gson.
 */
public abstract class JsonReaderInternalAccess {
    public static JsonReaderInternalAccess INSTANCE;

    /**
     * Changes the type of the current property name token to a string value.
     */
    public abstract void promoteNameToValue(JsonReader reader) throws IOException;
}