package p050l.p108s;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p050l.p108s.C5247m;

/* renamed from: l.s.q */
/* compiled from: TransitionSet */
public class C5260q extends C5247m {

    /* renamed from: O */
    private ArrayList<C5247m> f9357O = new ArrayList<>();

    /* renamed from: P */
    private boolean f9358P = true;

    /* renamed from: Q */
    int f9359Q;

    /* renamed from: R */
    boolean f9360R = false;

    /* renamed from: S */
    private int f9361S = 0;

    /* renamed from: l.s.q$a */
    /* compiled from: TransitionSet */
    class C5261a extends C5255n {

        /* renamed from: a */
        final /* synthetic */ C5247m f9362a;

        C5261a(C5260q qVar, C5247m mVar) {
            this.f9362a = mVar;
        }

        /* renamed from: c */
        public void mo18026c(C5247m mVar) {
            this.f9362a.mo18107r();
            mVar.mo18086b((C5247m.C5253f) this);
        }
    }

    /* renamed from: l.s.q$b */
    /* compiled from: TransitionSet */
    static class C5262b extends C5255n {

        /* renamed from: a */
        C5260q f9363a;

        C5262b(C5260q qVar) {
            this.f9363a = qVar;
        }

        /* renamed from: a */
        public void mo18047a(C5247m mVar) {
            C5260q qVar = this.f9363a;
            if (!qVar.f9360R) {
                qVar.mo18108s();
                this.f9363a.f9360R = true;
            }
        }

        /* renamed from: c */
        public void mo18026c(C5247m mVar) {
            C5260q qVar = this.f9363a;
            int i = qVar.f9359Q - 1;
            qVar.f9359Q = i;
            if (i == 0) {
                qVar.f9360R = false;
                qVar.mo18088b();
            }
            mVar.mo18086b((C5247m.C5253f) this);
        }
    }

    /* renamed from: w */
    private void m9874w() {
        C5262b bVar = new C5262b(this);
        Iterator<C5247m> it = this.f9357O.iterator();
        while (it.hasNext()) {
            it.next().mo18075a((C5247m.C5253f) bVar);
        }
        this.f9359Q = this.f9357O.size();
    }

