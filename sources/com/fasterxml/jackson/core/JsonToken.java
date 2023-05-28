package com.fasterxml.jackson.core;

import p015cm.aptoide.p016pt.account.AdultContentAnalytics;

public enum JsonToken {
    NOT_AVAILABLE((String) null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME((String) null, 5),
    VALUE_EMBEDDED_OBJECT((String) null, 12),
    VALUE_STRING((String) null, 6),
    VALUE_NUMBER_INT((String) null, 7),
    VALUE_NUMBER_FLOAT((String) null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE(AdultContentAnalytics.UNLOCK, 10),
    VALUE_NULL("null", 11);
    
    final int _id;
    final boolean _isNumber;
    final boolean _isScalar;
    final boolean _isStructEnd;
    final boolean _isStructStart;
    final String _serialized;
    final byte[] _serializedBytes;
    final char[] _serializedChars;

    private JsonToken(String str, int i) {
        boolean z = false;
        if (str == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
        } else {
            this._serialized = str;
            char[] charArray = str.toCharArray();
            this._serializedChars = charArray;
            int length = charArray.length;
            this._serializedBytes = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                this._serializedBytes[i2] = (byte) this._serializedChars[i2];
            }
        }
        this._id = i;
        if (i != 10) {
        }
        this._isNumber = i == 7 || i == 8;
        this._isStructStart = i == 1 || i == 3;
        boolean z2 = i == 2 || i == 4;
        this._isStructEnd = z2;
        if (!this._isStructStart && !z2 && i != 5 && i != -1) {
            z = true;
        }
        this._isScalar = z;
    }

    public final char[] asCharArray() {
        return this._serializedChars;
    }

    public final String asString() {
        return this._serialized;
    }

    /* renamed from: id */
    public final int mo21540id() {
        return this._id;
    }

    public final boolean isNumeric() {
        return this._isNumber;
    }

    public final boolean isScalarValue() {
        return this._isScalar;
    }

    public final boolean isStructEnd() {
        return this._isStructEnd;
    }

    public final boolean isStructStart() {
        return this._isStructStart;
    }
}
