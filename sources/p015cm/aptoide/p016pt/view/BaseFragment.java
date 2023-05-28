package p015cm.aptoide.p016pt.view;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import com.trello.rxlifecycle.p034h.p035a.C4752d;
import java.lang.reflect.Field;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.FlavourFragmentModule;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationActivity;
import p015cm.aptoide.p016pt.logger.Logger;

/* renamed from: cm.aptoide.pt.view.BaseFragment */
public abstract class BaseFragment extends C4752d {
    private BottomNavigationActivity bottomNavigationActivity;
    private FragmentComponent fragmentComponent;

    private Fragment getRemovingParent(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != null && parentFragment.isRemoving()) {
            return getRemovingParent(parentFragment);
        }
        if (fragment.isRemoving()) {
            return fragment;
        }
        return null;
    }

    private static long getRemovingParentAnimationDuration(Fragment fragment, long j) {
        try {
            Field declaredField = Fragment.class.getDeclaredField("mAnimationInfo");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(fragment);
            Field declaredField2 = obj.getClass().getDeclaredField("mNextAnim");
            declaredField2.setAccessible(true);
            Animation loadAnimation = AnimationUtils.loadAnimation(fragment.getActivity(), declaredField2.getInt(obj));
            return loadAnimation == null ? j : loadAnimation.getDuration();
        } catch (Resources.NotFoundException | IllegalAccessException | NoSuchFieldException e) {
            Logger.getInstance().mo12980e("BASE FRAGMENT", "Unable to load next animation from parent.", e);
            return j;
        }
    }

    public FragmentComponent getFragmentComponent(Bundle bundle) {
        if (this.fragmentComponent == null) {
            AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
            this.fragmentComponent = ((BaseActivity) getActivity()).getActivityComponent().plus(aptoideApplication.getFragmentModule(this, bundle, getArguments(), aptoideApplication.isCreateStoreUserPrivacyEnabled(), getActivity().getApplicationContext().getPackageName()), new FlavourFragmentModule());
        }
        return this.fragmentComponent;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof BottomNavigationActivity) {
            this.bottomNavigationActivity = (BottomNavigationActivity) activity;
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        Fragment removingParent = getRemovingParent(getParentFragment());
        if (z || removingParent == null) {
            return super.onCreateAnimation(i, z, i2);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
        alphaAnimation.setDuration(getRemovingParentAnimationDuration(removingParent, 300));
        return alphaAnimation;
    }

    public void onDestroy() {
        this.fragmentComponent = null;
        super.onDestroy();
    }

    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomNavigationActivity bottomNavigationActivity2 = this.bottomNavigationActivity;
        if (bottomNavigationActivity2 != null) {
            bottomNavigationActivity2.toggleBottomNavigation();
        }
    }
}