    /* renamed from: c */
    public void mo17996c(C5264s sVar) {
        if (mo18090b(sVar.f9368b)) {
            Iterator<C5247m> it = this.f9357O.iterator();
            while (it.hasNext()) {
                C5247m next = it.next();
                if (next.mo18090b(sVar.f9368b)) {
                    next.mo17996c(sVar);
                    sVar.f9369c.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        super.cancel();
        int size = this.f9357O.size();
        for (int i = 0; i < size; i++) {
            this.f9357O.get(i).cancel();
        }
    }

    /* renamed from: e */
    public void mo18097e(View view) {
        super.mo18097e(view);
        int size = this.f9357O.size();
        for (int i = 0; i < size; i++) {
            this.f9357O.get(i).mo18097e(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo18107r() {
        if (this.f9357O.isEmpty()) {
            mo18108s();
            mo18088b();
            return;
        }
        m9874w();
        if (!this.f9358P) {
            for (int i = 1; i < this.f9357O.size(); i++) {
                this.f9357O.get(i - 1).mo18075a((C5247m.C5253f) new C5261a(this, this.f9357O.get(i)));
            }
            C5247m mVar = this.f9357O.get(0);
            if (mVar != null) {
                mVar.mo18107r();
                return;
            }
            return;
        }
        Iterator<C5247m> it = this.f9357O.iterator();
        while (it.hasNext()) {
            it.next().mo18107r();
        }
    }

    /* renamed from: u */
    public int mo18122u() {
        return this.f9357O.size();
    }

    public C5247m clone() {
        C5260q qVar = (C5260q) super.clone();
        qVar.f9357O = new ArrayList<>();
        int size = this.f9357O.size();
        for (int i = 0; i < size; i++) {
            qVar.m9873b(this.f9357O.get(i).clone());
        }
        return qVar;
    }

    /* renamed from: d */
    public C5260q m9900d(View view) {
        for (int i = 0; i < this.f9357O.size(); i++) {
            this.f9357O.get(i).mo18095d(view);
        }
        super.mo18095d(view);
        return this;
    }

    /* renamed from: b */
    public C5260q mo18121b(int i) {
        if (i == 0) {
            this.f9358P = true;
        } else if (i == 1) {
            this.f9358P = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: a */
    public C5260q mo18120a(C5247m mVar) {
        m9873b(mVar);
        long j = this.f9323h;
        if (j >= 0) {
            mVar.mo18072a(j);
        }
        if ((this.f9361S & 1) != 0) {
            mVar.mo18073a(mo18098f());
        }
        if ((this.f9361S & 2) != 0) {
            mVar.mo18083a(mo18101i());
        }
        if ((this.f9361S & 4) != 0) {
            mVar.mo18081a(mo18100h());
        }
        if ((this.f9361S & 8) != 0) {
            mVar.mo18082a(mo18096e());
        }
        return this;
    }

    /* renamed from: b */
    private void m9873b(C5247m mVar) {
        this.f9357O.add(mVar);
        mVar.f9338w = this;
    }

    /* renamed from: c */
    public void mo18092c(View view) {
        super.mo18092c(view);
        int size = this.f9357O.size();
        for (int i = 0; i < size; i++) {
            this.f9357O.get(i).mo18092c(view);
        }
    }

    /* renamed from: b */
    public C5260q m9894b(long j) {
        super.mo18085b(j);
        return this;
    }

    /* renamed from: b */
    public C5260q m9895b(C5247m.C5253f fVar) {
        super.mo18086b(fVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo18089b(C5264s sVar) {
        super.mo18089b(sVar);
        int size = this.f9357O.size();
        for (int i = 0; i < size; i++) {
            this.f9357O.get(i).mo18089b(sVar);
        }
    }

    /* renamed from: a */
    public C5247m mo18119a(int i) {
        if (i < 0 || i >= this.f9357O.size()) {
            return null;
        }
        return this.f9357O.get(i);
    }

    /* renamed from: a */
    public C5260q m9881a(long j) {
        ArrayList<C5247m> arrayList;
        super.mo18072a(j);
        if (this.f9323h >= 0 && (arrayList = this.f9357O) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f9357O.get(i).mo18072a(j);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C5260q m9882a(TimeInterpolator timeInterpolator) {
        this.f9361S |= 1;
        ArrayList<C5247m> arrayList = this.f9357O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f9357O.get(i).mo18073a(timeInterpolator);
            }
        }
        super.mo18073a(timeInterpolator);
        return this;
    }

    /* renamed from: a */
    public C5260q m9883a(View view) {
        for (int i = 0; i < this.f9357O.size(); i++) {
            this.f9357O.get(i).mo18074a(view);
        }
        super.mo18074a(view);
        return this;
    }

    /* renamed from: a */
    public C5260q m9884a(C5247m.C5253f fVar) {
        super.mo18075a(fVar);
        return this;
    }

    /* renamed from: a */
    public void mo18081a(C5232g gVar) {
        super.mo18081a(gVar);
        this.f9361S |= 4;
        if (this.f9357O != null) {
            for (int i = 0; i < this.f9357O.size(); i++) {
                this.f9357O.get(i).mo18081a(gVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18079a(ViewGroup viewGroup, C5265t tVar, C5265t tVar2, ArrayList<C5264s> arrayList, ArrayList<C5264s> arrayList2) {
        long j = mo18102j();
        int size = this.f9357O.size();
        for (int i = 0; i < size; i++) {
            C5247m mVar = this.f9357O.get(i);
            if (j > 0 && (this.f9358P || i == 0)) {
                long j2 = mVar.mo18102j();
                if (j2 > 0) {
                    mVar.mo18085b(j2 + j);
                } else {
                    mVar.mo18085b(j);
                }
            }
            mVar.mo18079a(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public void mo17995a(C5264s sVar) {
        if (mo18090b(sVar.f9368b)) {
            Iterator<C5247m> it = this.f9357O.iterator();
            while (it.hasNext()) {
                C5247m next = it.next();
                if (next.mo18090b(sVar.f9368b)) {
                    next.mo17995a(sVar);
                    sVar.f9369c.add(next);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo18083a(C5259p pVar) {
        super.mo18083a(pVar);
        this.f9361S |= 2;
        int size = this.f9357O.size();
        for (int i = 0; i < size; i++) {
            this.f9357O.get(i).mo18083a(pVar);
        }
    }

    /* renamed from: a */
    public void mo18082a(C5247m.C5252e eVar) {
        super.mo18082a(eVar);
        this.f9361S |= 8;
        int size = this.f9357O.size();
        for (int i = 0; i < size; i++) {
            this.f9357O.get(i).mo18082a(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo18071a(String str) {
        String a = super.mo18071a(str);
        for (int i = 0; i < this.f9357O.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n");
            sb.append(this.f9357O.get(i).mo18071a(str + "  "));
            a = sb.toString();
        }
        return a;
    }
}
