package p050l.p051a.p058o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: l.a.o.b */
/* compiled from: ActionMode */
public abstract class C4821b {

    /* renamed from: f */
    private Object f8213f;

    /* renamed from: g */
    private boolean f8214g;

    /* renamed from: l.a.o.b$a */
    /* compiled from: ActionMode */
    public interface C4822a {
        /* renamed from: a */
        void mo351a(C4821b bVar);

        /* renamed from: a */
        boolean mo352a(C4821b bVar, Menu menu);

        /* renamed from: a */
        boolean mo353a(C4821b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo354b(C4821b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract void mo435a();

    /* renamed from: a */
    public abstract void mo436a(int i);

    /* renamed from: a */
    public abstract void mo437a(View view);

    /* renamed from: a */
    public abstract void mo438a(CharSequence charSequence);

    /* renamed from: a */
    public void mo16777a(Object obj) {
        this.f8213f = obj;
    }

    /* renamed from: b */
    public abstract View mo440b();

    /* renamed from: b */
    public abstract void mo441b(int i);

    /* renamed from: b */
    public abstract void mo442b(CharSequence charSequence);

    /* renamed from: c */
    public abstract Menu mo443c();

    /* renamed from: d */
    public abstract MenuInflater mo444d();

    /* renamed from: e */
    public abstract CharSequence mo445e();

    /* renamed from: f */
    public Object mo16778f() {
        return this.f8213f;
    }

    /* renamed from: g */
    public abstract CharSequence mo446g();

    /* renamed from: h */
    public boolean mo16779h() {
        return this.f8214g;
    }

    /* renamed from: i */
    public abstract void mo447i();

    /* renamed from: j */
    public abstract boolean mo448j();

    /* renamed from: a */
    public void mo439a(boolean z) {
        this.f8214g = z;
    }
}
