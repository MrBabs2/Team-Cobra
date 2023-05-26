package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import p050l.p066e.C4868a;

public final class zza extends Fragment implements LifecycleFragment {

    /* renamed from: i */
    private static WeakHashMap<Activity, WeakReference<zza>> f14012i = new WeakHashMap<>();

    /* renamed from: f */
    private Map<String, LifecycleCallback> f14013f = new C4868a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f14014g = 0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Bundle f14015h;

    /* renamed from: a */
    public static zza m15896a(Activity activity) {
        zza zza;
        WeakReference weakReference = f14012i.get(activity);
        if (weakReference != null && (zza = (zza) weakReference.get()) != null) {
            return zza;
        }
        try {
            zza zza2 = (zza) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zza2 == null || zza2.isRemoving()) {
                zza2 = new zza();
                activity.getFragmentManager().beginTransaction().add(zza2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f14012i.put(activity, new WeakReference(zza2));
            return zza2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f14013f.values()) {
            a.mo25068a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f14013f.values()) {
            a.mo25066a(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14014g = 1;
        this.f14015h = bundle;
        for (Map.Entry next : this.f14013f.entrySet()) {
            ((LifecycleCallback) next.getValue()).mo25067a(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f14014g = 5;
        for (LifecycleCallback b : this.f14013f.values()) {
            b.mo25069b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f14014g = 3;
        for (LifecycleCallback c : this.f14013f.values()) {
            c.mo25071c();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f14013f.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).mo25070b(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f14014g = 2;
        for (LifecycleCallback d : this.f14013f.values()) {
            d.mo25072d();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f14014g = 4;
        for (LifecycleCallback e : this.f14013f.values()) {
            e.mo25073e();
        }
    }

    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo25075a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f14013f.get(str));
    }

    /* renamed from: a */
    public final void mo25076a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f14013f.containsKey(str)) {
            this.f14013f.put(str, lifecycleCallback);
            if (this.f14014g > 0) {
                new zze(Looper.getMainLooper()).post(new C7213x0(this, lifecycleCallback, str));
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
    public final Activity mo25074a() {
        return getActivity();
    }
}
