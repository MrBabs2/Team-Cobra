package com.airbnb.epoxy;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.preload.C5617a;
import com.airbnb.epoxy.preload.C5619b;
import com.airbnb.epoxy.preload.C5621c;
import com.airbnb.epoxy.preload.C5627h;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9117p;
import p112n.p267a.p268a.C10555c;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 `2\u00020\u0001:\u0005`abcdB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ~\u0010\u001c\u001a\u00020\u001d\"\f\b\u0000\u0010\u001e*\u0006\u0012\u0002\b\u00030\u001f\"\n\b\u0001\u0010 *\u0004\u0018\u00010!\"\b\b\u0002\u0010\"*\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00072 \u0010%\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060'j\u0002`(\u0012\u0004\u0012\u00020\u001d0&j\u0002`)2\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H\"0+2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002H\"0-J\u000e\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u00020\u001dH\u0016J\b\u00102\u001a\u00020\u001dH\u0002J\u0006\u00103\u001a\u00020\u001dJ\b\u00104\u001a\u00020\u001dH\u0002J\b\u00105\u001a\u000206H\u0014J\b\u00107\u001a\u000208H\u0014J\u0012\u00109\u001a\u00020\u00072\b\b\u0001\u0010:\u001a\u00020\u0007H\u0005J\b\u0010;\u001a\u00020\u001dH\u0015J\b\u0010<\u001a\u00020\u001dH\u0002J\b\u0010=\u001a\u00020\u001dH\u0016J\b\u0010>\u001a\u00020\u001dH\u0016J\b\u0010?\u001a\u00020\u001dH\u0002J\b\u0010@\u001a\u00020\u001dH\u0016J\u0006\u0010A\u001a\u00020\u001dJ\u0012\u0010B\u001a\u00020\u00072\b\b\u0001\u0010C\u001a\u00020\u0007H\u0005J\u0016\u0010D\u001a\u00020\u001d2\f\u0010E\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017H\u0016J\u000e\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u000bJ\u000e\u0010H\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u000bJ\u000e\u0010I\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010J\u001a\u00020\u001d2\b\b\u0001\u0010:\u001a\u00020\u0007J\u0010\u0010K\u001a\u00020\u001d2\b\b\u0001\u0010L\u001a\u00020\u0007J\u0010\u0010M\u001a\u00020\u001d2\b\b\u0001\u0010C\u001a\u00020\u0007J\u0012\u0010N\u001a\u00020\u001d2\b\u0010O\u001a\u0004\u0018\u000106H\u0016J\u0010\u0010P\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020RH\u0016J\u001a\u0010S\u001a\u00020\u001d2\u0010\u0010T\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0UH\u0016J\u000e\u0010V\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\rJ\b\u0010W\u001a\u00020\rH\u0016J\u001e\u0010X\u001a\u00020\u001d2\f\u0010E\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00172\u0006\u0010Y\u001a\u00020\rH\u0016J\b\u0010Z\u001a\u00020\u001dH\u0002J\b\u0010[\u001a\u00020\u001dH\u0002J\u001f\u0010\\\u001a\u00020\u001d2\u0017\u0010]\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001d0^¢\u0006\u0002\b_R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006e"}, mo16641d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "delayMsWhenRemovingAdapterOnDetach", "epoxyController", "Lcom/airbnb/epoxy/EpoxyController;", "isRemoveAdapterRunnablePosted", "", "preloadConfigs", "", "Lcom/airbnb/epoxy/EpoxyRecyclerView$PreloadConfig;", "preloadScrollListeners", "Lcom/airbnb/epoxy/preload/EpoxyPreloader;", "removeAdapterRunnable", "Ljava/lang/Runnable;", "removeAdapterWhenDetachedFromWindow", "removedAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "spacingDecorator", "Lcom/airbnb/epoxy/EpoxyItemSpacingDecorator;", "getSpacingDecorator", "()Lcom/airbnb/epoxy/EpoxyItemSpacingDecorator;", "addPreloader", "", "T", "Lcom/airbnb/epoxy/EpoxyModel;", "U", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "P", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "maxPreloadDistance", "errorHandler", "Lkotlin/Function2;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/airbnb/epoxy/preload/PreloadErrorHandler;", "preloader", "Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "requestHolderFactory", "Lkotlin/Function0;", "buildModelsWith", "callback", "Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;", "clear", "clearPoolIfActivityIsDestroyed", "clearPreloaders", "clearRemovedAdapterAndCancelRunnable", "createLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "createViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "dpToPx", "dp", "init", "initViewPool", "onAttachedToWindow", "onDetachedFromWindow", "removeAdapter", "requestLayout", "requestModelBuild", "resToPx", "itemSpacingRes", "setAdapter", "adapter", "setController", "controller", "setControllerAndBuildModels", "setDelayMsWhenRemovingAdapterOnDetach", "setItemSpacingDp", "setItemSpacingPx", "spacingPx", "setItemSpacingRes", "setLayoutManager", "layout", "setLayoutParams", "params", "Landroid/view/ViewGroup$LayoutParams;", "setModels", "models", "", "setRemoveAdapterWhenDetachedFromWindow", "shouldShareViewPoolAcrossContext", "swapAdapter", "removeAndRecycleExistingViews", "syncSpanCount", "updatePreloaders", "withModels", "buildModels", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Companion", "ModelBuilderCallback", "ModelBuilderCallbackController", "PreloadConfig", "WithModelsController", "epoxy-adapter_release"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: EpoxyRecyclerView.kt */
public class EpoxyRecyclerView extends RecyclerView {
    private static final C5566a ACTIVITY_RECYCLER_POOL = new C5566a();
    public static final C5559a Companion = new C5559a((DefaultConstructorMarker) null);
    private static final int DEFAULT_ADAPTER_REMOVAL_DELAY_MS = 2000;
    private int delayMsWhenRemovingAdapterOnDetach;
    private C5607n epoxyController;
    /* access modifiers changed from: private */
    public boolean isRemoveAdapterRunnablePosted;
    private final List<C5561c<?, ?, ?>> preloadConfigs;
    private final List<C5619b<?>> preloadScrollListeners;
    private final Runnable removeAdapterRunnable;
    private boolean removeAdapterWhenDetachedFromWindow;
    private RecyclerView.C0633g<?> removedAdapter;
    private final C5630r spacingDecorator;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo16641d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;", "Lcom/airbnb/epoxy/EpoxyController;", "()V", "callback", "Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;", "getCallback", "()Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;", "setCallback", "(Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;)V", "buildModels", "", "epoxy-adapter_release"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: EpoxyRecyclerView.kt */
    private static final class ModelBuilderCallbackController extends C5607n {
        private C5560b callback = new C5557a();

