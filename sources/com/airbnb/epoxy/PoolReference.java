package com.airbnb.epoxy;

import android.content.Context;
import androidx.lifecycle.C0514f;
import androidx.lifecycle.C0520i;
import androidx.lifecycle.C0531r;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo16641d2 = {"Lcom/airbnb/epoxy/PoolReference;", "Landroidx/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "parent", "Lcom/airbnb/epoxy/ActivityRecyclerPool;", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;Lcom/airbnb/epoxy/ActivityRecyclerPool;)V", "getContext", "()Landroid/content/Context;", "contextReference", "Ljava/lang/ref/WeakReference;", "getViewPool", "()Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "clearIfDestroyed", "", "onContextDestroyed", "epoxy-adapter_release"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: ActivityRecyclerPool.kt */
public final class PoolReference implements C0520i {

    /* renamed from: a */
    private final WeakReference<Context> f7991a;

    /* renamed from: b */
    private final RecyclerView.C0654u f7992b;

    /* renamed from: c */
    private final C5566a f7993c;

    public PoolReference(Context context, RecyclerView.C0654u uVar, C5566a aVar) {
        C10202j.m34178b(context, "context");
        C10202j.m34178b(uVar, "viewPool");
        C10202j.m34178b(aVar, "parent");
        this.f7992b = uVar;
        this.f7993c = aVar;
        this.f7991a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void mo15767a() {
        this.f7993c.mo19114a(this);
    }

    /* renamed from: b */
    public final Context mo15768b() {
        return (Context) this.f7991a.get();
    }

    /* renamed from: c */
    public final RecyclerView.C0654u mo15769c() {
        return this.f7992b;
    }

    @C0531r(C0514f.C0515a.ON_DESTROY)
    public final void onContextDestroyed() {
        mo15767a();
    }
}
