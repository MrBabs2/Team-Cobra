package p015cm.aptoide.p016pt.store.view;

import android.view.View;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.view.LoginDisplayable;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.LoginWidget */
public class LoginWidget extends Widget<LoginDisplayable> {
    private View loginButton;

    public LoginWidget(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.loginButton = view.findViewById(C1086R.C1088id.login_button);
    }

    public void bindView(LoginDisplayable loginDisplayable, int i) {
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.loginButton).mo18655a(new C4265a1(((ActivityResultNavigator) getContext()).getAccountNavigator()), (C5378b<Throwable>) C4388z0.f7541f));
    }
}
