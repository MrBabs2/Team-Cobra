package kotlinx.coroutines.p396j2;

import java.util.concurrent.RejectedExecutionException;
import kotlin.p042a0.C9069g;
import kotlinx.coroutines.C12186c1;
import kotlinx.coroutines.C12276k0;
import kotlinx.coroutines.C12324y;

/* renamed from: kotlinx.coroutines.j2.d */
/* compiled from: Dispatcher.kt */
public class C12264d extends C12186c1 {

    /* renamed from: g */
    private C12258a f32064g;

    /* renamed from: h */
    private final int f32065h;

    /* renamed from: i */
    private final int f32066i;

    /* renamed from: j */
    private final long f32067j;

    /* renamed from: k */
    private final String f32068k;

    public C12264d(int i, int i2, long j, String str) {
        this.f32065h = i;
        this.f32066i = i2;
        this.f32067j = j;
        this.f32068k = str;
        this.f32064g = mo38961m();
    }

    /* renamed from: m */
    private final C12258a mo38961m() {
        return new C12258a(this.f32065h, this.f32066i, this.f32067j, this.f32068k);
    }

    /* renamed from: a */
    public void mo38845a(C9069g gVar, Runnable runnable) {
        try {
            C12258a.m40415a(this.f32064g, runnable, (C12270j) null, false, 6, (Object) null);
        } catch (RejectedExecutionException unused) {
            C12276k0.f32092m.mo38845a(gVar, runnable);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12264d(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C12272l.f32081b : i, (i3 & 2) != 0 ? C12272l.f32082c : i2, (i3 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    /* renamed from: a */
    public final C12324y mo38962a(int i) {
        if (i > 0) {
            return new C12266f(this, i, 1);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i).toString());
    }

    /* renamed from: a */
    public final void mo38963a(Runnable runnable, C12270j jVar, boolean z) {
        try {
            this.f32064g.mo38943a(runnable, jVar, z);
        } catch (RejectedExecutionException unused) {
            C12276k0.f32092m.mo39050b(this.f32064g.mo38941a(runnable, jVar));
        }
    }

    public C12264d(int i, int i2, String str) {
        this(i, i2, C12272l.f32083d, str);
    }
}
