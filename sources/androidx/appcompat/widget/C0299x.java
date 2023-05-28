package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.view.menu.C0153m;
import p050l.p075h.p084l.C5086z;

/* renamed from: androidx.appcompat.widget.x */
/* compiled from: DecorToolbar */
public interface C0299x {
    /* renamed from: a */
    C5086z mo1733a(int i, long j);

    /* renamed from: a */
    void mo1734a(int i);

    /* renamed from: a */
    void mo1736a(Menu menu, C0153m.C0154a aVar);

    /* renamed from: a */
    void mo1738a(C0153m.C0154a aVar, C0138g.C0139a aVar2);

    /* renamed from: a */
    void mo1739a(C0259j0 j0Var);

    /* renamed from: a */
    void mo1741a(boolean z);

    /* renamed from: a */
    boolean mo1742a();

    /* renamed from: b */
    void mo1743b();

    /* renamed from: b */
    void mo1744b(int i);

    /* renamed from: b */
    void mo1747b(boolean z);

    /* renamed from: c */
    void mo1748c(int i);

    /* renamed from: c */
    boolean mo1749c();

    void collapseActionView();

    /* renamed from: d */
    boolean mo1752d();

    /* renamed from: e */
    boolean mo1754e();

    /* renamed from: f */
    boolean mo1755f();

    /* renamed from: g */
    void mo1756g();

    Context getContext();

    CharSequence getTitle();

    /* renamed from: h */
    boolean mo1759h();

    /* renamed from: i */
    Menu mo1760i();

    /* renamed from: j */
    int mo1761j();

    /* renamed from: k */
    ViewGroup mo1762k();

    /* renamed from: l */
    int mo1763l();

    /* renamed from: m */
    void mo1764m();

    /* renamed from: n */
    void mo1765n();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
