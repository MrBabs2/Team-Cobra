package p015cm.aptoide.p016pt.account.view;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.account.view.LoginDisplayable */
public class LoginDisplayable extends Displayable {
    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public int getViewLayout() {
        return C1086R.layout.login_store_displayable_layout;
    }
}
