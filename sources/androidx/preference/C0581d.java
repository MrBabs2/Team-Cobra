package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.C0074c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: androidx.preference.d */
/* compiled from: MultiSelectListPreferenceDialogFragmentCompat */
public class C0581d extends C0584f {

    /* renamed from: n */
    Set<String> f2338n = new HashSet();

    /* renamed from: o */
    boolean f2339o;

    /* renamed from: p */
    CharSequence[] f2340p;

    /* renamed from: q */
    CharSequence[] f2341q;

    /* renamed from: androidx.preference.d$a */
    /* compiled from: MultiSelectListPreferenceDialogFragmentCompat */
    class C0582a implements DialogInterface.OnMultiChoiceClickListener {
        C0582a() {
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            if (z) {
                C0581d dVar = C0581d.this;
                dVar.f2339o = dVar.f2338n.add(dVar.f2341q[i].toString()) | dVar.f2339o;
                return;
            }
            C0581d dVar2 = C0581d.this;
            dVar2.f2339o = dVar2.f2338n.remove(dVar2.f2341q[i].toString()) | dVar2.f2339o;
        }
    }

    /* renamed from: d */
    private MultiSelectListPreference m2865d() {
        return (MultiSelectListPreference) mo3298b();
    }

    public static C0581d newInstance(String str) {
        C0581d dVar = new C0581d();
        Bundle bundle = new Bundle(1);
        bundle.putString(RoomNotification.KEY, str);
        dVar.setArguments(bundle);
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3286a(C0074c.C0075a aVar) {
        super.mo3286a(aVar);
        int length = this.f2341q.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f2338n.contains(this.f2341q[i].toString());
        }
        aVar.mo224a(this.f2340p, zArr, (DialogInterface.OnMultiChoiceClickListener) new C0582a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference d = m2865d();
            if (d.mo3155d0() == null || d.mo3156e0() == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.f2338n.clear();
            this.f2338n.addAll(d.mo3157f0());
            this.f2339o = false;
            this.f2340p = d.mo3155d0();
            this.f2341q = d.mo3156e0();
            return;
        }
        this.f2338n.clear();
        this.f2338n.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.f2339o = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.f2340p = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.f2341q = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.f2338n));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f2339o);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f2340p);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f2341q);
    }

    /* renamed from: a */
    public void mo3284a(boolean z) {
        if (z && this.f2339o) {
            MultiSelectListPreference d = m2865d();
            if (d.mo3192a((Object) this.f2338n)) {
                d.mo3154c(this.f2338n);
            }
        }
        this.f2339o = false;
    }
}
