package com.airbnb.epoxy.preload;

import android.view.View;
import com.airbnb.epoxy.C5631s;
import com.airbnb.epoxy.preload.C5621c;
import com.airbnb.epoxy.preload.C5627h;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u001f*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\n\b\u0001\u0010\u0003*\u0004\u0018\u00010\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007:\u0001\u001fB!\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\u0015\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\u0014H&¢\u0006\u0002\u0010\u0015J+\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH&¢\u0006\u0002\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, mo16641d2 = {"Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "T", "Lcom/airbnb/epoxy/EpoxyModel;", "U", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "P", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "", "modelType", "Ljava/lang/Class;", "preloadableViewIds", "", "", "(Ljava/lang/Class;Ljava/util/List;)V", "getModelType", "()Ljava/lang/Class;", "getPreloadableViewIds", "()Ljava/util/List;", "buildViewMetadata", "view", "Landroid/view/View;", "(Landroid/view/View;)Lcom/airbnb/epoxy/preload/ViewMetadata;", "startPreload", "", "epoxyModel", "preloadTarget", "viewData", "Lcom/airbnb/epoxy/preload/ViewData;", "(Lcom/airbnb/epoxy/EpoxyModel;Lcom/airbnb/epoxy/preload/PreloadRequestHolder;Lcom/airbnb/epoxy/preload/ViewData;)V", "viewSignature", "(Lcom/airbnb/epoxy/EpoxyModel;)Ljava/lang/Object;", "Companion", "epoxy-adapter_release"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: com.airbnb.epoxy.preload.a */
/* compiled from: EpoxyModelPreloader.kt */
public abstract class C5617a<T extends C5631s<?>, U extends C5627h, P extends C5621c> {

    /* renamed from: a */
    private final Class<T> f9899a;

    /* renamed from: b */
    private final List<Integer> f9900b;

    /* renamed from: com.airbnb.epoxy.preload.a$a */
    /* compiled from: EpoxyModelPreloader.kt */
    public static final class C5618a {
        private C5618a() {
        }

        public /* synthetic */ C5618a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5618a((DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public abstract U mo19284a(View view);

    /* renamed from: a */
    public final Class<T> mo19285a() {
        return this.f9899a;
    }

    /* renamed from: a */
    public Object mo19286a(T t) {
        C10202j.m34178b(t, "epoxyModel");
        return null;
    }

    /* renamed from: a */
    public abstract void mo19287a(T t, P p, C5626g<? extends U> gVar);

    /* renamed from: b */
    public final List<Integer> mo19288b() {
        return this.f9900b;
    }
}
