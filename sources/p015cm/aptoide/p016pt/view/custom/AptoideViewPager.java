package p015cm.aptoide.p016pt.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.NavigationTrackerPagerAdapterHelper;

@Deprecated
/* renamed from: cm.aptoide.pt.view.custom.AptoideViewPager */
public class AptoideViewPager extends ViewPager {
    private boolean enabled = true;
    /* access modifiers changed from: private */
    public boolean trackingEnabled = true;

    public AptoideViewPager(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnPageChangeListener(new ViewPager.C0807m() {
            public void onPageSelected(int i) {
                super.onPageSelected(i);
                if (!AptoideViewPager.this.trackingEnabled) {
                    return;
                }
                if (!(AptoideViewPager.this.getAdapter() instanceof NavigationTrackerPagerAdapterHelper)) {
                    throw new RuntimeException(AptoideViewPager.this.getAdapter().getClass().getSimpleName() + " has to implement " + NavigationTrackerPagerAdapterHelper.class.getSimpleName());
                } else if (i != 0) {
                    NavigationTrackerPagerAdapterHelper navigationTrackerPagerAdapterHelper = (NavigationTrackerPagerAdapterHelper) AptoideViewPager.this.getAdapter();
                    ((AptoideApplication) AptoideViewPager.this.getContext().getApplicationContext()).getNavigationTracker().registerScreen(ScreenTagHistory.Builder.build(navigationTrackerPagerAdapterHelper.getItemName(i), navigationTrackerPagerAdapterHelper.getItemTag(i), navigationTrackerPagerAdapterHelper.getItemStore().name()));
                }
            }
        });
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.enabled) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.enabled) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setPagingEnabled(boolean z) {
        this.enabled = z;
    }

    public void setTrackingEnabled(boolean z) {
        this.trackingEnabled = z;
    }

    public AptoideViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
