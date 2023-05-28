package com.airbnb.epoxy;

import android.os.Bundle;
import android.os.Handler;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.airbnb.epoxy.n */
/* compiled from: EpoxyController */
public abstract class C5607n {
    private static final int DELAY_TO_CHECK_ADAPTER_COUNT_MS = 3000;
    private static final C5602k0 NO_OP_TIMER = new C5585d0();
    public static Handler defaultDiffingHandler;
    public static Handler defaultModelBuildingHandler;
    private static boolean filterDuplicatesDefault = false;
    private static boolean globalDebugLoggingEnabled = false;
    private static C5611d globalExceptionHandler = new C5609b();
    /* access modifiers changed from: private */
    public final C5614o adapter;
    private final Runnable buildModelsRunnable;
    private C5616p debugObserver;
    private volatile boolean filterDuplicates;
    /* access modifiers changed from: private */
    public volatile boolean hasBuiltModelsEver;
    /* access modifiers changed from: private */
    public final C5590f helper;
    private final List<C5612e> interceptors;
    private final Handler modelBuildHandler;
    private List<C5613f> modelInterceptorCallbacks;
    /* access modifiers changed from: private */
    public C5594h modelsBeingBuilt;
    /* access modifiers changed from: private */
    public int recyclerViewAttachCount;
    private volatile int requestedModelBuildType;
    /* access modifiers changed from: private */
    public C5631s<?> stagedModel;
    /* access modifiers changed from: private */
    public volatile Thread threadBuildingModels;
    /* access modifiers changed from: private */
    public C5602k0 timer;

    /* renamed from: com.airbnb.epoxy.n$a */
    /* compiled from: EpoxyController */
    class C5608a implements Runnable {
        C5608a() {
        }

        public void run() {
            Thread unused = C5607n.this.threadBuildingModels = Thread.currentThread();
            C5607n.this.cancelPendingModelBuild();
            C5607n.this.helper.resetAutoModels();
            C5594h unused2 = C5607n.this.modelsBeingBuilt = new C5594h(C5607n.this.getExpectedModelCount());
            C5607n.this.timer.mo19207a("Models built");
            try {
                C5607n.this.buildModels();
                C5607n.this.addCurrentlyStagedModelIfExists();
                C5607n.this.timer.stop();
                C5607n.this.runInterceptors();
                C5607n nVar = C5607n.this;
                nVar.filterDuplicatesIfNeeded(nVar.modelsBeingBuilt);
                C5607n.this.modelsBeingBuilt.mo19222f();
                C5607n.this.timer.mo19207a("Models diffed");
                C5607n.this.adapter.mo19277a(C5607n.this.modelsBeingBuilt);
                C5607n.this.timer.stop();
                C5594h unused3 = C5607n.this.modelsBeingBuilt = null;
                boolean unused4 = C5607n.this.hasBuiltModelsEver = true;
                Thread unused5 = C5607n.this.threadBuildingModels = null;
            } catch (Throwable th) {
                C5607n.this.timer.stop();
                C5594h unused6 = C5607n.this.modelsBeingBuilt = null;
                boolean unused7 = C5607n.this.hasBuiltModelsEver = true;
                Thread unused8 = C5607n.this.threadBuildingModels = null;
                C5631s unused9 = C5607n.this.stagedModel = null;
                throw th;
            }
        }
    }

    /* renamed from: com.airbnb.epoxy.n$b */
    /* compiled from: EpoxyController */
    static class C5609b implements C5611d {
        C5609b() {
        }

        /* renamed from: a */
        public void mo19269a(C5607n nVar, RuntimeException runtimeException) {
        }
    }

    /* renamed from: com.airbnb.epoxy.n$c */
    /* compiled from: EpoxyController */
    class C5610c implements Runnable {
        C5610c() {
        }

        public void run() {
            if (C5607n.this.recyclerViewAttachCount > 1) {
                C5607n.this.onExceptionSwallowed(new IllegalStateException("This EpoxyController had its adapter added to more than one ReyclerView. Epoxy does not support attaching an adapter to multiple RecyclerViews because saved state will not work properly. If you did not intend to attach your adapter to multiple RecyclerViews you may be leaking a reference to a previous RecyclerView. Make sure to remove the adapter from any previous RecyclerViews (eg if the adapter is reused in a Fragment across multiple onCreateView/onDestroyView cycles). See https://github.com/airbnb/epoxy/wiki/Avoiding-Memory-Leaks for more information."));
            }
        }
    }

