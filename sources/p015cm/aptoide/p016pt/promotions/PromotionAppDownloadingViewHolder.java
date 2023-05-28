package p015cm.aptoide.p016pt.promotions;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.promotions.PromotionAppClick;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.promotions.PromotionAppDownloadingViewHolder */
class PromotionAppDownloadingViewHolder extends RecyclerView.C0629c0 {
    private TextView appDescription;
    private ImageView appIcon;
    private TextView appName;
    private TextView appRewardMessage;
    private ImageView cancelDownload;
    private LinearLayout downloadControlsLayout;
    private ProgressBar downloadProgressBar;
    private TextView downloadProgressValue;
    private ImageView pauseDownload;
    private final C12871b<PromotionAppClick> promotionAppClick;
    private ImageView resumeDownload;

    /* renamed from: cm.aptoide.pt.promotions.PromotionAppDownloadingViewHolder$1 */
    static /* synthetic */ class C37301 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.app.DownloadModel$DownloadState[] r0 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState = r0
                cm.aptoide.pt.app.DownloadModel$DownloadState r1 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.app.DownloadModel$DownloadState r1 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.INDETERMINATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.app.DownloadModel$DownloadState r1 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.PAUSE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.app.DownloadModel$DownloadState r1 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.app.DownloadModel$DownloadState r1 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x0049 }
                cm.aptoide.pt.app.DownloadModel$DownloadState r1 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.COMPLETE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.promotions.PromotionAppDownloadingViewHolder.C37301.<clinit>():void");
        }
    }

    public PromotionAppDownloadingViewHolder(View view, C12871b<PromotionAppClick> bVar) {
        super(view);
        this.appIcon = (ImageView) view.findViewById(C1086R.C1088id.app_icon);
        this.appName = (TextView) view.findViewById(C1086R.C1088id.app_name);
        this.appDescription = (TextView) view.findViewById(C1086R.C1088id.app_description);
        this.downloadProgressBar = (ProgressBar) view.findViewById(C1086R.C1088id.promotions_download_progress_bar);
        this.downloadProgressValue = (TextView) view.findViewById(C1086R.C1088id.promotions_download_progress_number);
        this.pauseDownload = (ImageView) view.findViewById(C1086R.C1088id.promotions_download_pause_download);
        this.cancelDownload = (ImageView) view.findViewById(C1086R.C1088id.promotions_download_cancel_button);
        this.resumeDownload = (ImageView) view.findViewById(C1086R.C1088id.promotions_download_resume_download);
        this.downloadControlsLayout = (LinearLayout) view.findViewById(C1086R.C1088id.install_controls_layout);
        this.appRewardMessage = (TextView) view.findViewById(C1086R.C1088id.app_reward);
        this.promotionAppClick = bVar;
    }

    private SpannableString handleRewardMessage(float f, String str, double d, boolean z) {
        String str2;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String d2 = Double.toString(Math.floor((double) f));
        if (z) {
            Context context = this.itemView.getContext();
            str2 = context.getString(C1086R.string.FIATpromotion_update_to_get_short, new Object[]{d2, str + decimalFormat.format(d)});
        } else {
            Context context2 = this.itemView.getContext();
            str2 = context2.getString(C1086R.string.FIATpromotion_install_to_get_short, new Object[]{d2, str + decimalFormat.format(d)});
        }
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new ForegroundColorSpan(this.itemView.getContext().getResources().getColor(C1086R.color.promotions_reward)), str2.indexOf(d2), str2.length(), 33);
        return spannableString;
    }

    private void setAppCardHeader(PromotionViewApp promotionViewApp) {
        ImageLoader.with(this.itemView.getContext()).load(promotionViewApp.getAppIcon(), this.appIcon);
        this.appName.setText(promotionViewApp.getName());
        this.appDescription.setText(promotionViewApp.getDescription());
        this.appRewardMessage.setText(handleRewardMessage(promotionViewApp.getAppcValue(), promotionViewApp.getFiatSymbol(), promotionViewApp.getFiatValue(), promotionViewApp.getDownloadModel().getAction().equals(DownloadModel.Action.UPDATE)));
    }

    private void setDownloadState(int i, PromotionViewApp promotionViewApp) {
        DownloadModel.DownloadState downloadState = promotionViewApp.getDownloadModel().getDownloadState();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        switch (C37301.$SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[downloadState.ordinal()]) {
            case 1:
                this.downloadProgressBar.setIndeterminate(false);
                this.downloadProgressBar.setProgress(i);
                TextView textView = this.downloadProgressValue;
                textView.setText(String.valueOf(i) + "%");
                this.pauseDownload.setVisibility(0);
                this.pauseDownload.setOnClickListener(new C3745b1(this, promotionViewApp));
                this.cancelDownload.setVisibility(8);
                this.resumeDownload.setVisibility(8);
                this.downloadControlsLayout.setLayoutParams(layoutParams);
                return;
            case 2:
                this.downloadProgressBar.setIndeterminate(true);
                this.pauseDownload.setVisibility(0);
                this.pauseDownload.setOnClickListener(new C3770e1(this, promotionViewApp));
                this.cancelDownload.setVisibility(8);
                this.resumeDownload.setVisibility(8);
                this.downloadControlsLayout.setLayoutParams(layoutParams);
                return;
            case 3:
                this.downloadProgressBar.setIndeterminate(false);
                this.downloadProgressBar.setProgress(i);
                TextView textView2 = this.downloadProgressValue;
                textView2.setText(String.valueOf(i) + "%");
                this.pauseDownload.setVisibility(8);
                this.cancelDownload.setVisibility(0);
                this.cancelDownload.setOnClickListener(new C3762d1(this, promotionViewApp));
                this.resumeDownload.setVisibility(0);
                this.resumeDownload.setOnClickListener(new C3754c1(this, promotionViewApp));
                this.downloadControlsLayout.setLayoutParams(layoutParams2);
                return;
            case 4:
            case 5:
            case 6:
                this.downloadProgressBar.setIndeterminate(true);
                this.pauseDownload.setVisibility(0);
                this.pauseDownload.setOnClickListener(new C3736a1(this, promotionViewApp));
                this.cancelDownload.setVisibility(8);
                this.resumeDownload.setVisibility(8);
                this.downloadControlsLayout.setLayoutParams(layoutParams);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo13624a(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* renamed from: b */
    public /* synthetic */ void mo13625b(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* renamed from: c */
    public /* synthetic */ void mo13626c(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.CANCEL_DOWNLOAD));
    }

    /* renamed from: d */
    public /* synthetic */ void mo13627d(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.RESUME_DOWNLOAD));
    }

    /* renamed from: e */
    public /* synthetic */ void mo13628e(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    public void setApp(PromotionViewApp promotionViewApp) {
        setAppCardHeader(promotionViewApp);
        setDownloadState(promotionViewApp.getDownloadModel().getProgress(), promotionViewApp);
    }
}
