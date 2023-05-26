package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0547y;
import p050l.p075h.p083k.C5008h;

/* renamed from: androidx.fragment.app.e */
/* compiled from: FragmentController */
public class C0459e {

    /* renamed from: a */
    private final C0461g<?> f1969a;

    private C0459e(C0461g<?> gVar) {
        this.f1969a = gVar;
    }

    /* renamed from: a */
    public static C0459e m2215a(C0461g<?> gVar) {
        C5008h.m8900a(gVar, (Object) "callbacks == null");
        return new C0459e(gVar);
    }

    /* renamed from: b */
    public void mo2771b() {
        this.f1969a.f1975j.mo2874j();
    }

    /* renamed from: c */
    public void mo2775c() {
        this.f1969a.f1975j.mo2876k();
    }

    /* renamed from: d */
    public void mo2776d() {
        this.f1969a.f1975j.mo2880m();
    }

    /* renamed from: e */
    public void mo2777e() {
        this.f1969a.f1975j.mo2882n();
    }

    /* renamed from: f */
    public void mo2778f() {
        this.f1969a.f1975j.mo2888p();
    }

    /* renamed from: g */
    public void mo2779g() {
        this.f1969a.f1975j.mo2890q();
    }

    /* renamed from: h */
    public void mo2780h() {
        this.f1969a.f1975j.mo2893r();
    }

    /* renamed from: i */
    public boolean mo2781i() {
        return this.f1969a.f1975j.mo2897t();
    }

    /* renamed from: j */
    public C0462h mo2782j() {
        return this.f1969a.f1975j;
    }

    /* renamed from: k */
    public void mo2783k() {
        this.f1969a.f1975j.mo2905z();
    }

    /* renamed from: l */
    public Parcelable mo2784l() {
        return this.f1969a.f1975j.mo2822B();
    }

    /* renamed from: a */
    public Fragment mo2762a(String str) {
        return this.f1969a.f1975j.mo2846b(str);
    }

    /* renamed from: b */
    public void mo2772b(boolean z) {
        this.f1969a.f1975j.mo2852b(z);
    }

    /* renamed from: a */
    public void mo2767a(Fragment fragment) {
        C0461g<?> gVar = this.f1969a;
        gVar.f1975j.mo2839a((C0461g) gVar, (C0458d) gVar, fragment);
    }

    /* renamed from: b */
    public boolean mo2773b(Menu menu) {
        return this.f1969a.f1975j.mo2853b(menu);
    }

    /* renamed from: a */
    public View mo2761a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1969a.f1975j.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: b */
    public boolean mo2774b(MenuItem menuItem) {
        return this.f1969a.f1975j.mo2854b(menuItem);
    }

    /* renamed from: a */
    public void mo2765a(Parcelable parcelable) {
        C0461g<?> gVar = this.f1969a;
        if (gVar instanceof C0547y) {
            gVar.f1975j.mo2829a(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: a */
    public void mo2763a() {
        this.f1969a.f1975j.mo2872i();
    }

    /* renamed from: a */
    public void mo2768a(boolean z) {
        this.f1969a.f1975j.mo2841a(z);
    }

    /* renamed from: a */
    public void mo2764a(Configuration configuration) {
        this.f1969a.f1975j.mo2828a(configuration);
    }

    /* renamed from: a */
    public boolean mo2769a(Menu menu, MenuInflater menuInflater) {
        return this.f1969a.f1975j.mo2842a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo2770a(MenuItem menuItem) {
        return this.f1969a.f1975j.mo2843a(menuItem);
    }

    /* renamed from: a */
    public void mo2766a(Menu menu) {
        this.f1969a.f1975j.mo2830a(menu);
    }
}
