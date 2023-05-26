package p015cm.aptoide.p016pt.app.view;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.fragment.app.C0456c;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.Translator;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.app.view.OfficialAppWidget */
public class OfficialAppWidget extends Widget<OfficialAppDisplayable> {
    private static final String TAG = "cm.aptoide.pt.app.view.OfficialAppWidget";
    private TextView appDownloads;
    private ImageView appImage;
    private TextView appName;
    private RatingBar appRating;
    private TextView appSize;
    private TextView appVersion;
    private Button installButton;
    private TextView installMessage;
    private View verticalSeparator;

    public OfficialAppWidget(View view) {
        super(view);
    }

    private void hideOfficialAppMessage() {
        this.installMessage.setVisibility(8);
        this.verticalSeparator.setVisibility(8);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7608a(boolean z, GetAppMeta.App app, Void voidR) {
        if (z) {
            AptoideUtils.SystemU.openApp(app.getPackageName(), getContext().getPackageManager(), getContext());
            return;
        }
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(app.getPackageName(), AppViewFragment.OpenType.OPEN_AND_INSTALL), true);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.appImage = (ImageView) view.findViewById(C1086R.C1088id.app_image);
        this.installButton = (Button) view.findViewById(C1086R.C1088id.app_install_button);
        this.installMessage = (TextView) view.findViewById(C1086R.C1088id.install_message);
        this.appName = (TextView) view.findViewById(C1086R.C1088id.app_name);
        this.verticalSeparator = view.findViewById(C1086R.C1088id.vertical_separator);
        this.appRating = (RatingBar) view.findViewById(C1086R.C1088id.app_rating);
        this.appDownloads = (TextView) view.findViewById(C1086R.C1088id.app_downloads);
        this.appVersion = (TextView) view.findViewById(C1086R.C1088id.app_version);
        this.appSize = (TextView) view.findViewById(C1086R.C1088id.app_size);
    }

    public void bindView(OfficialAppDisplayable officialAppDisplayable, int i) {
        C0456c context = getContext();
        Pair<String, GetAppMeta> messageGetApp = officialAppDisplayable.getMessageGetApp();
        boolean isAppInstalled = officialAppDisplayable.isAppInstalled();
        int primaryColor = officialAppDisplayable.getPrimaryColor();
        GetAppMeta.App data = ((GetAppMeta) messageGetApp.second).getData();
        String name = data.getName();
        if (!TextUtils.isEmpty((CharSequence) messageGetApp.first)) {
            String[] translateToMultiple = Translator.translateToMultiple((String) messageGetApp.first, getContext().getApplicationContext());
            if (translateToMultiple == null || translateToMultiple.length != 4) {
                this.installMessage.setText((CharSequence) messageGetApp.first);
            } else {
                SpannableString spannableString = new SpannableString(String.format(isAppInstalled ? translateToMultiple[3] : translateToMultiple[2], new Object[]{name}));
                spannableString.setSpan(new ForegroundColorSpan(primaryColor), 0, spannableString.length(), 17);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(translateToMultiple[0]);
                spannableStringBuilder.append(spannableString);
                spannableStringBuilder.append(translateToMultiple[1]);
                this.installMessage.setText(spannableStringBuilder);
            }
        } else {
            hideOfficialAppMessage();
        }
        this.appRating.setRating(data.getStats().getRating().getAvg());
        this.appName.setText(name);
        this.appDownloads.setText(String.format(context.getString(C1086R.string.downloads_count), new Object[]{AptoideUtils.StringU.withSuffix((long) data.getStats().getDownloads())}));
        this.appVersion.setText(String.format(context.getString(C1086R.string.version_number), new Object[]{data.getFile().getVername()}));
        this.appSize.setText(String.format(context.getString(C1086R.string.app_size), new Object[]{AptoideUtils.StringU.formatBytes(data.getFile().getFilesize(), false)}));
        ImageLoader.with(context).load(data.getIcon(), this.appImage);
        this.installButton.setBackgroundResource(officialAppDisplayable.getRaisedButtonDrawable());
        this.installButton.setText(context.getString(isAppInstalled ? C1086R.string.open : C1086R.string.install));
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.installButton).mo18655a(new C1828tg(this, isAppInstalled, data), (C5378b<Throwable>) C1808sg.f4396f));
    }
}
