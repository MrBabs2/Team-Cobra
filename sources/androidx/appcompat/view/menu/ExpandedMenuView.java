package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.widget.C0278q0;

public final class ExpandedMenuView extends ListView implements C0138g.C0140b, C0155n, AdapterView.OnItemClickListener {

    /* renamed from: h */
    private static final int[] f416h = {16842964, 16843049};

    /* renamed from: f */
    private C0138g f417f;

    /* renamed from: g */
    private int f418g;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* renamed from: a */
    public void mo472a(C0138g gVar) {
        this.f417f = gVar;
    }

    public int getWindowAnimations() {
        return this.f418g;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo473a((C0142i) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0278q0 a = C0278q0.m1271a(context, attributeSet, f416h, i, 0);
        if (a.mo1730g(0)) {
            setBackgroundDrawable(a.mo1719b(0));
        }
        if (a.mo1730g(1)) {
            setDivider(a.mo1719b(1));
        }
        a.mo1720b();
    }

    /* renamed from: a */
    public boolean mo473a(C0142i iVar) {
        return this.f417f.mo624a((MenuItem) iVar, 0);
    }
}
