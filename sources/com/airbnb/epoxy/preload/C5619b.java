package com.airbnb.epoxy.preload;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.C5567a0;
import com.airbnb.epoxy.C5583d;
import com.airbnb.epoxy.C5603l;
import com.airbnb.epoxy.C5607n;
import com.airbnb.epoxy.C5631s;
import com.airbnb.epoxy.preload.C5621c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9117p;
import kotlin.p220g0.C9143a;
import kotlin.p220g0.C9146c;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 9*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u00019Be\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\tj\u0002`\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u001c\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\u00130\u0012¢\u0006\u0002\u0010\u0014Be\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\tj\u0002`\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u001c\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\u00130\u0012¢\u0006\u0002\u0010\u0017Be\b\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0018\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\tj\u0002`\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u001c\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\u00130\u0012¢\u0006\u0002\u0010\u001aJ \u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+H\u0002J\u0006\u0010,\u001a\u00020\rJ\u0018\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0010H\u0016J \u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020/2\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0010H\u0016J\u0010\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020\u0010H\u0002J\f\u00106\u001a\u00020\u0010*\u00020\u0010H\u0002J\f\u00107\u001a\u00020+*\u00020\u0010H\u0002J\f\u00108\u001a\u00020+*\u00020\u0010H\u0002R\u000e\u0010\u0015\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R6\u0010\u0011\u001a*\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030!0 \u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\u00130\u001fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, mo16641d2 = {"Lcom/airbnb/epoxy/preload/EpoxyPreloader;", "P", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "epoxyController", "Lcom/airbnb/epoxy/EpoxyController;", "requestHolderFactory", "Lkotlin/Function0;", "errorHandler", "Lkotlin/Function2;", "Landroid/content/Context;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "Lcom/airbnb/epoxy/preload/PreloadErrorHandler;", "maxItemsToPreload", "", "modelPreloaders", "", "Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "(Lcom/airbnb/epoxy/EpoxyController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ILjava/util/List;)V", "adapter", "Lcom/airbnb/epoxy/EpoxyAdapter;", "(Lcom/airbnb/epoxy/EpoxyAdapter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ILjava/util/List;)V", "Lcom/airbnb/epoxy/BaseEpoxyAdapter;", "preloadTargetFactory", "(Lcom/airbnb/epoxy/BaseEpoxyAdapter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ILjava/util/List;)V", "lastPreloadRange", "Lkotlin/ranges/IntProgression;", "lastVisibleRange", "Lkotlin/ranges/IntRange;", "", "Ljava/lang/Class;", "Lcom/airbnb/epoxy/EpoxyModel;", "Lcom/airbnb/epoxy/preload/PreloadTargetProvider;", "scrollState", "totalItemCount", "viewDataCache", "Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider;", "calculatePreloadRange", "firstVisiblePosition", "lastVisiblePosition", "isIncreasing", "", "cancelPreloadRequests", "onScrollStateChanged", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "onScrolled", "dx", "dy", "preloadAdapterPosition", "position", "clampToAdapterRange", "isFling", "isInvalid", "Companion", "epoxy-adapter_release"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: com.airbnb.epoxy.preload.b */
/* compiled from: EpoxyPreloader.kt */
public final class C5619b<P extends C5621c> extends RecyclerView.C0653t {

    /* renamed from: i */
    public static final C5620a f9901i = new C5620a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private C9146c f9902a;

    /* renamed from: b */
    private C9143a f9903b;

    /* renamed from: c */
    private int f9904c;

    /* renamed from: d */
    private final Map<Class<? extends C5631s<?>>, C5617a<?, ?, ? extends P>> f9905d;

    /* renamed from: e */
    private final C5622d<P> f9906e;

    /* renamed from: f */
    private final C5624f f9907f;

    /* renamed from: g */
    private final C5583d f9908g;

    /* renamed from: h */
    private final int f9909h;

    /* renamed from: com.airbnb.epoxy.preload.b$a */
    /* compiled from: EpoxyPreloader.kt */
    public static final class C5620a {
        private C5620a() {
        }

        /* renamed from: a */
        public final <P extends C5621c> C5619b<P> mo19291a(C5607n nVar, C9102a<? extends P> aVar, C9117p<? super Context, ? super RuntimeException, C10483v> pVar, int i, List<? extends C5617a<? extends C5631s<?>, ? extends C5627h, ? extends P>> list) {
            C10202j.m34178b(nVar, "epoxyController");
            C10202j.m34178b(aVar, "requestHolderFactory");
            C10202j.m34178b(pVar, "errorHandler");
            C10202j.m34178b(list, "modelPreloaders");
            return new C5619b(nVar, aVar, pVar, i, list);
        }

        public /* synthetic */ C5620a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <P extends C5621c> C5619b<P> mo19290a(C5603l lVar, C9102a<? extends P> aVar, C9117p<? super Context, ? super RuntimeException, C10483v> pVar, int i, List<? extends C5617a<? extends C5631s<?>, ? extends C5627h, ? extends P>> list) {
            C10202j.m34178b(lVar, "epoxyAdapter");
            C10202j.m34178b(aVar, "requestHolderFactory");
            C10202j.m34178b(pVar, "errorHandler");
            C10202j.m34178b(list, "modelPreloaders");
            return new C5619b(lVar, aVar, pVar, i, list);
        }
    }

    private C5619b(C5583d dVar, C9102a<? extends P> aVar, C9117p<? super Context, ? super RuntimeException, C10483v> pVar, int i, List<? extends C5617a<?, ?, ? extends P>> list) {
        this.f9908g = dVar;
        this.f9909h = i;
        this.f9902a = C9146c.f25689k.mo33497a();
        this.f9903b = C9146c.f25689k.mo33497a();
        this.f9904c = -1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C9150f.m29847a(C10515i0.m35582a(C10531p.m35750a(list, 10)), 16));
        for (T next : list) {
            linkedHashMap.put(((C5617a) next).mo19285a(), next);
        }
        this.f9905d = linkedHashMap;
        this.f9906e = new C5622d<>(this.f9909h, aVar);
        this.f9907f = new C5624f(this.f9908g, pVar);
        if (!(this.f9909h > 0)) {
            throw new IllegalArgumentException(("maxItemsToPreload must be greater than 0. Was " + this.f9909h).toString());
        }
    }

    /* renamed from: a */
    private final C9143a m10687a(int i, int i2, boolean z) {
        int i3 = 1;
        int i4 = z ? i2 + 1 : i - 1;
        int i5 = this.f9909h;
        int i6 = (z ? i5 - 1 : 1 - i5) + i4;
        C9143a.C9144a aVar = C9143a.f25680i;
        int a = m10686a(i4);
        int a2 = m10686a(i6);
        if (!z) {
            i3 = -1;
        }
        return aVar.mo33491a(a, a2, i3);
    }

    /* renamed from: b */
    private final boolean m10688b(int i) {
        return Math.abs(i) > 75;
    }

    /* renamed from: c */
    private final boolean m10689c(int i) {
        return i == -1 || i >= this.f9904c;
    }

    /* renamed from: d */
    private final void m10690d(int i) {
        C5631s<?> a = C5567a0.m10539a(this.f9908g, i);
        C5617a<?, ?, ? extends P> aVar = null;
        if (!(a instanceof C5631s)) {
            a = null;
        }
        if (a != null) {
            C5617a<?, ?, ? extends P> aVar2 = this.f9905d.get(a.getClass());
            if (aVar2 instanceof C5617a) {
                aVar = aVar2;
            }
            C5617a aVar3 = aVar;
            if (aVar3 != null) {
                for (C5626g a2 : this.f9907f.mo19296a(aVar3, a, i)) {
                    aVar3.mo19287a(a, this.f9906e.mo19294b(), a2);
                }
            }
        }
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C10202j.m34178b(recyclerView, "recyclerView");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C10202j.m34178b(recyclerView, "recyclerView");
        if (!(i == 0 && i2 == 0) && !m10688b(i) && !m10688b(i2)) {
            RecyclerView.C0633g adapter = recyclerView.getAdapter();
            boolean z = false;
            this.f9904c = adapter != null ? adapter.getItemCount() : 0;
            RecyclerView.C0644o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (m10689c(findFirstVisibleItemPosition) || m10689c(findLastVisibleItemPosition)) {
                    this.f9902a = C9146c.f25689k.mo33497a();
                    this.f9903b = C9146c.f25689k.mo33497a();
                    return;
                }
                C9146c cVar = new C9146c(findFirstVisibleItemPosition, findLastVisibleItemPosition);
                if (!C10202j.m34176a((Object) cVar, (Object) this.f9902a)) {
                    if (cVar.getFirst() > this.f9902a.getFirst() || cVar.getLast() > this.f9902a.getLast()) {
                        z = true;
                    }
                    C9143a a = m10687a(findFirstVisibleItemPosition, findLastVisibleItemPosition, z);
                    for (Number intValue : C10539w.m35791c(a, this.f9903b)) {
                        m10690d(intValue.intValue());
                    }
                    this.f9902a = cVar;
                    this.f9903b = a;
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
    }

    /* renamed from: a */
    private final int m10686a(int i) {
        return Math.min(this.f9904c - 1, Math.max(i, 0));
    }

    /* renamed from: a */
    public final void mo19289a() {
        this.f9906e.mo19293a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5619b(com.airbnb.epoxy.C5607n r8, kotlin.p215c0.p216c.C9102a<? extends P> r9, kotlin.p215c0.p216c.C9117p<? super android.content.Context, ? super java.lang.RuntimeException, kotlin.C10483v> r10, int r11, java.util.List<? extends com.airbnb.epoxy.preload.C5617a<?, ?, ? extends P>> r12) {
        /*
            r7 = this;
            java.lang.String r0 = "epoxyController"
            kotlin.jvm.internal.C10202j.m34178b(r8, r0)
            java.lang.String r0 = "requestHolderFactory"
            kotlin.jvm.internal.C10202j.m34178b(r9, r0)
            java.lang.String r0 = "errorHandler"
            kotlin.jvm.internal.C10202j.m34178b(r10, r0)
            java.lang.String r0 = "modelPreloaders"
            kotlin.jvm.internal.C10202j.m34178b(r12, r0)
            com.airbnb.epoxy.o r2 = r8.getAdapter()
            java.lang.String r8 = "epoxyController.adapter"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>((com.airbnb.epoxy.C5583d) r2, r3, (kotlin.p215c0.p216c.C9117p<? super android.content.Context, ? super java.lang.RuntimeException, kotlin.C10483v>) r4, (int) r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.preload.C5619b.<init>(com.airbnb.epoxy.n, kotlin.c0.c.a, kotlin.c0.c.p, int, java.util.List):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C5619b(C5603l lVar, C9102a<? extends P> aVar, C9117p<? super Context, ? super RuntimeException, C10483v> pVar, int i, List<? extends C5617a<?, ?, ? extends P>> list) {
        this((C5583d) lVar, aVar, pVar, i, list);
        C10202j.m34178b(lVar, "adapter");
        C10202j.m34178b(aVar, "requestHolderFactory");
        C10202j.m34178b(pVar, "errorHandler");
        C10202j.m34178b(list, "modelPreloaders");
    }
}
