package p015cm.aptoide.p016pt.home.apps.list.models;

import com.airbnb.epoxy.C5629q;
import com.airbnb.epoxy.C5635t;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.home.apps.App;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, mo16641d2 = {"Lcm/aptoide/pt/home/apps/list/models/BaseCardModel;", "T", "Lcom/airbnb/epoxy/EpoxyHolder;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "()V", "application", "Lcm/aptoide/pt/home/apps/App;", "getApplication", "()Lcm/aptoide/pt/home/apps/App;", "setApplication", "(Lcm/aptoide/pt/home/apps/App;)V", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.apps.list.models.BaseCardModel */
/* compiled from: BaseCardModel.kt */
public abstract class BaseCardModel<T extends C5629q> extends C5635t<T> {
    private App application;

    public final App getApplication() {
        return this.application;
    }

    public final void setApplication(App app) {
        this.application = app;
    }
}
