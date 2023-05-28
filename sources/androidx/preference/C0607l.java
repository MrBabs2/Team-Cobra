package androidx.preference;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.preference.l */
/* compiled from: PreferenceViewHolder */
public class C0607l extends RecyclerView.C0629c0 {

    /* renamed from: a */
    private final SparseArray<View> f2405a;

    /* renamed from: b */
    private boolean f2406b;

    /* renamed from: c */
    private boolean f2407c;

    C0607l(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f2405a = sparseArray;
        sparseArray.put(16908310, view.findViewById(16908310));
        this.f2405a.put(16908304, view.findViewById(16908304));
        this.f2405a.put(16908294, view.findViewById(16908294));
        SparseArray<View> sparseArray2 = this.f2405a;
        int i = C0611p.icon_frame;
        sparseArray2.put(i, view.findViewById(i));
        this.f2405a.put(16908350, view.findViewById(16908350));
    }

    /* renamed from: a */
    public View mo3383a(int i) {
        View view = this.f2405a.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            this.f2405a.put(i, findViewById);
        }
        return findViewById;
    }

    /* renamed from: b */
    public boolean mo3387b() {
        return this.f2407c;
    }

    /* renamed from: b */
    public void mo3386b(boolean z) {
        this.f2407c = z;
    }

    /* renamed from: a */
    public boolean mo3385a() {
        return this.f2406b;
    }

    /* renamed from: a */
    public void mo3384a(boolean z) {
        this.f2406b = z;
    }
}
