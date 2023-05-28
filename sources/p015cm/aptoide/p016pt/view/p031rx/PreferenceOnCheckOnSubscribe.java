package p015cm.aptoide.p016pt.view.p031rx;

import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: cm.aptoide.pt.view.rx.PreferenceOnCheckOnSubscribe */
class PreferenceOnCheckOnSubscribe implements C5368e.C5370a<Boolean> {
    /* access modifiers changed from: private */
    public final CheckBoxPreference preference;

    public PreferenceOnCheckOnSubscribe(CheckBoxPreference checkBoxPreference) {
        this.preference = checkBoxPreference;
    }

    public void call(final C12475j<? super Boolean> jVar) {
        C12476a.verifyMainThread();
        C46831 r0 = new Preference.C0564d() {
            public boolean onPreferenceClick(Preference preference) {
                if (!jVar.isUnsubscribed()) {
                    jVar.onNext(Boolean.valueOf(((CheckBoxPreference) preference).mo3117X()));
                }
                return true;
            }
        };
        jVar.add(new C12476a() {
            /* access modifiers changed from: protected */
            public void onUnsubscribe() {
                PreferenceOnCheckOnSubscribe.this.preference.mo3184a((Preference.C0564d) null);
            }
        });
        this.preference.mo3184a((Preference.C0564d) r0);
    }
}