        /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$ModelBuilderCallbackController$a */
        /* compiled from: EpoxyRecyclerView.kt */
        public static final class C5557a implements C5560b {
            C5557a() {
            }

            /* renamed from: a */
            public void mo19080a(C5607n nVar) {
                C10202j.m34178b(nVar, "controller");
            }
        }

        /* access modifiers changed from: protected */
        public void buildModels() {
            this.callback.mo19080a(this);
        }

        public final C5560b getCallback() {
            return this.callback;
        }

        public final void setCallback(C5560b bVar) {
            C10202j.m34178b(bVar, "<set-?>");
            this.callback = bVar;
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0014R+\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, mo16641d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;", "Lcom/airbnb/epoxy/EpoxyController;", "()V", "callback", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "setCallback", "(Lkotlin/jvm/functions/Function1;)V", "buildModels", "epoxy-adapter_release"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: EpoxyRecyclerView.kt */
    private static final class WithModelsController extends C5607n {
        private C9113l<? super C5607n, C10483v> callback = C5558a.f9817f;

        /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$WithModelsController$a */
        /* compiled from: EpoxyRecyclerView.kt */
        static final class C5558a extends C10203k implements C9113l<C5607n, C10483v> {

            /* renamed from: f */
            public static final C5558a f9817f = new C5558a();

            C5558a() {
                super(1);
            }

            /* renamed from: a */
            public final void mo19083a(C5607n nVar) {
                C10202j.m34178b(nVar, "$receiver");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo19083a((C5607n) obj);
                return C10483v.f28357a;
            }
        }

        /* access modifiers changed from: protected */
        public void buildModels() {
            this.callback.invoke(this);
        }

        public final C9113l<C5607n, C10483v> getCallback() {
            return this.callback;
        }

        public final void setCallback(C9113l<? super C5607n, C10483v> lVar) {
            C10202j.m34178b(lVar, "<set-?>");
            this.callback = lVar;
        }
    }

    /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$a */
    /* compiled from: EpoxyRecyclerView.kt */
    public static final class C5559a {
        private C5559a() {
        }

        public /* synthetic */ C5559a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$b */
    /* compiled from: EpoxyRecyclerView.kt */
    public interface C5560b {
        /* renamed from: a */
        void mo19080a(C5607n nVar);
    }

    /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$c */
    /* compiled from: EpoxyRecyclerView.kt */
    private static final class C5561c<T extends C5631s<?>, U extends C5627h, P extends C5621c> {

        /* renamed from: a */
        private final int f9818a;

        /* renamed from: b */
        private final C9117p<Context, RuntimeException, C10483v> f9819b;

        /* renamed from: c */
        private final C5617a<T, U, P> f9820c;

        /* renamed from: d */
        private final C9102a<P> f9821d;

        public C5561c(int i, C9117p<? super Context, ? super RuntimeException, C10483v> pVar, C5617a<T, U, P> aVar, C9102a<? extends P> aVar2) {
            C10202j.m34178b(pVar, "errorHandler");
            C10202j.m34178b(aVar, "preloader");
            C10202j.m34178b(aVar2, "requestHolderFactory");
            this.f9818a = i;
            this.f9819b = pVar;
            this.f9820c = aVar;
            this.f9821d = aVar2;
        }

        /* renamed from: a */
        public final C9117p<Context, RuntimeException, C10483v> mo19084a() {
            return this.f9819b;
        }

        /* renamed from: b */
        public final int mo19085b() {
            return this.f9818a;
        }

        /* renamed from: c */
        public final C5617a<T, U, P> mo19086c() {
            return this.f9820c;
        }

        /* renamed from: d */
        public final C9102a<P> mo19087d() {
            return this.f9821d;
        }
    }

    /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$d */
    /* compiled from: EpoxyRecyclerView.kt */
    static final class C5562d extends C10203k implements C9102a<RecyclerView.C0654u> {

        /* renamed from: f */
        final /* synthetic */ EpoxyRecyclerView f9822f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5562d(EpoxyRecyclerView epoxyRecyclerView) {
            super(0);
            this.f9822f = epoxyRecyclerView;
        }

        public final RecyclerView.C0654u invoke() {
            return this.f9822f.createViewPool();
        }
    }

    /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$e */
    /* compiled from: EpoxyRecyclerView.kt */
    static final class C5563e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ EpoxyRecyclerView f9823f;

        C5563e(EpoxyRecyclerView epoxyRecyclerView) {
            this.f9823f = epoxyRecyclerView;
        }

        public final void run() {
            if (this.f9823f.isRemoveAdapterRunnablePosted) {
                this.f9823f.isRemoveAdapterRunnablePosted = false;
                this.f9823f.removeAdapter();
            }
        }
    }

    public EpoxyRecyclerView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    public EpoxyRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EpoxyRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void addPreloader$default(EpoxyRecyclerView epoxyRecyclerView, int i, C9117p pVar, C5617a aVar, C9102a aVar2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 3;
            }
            epoxyRecyclerView.addPreloader(i, pVar, aVar, aVar2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPreloader");
    }

    private final void clearPoolIfActivityIsDestroyed() {
        if (C5568b.m10541a(getContext())) {
            getRecycledViewPool().mo3977b();
        }
    }

    private final void clearRemovedAdapterAndCancelRunnable() {
        this.removedAdapter = null;
        if (this.isRemoveAdapterRunnablePosted) {
            removeCallbacks(this.removeAdapterRunnable);
            this.isRemoveAdapterRunnablePosted = false;
        }
    }

    private final void initViewPool() {
        if (!shouldShareViewPoolAcrossContext()) {
            setRecycledViewPool(createViewPool());
            return;
        }
        C5566a aVar = ACTIVITY_RECYCLER_POOL;
        Context context = getContext();
        C10202j.m34174a((Object) context, "context");
        setRecycledViewPool(aVar.mo19113a(context, new C5562d(this)).mo15769c());
    }

    /* access modifiers changed from: private */
    public final void removeAdapter() {
        RecyclerView.C0633g<?> adapter = getAdapter();
        if (adapter != null) {
            swapAdapter((RecyclerView.C0633g<?>) null, true);
            this.removedAdapter = adapter;
        }
        clearPoolIfActivityIsDestroyed();
    }

    private final void syncSpanCount() {
        RecyclerView.C0644o layoutManager = getLayoutManager();
        C5607n nVar = this.epoxyController;
        if ((layoutManager instanceof GridLayoutManager) && nVar != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            if (nVar.getSpanCount() != gridLayoutManager.getSpanCount() || gridLayoutManager.getSpanSizeLookup() != nVar.getSpanSizeLookup()) {
                nVar.setSpanCount(gridLayoutManager.getSpanCount());
                gridLayoutManager.setSpanSizeLookup(nVar.getSpanSizeLookup());
            }
        }
    }

    private final void updatePreloaders() {
        C5619b<P> bVar;
        for (C5619b removeOnScrollListener : this.preloadScrollListeners) {
            removeOnScrollListener(removeOnScrollListener);
        }
        this.preloadScrollListeners.clear();
        RecyclerView.C0633g adapter = getAdapter();
        if (adapter != null) {
            C10202j.m34174a((Object) adapter, "adapter ?: return");
            for (C5561c cVar : this.preloadConfigs) {
                if (adapter instanceof C5603l) {
                    bVar = C5619b.f9901i.mo19290a((C5603l) adapter, cVar.mo19087d(), (C9117p<? super Context, ? super RuntimeException, C10483v>) cVar.mo19084a(), cVar.mo19085b(), C10527n.m35729a(cVar.mo19086c()));
                } else {
                    C5607n nVar = this.epoxyController;
                    bVar = nVar != null ? C5619b.f9901i.mo19291a(nVar, cVar.mo19087d(), (C9117p<? super Context, ? super RuntimeException, C10483v>) cVar.mo19084a(), cVar.mo19085b(), C10527n.m35729a(cVar.mo19086c())) : null;
                }
                if (bVar != null) {
                    this.preloadScrollListeners.add(bVar);
                    addOnScrollListener(bVar);
                }
            }
        }
    }

    public final <T extends C5631s<?>, U extends C5627h, P extends C5621c> void addPreloader(int i, C9117p<? super Context, ? super RuntimeException, C10483v> pVar, C5617a<T, U, P> aVar, C9102a<? extends P> aVar2) {
        C10202j.m34178b(pVar, "errorHandler");
        C10202j.m34178b(aVar, "preloader");
        C10202j.m34178b(aVar2, "requestHolderFactory");
        this.preloadConfigs.add(new C5561c(i, pVar, aVar, aVar2));
        updatePreloaders();
    }

    public final void buildModelsWith(C5560b bVar) {
        C10202j.m34178b(bVar, "callback");
        C5607n nVar = this.epoxyController;
        if (!(nVar instanceof ModelBuilderCallbackController)) {
            nVar = null;
        }
        ModelBuilderCallbackController modelBuilderCallbackController = (ModelBuilderCallbackController) nVar;
        if (modelBuilderCallbackController == null) {
            modelBuilderCallbackController = new ModelBuilderCallbackController();
            setController(modelBuilderCallbackController);
        }
        modelBuilderCallbackController.setCallback(bVar);
        modelBuilderCallbackController.requestModelBuild();
    }

    public void clear() {
        C5607n nVar = this.epoxyController;
        if (nVar != null) {
            nVar.cancelPendingModelBuild();
        }
        this.epoxyController = null;
        swapAdapter((RecyclerView.C0633g<?>) null, true);
    }

    public final void clearPreloaders() {
        this.preloadConfigs.clear();
        updatePreloaders();
    }

    /* access modifiers changed from: protected */
    public RecyclerView.C0644o createLayoutManager() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i = layoutParams.height;
        if (i != -1 && i != 0) {
            return new LinearLayoutManager(getContext(), 0, false);
        }
        int i2 = layoutParams.width;
        if (i2 == -1 || i2 == 0) {
            setHasFixedSize(true);
        }
        return new LinearLayoutManager(getContext());
    }

