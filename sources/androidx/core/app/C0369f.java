package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0514f;
import androidx.lifecycle.C0521j;
import androidx.lifecycle.C0522k;
import androidx.lifecycle.C0537t;
import p050l.p066e.C4881g;
import p050l.p075h.p084l.C5030e;

/* renamed from: androidx.core.app.f */
/* compiled from: ComponentActivity */
public class C0369f extends Activity implements C0521j, C5030e.C5031a {
    private C4881g<Class<? extends C0370a>, C0370a> mExtraDataMap = new C4881g<>();
    private C0522k mLifecycleRegistry = new C0522k(this);

    @Deprecated
    /* renamed from: androidx.core.app.f$a */
    /* compiled from: ComponentActivity */
    public static class C0370a {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C5030e.m8984a(decorView, keyEvent)) {
            return C5030e.m8985a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C5030e.m8984a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends C0370a> T getExtraData(Class<T> cls) {
        return (C0370a) this.mExtraDataMap.get(cls);
    }

    public C0514f getLifecycle() {
        throw null;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0537t.m2618b((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.mo3043a(C0514f.C0516b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(C0370a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
