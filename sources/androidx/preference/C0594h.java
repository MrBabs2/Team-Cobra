package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.C0600j;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.C0688f;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.preference.h */
/* compiled from: PreferenceGroupAdapter */
public class C0594h extends RecyclerView.C0633g<C0607l> implements Preference.C0562b, PreferenceGroup.C0570c {

    /* renamed from: f */
    private PreferenceGroup f2364f;

    /* renamed from: g */
    private List<Preference> f2365g;

    /* renamed from: h */
    private List<Preference> f2366h;

    /* renamed from: i */
    private List<C0598d> f2367i;

    /* renamed from: j */
    private Handler f2368j;

    /* renamed from: k */
    private Runnable f2369k = new C0595a();

    /* renamed from: androidx.preference.h$a */
    /* compiled from: PreferenceGroupAdapter */
    class C0595a implements Runnable {
        C0595a() {
        }

        public void run() {
            C0594h.this.mo3338a();
        }
    }

    /* renamed from: androidx.preference.h$b */
    /* compiled from: PreferenceGroupAdapter */
    class C0596b extends C0688f.C0690b {

        /* renamed from: a */
        final /* synthetic */ List f2371a;

        /* renamed from: b */
        final /* synthetic */ List f2372b;

        /* renamed from: c */
        final /* synthetic */ C0600j.C0604d f2373c;

        C0596b(C0594h hVar, List list, List list2, C0600j.C0604d dVar) {
            this.f2371a = list;
            this.f2372b = list2;
            this.f2373c = dVar;
        }

        public boolean areContentsTheSame(int i, int i2) {
            return this.f2373c.mo3380a((Preference) this.f2371a.get(i), (Preference) this.f2372b.get(i2));
        }

        public boolean areItemsTheSame(int i, int i2) {
            return this.f2373c.mo3381b((Preference) this.f2371a.get(i), (Preference) this.f2372b.get(i2));
        }

        public int getNewListSize() {
            return this.f2372b.size();
        }

        public int getOldListSize() {
            return this.f2371a.size();
        }
    }

    /* renamed from: androidx.preference.h$c */
    /* compiled from: PreferenceGroupAdapter */
    class C0597c implements Preference.C0564d {

        /* renamed from: a */
        final /* synthetic */ PreferenceGroup f2374a;

        C0597c(PreferenceGroup preferenceGroup) {
            this.f2374a = preferenceGroup;
        }

        public boolean onPreferenceClick(Preference preference) {
            this.f2374a.mo3246h(Integer.MAX_VALUE);
            C0594h.this.mo3230a(preference);
            PreferenceGroup.C0569b Y = this.f2374a.mo3118Y();
            if (Y == null) {
                return true;
            }
            Y.mo3251a();
            return true;
        }
    }

    /* renamed from: androidx.preference.h$d */
    /* compiled from: PreferenceGroupAdapter */
    private static class C0598d {

        /* renamed from: a */
        int f2376a;

        /* renamed from: b */
        int f2377b;

        /* renamed from: c */
        String f2378c;

