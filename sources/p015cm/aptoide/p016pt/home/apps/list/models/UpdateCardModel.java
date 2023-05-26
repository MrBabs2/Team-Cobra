package p015cm.aptoide.p016pt.home.apps.list.models;

import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0327d;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.C5631s;
import com.airbnb.epoxy.C5635t;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p218e0.C9132c;
import p015cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import p015cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.apps.AppClick;
import p015cm.aptoide.p016pt.home.apps.model.StateApp;
import p015cm.aptoide.p016pt.home.apps.model.UpdateApp;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p112n.p272c.p273a.p274a.p275a.p276a.C10557a;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u001c\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J(\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u0018\u0010\"\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0005H\u0002R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006$"}, mo16641d2 = {"Lcm/aptoide/pt/home/apps/list/models/UpdateCardModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcm/aptoide/pt/home/apps/list/models/UpdateCardModel$CardHolder;", "()V", "application", "Lcm/aptoide/pt/home/apps/model/UpdateApp;", "getApplication", "()Lcm/aptoide/pt/home/apps/model/UpdateApp;", "setApplication", "(Lcm/aptoide/pt/home/apps/model/UpdateApp;)V", "eventSubject", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/apps/AppClick;", "getEventSubject", "()Lrx/subjects/PublishSubject;", "setEventSubject", "(Lrx/subjects/PublishSubject;)V", "themeManager", "Lcm/aptoide/pt/themes/ThemeManager;", "getThemeManager", "()Lcm/aptoide/pt/themes/ThemeManager;", "setThemeManager", "(Lcm/aptoide/pt/themes/ThemeManager;)V", "bind", "", "holder", "previouslyBoundModel", "Lcom/airbnb/epoxy/EpoxyModel;", "processDownload", "app", "setDownloadViewVisibility", "visible", "", "error", "setupListeners", "CardHolder", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.apps.list.models.UpdateCardModel */
/* compiled from: UpdateCardModel.kt */
public abstract class UpdateCardModel extends C5635t<CardHolder> {
    private UpdateApp application;
    private C12871b<AppClick> eventSubject;
    private ThemeManager themeManager;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\r8FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0006R\u001b\u0010\u001e\u001a\u00020\u00128FX\u0002¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0014R\u001b\u0010!\u001a\u00020\u00128FX\u0002¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b\"\u0010\u0014¨\u0006$"}, mo16641d2 = {"Lcm/aptoide/pt/home/apps/list/models/UpdateCardModel$CardHolder;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "()V", "actionButton", "Landroid/widget/ImageView;", "getActionButton", "()Landroid/widget/ImageView;", "actionButton$delegate", "Lkotlin/properties/ReadOnlyProperty;", "appIcon", "getAppIcon", "appIcon$delegate", "downloadProgressView", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "getDownloadProgressView", "()Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "downloadProgressView$delegate", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "name$delegate", "rootLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getRootLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "rootLayout$delegate", "secondaryIcon", "getSecondaryIcon", "secondaryIcon$delegate", "secondaryText", "getSecondaryText", "secondaryText$delegate", "tertiaryText", "getTertiaryText", "tertiaryText$delegate", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.home.apps.list.models.UpdateCardModel$CardHolder */
    /* compiled from: UpdateCardModel.kt */
    public static final class CardHolder extends C10557a {
        static final /* synthetic */ C9168l[] $$delegatedProperties;
        private final C9132c actionButton$delegate = bind(C1086R.C1088id.apps_action_button);
        private final C9132c appIcon$delegate = bind(C1086R.C1088id.apps_app_icon);
        private final C9132c downloadProgressView$delegate = bind(C1086R.C1088id.download_progress_view);
        private final C9132c name$delegate = bind(C1086R.C1088id.apps_app_name);
        private final C9132c rootLayout$delegate = bind(C1086R.C1088id.root_layout);
        private final C9132c secondaryIcon$delegate = bind(C1086R.C1088id.secondary_icon);
        private final C9132c secondaryText$delegate = bind(C1086R.C1088id.apps_secondary_text);
        private final C9132c tertiaryText$delegate = bind(C1086R.C1088id.apps_tertiary_text);

        static {
            Class<CardHolder> cls = CardHolder.class;
            $$delegatedProperties = new C9168l[]{C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "name", "getName()Landroid/widget/TextView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "appIcon", "getAppIcon()Landroid/widget/ImageView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "secondaryText", "getSecondaryText()Landroid/widget/TextView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "secondaryIcon", "getSecondaryIcon()Landroid/widget/ImageView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "tertiaryText", "getTertiaryText()Landroid/widget/TextView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "actionButton", "getActionButton()Landroid/widget/ImageView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "downloadProgressView", "getDownloadProgressView()Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "rootLayout", "getRootLayout()Landroidx/constraintlayout/widget/ConstraintLayout;"))};
        }

        public final ImageView getActionButton() {
            return (ImageView) this.actionButton$delegate.mo33478a(this, $$delegatedProperties[5]);
        }

        public final ImageView getAppIcon() {
            return (ImageView) this.appIcon$delegate.mo33478a(this, $$delegatedProperties[1]);
        }

        public final DownloadProgressView getDownloadProgressView() {
            return (DownloadProgressView) this.downloadProgressView$delegate.mo33478a(this, $$delegatedProperties[6]);
        }

        public final TextView getName() {
            return (TextView) this.name$delegate.mo33478a(this, $$delegatedProperties[0]);
        }

        public final ConstraintLayout getRootLayout() {
            return (ConstraintLayout) this.rootLayout$delegate.mo33478a(this, $$delegatedProperties[7]);
        }

        public final ImageView getSecondaryIcon() {
            return (ImageView) this.secondaryIcon$delegate.mo33478a(this, $$delegatedProperties[3]);
        }

        public final TextView getSecondaryText() {
            return (TextView) this.secondaryText$delegate.mo33478a(this, $$delegatedProperties[2]);
        }

        public final TextView getTertiaryText() {
            return (TextView) this.tertiaryText$delegate.mo33478a(this, $$delegatedProperties[4]);
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.home.apps.list.models.UpdateCardModel$WhenMappings */
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

    private final void processDownload(CardHolder cardHolder, UpdateApp updateApp) {
        StateApp.Status status = updateApp.getStatus();
        if (status != null) {
            switch (WhenMappings.$EnumSwitchMapping$1[status.ordinal()]) {
                case 1:
                    setDownloadViewVisibility(cardHolder, updateApp, true, false);
                    cardHolder.getDownloadProgressView().startDownload();
                    break;
                case 2:
                    setDownloadViewVisibility(cardHolder, updateApp, true, false);
                    cardHolder.getDownloadProgressView().startInstallation();
                    break;
                case 3:
                    setDownloadViewVisibility(cardHolder, updateApp, true, false);
                    cardHolder.getDownloadProgressView().pauseDownload();
                    break;
                case 4:
                    setDownloadViewVisibility(cardHolder, updateApp, false, true);
                    break;
                case 5:
                    cardHolder.getDownloadProgressView().reset();
                    setDownloadViewVisibility(cardHolder, updateApp, true, false);
                    break;
                case 6:
                    cardHolder.getDownloadProgressView().reset();
                    setDownloadViewVisibility(cardHolder, updateApp, false, false);
                    break;
            }
        }
        cardHolder.getDownloadProgressView().setProgress(updateApp.getProgress());
    }

    /* access modifiers changed from: private */
    public final void setDownloadViewVisibility(CardHolder cardHolder, UpdateApp updateApp, boolean z, boolean z2) {
        TypedValue attributeForTheme;
        int i = 8;
        if (z) {
            cardHolder.getDownloadProgressView().setVisibility(0);
            cardHolder.getSecondaryIcon().setVisibility(8);
            cardHolder.getSecondaryText().setVisibility(8);
            cardHolder.getTertiaryText().setVisibility(8);
            cardHolder.getActionButton().setVisibility(4);
            C0327d dVar = new C0327d();
            dVar.mo2052b(cardHolder.getRootLayout());
            dVar.mo2045a(C1086R.C1088id.apps_app_name, 4, C1086R.C1088id.apps_app_icon, 4);
            dVar.mo2045a(C1086R.C1088id.apps_app_name, 3, C1086R.C1088id.apps_app_icon, 3);
            dVar.mo2044a((int) C1086R.C1088id.apps_app_name, 0.0f);
            dVar.mo2048a(cardHolder.getRootLayout());
        } else {
            cardHolder.getDownloadProgressView().setVisibility(8);
            cardHolder.getSecondaryIcon().setVisibility(0);
            cardHolder.getSecondaryText().setVisibility(0);
            TextView tertiaryText = cardHolder.getTertiaryText();
            if (updateApp.isInstalledWithAptoide()) {
                i = 0;
            }
            tertiaryText.setVisibility(i);
            cardHolder.getActionButton().setVisibility(0);
            C0327d dVar2 = new C0327d();
            dVar2.mo2052b(cardHolder.getRootLayout());
            dVar2.mo2045a(C1086R.C1088id.apps_app_name, 4, C1086R.C1088id.apps_secondary_text, 3);
            dVar2.mo2045a(C1086R.C1088id.apps_app_name, 3, cardHolder.getRootLayout().getId(), 3);
            dVar2.mo2044a((int) C1086R.C1088id.apps_app_name, 0.5f);
            dVar2.mo2048a(cardHolder.getRootLayout());
        }
        if (z2) {
            cardHolder.getSecondaryIcon().setImageResource(C1086R.C1087drawable.ic_error_outline_red);
            cardHolder.getSecondaryText().setText(C1086R.string.apps_short_error_download);
            cardHolder.getSecondaryText().setTextAppearance(cardHolder.getItemView().getContext(), C1086R.style.Aptoide_TextView_Medium_XS_Red700);
            return;
        }
        ThemeManager themeManager2 = this.themeManager;
        if (!(themeManager2 == null || (attributeForTheme = themeManager2.getAttributeForTheme(C1086R.attr.version_refresh_icon)) == null)) {
            cardHolder.getSecondaryIcon().setImageResource(attributeForTheme.resourceId);
        }
        cardHolder.getSecondaryText().setText(updateApp.getVersion());
        cardHolder.getSecondaryText().setTextAppearance(cardHolder.getItemView().getContext(), C1086R.style.Aptoide_TextView_Medium_XS_Grey);
    }

    private final void setupListeners(CardHolder cardHolder, UpdateApp updateApp) {
        cardHolder.getActionButton().setOnClickListener(new UpdateCardModel$setupListeners$1(this, updateApp));
        cardHolder.getItemView().setOnClickListener(new UpdateCardModel$setupListeners$2(this, updateApp));
        cardHolder.getItemView().setOnLongClickListener(new UpdateCardModel$setupListeners$3(this, updateApp));
        cardHolder.getDownloadProgressView().setEventListener(new UpdateCardModel$setupListeners$4(this, updateApp, cardHolder));
    }

    public final UpdateApp getApplication() {
        return this.application;
    }

    public final C12871b<AppClick> getEventSubject() {
        return this.eventSubject;
    }

    public final ThemeManager getThemeManager() {
        return this.themeManager;
    }

    public final void setApplication(UpdateApp updateApp) {
        this.application = updateApp;
    }

    public final void setEventSubject(C12871b<AppClick> bVar) {
        this.eventSubject = bVar;
    }

    public final void setThemeManager(ThemeManager themeManager2) {
        this.themeManager = themeManager2;
    }

    public void bind(CardHolder cardHolder) {
        C10202j.m34178b(cardHolder, "holder");
        UpdateApp updateApp = this.application;
        if (updateApp != null) {
            cardHolder.getName().setText(updateApp.getName());
            ImageLoader.with(cardHolder.getItemView().getContext()).load(updateApp.getIcon(), cardHolder.getAppIcon());
            cardHolder.getSecondaryText().setText(updateApp.getVersion());
            setupListeners(cardHolder, updateApp);
            processDownload(cardHolder, updateApp);
        }
    }

    public void bind(CardHolder cardHolder, C5631s<?> sVar) {
        C10202j.m34178b(cardHolder, "holder");
        C10202j.m34178b(sVar, "previouslyBoundModel");
        UpdateApp updateApp = this.application;
        if (updateApp != null) {
            processDownload(cardHolder, updateApp);
        }
    }
}
