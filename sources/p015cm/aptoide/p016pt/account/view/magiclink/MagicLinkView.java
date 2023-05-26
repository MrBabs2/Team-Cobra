package p015cm.aptoide.p016pt.account.view.magiclink;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\tH&¨\u0006\u000f"}, mo16641d2 = {"Lcm/aptoide/pt/account/view/magiclink/MagicLinkView;", "Lcm/aptoide/pt/presenter/View;", "getEmailTextChangeEvent", "Lrx/Observable;", "", "getMagicLinkClick", "getSecureLoginTextClick", "Ljava/lang/Void;", "removeLoadingScreen", "", "removeTextFieldError", "setEmailInvalidError", "setInitialState", "setLoadingScreen", "showUnknownError", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.account.view.magiclink.MagicLinkView */
/* compiled from: MagicLinkView.kt */
public interface MagicLinkView extends View {
    C5368e<String> getEmailTextChangeEvent();

    C5368e<String> getMagicLinkClick();

    C5368e<Void> getSecureLoginTextClick();

    void removeLoadingScreen();

    void removeTextFieldError();

    void setEmailInvalidError();

    void setInitialState();

    void setLoadingScreen();

    void showUnknownError();
}