        C0598d(Preference preference) {
            this.f2378c = preference.getClass().getName();
            this.f2376a = preference.mo3219q();
            this.f2377b = preference.mo3162D();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0598d)) {
                return false;
            }
            C0598d dVar = (C0598d) obj;
            if (this.f2376a == dVar.f2376a && this.f2377b == dVar.f2377b && TextUtils.equals(this.f2378c, dVar.f2378c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f2376a) * 31) + this.f2377b) * 31) + this.f2378c.hashCode();
        }
    }

    public C0594h(PreferenceGroup preferenceGroup) {
        this.f2364f = preferenceGroup;
        this.f2368j = new Handler();
        this.f2364f.mo3183a((Preference.C0562b) this);
        this.f2365g = new ArrayList();
        this.f2366h = new ArrayList();
        this.f2367i = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.f2364f;
        if (preferenceGroup2 instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup2).mo3254c0());
        } else {
            setHasStableIds(true);
        }
        mo3338a();
    }

    /* renamed from: b */
    private boolean m2894b(PreferenceGroup preferenceGroup) {
        return preferenceGroup.mo3117X() != Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3338a() {
        for (Preference a : this.f2365g) {
            a.mo3183a((Preference.C0562b) null);
        }
        ArrayList arrayList = new ArrayList(this.f2365g.size());
        this.f2365g = arrayList;
        m2893a((List<Preference>) arrayList, this.f2364f);
        List<Preference> list = this.f2366h;
        List<Preference> a2 = m2892a(this.f2364f);
        this.f2366h = a2;
        C0600j v = this.f2364f.mo3224v();
        if (v == null || v.mo3375e() == null) {
            notifyDataSetChanged();
        } else {
            C0688f.m3266a(new C0596b(this, list, a2, v.mo3375e())).mo4202a((RecyclerView.C0633g) this);
        }
        for (Preference a3 : this.f2365g) {
            a3.mo3179a();
        }
    }

    /* renamed from: c */
    public int mo3253c(Preference preference) {
        int size = this.f2366h.size();
        for (int i = 0; i < size; i++) {
            Preference preference2 = this.f2366h.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public void mo3232d(Preference preference) {
        int indexOf = this.f2366h.indexOf(preference);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, preference);
        }
    }

    public Preference getItem(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return this.f2366h.get(i);
    }

    public int getItemCount() {
        return this.f2366h.size();
    }

    public long getItemId(int i) {
        if (!hasStableIds()) {
            return -1;
        }
        return getItem(i).mo3216m();
    }

    public int getItemViewType(int i) {
        C0598d dVar = new C0598d(getItem(i));
        int indexOf = this.f2367i.indexOf(dVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f2367i.size();
        this.f2367i.add(dVar);
        return size;
    }

    /* renamed from: b */
    public void mo3231b(Preference preference) {
        mo3230a(preference);
    }

    public C0607l onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0598d dVar = this.f2367i.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C0615t.BackgroundStyle);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0615t.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = C4800a.m7936c(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(dVar.f2376a, viewGroup, false);
        if (inflate.getBackground() == null) {
            C5071v.m9161a(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = dVar.f2377b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C0607l(inflate);
    }

    /* renamed from: a */
    private void m2893a(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.mo3239b0();
        int Z = preferenceGroup.mo3119Z();
        for (int i = 0; i < Z; i++) {
            Preference g = preferenceGroup.mo3245g(i);
            list.add(g);
            C0598d dVar = new C0598d(g);
            if (!this.f2367i.contains(dVar)) {
                this.f2367i.add(dVar);
            }
            if (g instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) g;
                if (preferenceGroup2.mo3237a0()) {
                    m2893a(list, preferenceGroup2);
                }
            }
            g.mo3183a((Preference.C0562b) this);
        }
    }

    /* renamed from: a */
    private List<Preference> m2892a(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int Z = preferenceGroup.mo3119Z();
        int i = 0;
        for (int i2 = 0; i2 < Z; i2++) {
            Preference g = preferenceGroup.mo3245g(i2);
            if (g.mo3168M()) {
                if (!m2894b(preferenceGroup) || i < preferenceGroup.mo3117X()) {
                    arrayList.add(g);
                } else {
                    arrayList2.add(g);
                }
                if (!(g instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) g;
                    if (!preferenceGroup2.mo3237a0()) {
                        continue;
                    } else if (!m2894b(preferenceGroup) || !m2894b(preferenceGroup2)) {
                        for (Preference next : m2892a(preferenceGroup2)) {
                            if (!m2894b(preferenceGroup) || i < preferenceGroup.mo3117X()) {
                                arrayList.add(next);
                            } else {
                                arrayList2.add(next);
                            }
                            i++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                }
            }
        }
        if (m2894b(preferenceGroup) && i > preferenceGroup.mo3117X()) {
            arrayList.add(m2891a(preferenceGroup, (List<Preference>) arrayList2));
        }
        return arrayList;
    }

    /* renamed from: a */
    private C0578b m2891a(PreferenceGroup preferenceGroup, List<Preference> list) {
        C0578b bVar = new C0578b(preferenceGroup.mo3206d(), list, preferenceGroup.mo3216m());
        bVar.mo3184a((Preference.C0564d) new C0597c(preferenceGroup));
        return bVar;
    }

    /* renamed from: a */
    public void mo3230a(Preference preference) {
        this.f2368j.removeCallbacks(this.f2369k);
        this.f2368j.post(this.f2369k);
    }

    /* renamed from: a */
    public void onBindViewHolder(C0607l lVar, int i) {
        getItem(i).mo3114a(lVar);
    }

    /* renamed from: a */
    public int mo3252a(String str) {
        int size = this.f2366h.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, this.f2366h.get(i).mo3218p())) {
                return i;
            }
        }
        return -1;
    }
}
