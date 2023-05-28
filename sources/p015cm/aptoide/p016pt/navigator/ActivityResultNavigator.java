package p015cm.aptoide.p016pt.navigator;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.BaseActivity;
import p015cm.aptoide.p016pt.view.fragment.FragmentView;
import p112n.p118g.p119b.C5303a;
import p112n.p118g.p119b.C5305c;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.navigator.ActivityResultNavigator */
public abstract class ActivityResultNavigator extends BaseActivity implements ActivityNavigator {
    @Inject
    AccountNavigator accountNavigator;
    private FragmentNavigator fragmentNavigator;
    private Map<Integer, Result> fragmentResultMap;
    private C5303a<Map<Integer, Result>> fragmentResultRelay;
    @Inject
    @Named
    String marketName;
    private C5305c<Result> resultRelay;
    @Inject
    public ThemeManager themeManager;

    /* renamed from: a */
    static /* synthetic */ Boolean m6519a(int i, Result result) {
        return Boolean.valueOf(result.getRequestCode() == i);
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m6520b(int i, Result result) {
        return Boolean.valueOf(result.getRequestCode() == i);
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m6521c(int i, Result result) {
        return Boolean.valueOf(result.getRequestCode() == i);
    }

    public AccountNavigator getAccountNavigator() {
        return this.accountNavigator;
    }

    public Activity getActivity() {
        return this;
    }

    public ActivityNavigator getActivityNavigator() {
        return this;
    }

    public FragmentNavigator getFragmentNavigator() {
        return this.fragmentNavigator;
    }

    public Map<Integer, Result> getFragmentResultMap() {
        return this.fragmentResultMap;
    }

    public C5303a<Map<Integer, Result>> getFragmentResultRelay() {
        return this.fragmentResultRelay;
    }

    public void navigateBack() {
        finish();
    }

    public void navigateBackWithResult(int i, Bundle bundle) {
        setResult(i, new Intent().putExtras(bundle));
        finish();
    }

    public void navigateForResult(Class<? extends Activity> cls, int i, Bundle bundle) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, cls));
        intent.putExtras(bundle);
        startActivityForResult(intent, i);
    }

    public C5368e<Result> navigateForResultWithOutput(String str, Uri uri, int i) {
        Intent intent = new Intent(str);
        if (intent.resolveActivity(getPackageManager()) == null) {
            return C5368e.m10265n();
        }
        intent.putExtra("output", uri);
        startActivityForResult(intent, i);
        return this.resultRelay.mo18681d(new C3425b(i));
    }

    public void navigateTo(Class<? extends Activity> cls) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, cls));
        startActivity(intent);
    }

    public void navigateWithIntent(Intent intent) {
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.resultRelay.call(new Result(i, i2, intent));
        Fragment fragment = getFragmentNavigator().getFragment();
        if (fragment != null && (fragment instanceof FragmentView) && !((FragmentView) fragment).isStartActivityForResultCalled()) {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.fragmentResultRelay = ((AptoideApplication) getApplicationContext()).getFragmentResultRelay();
        this.fragmentResultMap = ((AptoideApplication) getApplicationContext()).getFragmentResultMap();
        this.fragmentNavigator = new FragmentResultNavigator(getSupportFragmentManager(), C1086R.C1088id.fragment_placeholder, 17432576, 17432577, this.fragmentResultMap, this.fragmentResultRelay);
        super.onCreate(bundle);
        this.resultRelay = C5305c.m10045o();
        getActivityComponent().inject(this);
    }

    public C5368e<Result> results(int i) {
        return this.resultRelay.mo18681d(new C3426c(i));
    }

    public C5368e<Result> results() {
        return this.resultRelay;
    }

    public void navigateTo(Class<? extends Activity> cls, Bundle bundle) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, cls));
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void navigateForResult(Intent intent, int i) {
        startActivityForResult(intent, i);
    }

    public C5368e<Result> navigateForResult(String str, Uri uri, int i) {
        startActivityForResult(new Intent(str, uri), i);
        return this.resultRelay.mo18681d(new C3424a(i));
    }

    public void navigateForResult(String str, Uri uri, int i, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.setData(uri);
        intent.putExtra(str2, str3);
        startActivityForResult(intent, i);
    }

    public void navigateTo(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        startActivity(intent);
    }
}
