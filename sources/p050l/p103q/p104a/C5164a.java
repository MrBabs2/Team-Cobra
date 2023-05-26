package p050l.p103q.p104a;

/* renamed from: l.q.a.a */
/* compiled from: SimpleSQLiteQuery */
public final class C5164a implements C5172e {

    /* renamed from: f */
    private final String f9149f;

    /* renamed from: g */
    private final Object[] f9150g;

    public C5164a(String str, Object[] objArr) {
        this.f9149f = str;
        this.f9150g = objArr;
    }

    /* renamed from: a */
    public String mo4428a() {
        return this.f9149f;
    }

    /* renamed from: a */
    public void mo4430a(C5171d dVar) {
        m9591a(dVar, this.f9150g);
    }

    /* renamed from: a */
    public static void m9591a(C5171d dVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                m9590a(dVar, i, obj);
            }
        }
    }

    public C5164a(String str) {
        this(str, (Object[]) null);
    }

    /* renamed from: a */
    private static void m9590a(C5171d dVar, int i, Object obj) {
        if (obj == null) {
            dVar.bindNull(i);
        } else if (obj instanceof byte[]) {
            dVar.bindBlob(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            dVar.bindDouble(i, (double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            dVar.bindDouble(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            dVar.bindLong(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            dVar.bindLong(i, (long) ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            dVar.bindLong(i, (long) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            dVar.bindLong(i, (long) ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            dVar.bindString(i, (String) obj);
        } else if (obj instanceof Boolean) {
            dVar.bindLong(i, ((Boolean) obj).booleanValue() ? 1 : 0);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte," + " string");
        }
    }
}
