package p015cm.aptoide.p016pt.view.feedback;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.core.content.FileProvider;
import androidx.fragment.app.C0485m;
import java.io.File;
import java.util.ArrayList;
import javax.inject.Inject;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p015cm.aptoide.p016pt.view.fragment.BaseToolbarFragment;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5375k;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.view.feedback.SendFeedbackFragment */
public class SendFeedbackFragment extends BaseToolbarFragment implements NotBottomNavigationView {
    private static final String CARD_ID = "card_id";
    public static final String LOGS_FILE_NAME = "logs.txt";
    public static final String SCREENSHOT_PATH = "SCREENSHOT_PATH";
    private final String KEY_SCREENSHOT_PATH = "screenShotPath";
    @Inject
    AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private NavigationTracker aptoideNavigationTracker;
    private String cardId;
    private CrashReport crashReport;
    private CheckBox logsAndScreenshotsCb;
    private EditText messageBodyEdit;
    private String screenShotPath;
    private Button sendFeedbackBtn;
    private EditText subgectEdit;
    private C5375k unManagedSubscription;

    private Uri getUriFromFile(File file) {
        if (Build.VERSION.SDK_INT > 23) {
            return FileProvider.m1898a(getContext(), "cm.aptoide.pt.provider", file);
        }
        return Uri.fromFile(file);
    }

    public static SendFeedbackFragment newInstance(String str) {
        SendFeedbackFragment sendFeedbackFragment = new SendFeedbackFragment();
        Bundle bundle = new Bundle();
        bundle.putString(SCREENSHOT_PATH, str);
        sendFeedbackFragment.setArguments(bundle);
        return sendFeedbackFragment;
    }

    private void sendFeedback() {
        if (isContentValid()) {
            Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
            intent.setType("message/rfc822");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{((AptoideApplication) getContext().getApplicationContext()).getFeedbackEmail()});
            this.unManagedSubscription = this.aptoideInstalledAppsRepository.getInstalled(getContext().getPackageName()).mo18669c().mo18644a(C5376a.m10346b()).mo18655a(new C4624c(this, intent, getContext().getApplicationContext().getCacheDir().getPath()), (C5378b<Throwable>) new C4625d(this));
            return;
        }
        ShowMessage.asSnack(getView(), (int) C1086R.string.feedback_not_valid);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15585a(Void voidR) {
        sendFeedback();
    }

    /* renamed from: b */
    public /* synthetic */ void mo15586b(Throwable th) {
        this.crashReport.log(th);
    }

    public void bindViews(View view) {
        super.bindViews(view);
        this.subgectEdit = (EditText) view.findViewById(C1086R.C1088id.FeedBackSubject);
        this.messageBodyEdit = (EditText) view.findViewById(C1086R.C1088id.FeedBacktext);
        this.sendFeedbackBtn = (Button) view.findViewById(C1086R.C1088id.FeedBackSendButton);
        this.logsAndScreenshotsCb = (CheckBox) view.findViewById(C1086R.C1088id.FeedBackCheckBox);
    }

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return true;
    }

    public int getContentViewId() {
        return C1086R.layout.activity_feed_back;
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(SendFeedbackFragment.class.getSimpleName());
    }

    public boolean isContentValid() {
        return !TextUtils.isEmpty(this.subgectEdit.getText().toString());
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.aptoideNavigationTracker = ((AptoideApplication) getContext().getApplicationContext()).getNavigationTracker();
        this.crashReport = CrashReport.getInstance();
        setHasOptionsMenu(true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        C5375k kVar = this.unManagedSubscription;
        if (kVar != null) {
            kVar.unsubscribe();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("screenShotPath", this.screenShotPath);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.screenShotPath = bundle.getString("screenShotPath");
        }
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
        this.screenShotPath = bundle.getString(SCREENSHOT_PATH);
        this.cardId = bundle.getString(CARD_ID);
    }

    public void setupViews() {
        super.setupViews();
        C10695a.m36221a(this.sendFeedbackBtn).mo18655a(new C4623b(this), (C5378b<Throwable>) new C4622a(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo15583a(Intent intent, String str, RoomInstalled roomInstalled) {
        String versionName = roomInstalled != null ? roomInstalled.getVersionName() : "";
        intent.putExtra("android.intent.extra.SUBJECT", "[Feedback]-" + versionName + ": " + this.subgectEdit.getText().toString());
        intent.putExtra("android.intent.extra.TEXT", this.messageBodyEdit.getText().toString());
        if (this.logsAndScreenshotsCb.isChecked()) {
            ArrayList arrayList = new ArrayList();
            if (this.screenShotPath != null) {
                arrayList.add(getUriFromFile(new File(this.screenShotPath)));
            }
            String str2 = this.cardId;
            if (str2 == null) {
                str2 = this.aptoideNavigationTracker.getPrettyScreenHistory();
            }
            File readLogs = AptoideUtils.SystemU.readLogs(str, LOGS_FILE_NAME, str2);
            if (readLogs != null) {
                arrayList.add(getUriFromFile(readLogs));
            }
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        }
        try {
            C0485m a = getActivity().getSupportFragmentManager().mo2793a();
            a.mo2691c(this);
            a.mo2675a();
            startActivity(intent);
            getActivity().onBackPressed();
        } catch (ActivityNotFoundException unused) {
            ShowMessage.asSnack(getView(), (int) C1086R.string.feedback_no_email);
        }
    }

    public static SendFeedbackFragment newInstance() {
        return new SendFeedbackFragment();
    }

    public static SendFeedbackFragment newInstance(String str, String str2) {
        SendFeedbackFragment sendFeedbackFragment = new SendFeedbackFragment();
        Bundle bundle = new Bundle();
        bundle.putString(SCREENSHOT_PATH, str);
        bundle.putString(CARD_ID, str2);
        sendFeedbackFragment.setArguments(bundle);
        return sendFeedbackFragment;
    }

    /* renamed from: a */
    public /* synthetic */ void mo15584a(Throwable th) {
        this.crashReport.log(th);
    }
}
