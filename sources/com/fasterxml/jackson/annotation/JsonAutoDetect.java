package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAutoDetect {

    /* renamed from: com.fasterxml.jackson.annotation.JsonAutoDetect$1 */
    static /* synthetic */ class C47301 {

        /* renamed from: $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility */
        static final /* synthetic */ int[] f8022x23d16a11;
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0083 */
        static {
            /*
                com.fasterxml.jackson.annotation.PropertyAccessor[] r0 = com.fasterxml.jackson.annotation.PropertyAccessor.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor = r0
                r1 = 1
                com.fasterxml.jackson.annotation.PropertyAccessor r2 = com.fasterxml.jackson.annotation.PropertyAccessor.CREATOR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.PropertyAccessor r3 = com.fasterxml.jackson.annotation.PropertyAccessor.FIELD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.PropertyAccessor r4 = com.fasterxml.jackson.annotation.PropertyAccessor.GETTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.PropertyAccessor r5 = com.fasterxml.jackson.annotation.PropertyAccessor.IS_GETTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.annotation.PropertyAccessor r6 = com.fasterxml.jackson.annotation.PropertyAccessor.NONE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.annotation.PropertyAccessor r6 = com.fasterxml.jackson.annotation.PropertyAccessor.SETTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r5 = $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.fasterxml.jackson.annotation.PropertyAccessor r6 = com.fasterxml.jackson.annotation.PropertyAccessor.ALL     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7 = 7
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility[] r5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f8022x23d16a11 = r5
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r1 = f8022x23d16a11     // Catch:{ NoSuchFieldError -> 0x006f }
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE     // Catch:{ NoSuchFieldError -> 0x006f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = f8022x23d16a11     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r1 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = f8022x23d16a11     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r1 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f8022x23d16a11     // Catch:{ NoSuchFieldError -> 0x008d }
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r1 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.annotation.JsonAutoDetect.C47301.<clinit>():void");
        }
    }

    public enum Visibility {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        NONE,
        DEFAULT;

        public boolean isVisible(Member member) {
            int i = C47301.f8022x23d16a11[ordinal()];
            if (i == 1) {
                return true;
            }
            if (i == 3) {
                return !Modifier.isPrivate(member.getModifiers());
            }
            if (i != 4) {
                if (i != 5) {
                    return false;
                }
            } else if (Modifier.isProtected(member.getModifiers())) {
                return true;
            }
            return Modifier.isPublic(member.getModifiers());
        }
    }

    public static class Value implements Object<JsonAutoDetect> {
        protected static final Value DEFAULT;
        private static final Visibility DEFAULT_FIELD_VISIBILITY;
        protected static final Value NO_OVERRIDES;
        protected final Visibility _creatorVisibility;
        protected final Visibility _fieldVisibility;
        protected final Visibility _getterVisibility;
        protected final Visibility _isGetterVisibility;
        protected final Visibility _setterVisibility;

        static {
            Visibility visibility = Visibility.PUBLIC_ONLY;
            DEFAULT_FIELD_VISIBILITY = visibility;
            DEFAULT = new Value(visibility, visibility, visibility, Visibility.ANY, Visibility.PUBLIC_ONLY);
            Visibility visibility2 = Visibility.DEFAULT;
            NO_OVERRIDES = new Value(visibility2, visibility2, visibility2, visibility2, visibility2);
        }

        private Value(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            this._fieldVisibility = visibility;
            this._getterVisibility = visibility2;
            this._isGetterVisibility = visibility3;
            this._setterVisibility = visibility4;
            this._creatorVisibility = visibility5;
        }

        private static boolean _equals(Value value, Value value2) {
            return value._fieldVisibility == value2._fieldVisibility && value._getterVisibility == value2._getterVisibility && value._isGetterVisibility == value2._isGetterVisibility && value._setterVisibility == value2._setterVisibility && value._creatorVisibility == value2._creatorVisibility;
        }

        private static Value _predefined(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            if (visibility == DEFAULT_FIELD_VISIBILITY) {
                Value value = DEFAULT;
                if (visibility2 == value._getterVisibility && visibility3 == value._isGetterVisibility && visibility4 == value._setterVisibility && visibility5 == value._creatorVisibility) {
                    return value;
                }
                return null;
            }
            Visibility visibility6 = Visibility.DEFAULT;
            if (visibility == visibility6 && visibility2 == visibility6 && visibility3 == visibility6 && visibility4 == visibility6 && visibility5 == visibility6) {
                return NO_OVERRIDES;
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && obj.getClass() == Value.class && _equals(this, (Value) obj);
        }

        public Visibility getCreatorVisibility() {
            return this._creatorVisibility;
        }

        public Visibility getFieldVisibility() {
            return this._fieldVisibility;
        }

        public Visibility getGetterVisibility() {
            return this._getterVisibility;
        }

        public Visibility getIsGetterVisibility() {
            return this._isGetterVisibility;
        }

        public Visibility getSetterVisibility() {
            return this._setterVisibility;
        }

        public int hashCode() {
            return ((this._fieldVisibility.ordinal() + 1) ^ (((this._getterVisibility.ordinal() * 3) - (this._isGetterVisibility.ordinal() * 7)) + (this._setterVisibility.ordinal() * 11))) ^ (this._creatorVisibility.ordinal() * 13);
        }

        /* access modifiers changed from: protected */
        public Object readResolve() {
            Value _predefined = _predefined(this._fieldVisibility, this._getterVisibility, this._isGetterVisibility, this._setterVisibility, this._creatorVisibility);
            return _predefined == null ? this : _predefined;
        }

        public String toString() {
            return String.format("JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)", new Object[]{this._fieldVisibility, this._getterVisibility, this._isGetterVisibility, this._setterVisibility, this._creatorVisibility});
        }
    }

    Visibility creatorVisibility() default Visibility.DEFAULT;

    Visibility fieldVisibility() default Visibility.DEFAULT;

    Visibility getterVisibility() default Visibility.DEFAULT;

    Visibility isGetterVisibility() default Visibility.DEFAULT;

    Visibility setterVisibility() default Visibility.DEFAULT;
}
