package p015cm.aptoide.p016pt.view.p031rx;

import androidx.appcompat.widget.SwitchCompat;
import p112n.p118g.p301a.p302a.C10664b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.view.rx.RxSwitch */
public class RxSwitch {
    private RxSwitch() {
        throw new AssertionError("No instances.");
    }

    public static C5368e<Boolean> checks(SwitchCompat switchCompat) {
        C10664b.m36198a(switchCompat, "switchCompat == null");
        return C5368e.m10241a(new SwitchOnCheckOnSubscribe(switchCompat));
    }
}
