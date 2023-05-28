package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonFormat {

    public enum Feature {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    public enum Shape {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN;

        public boolean isNumeric() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }
    }

    public static class Features {
        private static final Features EMPTY = new Features(0, 0);
        private final int _disabled;
        private final int _enabled;

        private Features(int i, int i2) {
            this._enabled = i;
            this._disabled = i2;
        }

        public static Features construct(JsonFormat jsonFormat) {
            return construct(jsonFormat.with(), jsonFormat.without());
        }

        public static Features empty() {
            return EMPTY;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != Features.class) {
                return false;
            }
            Features features = (Features) obj;
            if (features._enabled == this._enabled && features._disabled == this._disabled) {
                return true;
            }
            return false;
        }

        public Boolean get(Feature feature) {
            int ordinal = 1 << feature.ordinal();
            if ((this._disabled & ordinal) != 0) {
                return Boolean.FALSE;
            }
            if ((ordinal & this._enabled) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public int hashCode() {
            return this._disabled + this._enabled;
        }

        public Features withOverrides(Features features) {
            if (features == null) {
                return this;
            }
            int i = features._disabled;
            int i2 = features._enabled;
            if (i == 0 && i2 == 0) {
                return this;
            }
            if (this._enabled == 0 && this._disabled == 0) {
                return features;
            }
            int i3 = this._enabled;
            int i4 = ((i ^ -1) & i3) | i2;
            int i5 = this._disabled;
            int i6 = i | ((i2 ^ -1) & i5);
            if (i4 == i3 && i6 == i5) {
                return this;
            }
            return new Features(i4, i6);
        }

        public static Features construct(Feature[] featureArr, Feature[] featureArr2) {
            int i = 0;
            for (Feature ordinal : featureArr) {
                i |= 1 << ordinal.ordinal();
            }
            int i2 = 0;
            for (Feature ordinal2 : featureArr2) {
                i2 |= 1 << ordinal2.ordinal();
            }
            return new Features(i, i2);
        }
    }

    public static class Value implements Object<JsonFormat> {
        private static final Value EMPTY = new Value();
        private final Features _features;
        private final Boolean _lenient;
        private final Locale _locale;
        private final String _pattern;
        private final Shape _shape;
        private transient TimeZone _timezone;
        private final String _timezoneStr;

        public Value() {
            this("", Shape.ANY, "", "", Features.empty(), (Boolean) null);
        }

        private static <T> boolean _equal(T t, T t2) {
            if (t == null) {
                return t2 == null;
            }
            if (t2 == null) {
                return false;
            }
            return t.equals(t2);
        }

        public static final Value empty() {
            return EMPTY;
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != Value.class) {
                return false;
            }
            Value value = (Value) obj;
            if (this._shape != value._shape || !this._features.equals(value._features) || !_equal(this._lenient, value._lenient) || !_equal(this._timezoneStr, value._timezoneStr) || !_equal(this._pattern, value._pattern) || !_equal(this._timezone, value._timezone) || !_equal(this._locale, value._locale)) {
                return false;
            }
            return true;
        }

        public Boolean getFeature(Feature feature) {
            return this._features.get(feature);
        }

        public Boolean getLenient() {
            return this._lenient;
        }

        public Locale getLocale() {
            return this._locale;
        }

        public String getPattern() {
            return this._pattern;
        }

        public Shape getShape() {
            return this._shape;
        }

        public TimeZone getTimeZone() {
            TimeZone timeZone = this._timezone;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this._timezoneStr;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            this._timezone = timeZone2;
            return timeZone2;
        }

        public boolean hasLocale() {
            return this._locale != null;
        }

        public boolean hasPattern() {
            String str = this._pattern;
            return str != null && str.length() > 0;
        }

        public boolean hasShape() {
            return this._shape != Shape.ANY;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r1._timezoneStr;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean hasTimeZone() {
            /*
                r1 = this;
                java.util.TimeZone r0 = r1._timezone
                if (r0 != 0) goto L_0x0011
                java.lang.String r0 = r1._timezoneStr
                if (r0 == 0) goto L_0x000f
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x000f
                goto L_0x0011
            L_0x000f:
                r0 = 0
                goto L_0x0012
            L_0x0011:
                r0 = 1
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.annotation.JsonFormat.Value.hasTimeZone():boolean");
        }

        public int hashCode() {
            String str = this._timezoneStr;
            int hashCode = str == null ? 1 : str.hashCode();
            String str2 = this._pattern;
            if (str2 != null) {
                hashCode ^= str2.hashCode();
            }
            int hashCode2 = hashCode + this._shape.hashCode();
            Boolean bool = this._lenient;
            if (bool != null) {
                hashCode2 ^= bool.hashCode();
            }
            Locale locale = this._locale;
            if (locale != null) {
                hashCode2 += locale.hashCode();
            }
            return hashCode2 ^ this._features.hashCode();
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s)", new Object[]{this._pattern, this._shape, this._lenient, this._locale, this._timezoneStr});
        }

        public final Value withOverrides(Value value) {
            Value value2;
            Features features;
            TimeZone timeZone;
            String str;
            if (value == null || value == (value2 = EMPTY) || value == this) {
                return this;
            }
            if (this == value2) {
                return value;
            }
            String str2 = value._pattern;
            if (str2 == null || str2.isEmpty()) {
                str2 = this._pattern;
            }
            String str3 = str2;
            Shape shape = value._shape;
            if (shape == Shape.ANY) {
                shape = this._shape;
            }
            Shape shape2 = shape;
            Locale locale = value._locale;
            if (locale == null) {
                locale = this._locale;
            }
            Locale locale2 = locale;
            Features features2 = this._features;
            if (features2 == null) {
                features = value._features;
            } else {
                features = features2.withOverrides(value._features);
            }
            Features features3 = features;
            Boolean bool = value._lenient;
            if (bool == null) {
                bool = this._lenient;
            }
            Boolean bool2 = bool;
            String str4 = value._timezoneStr;
            if (str4 == null || str4.isEmpty()) {
                str = this._timezoneStr;
                timeZone = this._timezone;
            } else {
                timeZone = value._timezone;
                str = str4;
            }
            return new Value(str3, shape2, locale2, str, timeZone, features3, bool2);
        }

        public Value(JsonFormat jsonFormat) {
            this(jsonFormat.pattern(), jsonFormat.shape(), jsonFormat.locale(), jsonFormat.timezone(), Features.construct(jsonFormat), jsonFormat.lenient().asBoolean());
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Value(java.lang.String r14, com.fasterxml.jackson.annotation.JsonFormat.Shape r15, java.lang.String r16, java.lang.String r17, com.fasterxml.jackson.annotation.JsonFormat.Features r18, java.lang.Boolean r19) {
            /*
                r13 = this;
                r0 = r16
                r1 = r17
                java.lang.String r2 = "##default"
                r3 = 0
                if (r0 == 0) goto L_0x001d
                int r4 = r16.length()
                if (r4 == 0) goto L_0x001d
                boolean r4 = r2.equals(r0)
                if (r4 == 0) goto L_0x0016
                goto L_0x001d
            L_0x0016:
                java.util.Locale r4 = new java.util.Locale
                r4.<init>(r0)
                r8 = r4
                goto L_0x001e
            L_0x001d:
                r8 = r3
            L_0x001e:
                if (r1 == 0) goto L_0x002f
                int r0 = r17.length()
                if (r0 == 0) goto L_0x002f
                boolean r0 = r2.equals(r1)
                if (r0 == 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                r9 = r1
                goto L_0x0030
            L_0x002f:
                r9 = r3
            L_0x0030:
                r10 = 0
                r5 = r13
                r6 = r14
                r7 = r15
                r11 = r18
                r12 = r19
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.annotation.JsonFormat.Value.<init>(java.lang.String, com.fasterxml.jackson.annotation.JsonFormat$Shape, java.lang.String, java.lang.String, com.fasterxml.jackson.annotation.JsonFormat$Features, java.lang.Boolean):void");
        }

        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, Features features, Boolean bool) {
            this._pattern = str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this._timezone = timeZone;
            this._timezoneStr = str2;
            this._features = features == null ? Features.empty() : features;
            this._lenient = bool;
        }
    }

    OptBoolean lenient() default OptBoolean.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    Shape shape() default Shape.ANY;

    String timezone() default "##default";

    Feature[] with() default {};

    Feature[] without() default {};
}
