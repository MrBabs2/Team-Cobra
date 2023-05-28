package p015cm.aptoide.p016pt.account.view;

import android.os.Bundle;
import p015cm.aptoide.p016pt.account.view.LoginBottomSheet;
import p015cm.aptoide.p016pt.view.BackButtonActivity;
import p112n.p118g.p119b.C5303a;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.account.view.LoginBottomSheetActivity */
public abstract class LoginBottomSheetActivity extends BackButtonActivity implements LoginBottomSheet {
    private C5303a<LoginBottomSheet.State> stateSubject;

    public void collapse() {
        this.stateSubject.call(LoginBottomSheet.State.COLLAPSED);
    }

    public void expand() {
        this.stateSubject.call(LoginBottomSheet.State.EXPANDED);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.stateSubject = C5303a.m10043o();
    }

    public C5368e<LoginBottomSheet.State> state() {
        return this.stateSubject;
    }
}
