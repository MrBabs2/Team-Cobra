package p015cm.aptoide.p016pt.account.view.magiclink;

import com.aptoide.authentication.model.CodeAuth;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/aptoide/authentication/model/CodeAuth;", "kotlin.jvm.PlatformType", "it", "Lcm/aptoide/pt/presenter/View$LifecycleEvent;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.account.view.magiclink.SendMagicLinkPresenter$handleSendMagicLinkClick$2 */
/* compiled from: SendMagicLinkPresenter.kt */
final class SendMagicLinkPresenter$handleSendMagicLinkClick$2<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ SendMagicLinkPresenter this$0;

    SendMagicLinkPresenter$handleSendMagicLinkClick$2(SendMagicLinkPresenter sendMagicLinkPresenter) {
        this.this$0 = sendMagicLinkPresenter;
    }

    public final C5368e<CodeAuth> call(View.LifecycleEvent lifecycleEvent) {
        return this.this$0.view.getMagicLinkClick().mo18687f(new C5379n<T, C5368e<? extends R>>(this) {
            final /* synthetic */ SendMagicLinkPresenter$handleSendMagicLinkClick$2 this$0;

            {
                this.this$0 = r1;
            }

            public final C5368e<CodeAuth> call(final String str) {
                SendMagicLinkPresenter sendMagicLinkPresenter = this.this$0.this$0;
                C10202j.m34174a((Object) str, "email");
                return sendMagicLinkPresenter.validateEmail(str).mo18681d(C11921.INSTANCE).mo18644a(this.this$0.this$0.viewScheduler).mo18664b(new C5378b<Boolean>(this) {
                    final /* synthetic */ C11911 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void call(Boolean bool) {
                        this.this$0.this$0.this$0.view.setLoadingScreen();
                    }
                }).mo18692i(new C5379n<T, Single<? extends R>>(this) {
                    final /* synthetic */ C11911 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final Single<CodeAuth> call(Boolean bool) {
                        return this.this$0.this$0.this$0.accountManager.sendMagicLink(str).mo18556a(this.this$0.this$0.this$0.viewScheduler).mo18564b(new C5378b<CodeAuth>(this) {
                            final /* synthetic */ C11943 this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final void call(CodeAuth codeAuth) {
                                this.this$0.this$0.this$0.this$0.agentPersistence.persistAgent(codeAuth.getAgent(), codeAuth.getState(), codeAuth.getEmail());
                                this.this$0.this$0.this$0.this$0.view.removeLoadingScreen();
                                SendMagicLinkNavigator access$getNavigator$p = this.this$0.this$0.this$0.this$0.navigator;
                                String str = str;
                                C10202j.m34174a((Object) str, "email");
                                access$getNavigator$p.navigateToCheckYourEmail(str);
                            }
                        });
                    }
                }).mo18644a(this.this$0.this$0.viewScheduler).mo18649a((C5378b<? super Throwable>) new C5378b<Throwable>(this) {
                    final /* synthetic */ C11911 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void call(Throwable th) {
                        this.this$0.this$0.this$0.view.removeLoadingScreen();
                        this.this$0.this$0.this$0.view.showUnknownError();
                        th.printStackTrace();
                    }
                });
            }
        }).mo18686f();
    }
}
