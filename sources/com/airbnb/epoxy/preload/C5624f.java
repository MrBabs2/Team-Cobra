package com.airbnb.epoxy.preload;

import android.content.Context;
import android.view.View;
import com.airbnb.epoxy.C5567a0;
import com.airbnb.epoxy.C5583d;
import com.airbnb.epoxy.C5586e;
import com.airbnb.epoxy.C5631s;
import com.airbnb.epoxy.C5636u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10216x;
import kotlin.p215c0.p216c.C9117p;
import p050l.p075h.p084l.C5071v;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001.B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\n¢\u0006\u0002\u0010\u000bJA\u0010\u0015\u001a\u00020\u0010\"\f\b\u0000\u0010\u0016*\u0006\u0012\u0002\b\u00030\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u0002H\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u0002H\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010\u001dJe\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001f0\u00120\u0011\"\f\b\u0000\u0010\u0016*\u0006\u0012\u0002\b\u00030\u0017\"\n\b\u0001\u0010\u001f*\u0004\u0018\u00010 \"\b\b\u0002\u0010!*\u00020\"2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!0\u00192\u0006\u0010\u001a\u001a\u0002H\u00162\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010#Ji\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001f0\u0012\u0018\u00010\u0011\"\f\b\u0000\u0010\u0016*\u0006\u0012\u0002\b\u00030\u0017\"\n\b\u0001\u0010\u001f*\u0004\u0018\u00010 \"\b\b\u0002\u0010!*\u00020\"2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!0\u00192\u0006\u0010\u001a\u001a\u0002H\u00162\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010%J_\u0010&\u001a\n\u0012\u0004\u0012\u0002H\u001f\u0018\u00010\u0012\"\f\b\u0000\u0010\u0016*\u0006\u0012\u0002\b\u00030\u0017\"\n\b\u0001\u0010\u001f*\u0004\u0018\u00010 \"\b\b\u0002\u0010!*\u00020\"*\u00020'2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!0\u00192\u0006\u0010\u001a\u001a\u0002H\u0016H\u0002¢\u0006\u0002\u0010(J;\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u0011\"\f\b\u0000\u0010\u0016*\u0006\u0012\u0002\b\u00030\u0017*\u00020'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00112\u0006\u0010\u001a\u001a\u0002H\u0016H\u0002¢\u0006\u0002\u0010+J!\u0010,\u001a\b\u0012\u0004\u0012\u00020'0\u0011\"\b\b\u0000\u0010\u0016*\u00020'*\u0002H\u0016H\u0002¢\u0006\u0002\u0010-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0018\u00010\u00110\u000fX\u0004¢\u0006\u0002\n\u0000R+\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006/"}, mo16641d2 = {"Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider;", "", "adapter", "Lcom/airbnb/epoxy/BaseEpoxyAdapter;", "errorHandler", "Lkotlin/Function2;", "Landroid/content/Context;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "Lcom/airbnb/epoxy/preload/PreloadErrorHandler;", "(Lcom/airbnb/epoxy/BaseEpoxyAdapter;Lkotlin/jvm/functions/Function2;)V", "getAdapter", "()Lcom/airbnb/epoxy/BaseEpoxyAdapter;", "cache", "", "Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider$CacheKey;", "", "Lcom/airbnb/epoxy/preload/ViewData;", "getErrorHandler", "()Lkotlin/jvm/functions/Function2;", "cacheKey", "T", "Lcom/airbnb/epoxy/EpoxyModel;", "preloader", "Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "epoxyModel", "position", "", "(Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;Lcom/airbnb/epoxy/EpoxyModel;I)Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider$CacheKey;", "dataForModel", "U", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "P", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "(Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;Lcom/airbnb/epoxy/EpoxyModel;I)Ljava/util/List;", "findViewData", "(Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;Lcom/airbnb/epoxy/EpoxyModel;Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider$CacheKey;)Ljava/util/List;", "buildData", "Landroid/view/View;", "(Landroid/view/View;Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;Lcom/airbnb/epoxy/EpoxyModel;)Lcom/airbnb/epoxy/preload/ViewData;", "findViews", "viewIds", "(Landroid/view/View;Ljava/util/List;Lcom/airbnb/epoxy/EpoxyModel;)Ljava/util/List;", "recursePreloadableViews", "(Landroid/view/View;)Ljava/util/List;", "CacheKey", "epoxy-adapter_release"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: com.airbnb.epoxy.preload.f */
/* compiled from: PreloadableViewDataProvider.kt */
public final class C5624f {

    /* renamed from: a */
    private final Map<C5625a, List<C5626g<?>>> f9911a = new LinkedHashMap();

    /* renamed from: b */
    private final C5583d f9912b;

    /* renamed from: c */
    private final C9117p<Context, RuntimeException, C10483v> f9913c;

    /* renamed from: com.airbnb.epoxy.preload.f$a */
    /* compiled from: PreloadableViewDataProvider.kt */
    private static final class C5625a {

        /* renamed from: a */
        private final Class<? extends C5631s<?>> f9914a;

        /* renamed from: b */
        private final int f9915b;

        /* renamed from: c */
        private final int f9916c;

        /* renamed from: d */
        private final Object f9917d;

        public C5625a(Class<? extends C5631s<?>> cls, int i, int i2, Object obj) {
            C10202j.m34178b(cls, "epoxyModelClass");
            this.f9914a = cls;
            this.f9915b = i;
            this.f9916c = i2;
            this.f9917d = obj;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C5625a) {
                    C5625a aVar = (C5625a) obj;
                    if (C10202j.m34176a((Object) this.f9914a, (Object) aVar.f9914a)) {
                        if (this.f9915b == aVar.f9915b) {
                            if (!(this.f9916c == aVar.f9916c) || !C10202j.m34176a(this.f9917d, aVar.f9917d)) {
                                return false;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Class<? extends C5631s<?>> cls = this.f9914a;
            int i = 0;
            int hashCode = (((((cls != null ? cls.hashCode() : 0) * 31) + this.f9915b) * 31) + this.f9916c) * 31;
            Object obj = this.f9917d;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "CacheKey(epoxyModelClass=" + this.f9914a + ", spanSize=" + this.f9915b + ", viewType=" + this.f9916c + ", signature=" + this.f9917d + ")";
        }
    }

    public C5624f(C5583d dVar, C9117p<? super Context, ? super RuntimeException, C10483v> pVar) {
        C10202j.m34178b(dVar, "adapter");
        C10202j.m34178b(pVar, "errorHandler");
        this.f9912b = dVar;
        this.f9913c = pVar;
    }

    /* renamed from: b */
    private final <T extends C5631s<?>> C5625a m10701b(C5617a<T, ?, ?> aVar, T t, int i) {
        return new C5625a(t.getClass(), this.f9912b.mo19205f() ? t.spanSize(this.f9912b.mo19202d(), i, this.f9912b.getItemCount()) : 1, C5567a0.m10537a((C5631s<?>) t), aVar.mo19286a(t));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.airbnb.epoxy.preload.a, java.lang.Object, com.airbnb.epoxy.preload.a<T, U, P>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends com.airbnb.epoxy.C5631s<?>, U extends com.airbnb.epoxy.preload.C5627h, P extends com.airbnb.epoxy.preload.C5621c> java.util.List<com.airbnb.epoxy.preload.C5626g<U>> mo19296a(com.airbnb.epoxy.preload.C5617a<T, U, P> r3, T r4, int r5) {
        /*
            r2 = this;
            java.lang.String r0 = "preloader"
            kotlin.jvm.internal.C10202j.m34178b(r3, r0)
            java.lang.String r0 = "epoxyModel"
            kotlin.jvm.internal.C10202j.m34178b(r4, r0)
            com.airbnb.epoxy.preload.f$a r5 = r2.m10701b(r3, r4, r5)
            java.util.Map<com.airbnb.epoxy.preload.f$a, java.util.List<com.airbnb.epoxy.preload.g<?>>> r0 = r2.f9911a
            java.lang.Object r1 = r0.get(r5)
            if (r1 != 0) goto L_0x001d
            java.util.List r1 = r2.m10700a(r3, r4, (com.airbnb.epoxy.preload.C5624f.C5625a) r5)
            r0.put(r5, r1)
        L_0x001d:
            boolean r3 = r1 instanceof java.util.List
            if (r3 != 0) goto L_0x0022
            r1 = 0
        L_0x0022:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0027
            return r1
        L_0x0027:
            java.util.List r3 = kotlin.p262y.C10529o.m35736a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.preload.C5624f.mo19296a(com.airbnb.epoxy.preload.a, com.airbnb.epoxy.s, int):java.util.List");
    }

    /* renamed from: a */
    private final <T extends C5631s<?>, U extends C5627h, P extends C5621c> List<C5626g<U>> m10700a(C5617a<T, U, P> aVar, T t, C5625a aVar2) {
        Object obj;
        View view;
        List<View> list;
        C5586e a = C5567a0.m10538a(this.f9912b);
        C10202j.m34174a((Object) a, "adapter.boundViewHoldersInternal()");
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C5636u uVar = (C5636u) obj;
            C10202j.m34174a((Object) uVar, "it");
            C5631s<?> a2 = uVar.mo19327a();
            boolean z = false;
            if (C10202j.m34176a((Object) C10216x.m34186a((Class) a2.getClass()), (Object) C10216x.m34186a((Class) t.getClass())) && C5071v.m9139D(uVar.itemView) && C5071v.m9140E(uVar.itemView)) {
                if (a2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type T");
                } else if (C10202j.m34176a((Object) m10701b(aVar, a2, uVar.getAdapterPosition()), (Object) aVar2)) {
                    z = true;
                    continue;
                } else {
                    continue;
                }
            }
            if (z) {
                break;
            }
        }
        C5636u uVar2 = (C5636u) obj;
        if (uVar2 == null || (view = uVar2.itemView) == null) {
            return null;
        }
        C10202j.m34174a((Object) view, "holderMatch?.itemView ?: return null");
        Object a3 = C5567a0.m10540a(uVar2);
        if (!aVar.mo19288b().isEmpty()) {
            list = m10699a(view, aVar.mo19288b(), t);
        } else if (view instanceof C5623e) {
            list = ((C5623e) view).mo19295a();
        } else if (a3 instanceof C5623e) {
            list = ((C5623e) a3).mo19295a();
        } else {
            list = C10529o.m35736a();
        }
        if (list.isEmpty()) {
            C9117p<Context, RuntimeException, C10483v> pVar = this.f9913c;
            Context context = view.getContext();
            C10202j.m34174a((Object) context, "rootView.context");
            pVar.invoke(context, new EpoxyPreloadException("No preloadable views were found in " + t.getClass().getSimpleName()));
        }
        ArrayList<View> arrayList = new ArrayList<>();
        for (View a4 : list) {
            boolean unused = C10536t.m35760a(arrayList, m10698a(a4));
        }
        ArrayList arrayList2 = new ArrayList();
        for (View a5 : arrayList) {
            C5626g<U> a6 = m10697a(a5, aVar, t);
            if (a6 != null) {
                arrayList2.add(a6);
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    private final <T extends View> List<View> m10698a(T t) {
        if (!(t instanceof C5623e)) {
            return C10527n.m35729a(t);
        }
        List<View> a = ((C5623e) t).mo19295a();
        ArrayList arrayList = new ArrayList();
        for (View a2 : a) {
            boolean unused = C10536t.m35760a(arrayList, m10698a(a2));
        }
        return arrayList;
    }

    /* renamed from: a */
    private final <T extends C5631s<?>, U extends C5627h, P extends C5621c> C5626g<U> m10697a(View view, C5617a<T, U, P> aVar, T t) {
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        if (width > 0 && height > 0) {
            return new C5626g<>(view.getId(), width, height, aVar.mo19284a(view));
        }
        C9117p<Context, RuntimeException, C10483v> pVar = this.f9913c;
        Context context = view.getContext();
        C10202j.m34174a((Object) context, "context");
        pVar.invoke(context, new EpoxyPreloadException(view.getClass().getSimpleName() + " in " + t.getClass().getSimpleName() + " has zero size. A size must be set to allow preloading."));
        return null;
    }

    /* renamed from: a */
    private final <T extends C5631s<?>> List<View> m10699a(View view, List<Integer> list, T t) {
        ArrayList arrayList = new ArrayList();
        for (Number intValue : list) {
            int intValue2 = intValue.intValue();
            View findViewById = view.findViewById(intValue2);
            if (findViewById == null) {
                C9117p<Context, RuntimeException, C10483v> pVar = this.f9913c;
                Context context = view.getContext();
                C10202j.m34174a((Object) context, "context");
                pVar.invoke(context, new EpoxyPreloadException("View with id " + intValue2 + " in " + t.getClass().getSimpleName() + " could not be found."));
            }
            if (findViewById != null) {
                arrayList.add(findViewById);
            }
        }
        return arrayList;
    }
}
