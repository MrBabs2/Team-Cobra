package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0153m;
import androidx.appcompat.view.menu.C0155n;
import java.util.ArrayList;
import p050l.p051a.C4796g;

/* renamed from: androidx.appcompat.view.menu.e */
/* compiled from: ListMenuPresenter */
public class C0135e implements C0153m, AdapterView.OnItemClickListener {

    /* renamed from: f */
    Context f504f;

    /* renamed from: g */
    LayoutInflater f505g;

    /* renamed from: h */
    C0138g f506h;

    /* renamed from: i */
    ExpandedMenuView f507i;

    /* renamed from: j */
    int f508j;

    /* renamed from: k */
    int f509k;

    /* renamed from: l */
    int f510l;

    /* renamed from: m */
    private C0153m.C0154a f511m;

    /* renamed from: n */
    C0136a f512n;

    /* renamed from: o */
    private int f513o;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* compiled from: ListMenuPresenter */
    private class C0136a extends BaseAdapter {

        /* renamed from: f */
        private int f514f = -1;

        public C0136a() {
            mo595a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo595a() {
            C0142i f = C0135e.this.f506h.mo657f();
            if (f != null) {
                ArrayList<C0142i> j = C0135e.this.f506h.mo665j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (j.get(i) == f) {
                        this.f514f = i;
                        return;
                    }
                }
            }
            this.f514f = -1;
        }

        public int getCount() {
            int size = C0135e.this.f506h.mo665j().size() - C0135e.this.f508j;
            return this.f514f < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0135e eVar = C0135e.this;
                view = eVar.f505g.inflate(eVar.f510l, viewGroup, false);
            }
            ((C0155n.C0156a) view).mo450a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo595a();
            super.notifyDataSetChanged();
        }

        public C0142i getItem(int i) {
            ArrayList<C0142i> j = C0135e.this.f506h.mo665j();
            int i2 = i + C0135e.this.f508j;
            int i3 = this.f514f;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return j.get(i2);
        }
    }

    public C0135e(Context context, int i) {
        this(i, 0);
        this.f504f = context;
        this.f505g = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public void mo547a(Context context, C0138g gVar) {
        if (this.f509k != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f509k);
            this.f504f = contextThemeWrapper;
            this.f505g = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f504f != null) {
            this.f504f = context;
            if (this.f505g == null) {
                this.f505g = LayoutInflater.from(context);
            }
        }
        this.f506h = gVar;
        C0136a aVar = this.f512n;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo555a(C0138g gVar, C0142i iVar) {
        return false;
    }

    /* renamed from: b */
    public void mo593b(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f507i;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    /* renamed from: b */
    public boolean mo573b() {
        return false;
    }

    /* renamed from: b */
    public boolean mo558b(C0138g gVar, C0142i iVar) {
        return false;
    }

    /* renamed from: c */
    public Parcelable mo574c() {
        if (this.f507i == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo593b(bundle);
        return bundle;
    }

    public int getId() {
        return this.f513o;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f506h.mo625a((MenuItem) this.f512n.getItem(i), (C0153m) this, 0);
    }

    public C0135e(int i, int i2) {
        this.f510l = i;
        this.f509k = i2;
    }

    /* renamed from: a */
    public C0155n mo591a(ViewGroup viewGroup) {
        if (this.f507i == null) {
            this.f507i = (ExpandedMenuView) this.f505g.inflate(C4796g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f512n == null) {
                this.f512n = new C0136a();
            }
            this.f507i.setAdapter(this.f512n);
            this.f507i.setOnItemClickListener(this);
        }
        return this.f507i;
    }

    /* renamed from: a */
    public ListAdapter mo590a() {
        if (this.f512n == null) {
            this.f512n = new C0136a();
        }
        return this.f512n;
    }

    /* renamed from: a */
    public void mo552a(boolean z) {
        C0136a aVar = this.f512n;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo551a(C0153m.C0154a aVar) {
        this.f511m = aVar;
    }

    /* renamed from: a */
    public boolean mo556a(C0162r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new C0141h(rVar).mo686a((IBinder) null);
        C0153m.C0154a aVar = this.f511m;
        if (aVar == null) {
            return true;
        }
        aVar.mo350a(rVar);
        return true;
    }

    /* renamed from: a */
    public void mo549a(C0138g gVar, boolean z) {
        C0153m.C0154a aVar = this.f511m;
        if (aVar != null) {
            aVar.mo349a(gVar, z);
        }
    }

    /* renamed from: a */
    public void mo592a(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f507i.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: a */
    public void mo566a(Parcelable parcelable) {
        mo592a((Bundle) parcelable);
    }
}
