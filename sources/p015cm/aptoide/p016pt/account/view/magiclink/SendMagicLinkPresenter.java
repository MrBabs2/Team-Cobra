package p015cm.aptoide.p016pt.account.view.magiclink;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.AgentPersistence;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo16641d2 = {"Lcm/aptoide/pt/account/view/magiclink/SendMagicLinkPresenter;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/account/view/magiclink/MagicLinkView;", "accountManager", "Lcm/aptoide/accountmanager/AptoideAccountManager;", "navigator", "Lcm/aptoide/pt/account/view/magiclink/SendMagicLinkNavigator;", "viewScheduler", "Lrx/Scheduler;", "agentPersistence", "Lcm/aptoide/pt/account/AgentPersistence;", "(Lcm/aptoide/pt/account/view/magiclink/MagicLinkView;Lcm/aptoide/accountmanager/AptoideAccountManager;Lcm/aptoide/pt/account/view/magiclink/SendMagicLinkNavigator;Lrx/Scheduler;Lcm/aptoide/pt/account/AgentPersistence;)V", "handleEmailChangeEvents", "", "handleSecureLoginTextClick", "handleSendMagicLinkClick", "present", "validateEmail", "Lrx/Observable;", "", "email", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.account.view.magiclink.SendMagicLinkPresenter */
/* compiled from: SendMagicLinkPresenter.kt */
public final class SendMagicLinkPresenter implements Presenter {
    /* access modifiers changed from: private */
    public final AptoideAccountManager accountManager;
    /* access modifiers changed from: private */
    public final AgentPersistence agentPersistence;
    /* access modifiers changed from: private */
    public final SendMagicLinkNavigator navigator;
    /* access modifiers changed from: private */
    public final MagicLinkView view;
    /* access modifiers changed from: private */
    public final C5373h viewScheduler;

    public SendMagicLinkPresenter(MagicLinkView magicLinkView, AptoideAccountManager aptoideAccountManager, SendMagicLinkNavigator sendMagicLinkNavigator, C5373h hVar, AgentPersistence agentPersistence2) {
        C10202j.m34178b(magicLinkView, "view");
        C10202j.m34178b(aptoideAccountManager, "accountManager");
        C10202j.m34178b(sendMagicLinkNavigator, "navigator");
        C10202j.m34178b(hVar, "viewScheduler");
        C10202j.m34178b(agentPersistence2, "agentPersistence");
        this.view = magicLinkView;
        this.accountManager = aptoideAccountManager;
        this.navigator = sendMagicLinkNavigator;
        this.viewScheduler = hVar;
        this.agentPersistence = agentPersistence2;
    }

    private final void handleEmailChangeEvents() {
        this.view.getLifecycleEvent().mo18681d(SendMagicLinkPresenter$handleEmailChangeEvents$1.INSTANCE).mo18687f(new SendMagicLinkPresenter$handleEmailChangeEvents$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(SendMagicLinkPresenter$handleEmailChangeEvents$3.INSTANCE, (C5378b<Throwable>) SendMagicLinkPresenter$handleEmailChangeEvents$4.INSTANCE);
    }

    private final void handleSecureLoginTextClick() {
        this.view.getLifecycleEvent().mo18681d(SendMagicLinkPresenter$handleSecureLoginTextClick$1.INSTANCE).mo18687f(new SendMagicLinkPresenter$handleSecureLoginTextClick$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(SendMagicLinkPresenter$handleSecureLoginTextClick$3.INSTANCE, (C5378b<Throwable>) SendMagicLinkPresenter$handleSecureLoginTextClick$4.INSTANCE);
    }

    private final void handleSendMagicLinkClick() {
        this.view.getLifecycleEvent().mo18681d(SendMagicLinkPresenter$handleSendMagicLinkClick$1.INSTANCE).mo18687f(new SendMagicLinkPresenter$handleSendMagicLinkClick$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(SendMagicLinkPresenter$handleSendMagicLinkClick$3.INSTANCE, (C5378b<Throwable>) SendMagicLinkPresenter$handleSendMagicLinkClick$4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public final C5368e<Boolean> validateEmail(String str) {
        C5368e<Boolean> b = this.accountManager.isEmailValid(str).mo18567c().mo18644a(this.viewScheduler).mo18664b(new SendMagicLinkPresenter$validateEmail$1(this));
        C10202j.m34174a((Object) b, "accountManager.isEmailVa…r()\n          }\n        }");
        return b;
    }

    public void present() {
        handleSendMagicLinkClick();
        handleEmailChangeEvents();
        handleSecureLoginTextClick();
    }
}
