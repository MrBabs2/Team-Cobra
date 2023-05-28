package kotlinx.coroutines.p396j2;

import kotlinx.coroutines.C12324y;
import kotlinx.coroutines.p393g2.C12231p;

/* renamed from: kotlinx.coroutines.j2.c */
/* compiled from: Dispatcher.kt */
public final class C12263c extends C12264d {

    /* renamed from: l */
    private static final C12324y f32062l;

    /* renamed from: m */
    public static final C12263c f32063m;

    static {
        C12263c cVar = new C12263c();
        f32063m = cVar;
        f32062l = cVar.mo38962a(C12233r.m40328a("kotlinx.coroutines.io.parallelism", C9150f.m29847a(64, C12231p.m40318a()), 0, 0, 12, (Object) null));
    }

    private C12263c() {
        super(0, 0, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    /* renamed from: m */
    public final C12324y mo38961m() {
        return f32062l;
    }

    public String toString() {
        return "DefaultDispatcher";
    }
}
