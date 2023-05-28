package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0055c;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.C0352a;
import androidx.core.app.C0388n;
import androidx.lifecycle.C0514f;
import androidx.lifecycle.C0522k;
import androidx.lifecycle.C0546x;
import androidx.lifecycle.C0547y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import okhttp3.internal.http2.Settings;
import p050l.p066e.C4882h;
import p050l.p094l.p095a.C5112a;

/* renamed from: androidx.fragment.app.c */
/* compiled from: FragmentActivity */
public class C0456c extends ComponentActivity implements C0352a.C0354b, C0352a.C0356d {
    static final String ALLOCATED_REQUEST_INDICIES_TAG = "android:support:request_indicies";
    static final String FRAGMENTS_TAG = "android:support:fragments";
    static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS = 65534;
    static final String NEXT_CANDIDATE_REQUEST_INDEX_TAG = "android:support:next_request_index";
    static final String REQUEST_FRAGMENT_WHO_TAG = "android:support:request_fragment_who";
    private static final String TAG = "FragmentActivity";
    boolean mCreated;
    final C0522k mFragmentLifecycleRegistry = new C0522k(this);
    final C0459e mFragments = C0459e.m2215a((C0461g<?>) new C0457a());
    int mNextCandidateRequestIndex;
    C4882h<String> mPendingFragmentActivityResults;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mStartedActivityFromFragment;
    boolean mStartedIntentSenderFromFragment;
    boolean mStopped = true;

    /* renamed from: androidx.fragment.app.c$a */
    /* compiled from: FragmentActivity */
    class C0457a extends C0461g<C0456c> implements C0547y, C0055c {
        public C0457a() {
            super(C0456c.this);
        }

        /* renamed from: a */
        public void mo2752a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C0456c.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: b */
        public boolean mo2754b(Fragment fragment) {
            return !C0456c.this.isFinishing();
        }

        /* renamed from: f */
        public LayoutInflater mo2756f() {
            return C0456c.this.getLayoutInflater().cloneInContext(C0456c.this);
        }

        /* renamed from: g */
        public int mo2757g() {
            Window window = C0456c.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        public C0514f getLifecycle() {
            return C0456c.this.mFragmentLifecycleRegistry;
        }

        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return C0456c.this.getOnBackPressedDispatcher();
        }

        public C0546x getViewModelStore() {
            return C0456c.this.getViewModelStore();
        }

        /* renamed from: h */
        public boolean mo2758h() {
            return C0456c.this.getWindow() != null;
        }

        /* renamed from: i */
        public void mo2759i() {
            C0456c.this.supportInvalidateOptionsMenu();
        }

        /* renamed from: a */
        public void mo2749a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            C0456c.this.startActivityFromFragment(fragment, intent, i, bundle);
        }

        /* renamed from: e */
        public C0456c m2207e() {
            return C0456c.this;
        }

