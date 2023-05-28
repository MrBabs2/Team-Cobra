package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import java.io.IOException;
import java.io.Serializable;

public class MinimalPrettyPrinter implements PrettyPrinter, Serializable {
    protected String _rootValueSeparator;
    protected Separators _separators;

    public MinimalPrettyPrinter() {
        this(PrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR.toString());
    }

    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
    }

    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
    }

    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(this._separators.getArrayValueSeparator());
    }

    public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.writeRaw(']');
    }

    public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.writeRaw('}');
    }

    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(this._separators.getObjectEntrySeparator());
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(this._separators.getObjectFieldValueSeparator());
    }

    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        String str = this._rootValueSeparator;
        if (str != null) {
            jsonGenerator.writeRaw(str);
        }
    }

    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw('[');
    }

    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw('{');
    }

    public MinimalPrettyPrinter(String str) {
        this._rootValueSeparator = str;
        this._separators = PrettyPrinter.DEFAULT_SEPARATORS;
    }
}
