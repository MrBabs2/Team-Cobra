package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.C0714o;
import androidx.recyclerview.widget.RecyclerView;
import p050l.p075h.p084l.C5010a;
import p050l.p075h.p084l.p085e0.C5034c;

@Deprecated
/* renamed from: androidx.preference.k */
/* compiled from: PreferenceRecyclerViewAccessibilityDelegate */
public class C0605k extends C0714o {

    /* renamed from: f */
    final RecyclerView f2401f;

    /* renamed from: g */
    final C5010a f2402g = super.mo3382b();

    /* renamed from: h */
    final C5010a f2403h = new C0606a();

    public C0605k(RecyclerView recyclerView) {
        super(recyclerView);
        this.f2401f = recyclerView;
    }

    /* renamed from: b */
    public C5010a mo3382b() {
        return this.f2403h;
    }

    /* renamed from: androidx.preference.k$a */
    /* compiled from: PreferenceRecyclerViewAccessibilityDelegate */
    class C0606a extends C5010a {
        C0606a() {
        }

        /* renamed from: a */
        public void mo2445a(View view, C5034c cVar) {
            Preference item;
            C0605k.this.f2402g.mo2445a(view, cVar);
            int childAdapterPosition = C0605k.this.f2401f.getChildAdapterPosition(view);
            RecyclerView.C0633g adapter = C0605k.this.f2401f.getAdapter();
            if ((adapter instanceof C0594h) && (item = ((C0594h) adapter).getItem(childAdapterPosition)) != null) {
                item.mo3190a(cVar);
            }
        }

        /* renamed from: a */
        public boolean mo2446a(View view, int i, Bundle bundle) {
            return C0605k.this.f2402g.mo2446a(view, i, bundle);
        }
    }
}