        /* renamed from: a */
        public void mo2750a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            C0456c.this.startIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }

        /* renamed from: a */
        public void mo2751a(Fragment fragment, String[] strArr, int i) {
            C0456c.this.requestPermissionsFromFragment(fragment, strArr, i);
        }

        /* renamed from: a */
        public boolean mo2753a(String str) {
            return C0352a.m1774a((Activity) C0456c.this, str);
        }

        /* renamed from: a */
        public void mo2748a(Fragment fragment) {
            C0456c.this.onAttachFragment(fragment);
        }

        /* renamed from: a */
        public View mo2661a(int i) {
            return C0456c.this.findViewById(i);
        }

        /* renamed from: a */
        public boolean mo2662a() {
            Window window = C0456c.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    public C0456c() {
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.mo17048c() < MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS) {
            while (this.mPendingFragmentActivityResults.mo17045b(this.mNextCandidateRequestIndex) >= 0) {
                this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
            }
            int i = this.mNextCandidateRequestIndex;
            this.mPendingFragmentActivityResults.mo17050c(i, fragment.mWho);
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    static void checkForValidRequestCode(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), C0514f.C0516b.CREATED));
    }

    private static boolean markState(C0462h hVar, C0514f.C0516b bVar) {
        boolean z = false;
        for (Fragment next : hVar.mo2803e()) {
            if (next != null) {
                if (next.getLifecycle().mo3038a().mo3041a(C0514f.C0516b.STARTED)) {
                    next.mLifecycleRegistry.mo3044b(bVar);
                    z = true;
                }
                if (next.getHost() != null) {
                    z |= markState(next.getChildFragmentManager(), bVar);
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.mo2761a(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            C5112a.m9392a(this).mo17727a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.mo2782j().mo2798a(str, fileDescriptor, printWriter, strArr);
    }

    public C0462h getSupportFragmentManager() {
        return this.mFragments.mo2782j();
    }

    @Deprecated
    public C5112a getSupportLoaderManager() {
        return C5112a.m9392a(this);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.mo2783k();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a = this.mPendingFragmentActivityResults.mo17043a(i4);
            this.mPendingFragmentActivityResults.mo17052d(i4);
            if (a == null) {
                Log.w(TAG, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a2 = this.mFragments.mo2762a(a);
            if (a2 == null) {
                Log.w(TAG, "Activity result no fragment exists for who: " + a);
                return;
            }
            a2.onActivityResult(i & Settings.DEFAULT_INITIAL_WINDOW_SIZE, i2, intent);
            return;
        }
        C0352a.C0355c a3 = C0352a.m1768a();
        if (a3 == null || !a3.mo2199a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.mo2783k();
        this.mFragments.mo2764a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.mFragments.mo2767a((Fragment) null);
        if (bundle != null) {
            this.mFragments.mo2765a(bundle.getParcelable(FRAGMENTS_TAG));
            if (bundle.containsKey(NEXT_CANDIDATE_REQUEST_INDEX_TAG)) {
                this.mNextCandidateRequestIndex = bundle.getInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG);
                int[] intArray = bundle.getIntArray(ALLOCATED_REQUEST_INDICIES_TAG);
                String[] stringArray = bundle.getStringArray(REQUEST_FRAGMENT_WHO_TAG);
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w(TAG, "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.mPendingFragmentActivityResults = new C4882h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.mPendingFragmentActivityResults.mo17050c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new C4882h<>();
            this.mNextCandidateRequestIndex = 0;
        }
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.mo3042a(C0514f.C0515a.ON_CREATE);
        this.mFragments.mo2771b();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.mo2769a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.mo2775c();
        this.mFragmentLifecycleRegistry.mo3042a(C0514f.C0515a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.mo2776d();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.mo2774b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.mo2770a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.mo2768a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.mo2783k();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.mo2766a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.mo2777e();
        this.mFragmentLifecycleRegistry.mo3042a(C0514f.C0515a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.mo2772b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.mo2773b(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.mo2783k();
        int i2 = (i >> 16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String a = this.mPendingFragmentActivityResults.mo17043a(i3);
            this.mPendingFragmentActivityResults.mo17052d(i3);
            if (a == null) {
                Log.w(TAG, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a2 = this.mFragments.mo2762a(a);
            if (a2 == null) {
                Log.w(TAG, "Activity result no fragment exists for who: " + a);
                return;
            }
            a2.onRequestPermissionsResult(i & Settings.DEFAULT_INITIAL_WINDOW_SIZE, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.mo2783k();
        this.mFragments.mo2781i();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.mo3042a(C0514f.C0515a.ON_RESUME);
        this.mFragments.mo2778f();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.mo3042a(C0514f.C0515a.ON_STOP);
        Parcelable l = this.mFragments.mo2784l();
        if (l != null) {
            bundle.putParcelable(FRAGMENTS_TAG, l);
        }
        if (this.mPendingFragmentActivityResults.mo17048c() > 0) {
            bundle.putInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG, this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.mo17048c()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.mo17048c()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.mo17048c(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.mo17049c(i);
                strArr[i] = this.mPendingFragmentActivityResults.mo17053e(i);
            }
            bundle.putIntArray(ALLOCATED_REQUEST_INDICIES_TAG, iArr);
            bundle.putStringArray(REQUEST_FRAGMENT_WHO_TAG, strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.mo2763a();
        }
        this.mFragments.mo2783k();
        this.mFragments.mo2781i();
        this.mFragmentLifecycleRegistry.mo3042a(C0514f.C0515a.ON_START);
        this.mFragments.mo2779g();
    }

    public void onStateNotSaved() {
        this.mFragments.mo2783k();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.mo2780h();
        this.mFragmentLifecycleRegistry.mo3042a(C0514f.C0515a.ON_STOP);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void requestPermissionsFromFragment(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            C0352a.m1773a(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            C0352a.m1773a(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE));
            this.mRequestedPermissionsFromFragment = false;
        } catch (Throwable th) {
            this.mRequestedPermissionsFromFragment = false;
            throw th;
        }
    }

    public void setEnterSharedElementCallback(C0388n nVar) {
        C0352a.m1772a((Activity) this, nVar);
    }

    public void setExitSharedElementCallback(C0388n nVar) {
        C0352a.m1776b(this, nVar);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        int i5 = i;
        this.mStartedIntentSenderFromFragment = true;
        if (i5 == -1) {
            try {
                C0352a.m1771a(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.mStartedIntentSenderFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            C0352a.m1771a(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i5 & Settings.DEFAULT_INITIAL_WINDOW_SIZE), intent, i2, i3, i4, bundle);
            this.mStartedIntentSenderFromFragment = false;
        }
    }

    public void supportFinishAfterTransition() {
        C0352a.m1775b(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        C0352a.m1777c(this);
    }

    public void supportStartPostponedEnterTransition() {
        C0352a.m1779e(this);
    }

    public final void validateRequestPermissionsRequestCode(int i) {
        if (!this.mRequestedPermissionsFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        if (i == -1) {
            try {
                C0352a.m1770a(this, intent, -1, bundle);
            } finally {
                this.mStartedActivityFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            C0352a.m1770a(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE), bundle);
            this.mStartedActivityFromFragment = false;
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public C0456c(int i) {
        super(i);
    }
}
