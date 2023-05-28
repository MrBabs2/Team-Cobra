package p015cm.aptoide.p016pt.bottomNavigation;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import javax.inject.Inject;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.view.LoginBottomSheetActivity;
import p015cm.aptoide.p016pt.home.AptoideBottomNavigator;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p123rx.C5368e;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.bottomNavigation.BottomNavigationActivity */
public abstract class BottomNavigationActivity extends LoginBottomSheetActivity implements AptoideBottomNavigator {
    protected static final int LAYOUT = 2131493056;
    private final String ITEMS_LIST_KEY = "BN_ITEMS";
    private Animation animationdown;
    private Animation animationup;
    @Inject
    BottomNavigationMapper bottomNavigationMapper;
    @Inject
    BottomNavigationNavigator bottomNavigationNavigator;
    protected BottomNavigationView bottomNavigationView;
    private C12871b<Integer> navigationSubject;

    /* renamed from: a */
    public /* synthetic */ boolean mo7870a(MenuItem menuItem) {
        this.navigationSubject.onNext(Integer.valueOf(menuItem.getItemId()));
        return true;
    }

    public void hideBottomNavigation() {
        if (this.bottomNavigationView.getVisibility() != 8) {
            this.bottomNavigationView.setVisibility(8);
        }
    }

    public C5368e<Integer> navigationEvent() {
        return this.navigationSubject;
    }

    public void onBackPressed() {
        if (getFragmentNavigator().peekLast() != null || !this.bottomNavigationNavigator.canNavigateBack()) {
            super.onBackPressed();
        } else {
            this.bottomNavigationNavigator.navigateBack();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1086R.layout.frame_layout);
        this.navigationSubject = C12871b.m41468p();
        this.bottomNavigationView = (BottomNavigationView) findViewById(C1086R.C1088id.bottom_navigation);
        getActivityComponent().inject(this);
        if (bundle != null) {
            this.bottomNavigationNavigator.setBottomNavigationItems(bundle.getIntegerArrayList("BN_ITEMS"));
        }
        this.bottomNavigationView.setOnNavigationItemSelectedListener(new C1953a(this));
        this.animationup = AnimationUtils.loadAnimation(this, C1086R.anim.slide_up);
        this.animationdown = AnimationUtils.loadAnimation(this, C1086R.anim.slide_down);
        toggleBottomNavigation();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.bottomNavigationMapper = null;
        this.bottomNavigationNavigator = null;
        this.navigationSubject = null;
        this.bottomNavigationView = null;
        this.animationdown = null;
        this.animationup = null;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putIntegerArrayList("BN_ITEMS", this.bottomNavigationNavigator.getBottomNavigationItems());
    }

    public void requestFocus(BottomNavigationItem bottomNavigationItem) {
        this.bottomNavigationView.getMenu().getItem(this.bottomNavigationMapper.mapToBottomNavigationPosition(bottomNavigationItem)).setChecked(true);
    }

    public void showFragment(Integer num) {
        this.bottomNavigationNavigator.navigateToBottomNavigationItem(this.bottomNavigationMapper.mapToBottomNavigationPosition(num));
    }

    public void toggleBottomNavigation() {
        if (getFragmentNavigator().getFragment() instanceof NotBottomNavigationView) {
            if (this.bottomNavigationView.getVisibility() != 8) {
                this.bottomNavigationView.startAnimation(this.animationdown);
                this.bottomNavigationView.setVisibility(8);
            }
        } else if (this.bottomNavigationView.getVisibility() != 0) {
            this.bottomNavigationView.startAnimation(this.animationup);
            this.bottomNavigationView.setVisibility(0);
        }
    }
}
