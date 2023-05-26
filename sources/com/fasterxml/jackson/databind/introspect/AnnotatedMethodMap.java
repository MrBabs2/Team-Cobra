package com.fasterxml.jackson.databind.introspect;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public final class AnnotatedMethodMap implements Iterable<AnnotatedMethod> {
    protected Map<MemberKey, AnnotatedMethod> _methods;

    public AnnotatedMethodMap() {
    }

    public AnnotatedMethod find(String str, Class<?>[] clsArr) {
        Map<MemberKey, AnnotatedMethod> map = this._methods;
        if (map == null) {
            return null;
        }
        return map.get(new MemberKey(str, clsArr));
    }

    public Iterator<AnnotatedMethod> iterator() {
        Map<MemberKey, AnnotatedMethod> map = this._methods;
        if (map == null) {
            return Collections.emptyList().iterator();
        }
        return map.values().iterator();
    }

    public AnnotatedMethodMap(Map<MemberKey, AnnotatedMethod> map) {
        this._methods = map;
    }
}
