package com.bumptech.glide.p159m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.C0456c;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C5874c;
import com.bumptech.glide.C5881i;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.m.o */
/* compiled from: SupportRequestManagerFragment */
public class C6249o extends Fragment {

    /* renamed from: f */
    private final C6230a f11410f;

    /* renamed from: g */
    private final C6247m f11411g;

    /* renamed from: h */
    private final Set<C6249o> f11412h;

    /* renamed from: i */
    private C6249o f11413i;

    /* renamed from: j */
    private C5881i f11414j;

    /* renamed from: k */
    private Fragment f11415k;

    /* renamed from: com.bumptech.glide.m.o$a */
    /* compiled from: SupportRequestManagerFragment */
    private class C6250a implements C6247m {
        C6250a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + C6249o.this + "}";
        }
    }

    public C6249o() {
        this(new C6230a());
    }

    /* renamed from: e */
    private Fragment m12713e() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f11415k;
    }

    /* renamed from: f */
    private void m12714f() {
        C6249o oVar = this.f11413i;
        if (oVar != null) {
            oVar.m12712b(this);
            this.f11413i = null;
        }
    }

    /* renamed from: a */
    public void mo20593a(C5881i iVar) {
        this.f11414j = iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6230a mo20594b() {
        return this.f11410f;
    }

    /* renamed from: c */
    public C5881i mo20595c() {
        return this.f11414j;
    }

    /* renamed from: d */
    public C6247m mo20596d() {
        return this.f11411g;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            m12710a(getActivity());
        } catch (IllegalStateException e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f11410f.mo20557a();
        m12714f();
    }

    public void onDetach() {
        super.onDetach();
        this.f11415k = null;
        m12714f();
    }

    public void onStart() {
        super.onStart();
        this.f11410f.mo20559b();
    }

    public void onStop() {
        super.onStop();
        this.f11410f.mo20561c();
    }

    public String toString() {
        return super.toString() + "{parent=" + m12713e() + "}";
    }

    @SuppressLint({"ValidFragment"})
    public C6249o(C6230a aVar) {
        this.f11411g = new C6250a();
        this.f11412h = new HashSet();
        this.f11410f = aVar;
    }

    /* renamed from: a */
    private void m12711a(C6249o oVar) {
        this.f11412h.add(oVar);
    }

    /* renamed from: b */
    private void m12712b(C6249o oVar) {
        this.f11412h.remove(oVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20592a(Fragment fragment) {
        this.f11415k = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m12710a(fragment.getActivity());
        }
    }

    /* renamed from: a */
    private void m12710a(C0456c cVar) {
        m12714f();
        C6249o b = C5874c.m11487b((Context) cVar).mo19963h().mo20582b(cVar);
        this.f11413i = b;
        if (!equals(b)) {
            this.f11413i.m12711a(this);
        }
    }
}
