package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.C0456c;
import androidx.fragment.app.C0485m;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import p050l.p066e.C4868a;

public final class zzc extends Fragment implements LifecycleFragment {

    /* renamed from: i */
    private static WeakHashMap<C0456c, WeakReference<zzc>> f14016i = new WeakHashMap<>();

    /* renamed from: f */
    private Map<String, LifecycleCallback> f14017f = new C4868a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f14018g = 0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Bundle f14019h;

    /* renamed from: a */
    public static zzc m15902a(C0456c cVar) {
        zzc zzc;
        WeakReference weakReference = f14016i.get(cVar);
        if (weakReference != null && (zzc = (zzc) weakReference.get()) != null) {
            return zzc;
        }
        try {
            zzc zzc2 = (zzc) cVar.getSupportFragmentManager().mo2792a("SupportLifecycleFragmentImpl");
            if (zzc2 == null || zzc2.isRemoving()) {
                zzc2 = new zzc();
                C0485m a = cVar.getSupportFragmentManager().mo2793a();
                a.mo2947a((Fragment) zzc2, "SupportLifecycleFragmentImpl");
                a.mo2686b();
            }
            f14016i.put(cVar, new WeakReference(zzc2));
            return zzc2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f14017f.values()) {
            a.mo25068a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f14017f.values()) {
            a.mo25066a(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14018g = 1;
        this.f14019h = bundle;
        for (Map.Entry next : this.f14017f.entrySet()) {
            ((LifecycleCallback) next.getValue()).mo25067a(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f14018g = 5;
        for (LifecycleCallback b : this.f14017f.values()) {
            b.mo25069b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f14018g = 3;
        for (LifecycleCallback c : this.f14017f.values()) {
            c.mo25071c();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f14017f.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).mo25070b(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f14018g = 2;
        for (LifecycleCallback d : this.f14017f.values()) {
            d.mo25072d();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f14018g = 4;
        for (LifecycleCallback e : this.f14017f.values()) {
            e.mo25073e();
        }
    }

    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo25075a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f14017f.get(str));
    }

    /* renamed from: a */
    public final void mo25076a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f14017f.containsKey(str)) {
            this.f14017f.put(str, lifecycleCallback);
            if (this.f14018g > 0) {
                new zze(Looper.getMainLooper()).post(new C7215y0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ Activity mo25074a() {
        return getActivity();
    }
}
