package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Iterator;

public abstract class JsonNode extends JsonSerializable.Base implements Object {
    protected JsonNode() {
    }

    public abstract String asText();

    public Iterator<JsonNode> elements() {
        return ClassUtil.emptyIterator();
    }

    public boolean isArray() {
        return false;
    }

    public final Iterator<JsonNode> iterator() {
        return elements();
    }

    public abstract String toString();
}
