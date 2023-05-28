package p015cm.aptoide.p016pt.view.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.C0456c;
import com.trello.rxlifecycle.C4749b;
import com.trello.rxlifecycle.C4750c;
import com.trello.rxlifecycle.p209g.C9008b;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.navigator.ActivityNavigator;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentResultNavigator;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.util.ScreenTrackingUtils;
import p015cm.aptoide.p016pt.view.BaseFragment;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.view.fragment.FragmentView */
public abstract class FragmentView extends BaseFragment implements View {
    private static final String TAG = FragmentView.class.getName();
    private ActivityResultNavigator activityResultNavigator;
    private boolean startActivityForResultCalled;

    /* renamed from: cm.aptoide.pt.view.fragment.FragmentView$1 */
    static /* synthetic */ class C46281 {
        static final /* synthetic */ int[] $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.trello.rxlifecycle.g.b[] r0 = com.trello.rxlifecycle.p209g.C9008b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent = r0
                com.trello.rxlifecycle.g.b r1 = com.trello.rxlifecycle.p209g.C9008b.ATTACH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent     // Catch:{ NoSuchFieldError -> 0x001d }
                com.trello.rxlifecycle.g.b r1 = com.trello.rxlifecycle.p209g.C9008b.CREATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.trello.rxlifecycle.g.b r1 = com.trello.rxlifecycle.p209g.C9008b.CREATE_VIEW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.trello.rxlifecycle.g.b r1 = com.trello.rxlifecycle.p209g.C9008b.START     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent     // Catch:{ NoSuchFieldError -> 0x003e }
                com.trello.rxlifecycle.g.b r1 = com.trello.rxlifecycle.p209g.C9008b.RESUME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.trello.rxlifecycle.g.b r1 = com.trello.rxlifecycle.p209g.C9008b.PAUSE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.trello.rxlifecycle.g.b r1 = com.trello.rxlifecycle.p209g.C9008b.STOP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.trello.rxlifecycle.g.b r1 = com.trello.rxlifecycle.p209g.C9008b.DESTROY_VIEW     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent     // Catch:{ NoSuchFieldError -> 0x006c }
                com.trello.rxlifecycle.g.b r1 = com.trello.rxlifecycle.p209g.C9008b.DETACH     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.trello.rxlifecycle.g.b r1 = com.trello.rxlifecycle.p209g.C9008b.DESTROY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.view.fragment.FragmentView.C46281.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: convertToEvent */
    public C5368e<View.LifecycleEvent> mo15622a(C9008b bVar) {
        switch (C46281.$SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[bVar.ordinal()]) {
            case 1:
            case 2:
                return C5368e.m10265n();
            case 3:
                return C5368e.m10257c(View.LifecycleEvent.CREATE);
            case 4:
                return C5368e.m10257c(View.LifecycleEvent.START);
            case 5:
                return C5368e.m10257c(View.LifecycleEvent.RESUME);
            case 6:
                return C5368e.m10257c(View.LifecycleEvent.PAUSE);
            case 7:
                return C5368e.m10257c(View.LifecycleEvent.STOP);
            case 8:
                return C5368e.m10257c(View.LifecycleEvent.DESTROY);
            case 9:
            case 10:
                return C5368e.m10265n();
            default:
                throw new IllegalStateException("Unrecognized event: " + bVar.name());
        }
    }

    public void attachPresenter(Presenter presenter) {
        presenter.present();
    }

    public final <T> C4749b<T> bindUntilEvent(View.LifecycleEvent lifecycleEvent) {
        return C4750c.m7795a(getLifecycleEvent(), lifecycleEvent);
    }

    public ActivityNavigator getActivityNavigator() {
        return this.activityResultNavigator.getActivityNavigator();
    }

    public FragmentNavigator getFragmentChildNavigator(int i) {
        return new FragmentResultNavigator(getChildFragmentManager(), i, 17432576, 17432577, this.activityResultNavigator.getFragmentResultMap(), this.activityResultNavigator.getFragmentResultRelay());
    }

    public FragmentNavigator getFragmentNavigator() {
        return this.activityResultNavigator.getFragmentNavigator();
    }

    public C5368e<View.LifecycleEvent> getLifecycleEvent() {
        return lifecycle().mo18687f(new C4633d(this));
    }

    /* access modifiers changed from: protected */
    public void hideKeyboard() {
        C0456c activity = getActivity();
        android.view.View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    public boolean isStartActivityForResultCalled() {
        return this.startActivityForResultCalled;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.activityResultNavigator = (ActivityResultNavigator) activity;
        } catch (ClassCastException unused) {
            Logger.getInstance().mo12979e(TAG, String.format("Parent activity must implement %s interface", new Object[]{ActivityResultNavigator.class.getName()}));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ScreenTrackingUtils.getInstance().incrementNumberOfScreens();
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public void onDestroy() {
        super.onDestroy();
        ScreenTrackingUtils.getInstance().decrementNumberOfScreens();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (getFragmentNavigator().popBackStack()) {
            return true;
        }
        getActivityNavigator().navigateBack();
        return true;
    }

    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            ScreenTrackingUtils.getInstance().addScreenToHistory(getClass().getSimpleName());
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        this.startActivityForResultCalled = true;
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        this.startActivityForResultCalled = true;
        super.startActivityForResult(intent, i, bundle);
    }
}