    /* access modifiers changed from: protected */
    public RecyclerView.C0654u createViewPool() {
        return new C5604l0();
    }

    /* access modifiers changed from: protected */
    public final int dpToPx(int i) {
        Resources resources = getResources();
        C10202j.m34174a((Object) resources, "resources");
        return (int) TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
    }

    /* access modifiers changed from: protected */
    public final C5630r getSpacingDecorator() {
        return this.spacingDecorator;
    }

    /* access modifiers changed from: protected */
    public void init() {
        setClipToPadding(false);
        initViewPool();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView.C0633g<?> gVar = this.removedAdapter;
        if (gVar != null) {
            swapAdapter(gVar, false);
        }
        clearRemovedAdapterAndCancelRunnable();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (C5619b a : this.preloadScrollListeners) {
            a.mo19289a();
        }
        if (this.removeAdapterWhenDetachedFromWindow) {
            int i = this.delayMsWhenRemovingAdapterOnDetach;
            if (i > 0) {
                this.isRemoveAdapterRunnablePosted = true;
                postDelayed(this.removeAdapterRunnable, (long) i);
            } else {
                removeAdapter();
            }
        }
        clearPoolIfActivityIsDestroyed();
    }

    public void requestLayout() {
        syncSpanCount();
        super.requestLayout();
    }

