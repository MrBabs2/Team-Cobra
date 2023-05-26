package p015cm.aptoide.p016pt.view.p031rx;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: cm.aptoide.pt.view.rx.SwitchOnCheckOnSubscribe */
class SwitchOnCheckOnSubscribe implements C5368e.C5370a<Boolean> {
    /* access modifiers changed from: private */
    public final SwitchCompat switchCompat;

    public SwitchOnCheckOnSubscribe(SwitchCompat switchCompat2) {
        this.switchCompat = switchCompat2;
    }

    public void call(final C12475j<? super Boolean> jVar) {
        C12476a.verifyMainThread();
        C46851 r0 = new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (!jVar.isUnsubscribed()) {
                    jVar.onNext(Boolean.valueOf(z));
                }
            }
        };
        jVar.add(new C12476a() {
            /* access modifiers changed from: protected */
            public void onUnsubscribe() {
                SwitchOnCheckOnSubscribe.this.switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            }
        });
        this.switchCompat.setOnCheckedChangeListener(r0);
    }
}
