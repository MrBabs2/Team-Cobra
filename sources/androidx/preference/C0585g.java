package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0454b;
import androidx.fragment.app.C0462h;
import androidx.fragment.app.C0485m;
import androidx.fragment.app.Fragment;
import androidx.preference.C0600j;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.preference.g */
/* compiled from: PreferenceFragmentCompat */
public abstract class C0585g extends Fragment implements C0600j.C0603c, C0600j.C0601a, C0600j.C0602b, DialogPreference.C0552a {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private static final String TAG = "PreferenceFragment";
    private final C0589d mDividerDecoration = new C0589d();
    private Handler mHandler = new C0586a();
    private boolean mHavePrefs;
    private boolean mInitDone;
    private int mLayoutResId = C0612q.preference_list_fragment;
    RecyclerView mList;
    private C0600j mPreferenceManager;
    private final Runnable mRequestFocus = new C0587b();
    private Runnable mSelectPreferenceRunnable;

    /* renamed from: androidx.preference.g$a */
    /* compiled from: PreferenceFragmentCompat */
    class C0586a extends Handler {
        C0586a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                C0585g.this.bindPreferences();
            }
        }
    }

    /* renamed from: androidx.preference.g$b */
    /* compiled from: PreferenceFragmentCompat */
    class C0587b implements Runnable {
        C0587b() {
        }

        public void run() {
            RecyclerView recyclerView = C0585g.this.mList;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* renamed from: androidx.preference.g$c */
    /* compiled from: PreferenceFragmentCompat */
    class C0588c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Preference f2353f;

        /* renamed from: g */
        final /* synthetic */ String f2354g;

        C0588c(Preference preference, String str) {
            this.f2353f = preference;
            this.f2354g = str;
        }

        public void run() {
            int i;
            RecyclerView.C0633g adapter = C0585g.this.mList.getAdapter();
            if (adapter instanceof PreferenceGroup.C0570c) {
                Preference preference = this.f2353f;
                if (preference != null) {
                    i = ((PreferenceGroup.C0570c) adapter).mo3253c(preference);
                } else {
                    i = ((PreferenceGroup.C0570c) adapter).mo3252a(this.f2354g);
                }
                if (i != -1) {
                    C0585g.this.mList.scrollToPosition(i);
                } else {
                    adapter.registerAdapterDataObserver(new C0593h(adapter, C0585g.this.mList, this.f2353f, this.f2354g));
                }
            } else if (adapter != null) {
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
        }
    }

    /* renamed from: androidx.preference.g$e */
    /* compiled from: PreferenceFragmentCompat */
    public interface C0590e {
        /* renamed from: a */
        boolean mo3329a(C0585g gVar, Preference preference);
    }

    /* renamed from: androidx.preference.g$f */
    /* compiled from: PreferenceFragmentCompat */
    public interface C0591f {
        /* renamed from: a */
        boolean mo3330a(C0585g gVar, Preference preference);
    }

    /* renamed from: androidx.preference.g$g */
    /* compiled from: PreferenceFragmentCompat */
    public interface C0592g {
        /* renamed from: a */
        boolean mo3331a(C0585g gVar, PreferenceScreen preferenceScreen);
    }

    /* renamed from: androidx.preference.g$h */
    /* compiled from: PreferenceFragmentCompat */
    private static class C0593h extends RecyclerView.C0635i {

        /* renamed from: a */
        private final RecyclerView.C0633g f2360a;

        /* renamed from: b */
        private final RecyclerView f2361b;

        /* renamed from: c */
        private final Preference f2362c;

        /* renamed from: d */
        private final String f2363d;

        public C0593h(RecyclerView.C0633g gVar, RecyclerView recyclerView, Preference preference, String str) {
            this.f2360a = gVar;
            this.f2361b = recyclerView;
            this.f2362c = preference;
            this.f2363d = str;
        }

        /* renamed from: a */
        private void m2890a() {
            int i;
            this.f2360a.unregisterAdapterDataObserver(this);
            Preference preference = this.f2362c;
            if (preference != null) {
                i = ((PreferenceGroup.C0570c) this.f2360a).mo3253c(preference);
            } else {
                i = ((PreferenceGroup.C0570c) this.f2360a).mo3252a(this.f2363d);
            }
            if (i != -1) {
                this.f2361b.scrollToPosition(i);
            }
        }

        public void onChanged() {
            m2890a();
        }

        public void onItemRangeChanged(int i, int i2) {
            m2890a();
        }

        public void onItemRangeInserted(int i, int i2) {
            m2890a();
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            m2890a();
        }

        public void onItemRangeRemoved(int i, int i2) {
            m2890a();
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            m2890a();
        }
    }

    private void postBindPreferences() {
        if (!this.mHandler.hasMessages(1)) {
            this.mHandler.obtainMessage(1).sendToTarget();
        }
    }

    private void requirePreferenceManager() {
        if (this.mPreferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void scrollToPreferenceInternal(Preference preference, String str) {
        C0588c cVar = new C0588c(preference, str);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = cVar;
        } else {
            cVar.run();
        }
    }

    private void unbindPreferences() {
        getListView().setAdapter((RecyclerView.C0633g) null);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.mo3171R();
        }
        onUnbindPreferences();
    }

    public void addPreferencesFromResource(int i) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.mo3365a(getContext(), i, getPreferenceScreen()));
    }

    /* access modifiers changed from: package-private */
    public void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.mo3170P();
        }
        onBindPreferences();
    }

    public <T extends Preference> T findPreference(CharSequence charSequence) {
        C0600j jVar = this.mPreferenceManager;
        if (jVar == null) {
            return null;
        }
        return jVar.mo3364a(charSequence);
    }

    public Fragment getCallbackFragment() {
        return null;
    }

    public final RecyclerView getListView() {
        return this.mList;
    }

    public C0600j getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.mo3377g();
    }

    /* access modifiers changed from: protected */
    public void onBindPreferences() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(C0608m.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = C0614s.PreferenceThemeOverlay;
        }
        getActivity().getTheme().applyStyle(i, false);
        C0600j jVar = new C0600j(getContext());
        this.mPreferenceManager = jVar;
        jVar.mo3368a((C0600j.C0602b) this);
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString(ARG_PREFERENCE_ROOT) : null);
    }

    /* access modifiers changed from: protected */
    public RecyclerView.C0633g onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new C0594h(preferenceScreen);
    }

    public RecyclerView.C0644o onCreateLayoutManager() {
        return new LinearLayoutManager(getContext());
    }

    public abstract void onCreatePreferences(Bundle bundle, String str);

    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (getContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(C0611p.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(C0612q.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new C0605k(recyclerView2));
        return recyclerView2;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0615t.PreferenceFragmentCompat, C0608m.preferenceFragmentCompatStyle, 0);
        this.mLayoutResId = obtainStyledAttributes.getResourceId(C0615t.PreferenceFragmentCompat_android_layout, this.mLayoutResId);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0615t.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0615t.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(C0615t.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(getContext());
        View inflate = cloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView onCreateRecyclerView = onCreateRecyclerView(cloneInContext, viewGroup2, bundle);
            if (onCreateRecyclerView != null) {
                this.mList = onCreateRecyclerView;
                onCreateRecyclerView.addItemDecoration(this.mDividerDecoration);
                setDivider(drawable);
                if (dimensionPixelSize != -1) {
                    setDividerHeight(dimensionPixelSize);
                }
                this.mDividerDecoration.mo3326b(z);
                if (this.mList.getParent() == null) {
                    viewGroup2.addView(this.mList);
                }
                this.mHandler.post(this.mRequestFocus);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            unbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    public void onDisplayPreferenceDialog(Preference preference) {
        C0454b bVar;
        boolean a = getCallbackFragment() instanceof C0590e ? ((C0590e) getCallbackFragment()).mo3329a(this, preference) : false;
        if (!a && (getActivity() instanceof C0590e)) {
            a = ((C0590e) getActivity()).mo3329a(this, preference);
        }
        if (!a && getFragmentManager().mo2792a(DIALOG_FRAGMENT_TAG) == null) {
            if (preference instanceof EditTextPreference) {
                bVar = C0577a.newInstance(preference.mo3218p());
            } else if (preference instanceof ListPreference) {
                bVar = C0579c.newInstance(preference.mo3218p());
            } else if (preference instanceof MultiSelectListPreference) {
                bVar = C0581d.newInstance(preference.mo3218p());
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            bVar.setTargetFragment(this, 0);
            bVar.show(getFragmentManager(), DIALOG_FRAGMENT_TAG);
        }
    }

    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        if (!(getCallbackFragment() instanceof C0592g ? ((C0592g) getCallbackFragment()).mo3331a(this, preferenceScreen) : false) && (getActivity() instanceof C0592g)) {
            ((C0592g) getActivity()).mo3331a(this, preferenceScreen);
        }
    }

    public boolean onPreferenceTreeClick(Preference preference) {
        if (preference.mo3215l() == null) {
            return false;
        }
        boolean a = getCallbackFragment() instanceof C0591f ? ((C0591f) getCallbackFragment()).mo3330a(this, preference) : false;
        if (!a && (getActivity() instanceof C0591f)) {
            a = ((C0591f) getActivity()).mo3330a(this, preference);
        }
        if (a) {
            return true;
        }
        Log.w(TAG, "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        C0462h supportFragmentManager = requireActivity().getSupportFragmentManager();
        Bundle e = preference.mo3210e();
        Fragment a2 = supportFragmentManager.mo2802d().mo2785a(requireActivity().getClassLoader(), preference.mo3215l());
        a2.setArguments(e);
        a2.setTargetFragment(this, 0);
        C0485m a3 = supportFragmentManager.mo2793a();
        a3.mo2950b(((View) getView().getParent()).getId(), a2);
        a3.mo2948a((String) null);
        a3.mo2675a();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.mo3208d(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    public void onStart() {
        super.onStart();
        this.mPreferenceManager.mo3369a((C0600j.C0603c) this);
        this.mPreferenceManager.mo3367a((C0600j.C0601a) this);
    }

    public void onStop() {
        super.onStop();
        this.mPreferenceManager.mo3369a((C0600j.C0603c) null);
        this.mPreferenceManager.mo3367a((C0600j.C0601a) null);
    }

    /* access modifiers changed from: protected */
    public void onUnbindPreferences() {
    }

    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (!(bundle == null || (bundle2 = bundle.getBundle(PREFERENCES_TAG)) == null || (preferenceScreen = getPreferenceScreen()) == null)) {
            preferenceScreen.mo3202c(bundle2);
        }
        if (this.mHavePrefs) {
            bindPreferences();
            Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    public void scrollToPreference(String str) {
        scrollToPreferenceInternal((Preference) null, str);
    }

    public void setDivider(Drawable drawable) {
        this.mDividerDecoration.mo3325a(drawable);
    }

    public void setDividerHeight(int i) {
        this.mDividerDecoration.mo3324a(i);
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        if (this.mPreferenceManager.mo3371a(preferenceScreen) && preferenceScreen != null) {
            onUnbindPreferences();
            this.mHavePrefs = true;
            if (this.mInitDone) {
                postBindPreferences();
            }
        }
    }

    public void setPreferencesFromResource(int i, String str) {
        requirePreferenceManager();
        PreferenceScreen a = this.mPreferenceManager.mo3365a(getContext(), i, (PreferenceScreen) null);
        Object obj = a;
        if (str != null) {
            Object c = a.mo3240c((CharSequence) str);
            boolean z = c instanceof PreferenceScreen;
            obj = c;
            if (!z) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        setPreferenceScreen((PreferenceScreen) obj);
    }

    public void scrollToPreference(Preference preference) {
        scrollToPreferenceInternal(preference, (String) null);
    }

    /* renamed from: androidx.preference.g$d */
    /* compiled from: PreferenceFragmentCompat */
    private class C0589d extends RecyclerView.C0643n {

        /* renamed from: a */
        private Drawable f2356a;

        /* renamed from: b */
        private int f2357b;

        /* renamed from: c */
        private boolean f2358c = true;

        C0589d() {
        }

        /* renamed from: a */
        private boolean m2883a(View view, RecyclerView recyclerView) {
            RecyclerView.C0629c0 childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z = false;
            if (!((childViewHolder instanceof C0607l) && ((C0607l) childViewHolder).mo3387b())) {
                return false;
            }
            boolean z2 = this.f2358c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.C0629c0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
            if ((childViewHolder2 instanceof C0607l) && ((C0607l) childViewHolder2).mo3385a()) {
                z = true;
            }
            return z;
        }

        /* renamed from: b */
        public void mo3326b(boolean z) {
            this.f2358c = z;
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
            if (m2883a(view, recyclerView)) {
                rect.bottom = this.f2357b;
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
            if (this.f2356a != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (m2883a(childAt, recyclerView)) {
                        int y = ((int) childAt.getY()) + childAt.getHeight();
                        this.f2356a.setBounds(0, y, width, this.f2357b + y);
                        this.f2356a.draw(canvas);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo3325a(Drawable drawable) {
            if (drawable != null) {
                this.f2357b = drawable.getIntrinsicHeight();
            } else {
                this.f2357b = 0;
            }
            this.f2356a = drawable;
            C0585g.this.mList.invalidateItemDecorations();
        }

        /* renamed from: a */
        public void mo3324a(int i) {
            this.f2357b = i;
            C0585g.this.mList.invalidateItemDecorations();
        }
    }
}
