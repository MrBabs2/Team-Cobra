package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.p187io.SerializedString;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;

public class PropertyName implements Serializable {
    public static final PropertyName NO_NAME = new PropertyName(new String(""), (String) null);
    public static final PropertyName USE_DEFAULT = new PropertyName("", (String) null);
    protected SerializableString _encodedSimple;
    protected final String _namespace;
    protected final String _simpleName;

    public PropertyName(String str) {
        this(str, (String) null);
    }

    public static PropertyName construct(String str) {
        if (str == null || str.length() == 0) {
            return USE_DEFAULT;
        }
        return new PropertyName(InternCache.instance.intern(str), (String) null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != PropertyName.class) {
            return false;
        }
        PropertyName propertyName = (PropertyName) obj;
        String str = this._simpleName;
        if (str == null) {
            if (propertyName._simpleName != null) {
                return false;
            }
        } else if (!str.equals(propertyName._simpleName)) {
            return false;
        }
        String str2 = this._namespace;
        if (str2 != null) {
            return str2.equals(propertyName._namespace);
        }
        if (propertyName._namespace == null) {
            return true;
        }
        return false;
    }

    public String getSimpleName() {
        return this._simpleName;
    }

    public boolean hasNamespace() {
        return this._namespace != null;
    }

    public boolean hasSimpleName() {
        return this._simpleName.length() > 0;
    }

    public int hashCode() {
        String str = this._namespace;
        if (str == null) {
            return this._simpleName.hashCode();
        }
        return str.hashCode() ^ this._simpleName.hashCode();
    }

    public PropertyName internSimpleName() {
        String intern;
        if (this._simpleName.length() == 0 || (intern = InternCache.instance.intern(this._simpleName)) == this._simpleName) {
            return this;
        }
        return new PropertyName(intern, this._namespace);
    }

    public boolean isEmpty() {
        return this._namespace == null && this._simpleName.isEmpty();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2._simpleName;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object readResolve() {
        /*
            r2 = this;
            java.lang.String r0 = r2._namespace
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = r2._simpleName
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
        L_0x0010:
            com.fasterxml.jackson.databind.PropertyName r0 = USE_DEFAULT
            return r0
        L_0x0013:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.PropertyName.readResolve():java.lang.Object");
    }

    public SerializableString simpleAsEncoded(MapperConfig<?> mapperConfig) {
        SerializableString serializableString;
        SerializableString serializableString2 = this._encodedSimple;
        if (serializableString2 != null) {
            return serializableString2;
        }
        if (mapperConfig == null) {
            serializableString = new SerializedString(this._simpleName);
        } else {
            serializableString = mapperConfig.compileString(this._simpleName);
        }
        SerializableString serializableString3 = serializableString;
        this._encodedSimple = serializableString3;
        return serializableString3;
    }

    public String toString() {
        if (this._namespace == null) {
            return this._simpleName;
        }
        return "{" + this._namespace + "}" + this._simpleName;
    }

    public PropertyName withSimpleName(String str) {
        if (str == null) {
            str = "";
        }
        if (str.equals(this._simpleName)) {
            return this;
        }
        return new PropertyName(str, this._namespace);
    }

    public PropertyName(String str, String str2) {
        this._simpleName = ClassUtil.nonNullString(str);
        this._namespace = str2;
    }

    public boolean hasSimpleName(String str) {
        return this._simpleName.equals(str);
    }

    public static PropertyName construct(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null && str.length() == 0) {
            return USE_DEFAULT;
        }
        return new PropertyName(InternCache.instance.intern(str), str2);
    }
}
