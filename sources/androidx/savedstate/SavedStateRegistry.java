package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0513e;
import androidx.lifecycle.C0514f;
import androidx.lifecycle.C0521j;
import java.util.Map;
import p050l.p059b.p060a.p062b.C4841b;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a */
    private C4841b<String, C0788b> f2879a = new C4841b<>();

    /* renamed from: b */
    private Bundle f2880b;

    /* renamed from: c */
    private boolean f2881c;

    /* renamed from: d */
    boolean f2882d;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    public interface C0787a {
        /* renamed from: a */
        void mo4475a(C0790b bVar);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    public interface C0788b {
        /* renamed from: a */
        Bundle mo4476a();
    }

    SavedStateRegistry() {
    }

    /* renamed from: a */
    public Bundle mo4472a(String str) {
        if (this.f2881c) {
            Bundle bundle = this.f2880b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f2880b.remove(str);
            if (this.f2880b.isEmpty()) {
                this.f2880b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4474a(C0514f fVar, Bundle bundle) {
        if (!this.f2881c) {
            if (bundle != null) {
                this.f2880b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            fVar.mo3039a(new C0513e() {
                /* renamed from: a */
                public void mo136a(C0521j jVar, C0514f.C0515a aVar) {
                    if (aVar == C0514f.C0515a.ON_START) {
                        SavedStateRegistry.this.f2882d = true;
                    } else if (aVar == C0514f.C0515a.ON_STOP) {
                        SavedStateRegistry.this.f2882d = false;
                    }
                }
            });
            this.f2881c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4473a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f2880b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C4841b<K, V>.C4753d b = this.f2879a.mo16853b();
        while (b.hasNext()) {
            Map.Entry entry = (Map.Entry) b.next();
            bundle2.putBundle((String) entry.getKey(), ((C0788b) entry.getValue()).mo4476a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
