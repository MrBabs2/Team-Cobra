package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.C0074c;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: androidx.preference.c */
/* compiled from: ListPreferenceDialogFragmentCompat */
public class C0579c extends C0584f {

    /* renamed from: n */
    int f2334n;

    /* renamed from: o */
    private CharSequence[] f2335o;

    /* renamed from: p */
    private CharSequence[] f2336p;

    /* renamed from: androidx.preference.c$a */
    /* compiled from: ListPreferenceDialogFragmentCompat */
    class C0580a implements DialogInterface.OnClickListener {
        C0580a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0579c cVar = C0579c.this;
            cVar.f2334n = i;
            cVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: d */
    private ListPreference m2862d() {
        return (ListPreference) mo3298b();
    }

    public static C0579c newInstance(String str) {
        C0579c cVar = new C0579c();
        Bundle bundle = new Bundle(1);
        bundle.putString(RoomNotification.KEY, str);
        cVar.setArguments(bundle);
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3286a(C0074c.C0075a aVar) {
        super.mo3286a(aVar);
        aVar.mo223a(this.f2335o, this.f2334n, (DialogInterface.OnClickListener) new C0580a());
        aVar.mo234c((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference d = m2862d();
            if (d.mo3144d0() == null || d.mo3147f0() == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.f2334n = d.mo3143d(d.mo3148g0());
            this.f2335o = d.mo3144d0();
            this.f2336p = d.mo3147f0();
            return;
        }
        this.f2334n = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.f2335o = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.f2336p = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f2334n);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f2335o);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f2336p);
    }

    /* renamed from: a */
    public void mo3284a(boolean z) {
        int i;
        if (z && (i = this.f2334n) >= 0) {
            String charSequence = this.f2336p[i].toString();
            ListPreference d = m2862d();
            if (d.mo3192a((Object) charSequence)) {
                d.mo3145e(charSequence);
            }
        }
    }
}
