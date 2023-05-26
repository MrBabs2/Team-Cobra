package p015cm.aptoide.p016pt.home.more.base;

import java.util.List;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\tH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0016\u0010\u0013\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\b\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0005H&J\b\u0010\u0016\u001a\u00020\u0005H&J\b\u0010\u0017\u001a\u00020\u0005H&¨\u0006\u0018"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/base/ListAppsView;", "T", "Lcm/aptoide/pt/view/app/Application;", "Lcm/aptoide/pt/presenter/View;", "addApps", "", "apps", "", "errorRetryClick", "Lrx/Observable;", "Ljava/lang/Void;", "getItemClickEvents", "Lcm/aptoide/pt/home/more/base/ListAppsClickEvent;", "headerClicks", "onBottomReached", "refreshEvents", "setToolbarInfo", "title", "", "showApps", "showGenericError", "showHeader", "showLoading", "showNoNetworkError", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.base.ListAppsView */
/* compiled from: ListAppsView.kt */
public interface ListAppsView<T extends Application> extends View {
    void addApps(List<? extends T> list);

    C5368e<Void> errorRetryClick();

    C5368e<ListAppsClickEvent<T>> getItemClickEvents();

    C5368e<Void> headerClicks();

    C5368e<Void> onBottomReached();

    C5368e<Void> refreshEvents();

    void setToolbarInfo(String str);

    void showApps(List<? extends T> list);

    void showGenericError();

    void showHeader();

    void showLoading();

    void showNoNetworkError();
}
