package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public abstract class FromStringDeserializer<T> extends StdScalarDeserializer<T> {

    public static class Std extends FromStringDeserializer<Object> {
        protected final int _kind;

        protected Std(Class<?> cls, int i) {
            super(cls);
            this._kind = i;
        }

        /* access modifiers changed from: protected */
        public Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            switch (this._kind) {
                case 1:
                    return new File(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return deserializationContext.findClass(str);
                    } catch (Exception e) {
                        return deserializationContext.handleInstantiationProblem(this._valueClass, str, ClassUtil.getRootCause(e));
                    }
                case 5:
                    return deserializationContext.getTypeFactory().constructFromCanonical(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    int _firstHyphenOrUnderscore = _firstHyphenOrUnderscore(str);
                    if (_firstHyphenOrUnderscore < 0) {
                        return new Locale(str);
                    }
                    String substring = str.substring(0, _firstHyphenOrUnderscore);
                    String substring2 = str.substring(_firstHyphenOrUnderscore + 1);
                    int _firstHyphenOrUnderscore2 = _firstHyphenOrUnderscore(substring2);
                    if (_firstHyphenOrUnderscore2 < 0) {
                        return new Locale(substring, substring2);
                    }
                    return new Locale(substring, substring2.substring(0, _firstHyphenOrUnderscore2), substring2.substring(_firstHyphenOrUnderscore2 + 1));
                case 9:
                    return Charset.forName(str);
                case 10:
                    return TimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (str.startsWith("[")) {
                        int lastIndexOf = str.lastIndexOf(93);
                        if (lastIndexOf != -1) {
                            int indexOf = str.indexOf(58, lastIndexOf);
                            return new InetSocketAddress(str.substring(0, lastIndexOf + 1), indexOf > -1 ? Integer.parseInt(str.substring(indexOf + 1)) : 0);
                        }
                        throw new InvalidFormatException(deserializationContext.getParser(), "Bracketed IPv6 address must contain closing bracket", str, InetSocketAddress.class);
                    }
                    int indexOf2 = str.indexOf(58);
                    if (indexOf2 >= 0) {
                        int i = indexOf2 + 1;
                        if (str.indexOf(58, i) < 0) {
                            return new InetSocketAddress(str.substring(0, indexOf2), Integer.parseInt(str.substring(i)));
                        }
                    }
                    return new InetSocketAddress(str, 0);
                case 13:
                    return new StringBuilder(str);
                default:
                    VersionUtil.throwInternal();
                    throw null;
            }
        }

        /* access modifiers changed from: protected */
        public Object _deserializeFromEmptyString() throws IOException {
            int i = this._kind;
            if (i == 3) {
                return URI.create("");
            }
            if (i == 8) {
                return Locale.ROOT;
            }
            if (i == 13) {
                return new StringBuilder();
            }
            return FromStringDeserializer.super._deserializeFromEmptyString();
        }

        /* access modifiers changed from: protected */
        public int _firstHyphenOrUnderscore(String str) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '_' || charAt == '-') {
                    return i;
                }
            }
            return -1;
        }
    }

    protected FromStringDeserializer(Class<?> cls) {
        super(cls);
    }

    public static Std findDeserializer(Class<?> cls) {
        int i;
        if (cls == File.class) {
            i = 1;
        } else if (cls == URL.class) {
            i = 2;
        } else if (cls == URI.class) {
            i = 3;
        } else if (cls == Class.class) {
            i = 4;
        } else if (cls == JavaType.class) {
            i = 5;
        } else if (cls == Currency.class) {
            i = 6;
        } else if (cls == Pattern.class) {
            i = 7;
        } else if (cls == Locale.class) {
            i = 8;
        } else if (cls == Charset.class) {
            i = 9;
        } else if (cls == TimeZone.class) {
            i = 10;
        } else if (cls == InetAddress.class) {
            i = 11;
        } else if (cls == InetSocketAddress.class) {
            i = 12;
        } else if (cls != StringBuilder.class) {
            return null;
        } else {
            i = 13;
        }
        return new Std(cls, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class<?>[] types() {
        /*
            r0 = 13
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<java.io.File> r2 = java.io.File.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<java.net.URL> r2 = java.net.URL.class
            r0[r1] = r2
            r1 = 2
            java.lang.Class<java.net.URI> r2 = java.net.URI.class
            r0[r1] = r2
            r1 = 3
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r0[r1] = r2
            r1 = 4
            java.lang.Class<com.fasterxml.jackson.databind.JavaType> r2 = com.fasterxml.jackson.databind.JavaType.class
            r0[r1] = r2
            r1 = 5
            java.lang.Class<java.util.Currency> r2 = java.util.Currency.class
            r0[r1] = r2
            r1 = 6
            java.lang.Class<java.util.regex.Pattern> r2 = java.util.regex.Pattern.class
            r0[r1] = r2
            r1 = 7
            java.lang.Class<java.util.Locale> r2 = java.util.Locale.class
            r0[r1] = r2
            r1 = 8
            java.lang.Class<java.nio.charset.Charset> r2 = java.nio.charset.Charset.class
            r0[r1] = r2
            r1 = 9
            java.lang.Class<java.util.TimeZone> r2 = java.util.TimeZone.class
            r0[r1] = r2
            r1 = 10
            java.lang.Class<java.net.InetAddress> r2 = java.net.InetAddress.class
            r0[r1] = r2
            r1 = 11
            java.lang.Class<java.net.InetSocketAddress> r2 = java.net.InetSocketAddress.class
            r0[r1] = r2
            r1 = 12
            java.lang.Class<java.lang.StringBuilder> r2 = java.lang.StringBuilder.class
            r0[r1] = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.types():java.lang.Class[]");
    }

    /* access modifiers changed from: protected */
    public abstract T _deserialize(String str, DeserializationContext deserializationContext) throws IOException;

    /* access modifiers changed from: protected */
    public T _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportInputMismatch((JsonDeserializer<?>) this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this._valueClass.getName());
        throw null;
    }

    /* access modifiers changed from: protected */
    public T _deserializeFromEmptyString() throws IOException {
        return null;
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String valueAsString = jsonParser.getValueAsString();
        if (valueAsString != null) {
            if (valueAsString.length() != 0) {
                String trim = valueAsString.trim();
                if (trim.length() != 0) {
                    try {
                        return _deserialize(trim, deserializationContext);
                    } catch (IllegalArgumentException | MalformedURLException e) {
                        String str = "not a valid textual representation";
                        String message = e.getMessage();
                        if (message != null) {
                            str = str + ", problem: " + message;
                        }
                        JsonMappingException weirdStringException = deserializationContext.weirdStringException(trim, this._valueClass, str);
                        weirdStringException.initCause(e);
                        throw weirdStringException;
                    }
                }
            }
            return _deserializeFromEmptyString();
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_ARRAY) {
            return _deserializeFromArray(jsonParser, deserializationContext);
        }
        if (currentToken != JsonToken.VALUE_EMBEDDED_OBJECT) {
            return deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
        T embeddedObject = jsonParser.getEmbeddedObject();
        if (embeddedObject == null) {
            return null;
        }
        if (this._valueClass.isAssignableFrom(embeddedObject.getClass())) {
            return embeddedObject;
        }
        return _deserializeEmbedded(embeddedObject, deserializationContext);
    }
}
