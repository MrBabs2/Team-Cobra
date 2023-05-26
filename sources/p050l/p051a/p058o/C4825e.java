package p050l.p051a.p058o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p050l.p051a.p058o.C4821b;

/* renamed from: l.a.o.e */
/* compiled from: StandaloneActionMode */
public class C4825e extends C4821b implements C0138g.C0139a {

    /* renamed from: h */
    private Context f8220h;

    /* renamed from: i */
    private ActionBarContextView f8221i;

    /* renamed from: j */
    private C4821b.C4822a f8222j;

    /* renamed from: k */
    private WeakReference<View> f8223k;

    /* renamed from: l */
    private boolean f8224l;

    /* renamed from: m */
    private C0138g f8225m;

    public C4825e(Context context, ActionBarContextView actionBarContextView, C4821b.C4822a aVar, boolean z) {
        this.f8220h = context;
        this.f8221i = actionBarContextView;
        this.f8222j = aVar;
        C0138g gVar = new C0138g(actionBarContextView.getContext());
        gVar.mo643c(1);
        this.f8225m = gVar;
        gVar.mo619a((C0138g.C0139a) this);
    }

    /* renamed from: a */
    public void mo438a(CharSequence charSequence) {
        this.f8221i.setSubtitle(charSequence);
    }

    /* renamed from: b */
    public void mo442b(CharSequence charSequence) {
        this.f8221i.setTitle(charSequence);
    }

    /* renamed from: c */
    public Menu mo443c() {
        return this.f8225m;
    }

    /* renamed from: d */
    public MenuInflater mo444d() {
        return new C4828g(this.f8221i.getContext());
    }

    /* renamed from: e */
    public CharSequence mo445e() {
        return this.f8221i.getSubtitle();
    }

    /* renamed from: g */
    public CharSequence mo446g() {
        return this.f8221i.getTitle();
    }

    /* renamed from: i */
    public void mo447i() {
        this.f8222j.mo354b(this, this.f8225m);
    }

    /* renamed from: j */
    public boolean mo448j() {
        return this.f8221i.mo899b();
    }

    /* renamed from: a */
    public void mo436a(int i) {
        mo438a((CharSequence) this.f8220h.getString(i));
    }

    /* renamed from: b */
    public void mo441b(int i) {
        mo442b((CharSequence) this.f8220h.getString(i));
    }

    /* renamed from: a */
    public void mo439a(boolean z) {
        super.mo439a(z);
        this.f8221i.setTitleOptional(z);
    }

    /* renamed from: b */
    public View mo440b() {
        WeakReference<View> weakReference = this.f8223k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public void mo437a(View view) {
        this.f8221i.setCustomView(view);
        this.f8223k = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public void mo435a() {
        if (!this.f8224l) {
            this.f8224l = true;
            this.f8221i.sendAccessibilityEvent(32);
            this.f8222j.mo351a(this);
        }
    }

    /* renamed from: a */
    public boolean mo320a(C0138g gVar, MenuItem menuItem) {
        return this.f8222j.mo353a((C4821b) this, menuItem);
    }

    /* renamed from: a */
    public void mo317a(C0138g gVar) {
        mo447i();
        this.f8221i.mo901d();
    }
}