    public final void requestModelBuild() {
        C5607n nVar = this.epoxyController;
        if (nVar == null) {
            throw new IllegalStateException("A controller must be set before requesting a model build.");
        } else if (nVar instanceof SimpleEpoxyController) {
            throw new IllegalStateException("Models were set with #setModels, they can not be rebuilt.");
        } else if (nVar != null) {
            nVar.requestModelBuild();
        } else {
            C10202j.m34172a();
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final int resToPx(int i) {
        return getResources().getDimensionPixelOffset(i);
    }

    public void setAdapter(RecyclerView.C0633g<?> gVar) {
        super.setAdapter(gVar);
        clearRemovedAdapterAndCancelRunnable();
        updatePreloaders();
    }

    public final void setController(C5607n nVar) {
        C10202j.m34178b(nVar, "controller");
        this.epoxyController = nVar;
        setAdapter(nVar.getAdapter());
        syncSpanCount();
    }

    public final void setControllerAndBuildModels(C5607n nVar) {
        C10202j.m34178b(nVar, "controller");
        nVar.requestModelBuild();
        setController(nVar);
    }

    public final void setDelayMsWhenRemovingAdapterOnDetach(int i) {
        this.delayMsWhenRemovingAdapterOnDetach = i;
    }

    public final void setItemSpacingDp(int i) {
        setItemSpacingPx(dpToPx(i));
    }

    public final void setItemSpacingPx(int i) {
        removeItemDecoration(this.spacingDecorator);
        this.spacingDecorator.mo19301a(i);
        if (i > 0) {
            addItemDecoration(this.spacingDecorator);
        }
    }

    public final void setItemSpacingRes(int i) {
        setItemSpacingPx(resToPx(i));
    }

    public void setLayoutManager(RecyclerView.C0644o oVar) {
        super.setLayoutManager(oVar);
        syncSpanCount();
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C10202j.m34178b(layoutParams, "params");
        boolean z = getLayoutParams() == null;
        super.setLayoutParams(layoutParams);
        if (z && getLayoutManager() == null) {
            setLayoutManager(createLayoutManager());
        }
    }

    public void setModels(List<? extends C5631s<?>> list) {
        C10202j.m34178b(list, "models");
        C5607n nVar = this.epoxyController;
        if (!(nVar instanceof SimpleEpoxyController)) {
            nVar = null;
        }
        SimpleEpoxyController simpleEpoxyController = (SimpleEpoxyController) nVar;
        if (simpleEpoxyController == null) {
            simpleEpoxyController = new SimpleEpoxyController();
            setController(simpleEpoxyController);
        }
        simpleEpoxyController.setModels(list);
    }

    public final void setRemoveAdapterWhenDetachedFromWindow(boolean z) {
        this.removeAdapterWhenDetachedFromWindow = z;
    }

    public boolean shouldShareViewPoolAcrossContext() {
        return true;
    }

    public void swapAdapter(RecyclerView.C0633g<?> gVar, boolean z) {
        super.swapAdapter(gVar, z);
        clearRemovedAdapterAndCancelRunnable();
        updatePreloaders();
    }

    public final void withModels(C9113l<? super C5607n, C10483v> lVar) {
        C10202j.m34178b(lVar, "buildModels");
        C5607n nVar = this.epoxyController;
        if (!(nVar instanceof WithModelsController)) {
            nVar = null;
        }
        WithModelsController withModelsController = (WithModelsController) nVar;
        if (withModelsController == null) {
            withModelsController = new WithModelsController();
            setController(withModelsController);
        }
        withModelsController.setCallback(lVar);
        withModelsController.requestModelBuild();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EpoxyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10202j.m34178b(context, "context");
        this.spacingDecorator = new C5630r();
        this.removeAdapterWhenDetachedFromWindow = true;
        this.delayMsWhenRemovingAdapterOnDetach = DEFAULT_ADAPTER_REMOVAL_DELAY_MS;
        this.removeAdapterRunnable = new C5563e(this);
        this.preloadScrollListeners = new ArrayList();
        this.preloadConfigs = new ArrayList();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10555c.EpoxyRecyclerView, i, 0);
            setItemSpacingPx(obtainStyledAttributes.getDimensionPixelSize(C10555c.EpoxyRecyclerView_itemSpacing, 0));
            obtainStyledAttributes.recycle();
        }
        init();
    }
}
