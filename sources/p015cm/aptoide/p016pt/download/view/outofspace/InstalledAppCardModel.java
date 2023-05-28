package p015cm.aptoide.p016pt.download.view.outofspace;

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
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p112n.p272c.p273a.p274a.p275a.p276a.C10557a;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0005H\u0002R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/outofspace/InstalledAppCardModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcm/aptoide/pt/download/view/outofspace/InstalledAppCardModel$CardHolder;", "()V", "application", "Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "getApplication", "()Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "setApplication", "(Lcm/aptoide/pt/download/view/outofspace/InstalledApp;)V", "eventSubject", "Lrx/subjects/PublishSubject;", "", "getEventSubject", "()Lrx/subjects/PublishSubject;", "setEventSubject", "(Lrx/subjects/PublishSubject;)V", "bind", "", "holder", "handleUninstallClick", "app", "CardHolder", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.InstalledAppCardModel */
/* compiled from: InstalledAppCardModel.kt */
public abstract class InstalledAppCardModel extends C5635t<CardHolder> {
    private InstalledApp application;
    private C12871b<String> eventSubject;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\fR\u001b\u0010\u0011\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/outofspace/InstalledAppCardModel$CardHolder;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "()V", "appIcon", "Landroid/widget/ImageView;", "getAppIcon", "()Landroid/widget/ImageView;", "appIcon$delegate", "Lkotlin/properties/ReadOnlyProperty;", "appSize", "Landroid/widget/TextView;", "getAppSize", "()Landroid/widget/TextView;", "appSize$delegate", "name", "getName", "name$delegate", "uninstallButton", "getUninstallButton", "uninstallButton$delegate", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.download.view.outofspace.InstalledAppCardModel$CardHolder */
    /* compiled from: InstalledAppCardModel.kt */
    public static final class CardHolder extends C10557a {
        static final /* synthetic */ C9168l[] $$delegatedProperties;
        private final C9132c appIcon$delegate = bind(C1086R.C1088id.app_icon);
        private final C9132c appSize$delegate = bind(C1086R.C1088id.app_size);
        private final C9132c name$delegate = bind(C1086R.C1088id.app_name);
        private final C9132c uninstallButton$delegate = bind(C1086R.C1088id.uninstall_button);

        static {
            Class<CardHolder> cls = CardHolder.class;
            $$delegatedProperties = new C9168l[]{C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "appIcon", "getAppIcon()Landroid/widget/ImageView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "name", "getName()Landroid/widget/TextView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "appSize", "getAppSize()Landroid/widget/TextView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "uninstallButton", "getUninstallButton()Landroid/widget/TextView;"))};
        }

        public final ImageView getAppIcon() {
            return (ImageView) this.appIcon$delegate.mo33478a(this, $$delegatedProperties[0]);
        }

        public final TextView getAppSize() {
            return (TextView) this.appSize$delegate.mo33478a(this, $$delegatedProperties[2]);
        }

        public final TextView getName() {
            return (TextView) this.name$delegate.mo33478a(this, $$delegatedProperties[1]);
        }

        public final TextView getUninstallButton() {
            return (TextView) this.uninstallButton$delegate.mo33478a(this, $$delegatedProperties[3]);
        }
    }

    private final void handleUninstallClick(CardHolder cardHolder, InstalledApp installedApp) {
        cardHolder.getUninstallButton().setOnClickListener(new InstalledAppCardModel$handleUninstallClick$1(this, installedApp));
    }

    public final InstalledApp getApplication() {
        return this.application;
    }

    public final C12871b<String> getEventSubject() {
        return this.eventSubject;
    }

    public final void setApplication(InstalledApp installedApp) {
        this.application = installedApp;
    }

    public final void setEventSubject(C12871b<String> bVar) {
        this.eventSubject = bVar;
    }

    public void bind(CardHolder cardHolder) {
        C10202j.m34178b(cardHolder, "holder");
        InstalledApp installedApp = this.application;
        if (installedApp != null) {
            cardHolder.getName().setText(installedApp.getAppName());
            ImageLoader.with(cardHolder.getItemView().getContext()).load(installedApp.getIcon(), cardHolder.getAppIcon());
            cardHolder.getAppSize().setText(AptoideUtils.StringU.formatBytes(installedApp.getSize(), false));
            handleUninstallClick(cardHolder, installedApp);
        }
    }
}
