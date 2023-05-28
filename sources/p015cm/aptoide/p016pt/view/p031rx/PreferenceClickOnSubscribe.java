package p015cm.aptoide.p016pt.view.p031rx;

import androidx.preference.Preference;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: cm.aptoide.pt.view.rx.PreferenceClickOnSubscribe */
class PreferenceClickOnSubscribe implements C5368e.C5370a<Preference> {
    /* access modifiers changed from: private */
    public final Preference preference;

    public PreferenceClickOnSubscribe(Preference preference2) {
        this.preference = preference2;
    }

    public void call(final C12475j<? super Preference> jVar) {
        C12476a.verifyMainThread();
        C46811 r0 = new Preference.C0564d() {
            public boolean onPreferenceClick(Preference preference) {
                if (!jVar.isUnsubscribed()) {
                    jVar.onNext(preference);
                }
                return true;
            }
        };
        jVar.add(new C12476a() {
            /* access modifiers changed from: protected */
            public void onUnsubscribe() {
                PreferenceClickOnSubscribe.this.preference.mo3184a((Preference.C0564d) null);
            }
        });
        this.preference.mo3184a((Preference.C0564d) r0);
    }
}