    /* renamed from: com.airbnb.epoxy.n$d */
    /* compiled from: EpoxyController */
    public interface C5611d {
        /* renamed from: a */
        void mo19269a(C5607n nVar, RuntimeException runtimeException);
    }

    /* renamed from: com.airbnb.epoxy.n$e */
    /* compiled from: EpoxyController */
    public interface C5612e {
        /* renamed from: a */
        void mo19271a(List<C5631s<?>> list);
    }

    /* renamed from: com.airbnb.epoxy.n$f */
    /* compiled from: EpoxyController */
    interface C5613f {
        /* renamed from: a */
        void mo19272a(C5607n nVar);

        /* renamed from: b */
        void mo19273b(C5607n nVar);
    }

    static {
        Handler handler = C5569b0.f9825g.f9934f;
        defaultModelBuildingHandler = handler;
        defaultDiffingHandler = handler;
    }

    public C5607n() {
        this(defaultModelBuildingHandler, defaultDiffingHandler);
    }

    private void assertIsBuildingModels() {
        if (!isBuildingModels()) {
            throw new IllegalEpoxyUsage("Can only call this when inside the `buildModels` method");
        }
    }

    private void assertNotBuildingModels() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call this from inside `buildModels`");
        }
    }

    /* access modifiers changed from: private */
    public void filterDuplicatesIfNeeded(List<C5631s<?>> list) {
        if (this.filterDuplicates) {
            this.timer.mo19207a("Duplicates filtered");
            HashSet hashSet = new HashSet(list.size());
            ListIterator<C5631s<?>> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                C5631s next = listIterator.next();
                if (!hashSet.add(Long.valueOf(next.mo19311id()))) {
                    int previousIndex = listIterator.previousIndex();
                    listIterator.remove();
                    int findPositionOfDuplicate = findPositionOfDuplicate(list, next);
                    C5631s sVar = list.get(findPositionOfDuplicate);
                    if (previousIndex <= findPositionOfDuplicate) {
                        findPositionOfDuplicate++;
                    }
                    onExceptionSwallowed(new IllegalEpoxyUsage("Two models have the same ID. ID's must be unique!\nOriginal has position " + findPositionOfDuplicate + ":\n" + sVar + "\nDuplicate has position " + previousIndex + ":\n" + next));
                }
            }
            this.timer.stop();
        }
    }

    private int findPositionOfDuplicate(List<C5631s<?>> list, C5631s<?> sVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).mo19311id() == sVar.mo19311id()) {
                return i;
            }
        }
        throw new IllegalArgumentException("No duplicates in list");
    }

    /* access modifiers changed from: private */
    public int getExpectedModelCount() {
        int itemCount = this.adapter.getItemCount();
        if (itemCount != 0) {
            return itemCount;
        }
        return 25;
    }

    /* access modifiers changed from: private */
    public void runInterceptors() {
        if (!this.interceptors.isEmpty()) {
            List<C5613f> list = this.modelInterceptorCallbacks;
            if (list != null) {
                for (C5613f a : list) {
                    a.mo19272a(this);
                }
            }
            this.timer.mo19207a("Interceptors executed");
            for (C5612e a2 : this.interceptors) {
                a2.mo19271a(this.modelsBeingBuilt);
            }
            this.timer.stop();
            List<C5613f> list2 = this.modelInterceptorCallbacks;
            if (list2 != null) {
                for (C5613f b : list2) {
                    b.mo19273b(this);
                }
            }
        }
        this.modelInterceptorCallbacks = null;
    }

    public static void setGlobalDebugLoggingEnabled(boolean z) {
        globalDebugLoggingEnabled = z;
    }

    public static void setGlobalDuplicateFilteringDefault(boolean z) {
        filterDuplicatesDefault = z;
    }

    public static void setGlobalExceptionHandler(C5611d dVar) {
        globalExceptionHandler = dVar;
    }

    /* access modifiers changed from: protected */
    public void add(C5631s<?> sVar) {
        sVar.addTo(this);
    }

    /* access modifiers changed from: package-private */
    public void addAfterInterceptorCallback(C5613f fVar) {
        assertIsBuildingModels();
        if (this.modelInterceptorCallbacks == null) {
            this.modelInterceptorCallbacks = new ArrayList();
        }
        this.modelInterceptorCallbacks.add(fVar);
    }

    /* access modifiers changed from: package-private */
    public void addCurrentlyStagedModelIfExists() {
        C5631s<?> sVar = this.stagedModel;
        if (sVar != null) {
            sVar.addTo(this);
        }
        this.stagedModel = null;
    }

    public void addInterceptor(C5612e eVar) {
        this.interceptors.add(eVar);
    }

    /* access modifiers changed from: package-private */
    public void addInternal(C5631s<?> sVar) {
        assertIsBuildingModels();
        if (sVar.hasDefaultId()) {
            throw new IllegalEpoxyUsage("You must set an id on a model before adding it. Use the @AutoModel annotation if you want an id to be automatically generated for you.");
        } else if (sVar.isShown()) {
            clearModelFromStaging(sVar);
            sVar.controllerToStageTo = null;
            this.modelsBeingBuilt.add(sVar);
        } else {
            throw new IllegalEpoxyUsage("You cannot hide a model in an EpoxyController. Use `addIf` to conditionally add a model instead.");
        }
    }

    public void addModelBuildListener(C5593g0 g0Var) {
        this.adapter.mo19276a(g0Var);
    }

    /* access modifiers changed from: protected */
    public abstract void buildModels();

    public synchronized void cancelPendingModelBuild() {
        if (this.requestedModelBuildType != 0) {
            this.requestedModelBuildType = 0;
            this.modelBuildHandler.removeCallbacks(this.buildModelsRunnable);
        }
    }

    /* access modifiers changed from: package-private */
    public void clearModelFromStaging(C5631s<?> sVar) {
        if (this.stagedModel != sVar) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = null;
    }

    public C5614o getAdapter() {
        return this.adapter;
    }

    /* access modifiers changed from: package-private */
    public int getFirstIndexOfModelInBuildingList(C5631s<?> sVar) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        for (int i = 0; i < size; i++) {
            if (this.modelsBeingBuilt.get(i) == sVar) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getModelCountBuiltSoFar() {
        assertIsBuildingModels();
        return this.modelsBeingBuilt.size();
    }

    public int getSpanCount() {
        return this.adapter.mo19202d();
    }

    public GridLayoutManager.C0618c getSpanSizeLookup() {
        return this.adapter.mo19204e();
    }

    public boolean hasPendingModelBuild() {
        return (this.requestedModelBuildType == 0 && this.threadBuildingModels == null && !this.adapter.mo19280h()) ? false : true;
    }

    /* access modifiers changed from: protected */
    public boolean isBuildingModels() {
        return this.threadBuildingModels == Thread.currentThread();
    }

    public boolean isDebugLoggingEnabled() {
        return this.timer != NO_OP_TIMER;
    }

    public boolean isDuplicateFilteringEnabled() {
        return this.filterDuplicates;
    }

    /* access modifiers changed from: package-private */
    public boolean isModelAddedMultipleTimes(C5631s<?> sVar) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.modelsBeingBuilt.get(i2) == sVar) {
                i++;
            }
        }
        if (i > 1) {
            return true;
        }
        return false;
    }

    public boolean isMultiSpan() {
        return this.adapter.mo19205f();
    }

    public void moveModel(int i, int i2) {
        assertNotBuildingModels();
        this.adapter.mo19275a(i, i2);
        requestDelayedModelBuild(500);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    /* access modifiers changed from: package-private */
    public void onAttachedToRecyclerViewInternal(RecyclerView recyclerView) {
        int i = this.recyclerViewAttachCount + 1;
        this.recyclerViewAttachCount = i;
        if (i > 1) {
            C5569b0.f9825g.f9934f.postDelayed(new C5610c(), 3000);
        }
        onAttachedToRecyclerView(recyclerView);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    /* access modifiers changed from: package-private */
    public void onDetachedFromRecyclerViewInternal(RecyclerView recyclerView) {
        this.recyclerViewAttachCount--;
        onDetachedFromRecyclerView(recyclerView);
    }

    /* access modifiers changed from: protected */
    public void onExceptionSwallowed(RuntimeException runtimeException) {
        globalExceptionHandler.mo19269a(this, runtimeException);
    }

    /* access modifiers changed from: protected */
    public void onModelBound(C5636u uVar, C5631s<?> sVar, int i, C5631s<?> sVar2) {
    }

    /* access modifiers changed from: protected */
    public void onModelUnbound(C5636u uVar, C5631s<?> sVar) {
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.adapter.mo19187a(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.adapter.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onViewAttachedToWindow(C5636u uVar, C5631s<?> sVar) {
    }

    /* access modifiers changed from: protected */
    public void onViewDetachedFromWindow(C5636u uVar, C5631s<?> sVar) {
    }

    public void removeInterceptor(C5612e eVar) {
        this.interceptors.remove(eVar);
    }

    public void removeModelBuildListener(C5593g0 g0Var) {
        this.adapter.mo19278b(g0Var);
    }

    public synchronized void requestDelayedModelBuild(int i) {
        if (!isBuildingModels()) {
            int i2 = 1;
            if (this.requestedModelBuildType == 2) {
                cancelPendingModelBuild();
            } else if (this.requestedModelBuildType == 1) {
                return;
            }
            if (i != 0) {
                i2 = 2;
            }
            this.requestedModelBuildType = i2;
            this.modelBuildHandler.postDelayed(this.buildModelsRunnable, (long) i);
            return;
        }
        throw new IllegalEpoxyUsage("Cannot call `requestDelayedModelBuild` from inside `buildModels`");
    }

    public void requestModelBuild() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call `requestModelBuild` from inside `buildModels`");
        } else if (this.hasBuiltModelsEver) {
            requestDelayedModelBuild(0);
        } else {
            this.buildModelsRunnable.run();
        }
    }

    public void setDebugLoggingEnabled(boolean z) {
        assertNotBuildingModels();
        if (z) {
            this.timer = new C5597i(getClass().getSimpleName());
            if (this.debugObserver == null) {
                this.debugObserver = new C5616p(getClass().getSimpleName());
            }
            this.adapter.registerAdapterDataObserver(this.debugObserver);
            return;
        }
        this.timer = NO_OP_TIMER;
        C5616p pVar = this.debugObserver;
        if (pVar != null) {
            this.adapter.unregisterAdapterDataObserver(pVar);
        }
    }

    public void setFilterDuplicates(boolean z) {
        this.filterDuplicates = z;
    }

    public void setSpanCount(int i) {
        this.adapter.mo19198b(i);
    }

    /* access modifiers changed from: package-private */
    public void setStagedModel(C5631s<?> sVar) {
        if (sVar != this.stagedModel) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = sVar;
    }

    public C5607n(Handler handler, Handler handler2) {
        this.recyclerViewAttachCount = 0;
        this.interceptors = new CopyOnWriteArrayList();
        this.filterDuplicates = filterDuplicatesDefault;
        this.threadBuildingModels = null;
        this.timer = NO_OP_TIMER;
        this.helper = C5592g.m10623a(this);
        this.requestedModelBuildType = 0;
        this.buildModelsRunnable = new C5608a();
        this.adapter = new C5614o(this, handler2);
        this.modelBuildHandler = handler;
        setDebugLoggingEnabled(globalDebugLoggingEnabled);
    }

    /* access modifiers changed from: protected */
    public void add(C5631s<?>... sVarArr) {
        C5594h hVar = this.modelsBeingBuilt;
        hVar.ensureCapacity(hVar.size() + sVarArr.length);
        for (C5631s<?> addTo : sVarArr) {
            addTo.addTo(this);
        }
    }

    /* access modifiers changed from: protected */
    public void add(List<? extends C5631s<?>> list) {
        C5594h hVar = this.modelsBeingBuilt;
        hVar.ensureCapacity(hVar.size() + list.size());
        for (C5631s addTo : list) {
            addTo.addTo(this);
        }
    }
}
