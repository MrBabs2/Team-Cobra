package com.bumptech.glide.p159m;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C5874c;
import com.bumptech.glide.C5881i;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: com.bumptech.glide.m.k */
/* compiled from: RequestManagerFragment */
public class C6242k extends Fragment {

    /* renamed from: f */
    private final C6230a f11394f;

    /* renamed from: g */
    private final C6247m f11395g;

    /* renamed from: h */
    private final Set<C6242k> f11396h;

    /* renamed from: i */
    private C5881i f11397i;

    /* renamed from: j */
    private C6242k f11398j;

    /* renamed from: k */
    private Fragment f11399k;

    /* renamed from: com.bumptech.glide.m.k$a */
    /* compiled from: RequestManagerFragment */
    private class C6243a implements C6247m {
        C6243a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + C6242k.this + "}";
        }
    }

    public C6242k() {
        this(new C6230a());
    }

    @TargetApi(17)
    /* renamed from: d */
    private Fragment m12681d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f11399k;
    }

    /* renamed from: e */
    private void m12682e() {
        C6242k kVar = this.f11398j;
        if (kVar != null) {
            kVar.m12680b(this);
            this.f11398j = null;
        }
    }

    /* renamed from: a */
    public void mo20567a(C5881i iVar) {
        this.f11397i = iVar;
    }

    /* renamed from: b */
    public C5881i mo20568b() {
        return this.f11397i;
    }

    /* renamed from: c */
    public C6247m mo20569c() {
        return this.f11395g;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m12678a(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f11394f.mo20557a();
        m12682e();
    }

    public void onDetach() {
        super.onDetach();
        m12682e();
    }

    public void onStart() {
        super.onStart();
        this.f11394f.mo20559b();
    }

    public void onStop() {
        super.onStop();
        this.f11394f.mo20561c();
    }

    public String toString() {
        return super.toString() + "{parent=" + m12681d() + "}";
    }

    @SuppressLint({"ValidFragment"})
    C6242k(C6230a aVar) {
        this.f11395g = new C6243a();
        this.f11396h = new HashSet();
        this.f11394f = aVar;
    }

    /* renamed from: b */
    private void m12680b(C6242k kVar) {
        this.f11396h.remove(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6230a mo20565a() {
        return this.f11394f;
    }

    /* renamed from: a */
    private void m12679a(C6242k kVar) {
        this.f11396h.add(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20566a(Fragment fragment) {
        this.f11399k = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m12678a(fragment.getActivity());
        }
    }

    /* renamed from: a */
    private void m12678a(Activity activity) {
        m12682e();
        C6242k b = C5874c.m11487b((Context) activity).mo19963h().mo20581b(activity);
        this.f11398j = b;
        if (!equals(b)) {
            this.f11398j.m12679a(this);
        }
    }
}
