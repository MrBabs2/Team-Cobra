package kotlin.reflect.jvm.internal.impl.protobuf;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w */
/* compiled from: WireFormat */
public final class C10472w {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b */
    /* compiled from: WireFormat */
    public enum C10474b {
        DOUBLE(C10479c.DOUBLE, 1),
        FLOAT(C10479c.FLOAT, 5),
        INT64(C10479c.LONG, 0),
        UINT64(C10479c.LONG, 0),
        INT32(C10479c.INT, 0),
        FIXED64(C10479c.LONG, 1),
        FIXED32(C10479c.INT, 5),
        BOOL(C10479c.BOOLEAN, 0),
        STRING(C10479c.STRING, 2) {
            /* renamed from: e */
            public boolean mo35886e() {
                return false;
            }
        },
        GROUP(C10479c.MESSAGE, 3) {
            /* renamed from: e */
            public boolean mo35886e() {
                return false;
            }
        },
        MESSAGE(C10479c.MESSAGE, 2) {
            /* renamed from: e */
            public boolean mo35886e() {
                return false;
            }
        },
        BYTES(C10479c.BYTE_STRING, 2) {
            /* renamed from: e */
            public boolean mo35886e() {
                return false;
            }
        },
        UINT32(C10479c.INT, 0),
        ENUM(C10479c.ENUM, 0),
        SFIXED32(C10479c.INT, 5),
        SFIXED64(C10479c.LONG, 1),
        SINT32(C10479c.INT, 0),
        SINT64(C10479c.LONG, 0);
        

        /* renamed from: f */
        private final C10479c f28340f;

        /* renamed from: g */
        private final int f28341g;

        /* renamed from: a */
        public C10479c mo35884a() {
            return this.f28340f;
        }

        /* renamed from: d */
        public int mo35885d() {
            return this.f28341g;
        }

        /* renamed from: e */
        public boolean mo35886e() {
            return true;
        }

        private C10474b(C10479c cVar, int i) {
            this.f28340f = cVar;
            this.f28341g = i;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$c */
    /* compiled from: WireFormat */
    public enum C10479c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(false),
        STRING(""),
        BYTE_STRING(C10417d.f28215f),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: f */
        private final Object f28352f;

        private C10479c(Object obj) {
            this.f28352f = obj;
        }
    }

    static {
        m35489a(1, 3);
        m35489a(1, 4);
        m35489a(2, 0);
        m35489a(3, 2);
    }

    /* renamed from: a */
    public static int m35488a(int i) {
        return i >>> 3;
    }

    /* renamed from: a */
    static int m35489a(int i, int i2) {
        return (i << 3) | i2;
    }

    /* renamed from: b */
    static int m35490b(int i) {
        return i & 7;
    }
}
