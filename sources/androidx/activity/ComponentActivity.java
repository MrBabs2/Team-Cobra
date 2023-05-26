package androidx.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.C0369f;
import androidx.lifecycle.C0514f;
import androidx.lifecycle.C0519h;
import androidx.lifecycle.C0521j;
import androidx.lifecycle.C0522k;
import androidx.lifecycle.C0537t;
import androidx.lifecycle.C0546x;
import androidx.lifecycle.C0547y;
import androidx.savedstate.C0789a;
import androidx.savedstate.C0790b;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends C0369f implements C0521j, C0547y, C0790b, C0055c {
    private int mContentLayoutId;
    private final C0522k mLifecycleRegistry;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final C0789a mSavedStateRegistryController;
    private C0546x mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0050a implements Runnable {
        C0050a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    static final class C0051b {

        /* renamed from: a */
        Object f86a;

        /* renamed from: b */
        C0546x f87b;

        C0051b() {
        }
    }

    public ComponentActivity() {
        this.mLifecycleRegistry = new C0522k(this);
        this.mSavedStateRegistryController = C0789a.m3563a((C0790b) this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new C0050a());
        if (getLifecycle() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                getLifecycle().mo3039a(new C0519h() {
                    /* renamed from: a */
                    public void mo136a(C0521j jVar, C0514f.C0515a aVar) {
                        if (aVar == C0514f.C0515a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            getLifecycle().mo3039a(new C0519h() {
                /* renamed from: a */
                public void mo136a(C0521j jVar, C0514f.C0515a aVar) {
                    if (aVar == C0514f.C0515a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().mo3098a();
                    }
                }
            });
            int i = Build.VERSION.SDK_INT;
            if (19 <= i && i <= 23) {
                getLifecycle().mo3039a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0051b bVar = (C0051b) getLastNonConfigurationInstance();
        if (bVar != null) {
            return bVar.f86a;
        }
        return null;
    }

    public C0514f getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo4477a();
    }

    public C0546x getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                C0051b bVar = (C0051b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.mViewModelStore = bVar.f87b;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new C0546x();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.mo139a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mSavedStateRegistryController.mo4478a(bundle);
        C0537t.m2618b((Activity) this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        C0051b bVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0546x xVar = this.mViewModelStore;
        if (xVar == null && (bVar = (C0051b) getLastNonConfigurationInstance()) != null) {
            xVar = bVar.f87b;
        }
        if (xVar == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0051b bVar2 = new C0051b();
        bVar2.f86a = onRetainCustomNonConfigurationInstance;
        bVar2.f87b = xVar;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C0514f lifecycle = getLifecycle();
        if (lifecycle instanceof C0522k) {
            ((C0522k) lifecycle).mo3044b(C0514f.C0516b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo4479b(bundle);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
