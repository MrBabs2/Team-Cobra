package p015cm.aptoide.aptoideviews.common;

import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9102a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ\u0006\u0010\f\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/common/Debouncer;", "", "delayMs", "", "(J)V", "getDelayMs", "()J", "lastClickTime", "execute", "", "function", "Lkotlin/Function0;", "reset", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.common.Debouncer */
/* compiled from: Debouncer.kt */
public final class Debouncer {
    private final long delayMs;
    private long lastClickTime;

    public Debouncer(long j) {
        this.delayMs = j;
    }

    public final void execute(C9102a<C10483v> aVar) {
        C10202j.m34178b(aVar, "function");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastClickTime > this.delayMs) {
            this.lastClickTime = currentTimeMillis;
            aVar.invoke();
        }
    }

    public final long getDelayMs() {
        return this.delayMs;
    }

    public final void reset() {
        this.lastClickTime = System.currentTimeMillis();
    }
}
