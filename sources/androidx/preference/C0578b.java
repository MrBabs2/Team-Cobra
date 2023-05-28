package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import androidx.room.C0753j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.preference.b */
/* compiled from: ExpandButton */
final class C0578b extends Preference {

    /* renamed from: U */
    private long f2333U;

    C0578b(Context context, List<Preference> list, long j) {
        super(context);
        m2858X();
        m2859a(list);
        this.f2333U = j + 1000000;
    }

    /* renamed from: X */
    private void m2858X() {
        mo3207d(C0612q.expand_button);
        mo3201c(C0610o.ic_arrow_down_24dp);
        mo3213f(C0613r.expand_button_title);
        mo3211e((int) C0753j.MAX_BIND_PARAMETER_CNT);
    }

    /* renamed from: a */
    private void m2859a(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = null;
        for (Preference next : list) {
            CharSequence B = next.mo3161B();
            boolean z = next instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(B)) {
                arrayList.add((PreferenceGroup) next);
            }
            if (arrayList.contains(next.mo3221s())) {
                if (z) {
                    arrayList.add((PreferenceGroup) next);
                }
            } else if (!TextUtils.isEmpty(B)) {
                if (charSequence == null) {
                    charSequence = B;
                } else {
                    charSequence = mo3206d().getString(C0613r.summary_collapsed_preference_list, new Object[]{charSequence, B});
                }
            }
        }
        mo3142a(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public long mo3216m() {
        return this.f2333U;
    }

    /* renamed from: a */
    public void mo3114a(C0607l lVar) {
        super.mo3114a(lVar);
        lVar.mo3384a(false);
    }
}
