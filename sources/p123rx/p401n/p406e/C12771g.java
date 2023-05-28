package p123rx.p401n.p406e;

/* renamed from: rx.n.e.g */
/* compiled from: PlatformDependent */
public final class C12771g {

    /* renamed from: a */
    private static final int f32955a;

    /* renamed from: b */
    private static final boolean f32956b;

    static {
        int c = m41266c();
        f32955a = c;
        f32956b = c != 0;
    }

    /* renamed from: a */
    public static int m41264a() {
        return f32955a;
    }

    /* renamed from: b */
    public static boolean m41265b() {
        return f32956b;
    }

    /* renamed from: c */
    private static int m41266c() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
