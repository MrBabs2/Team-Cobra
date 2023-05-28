package p015cm.aptoide.p016pt.home.apps.list.models;

import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.epoxy.C5635t;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p218e0.C9132c;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.apps.model.InstalledApp;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p112n.p272c.p273a.p274a.p275a.p276a.C10557a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, mo16641d2 = {"Lcm/aptoide/pt/home/apps/list/models/InstalledCardModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcm/aptoide/pt/home/apps/list/models/InstalledCardModel$CardHolder;", "()V", "application", "Lcm/aptoide/pt/home/apps/model/InstalledApp;", "getApplication", "()Lcm/aptoide/pt/home/apps/model/InstalledApp;", "setApplication", "(Lcm/aptoide/pt/home/apps/model/InstalledApp;)V", "bind", "", "holder", "CardHolder", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.apps.list.models.InstalledCardModel */
/* compiled from: InstalledCardModel.kt */
public abstract class InstalledCardModel extends C5635t<CardHolder> {
    private InstalledApp application;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, mo16641d2 = {"Lcm/aptoide/pt/home/apps/list/models/InstalledCardModel$CardHolder;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "()V", "appIcon", "Landroid/widget/ImageView;", "getAppIcon", "()Landroid/widget/ImageView;", "appIcon$delegate", "Lkotlin/properties/ReadOnlyProperty;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "name$delegate", "version", "getVersion", "version$delegate", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.home.apps.list.models.InstalledCardModel$CardHolder */
    /* compiled from: InstalledCardModel.kt */
    public static final class CardHolder extends C10557a {
        static final /* synthetic */ C9168l[] $$delegatedProperties;
        private final C9132c appIcon$delegate = bind(C1086R.C1088id.apps_installed_icon);
        private final C9132c name$delegate = bind(C1086R.C1088id.apps_installed_app_name);
        private final C9132c version$delegate = bind(C1086R.C1088id.apps_installed_app_version);

        static {
            Class<CardHolder> cls = CardHolder.class;
            $$delegatedProperties = new C9168l[]{C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "name", "getName()Landroid/widget/TextView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "appIcon", "getAppIcon()Landroid/widget/ImageView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "version", "getVersion()Landroid/widget/TextView;"))};
        }

        public final ImageView getAppIcon() {
            return (ImageView) this.appIcon$delegate.mo33478a(this, $$delegatedProperties[1]);
        }

        public final TextView getName() {
            return (TextView) this.name$delegate.mo33478a(this, $$delegatedProperties[0]);
        }

        public final TextView getVersion() {
            return (TextView) this.version$delegate.mo33478a(this, $$delegatedProperties[2]);
        }
    }

    public final InstalledApp getApplication() {
        return this.application;
    }

    public final void setApplication(InstalledApp installedApp) {
        this.application = installedApp;
    }

    public void bind(CardHolder cardHolder) {
        C10202j.m34178b(cardHolder, "holder");
        InstalledApp installedApp = this.application;
        if (installedApp != null) {
            cardHolder.getName().setText(installedApp.getAppName());
            ImageLoader.with(cardHolder.getItemView().getContext()).load(installedApp.getIcon(), cardHolder.getAppIcon());
            cardHolder.getVersion().setText(installedApp.getVersion());
        }
    }
}
