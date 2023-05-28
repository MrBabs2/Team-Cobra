package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

public class ViewMatcher implements Serializable {
    protected static final ViewMatcher EMPTY = new ViewMatcher();

    private static final class Multi extends ViewMatcher implements Serializable {
        private final Class<?>[] _views;

        public Multi(Class<?>[] clsArr) {
            this._views = clsArr;
        }

        public boolean isVisibleForView(Class<?> cls) {
            for (Class<?> cls2 : this._views) {
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final class Single extends ViewMatcher {
        private final Class<?> _view;

        public Single(Class<?> cls) {
            this._view = cls;
        }

        public boolean isVisibleForView(Class<?> cls) {
            Class<?> cls2 = this._view;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
    }

    public static ViewMatcher construct(Class<?>[] clsArr) {
        if (clsArr == null) {
            return EMPTY;
        }
        int length = clsArr.length;
        if (length == 0) {
            return EMPTY;
        }
        if (length != 1) {
            return new Multi(clsArr);
        }
        return new Single(clsArr[0]);
    }

    public boolean isVisibleForView(Class<?> cls) {
        return false;
    }
}
