package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0153m;
import androidx.appcompat.view.menu.C0155n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
/* compiled from: BaseMenuPresenter */
public abstract class C0127b implements C0153m {

    /* renamed from: f */
    protected Context f455f;

    /* renamed from: g */
    protected Context f456g;

    /* renamed from: h */
    protected C0138g f457h;

    /* renamed from: i */
    protected LayoutInflater f458i;

    /* renamed from: j */
    private C0153m.C0154a f459j;

    /* renamed from: k */
    private int f460k;

    /* renamed from: l */
    private int f461l;

    /* renamed from: m */
    protected C0155n f462m;

    /* renamed from: n */
    private int f463n;

    public C0127b(Context context, int i, int i2) {
        this.f455f = context;
        this.f458i = LayoutInflater.from(context);
        this.f460k = i;
        this.f461l = i2;
    }

    /* renamed from: a */
    public void mo547a(Context context, C0138g gVar) {
        this.f456g = context;
        LayoutInflater.from(context);
        this.f457h = gVar;
    }

    /* renamed from: a */
    public abstract void mo550a(C0142i iVar, C0155n.C0156a aVar);

    /* renamed from: a */
    public abstract boolean mo553a(int i, C0142i iVar);

    /* renamed from: a */
    public boolean mo555a(C0138g gVar, C0142i iVar) {
        return false;
    }

    /* renamed from: b */
    public C0155n mo557b(ViewGroup viewGroup) {
        if (this.f462m == null) {
            C0155n nVar = (C0155n) this.f458i.inflate(this.f460k, viewGroup, false);
            this.f462m = nVar;
            nVar.mo472a(this.f457h);
            mo552a(true);
        }
        return this.f462m;
    }

    /* renamed from: b */
    public boolean mo558b(C0138g gVar, C0142i iVar) {
        return false;
    }

    public int getId() {
        return this.f463n;
    }

    /* renamed from: a */
    public void mo552a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f462m;
        if (viewGroup != null) {
            C0138g gVar = this.f457h;
            int i = 0;
            if (gVar != null) {
                gVar.mo638b();
                ArrayList<C0142i> n = this.f457h.mo669n();
                int size = n.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0142i iVar = n.get(i3);
                    if (mo553a(i2, iVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0142i itemData = childAt instanceof C0155n.C0156a ? ((C0155n.C0156a) childAt).getItemData() : null;
                        View a = mo543a(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo548a(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo554a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo548a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f462m).addView(view, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo554a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public void mo551a(C0153m.C0154a aVar) {
        this.f459j = aVar;
    }

    /* renamed from: a */
    public C0153m.C0154a mo544a() {
        return this.f459j;
    }

    /* renamed from: a */
    public C0155n.C0156a mo545a(ViewGroup viewGroup) {
        return (C0155n.C0156a) this.f458i.inflate(this.f461l, viewGroup, false);
    }

    /* renamed from: a */
    public View mo543a(C0142i iVar, View view, ViewGroup viewGroup) {
        C0155n.C0156a aVar;
        if (view instanceof C0155n.C0156a) {
            aVar = (C0155n.C0156a) view;
        } else {
            aVar = mo545a(viewGroup);
        }
        mo550a(iVar, aVar);
        return (View) aVar;
    }

    /* renamed from: a */
    public void mo549a(C0138g gVar, boolean z) {
        C0153m.C0154a aVar = this.f459j;
        if (aVar != null) {
            aVar.mo349a(gVar, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo556a(androidx.appcompat.view.menu.C0162r r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.f459j
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f457h
        L_0x0009:
            boolean r2 = r0.mo350a(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0127b.mo556a(androidx.appcompat.view.menu.r):boolean");
    }

    /* renamed from: a */
    public void mo546a(int i) {
        this.f463n = i;
    }
}
