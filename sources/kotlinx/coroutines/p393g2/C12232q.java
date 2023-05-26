package kotlinx.coroutines.p393g2;

/* renamed from: kotlinx.coroutines.g2.q */
/* compiled from: SystemProps.kt */
final /* synthetic */ class C12232q {

    /* renamed from: a */
    private static final int f32005a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m40325a() {
        return f32005a;
    }

    /* renamed from: a */
    public static final String m40326a(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
