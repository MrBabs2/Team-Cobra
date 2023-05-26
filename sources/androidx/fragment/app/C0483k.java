package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0514f;
import androidx.viewpager.widget.C0809a;

/* renamed from: androidx.fragment.app.k */
/* compiled from: FragmentPagerAdapter */
public abstract class C0483k extends C0809a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private C0485m mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final C0462h mFragmentManager;

    @Deprecated
    public C0483k(C0462h hVar) {
        this(hVar, 0);
    }

    private static String makeFragmentName(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.mo2793a();
        }
        this.mCurTransaction.mo2688b(fragment);
        if (fragment == this.mCurrentPrimaryItem) {
            this.mCurrentPrimaryItem = null;
        }
    }

    public void finishUpdate(ViewGroup viewGroup) {
        C0485m mVar = this.mCurTransaction;
        if (mVar != null) {
            mVar.mo2693d();
            this.mCurTransaction = null;
        }
    }

    public abstract Fragment getItem(int i);

    public long getItemId(int i) {
        return (long) i;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.mo2793a();
        }
        long itemId = getItemId(i);
        Fragment a = this.mFragmentManager.mo2792a(makeFragmentName(viewGroup.getId(), itemId));
        if (a != null) {
            this.mCurTransaction.mo2946a(a);
        } else {
            a = getItem(i);
            this.mCurTransaction.mo2945a(viewGroup.getId(), a, makeFragmentName(viewGroup.getId(), itemId));
        }
        if (a != this.mCurrentPrimaryItem) {
            a.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.mo2678a(a, C0514f.C0516b.STARTED);
            } else {
                a.setUserVisibleHint(false);
            }
        }
        return a;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.mo2793a();
                    }
                    this.mCurTransaction.mo2678a(this.mCurrentPrimaryItem, C0514f.C0516b.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.mo2793a();
                }
                this.mCurTransaction.mo2678a(fragment, C0514f.C0516b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public C0483k(C0462h hVar, int i) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = hVar;
        this.mBehavior = i;
    }
}
