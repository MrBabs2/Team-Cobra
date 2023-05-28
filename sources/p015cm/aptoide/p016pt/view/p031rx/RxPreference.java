package p015cm.aptoide.p016pt.view.p031rx;

import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import p112n.p118g.p301a.p302a.C10664b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.view.rx.RxPreference */
public class RxPreference {
    private RxPreference() {
        throw new AssertionError("No instances.");
    }

    public static C5368e<Boolean> checks(CheckBoxPreference checkBoxPreference) {
        C10664b.m36198a(checkBoxPreference, "preference == null");
        return C5368e.m10241a(new PreferenceOnCheckOnSubscribe(checkBoxPreference));
    }

    public static C5368e<Preference> clicks(Preference preference) {
        C10664b.m36198a(preference, "preference == null");
        return C5368e.m10241a(new PreferenceClickOnSubscribe(preference));
    }
}
