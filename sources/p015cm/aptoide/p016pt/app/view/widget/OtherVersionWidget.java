package p015cm.aptoide.p016pt.app.view.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C0285s0;
import java.util.Locale;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.view.displayable.OtherVersionDisplayable;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;

/* renamed from: cm.aptoide.pt.app.view.widget.OtherVersionWidget */
public class OtherVersionWidget extends Widget<OtherVersionDisplayable> implements View.OnClickListener {
    private static final Locale DEFAULT_LOCALE = Locale.getDefault();
    private static final String TAG = OtherVersionWidget.class.getSimpleName();
    private long appId;
    private TextView date;
    private OtherVersionDisplayable displayable;
    private TextView downloads;
    private TextView followers;
    private String packageName;
    private ImageView storeIcon;
    private String storeName;
    private TextView storeNameView;
    private ImageView trustedBadge;
    private TextView version;

    /* renamed from: cm.aptoide.pt.app.view.widget.OtherVersionWidget$1 */
    static /* synthetic */ class C18831 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                cm.aptoide.pt.dataprovider.model.v7.Malware$Rank[] r0 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Rank.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank = r0
                cm.aptoide.pt.dataprovider.model.v7.Malware$Rank r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Rank.TRUSTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.dataprovider.model.v7.Malware$Rank r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Rank.WARNING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.dataprovider.model.v7.Malware$Rank r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Rank.CRITICAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.dataprovider.model.v7.Malware$Rank r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Rank.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.app.view.widget.OtherVersionWidget.C18831.<clinit>():void");
        }
    }

    public OtherVersionWidget(View view) {
        super(view);
    }

    private void navigateToAppView() {
        Logger instance = Logger.getInstance();
        String str = TAG;
        instance.mo12975d(str, "showing other version for app with id = " + this.appId);
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(this.appId, this.packageName, (String) null, this.storeName, ""), true);
    }

    private void setBadge(App app) {
        Malware.Rank rank;
        if (app.getFile().getMalware().getRank() == null) {
            rank = Malware.Rank.UNKNOWN;
        } else {
            rank = app.getFile().getMalware().getRank();
        }
        int i = C18831.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank[rank.ordinal()];
        this.trustedBadge.setImageResource(i != 1 ? i != 2 ? i != 3 ? 0 : C1086R.C1087drawable.ic_badges_critical : C1086R.C1087drawable.ic_badges_warning : C1086R.C1087drawable.ic_badges_trusted);
    }

    private void setItemBackgroundColor(View view) {
        int i;
        Resources.Theme theme = view.getContext().getTheme();
        Resources resources = view.getResources();
        if (getLayoutPosition() % 2 == 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                i = resources.getColor(this.displayable.getThemeManager().getAttributeForTheme(C1086R.attr.backgroundSecondary).resourceId, theme);
            } else {
                i = resources.getColor(this.displayable.getThemeManager().getAttributeForTheme(C1086R.attr.backgroundSecondary).resourceId);
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            i = resources.getColor(this.displayable.getThemeManager().getAttributeForTheme(C1086R.attr.backgroundMain).resourceId, theme);
        } else {
            i = resources.getColor(this.displayable.getThemeManager().getAttributeForTheme(C1086R.attr.backgroundMain).resourceId);
        }
        view.setBackgroundColor(i);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7734a(View view) {
        navigateToAppView();
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.version = (TextView) view.findViewById(C1086R.C1088id.version_name);
        this.trustedBadge = (ImageView) view.findViewById(C1086R.C1088id.badge_icon);
        this.date = (TextView) view.findViewById(C1086R.C1088id.version_date);
        this.downloads = (TextView) view.findViewById(C1086R.C1088id.downloads);
        this.storeIcon = (ImageView) view.findViewById(C1086R.C1088id.store_icon);
        this.storeNameView = (TextView) view.findViewById(C1086R.C1088id.store_name);
        this.followers = (TextView) view.findViewById(C1086R.C1088id.store_followers);
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        navigateToAppView();
    }

    public void bindView(OtherVersionDisplayable otherVersionDisplayable, int i) {
        this.displayable = otherVersionDisplayable;
        setItemBackgroundColor(this.itemView);
        try {
            App app = (App) otherVersionDisplayable.getPojo();
            this.appId = app.getId();
            this.storeName = app.getStore().getName();
            this.packageName = app.getPackageName();
            this.version.setText(app.getFile().getVername());
            C0285s0.m1359a(this.version, app.getFile().getVername());
            this.version.setOnClickListener(new C1884a(this));
            setBadge(app);
            this.date.setText(AptoideUtils.DateTimeU.getInstance(getContext()).getTimeDiffString((Context) getContext(), app.getModified().getTime(), getContext().getResources()));
            this.downloads.setText(String.format(DEFAULT_LOCALE, getContext().getString(C1086R.string.other_versions_downloads_count_text), new Object[]{AptoideUtils.StringU.withSuffix((long) app.getStats().getDownloads())}));
            ImageLoader.with(getContext()).load(app.getStore().getAvatar(), this.storeIcon);
            this.storeNameView.setText(app.getStore().getName());
            this.followers.setText(String.format(DEFAULT_LOCALE, getContext().getString(C1086R.string.appview_followers_count_text), new Object[]{Integer.valueOf(app.getStore().getStats().getSubscribers())}));
        } catch (NullPointerException e) {
            CrashReport.getInstance().log(e);
        }
    }
}
