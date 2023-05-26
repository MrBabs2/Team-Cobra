package p015cm.aptoide.p016pt.home.apps.list.models;

import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.epoxy.C5631s;
import com.airbnb.epoxy.C5635t;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p218e0.C9132c;
import p015cm.aptoide.aptoideviews.common.Debouncer;
import p015cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import p015cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.apps.AppClick;
import p015cm.aptoide.p016pt.home.apps.model.DownloadApp;
import p015cm.aptoide.p016pt.home.apps.model.StateApp;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p112n.p272c.p273a.p274a.p275a.p276a.C10557a;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J \u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0005H\u0002R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, mo16641d2 = {"Lcm/aptoide/pt/home/apps/list/models/DownloadCardModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcm/aptoide/pt/home/apps/list/models/DownloadCardModel$CardHolder;", "()V", "application", "Lcm/aptoide/pt/home/apps/model/DownloadApp;", "getApplication", "()Lcm/aptoide/pt/home/apps/model/DownloadApp;", "setApplication", "(Lcm/aptoide/pt/home/apps/model/DownloadApp;)V", "debouncer", "Lcm/aptoide/aptoideviews/common/Debouncer;", "eventSubject", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/apps/AppClick;", "getEventSubject", "()Lrx/subjects/PublishSubject;", "setEventSubject", "(Lrx/subjects/PublishSubject;)V", "bind", "", "holder", "previouslyBoundModel", "Lcom/airbnb/epoxy/EpoxyModel;", "processDownload", "app", "setDownloadViewVisibility", "installed", "", "error", "setupListeners", "CardHolder", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.apps.list.models.DownloadCardModel */
/* compiled from: DownloadCardModel.kt */
public abstract class DownloadCardModel extends C5635t<CardHolder> {
    private DownloadApp application;
    /* access modifiers changed from: private */
    public final Debouncer debouncer = new Debouncer(1250);
    private C12871b<AppClick> eventSubject;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0014\u0010\u0006R\u001b\u0010\u0016\u001a\u00020\u000f8FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, mo16641d2 = {"Lcm/aptoide/pt/home/apps/list/models/DownloadCardModel$CardHolder;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "()V", "appIcon", "Landroid/widget/ImageView;", "getAppIcon", "()Landroid/widget/ImageView;", "appIcon$delegate", "Lkotlin/properties/ReadOnlyProperty;", "downloadProgressView", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "getDownloadProgressView", "()Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "downloadProgressView$delegate", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "name$delegate", "secondaryIcon", "getSecondaryIcon", "secondaryIcon$delegate", "secondaryText", "getSecondaryText", "secondaryText$delegate", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.home.apps.list.models.DownloadCardModel$CardHolder */
    /* compiled from: DownloadCardModel.kt */
    public static final class CardHolder extends C10557a {
        static final /* synthetic */ C9168l[] $$delegatedProperties;
        private final C9132c appIcon$delegate = bind(C1086R.C1088id.apps_app_icon);
        private final C9132c downloadProgressView$delegate = bind(C1086R.C1088id.download_progress_view);
        private final C9132c name$delegate = bind(C1086R.C1088id.apps_app_name);
        private final C9132c secondaryIcon$delegate = bind(C1086R.C1088id.secondary_icon);
        private final C9132c secondaryText$delegate = bind(C1086R.C1088id.apps_secondary_text);

        static {
            Class<CardHolder> cls = CardHolder.class;
            $$delegatedProperties = new C9168l[]{C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "name", "getName()Landroid/widget/TextView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "appIcon", "getAppIcon()Landroid/widget/ImageView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "secondaryText", "getSecondaryText()Landroid/widget/TextView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "secondaryIcon", "getSecondaryIcon()Landroid/widget/ImageView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "downloadProgressView", "getDownloadProgressView()Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;"))};
        }

        public final ImageView getAppIcon() {
            return (ImageView) this.appIcon$delegate.mo33478a(this, $$delegatedProperties[1]);
        }

        public final DownloadProgressView getDownloadProgressView() {
            return (DownloadProgressView) this.downloadProgressView$delegate.mo33478a(this, $$delegatedProperties[4]);
        }

        public final TextView getName() {
            return (TextView) this.name$delegate.mo33478a(this, $$delegatedProperties[0]);
        }

        public final ImageView getSecondaryIcon() {
            return (ImageView) this.secondaryIcon$delegate.mo33478a(this, $$delegatedProperties[3]);
        }

        public final TextView getSecondaryText() {
            return (TextView) this.secondaryText$delegate.mo33478a(this, $$delegatedProperties[2]);
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.home.apps.list.models.DownloadCardModel$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DownloadEventListener.Action.Type.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DownloadEventListener.Action.Type.CANCEL.ordinal()] = 1;
            $EnumSwitchMapping$0[DownloadEventListener.Action.Type.RESUME.ordinal()] = 2;
            $EnumSwitchMapping$0[DownloadEventListener.Action.Type.PAUSE.ordinal()] = 3;
            int[] iArr2 = new int[StateApp.Status.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[StateApp.Status.ACTIVE.ordinal()] = 1;
            $EnumSwitchMapping$1[StateApp.Status.INSTALLING.ordinal()] = 2;
            $EnumSwitchMapping$1[StateApp.Status.PAUSE.ordinal()] = 3;
            $EnumSwitchMapping$1[StateApp.Status.ERROR.ordinal()] = 4;
            $EnumSwitchMapping$1[StateApp.Status.IN_QUEUE.ordinal()] = 5;
            $EnumSwitchMapping$1[StateApp.Status.STANDBY.ordinal()] = 6;
        }
    }

    private final void processDownload(CardHolder cardHolder, DownloadApp downloadApp) {
        cardHolder.getDownloadProgressView().setProgress(downloadApp.getProgress());
        StateApp.Status status = downloadApp.getStatus();
        if (status != null) {
            switch (WhenMappings.$EnumSwitchMapping$1[status.ordinal()]) {
                case 1:
                    setDownloadViewVisibility(cardHolder, false, false);
                    cardHolder.getDownloadProgressView().startDownload();
                    break;
                case 2:
                    setDownloadViewVisibility(cardHolder, false, false);
                    cardHolder.getDownloadProgressView().startInstallation();
                    break;
                case 3:
                    setDownloadViewVisibility(cardHolder, false, false);
                    cardHolder.getDownloadProgressView().pauseDownload();
                    break;
                case 4:
                    setDownloadViewVisibility(cardHolder, false, true);
                    break;
                case 5:
                    cardHolder.getDownloadProgressView().reset();
                    setDownloadViewVisibility(cardHolder, false, false);
                    break;
                case 6:
                    cardHolder.getDownloadProgressView().reset();
                    setDownloadViewVisibility(cardHolder, true, false);
                    break;
            }
        }
        cardHolder.getDownloadProgressView().setProgress(downloadApp.getProgress());
    }

    /* access modifiers changed from: private */
    public final void setDownloadViewVisibility(CardHolder cardHolder, boolean z, boolean z2) {
        if (z2) {
            cardHolder.getDownloadProgressView().setVisibility(8);
            cardHolder.getSecondaryIcon().setVisibility(0);
            cardHolder.getSecondaryText().setVisibility(0);
            cardHolder.getSecondaryIcon().setImageResource(C1086R.C1087drawable.ic_error_outline_red);
            cardHolder.getSecondaryText().setText(C1086R.string.apps_short_error_download);
            cardHolder.getSecondaryText().setTextAppearance(cardHolder.getItemView().getContext(), C1086R.style.Aptoide_TextView_Medium_XS_Red700);
        } else if (z) {
            cardHolder.getDownloadProgressView().setVisibility(8);
            cardHolder.getSecondaryIcon().setVisibility(8);
            cardHolder.getSecondaryText().setVisibility(0);
            cardHolder.getSecondaryText().setText(C1086R.string.apps_short_ready_to_install);
            cardHolder.getSecondaryText().setTextAppearance(cardHolder.getItemView().getContext(), C1086R.style.Aptoide_TextView_Regular_XS_BlackAlpha);
        } else {
            cardHolder.getDownloadProgressView().setVisibility(0);
            cardHolder.getSecondaryIcon().setVisibility(8);
            cardHolder.getSecondaryText().setVisibility(8);
        }
    }

    private final void setupListeners(CardHolder cardHolder, DownloadApp downloadApp) {
        cardHolder.getItemView().setOnClickListener(new DownloadCardModel$setupListeners$1(this, downloadApp));
        cardHolder.getDownloadProgressView().setEventListener(new DownloadCardModel$setupListeners$2(this, downloadApp, cardHolder));
    }

    public final DownloadApp getApplication() {
        return this.application;
    }

    public final C12871b<AppClick> getEventSubject() {
        return this.eventSubject;
    }

    public final void setApplication(DownloadApp downloadApp) {
        this.application = downloadApp;
    }

    public final void setEventSubject(C12871b<AppClick> bVar) {
        this.eventSubject = bVar;
    }

    public void bind(CardHolder cardHolder) {
        C10202j.m34178b(cardHolder, "holder");
        DownloadApp downloadApp = this.application;
        if (downloadApp != null) {
            cardHolder.getName().setText(downloadApp.getName());
            ImageLoader.with(cardHolder.getItemView().getContext()).load(downloadApp.getIcon(), cardHolder.getAppIcon());
            cardHolder.getSecondaryText().setText(downloadApp.getVersion());
            setupListeners(cardHolder, downloadApp);
            processDownload(cardHolder, downloadApp);
        }
    }

    public void bind(CardHolder cardHolder, C5631s<?> sVar) {
        C10202j.m34178b(cardHolder, "holder");
        C10202j.m34178b(sVar, "previouslyBoundModel");
        DownloadApp downloadApp = this.application;
        if (downloadApp != null) {
            processDownload(cardHolder, downloadApp);
        }
    }
}
