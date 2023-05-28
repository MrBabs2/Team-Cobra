package p015cm.aptoide.p016pt.account.view;

import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.account.view.LoginBottomSheet */
public interface LoginBottomSheet {

    /* renamed from: cm.aptoide.pt.account.view.LoginBottomSheet$State */
    public enum State {
        EXPANDED,
        COLLAPSED
    }

    void collapse();

    void expand();

    C5368e<State> state();
}
