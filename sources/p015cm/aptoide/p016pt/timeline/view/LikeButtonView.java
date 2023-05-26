package p015cm.aptoide.p016pt.timeline.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.custom.CircleView;
import p015cm.aptoide.p016pt.view.custom.DotsView;

/* renamed from: cm.aptoide.pt.timeline.view.LikeButtonView */
public class LikeButtonView extends FrameLayout {
    private static final AccelerateDecelerateInterpolator ACCELERATE_DECELERATE_INTERPOLATOR = new AccelerateDecelerateInterpolator();
    private static final DecelerateInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();
    private static final OvershootInterpolator OVERSHOOT_INTERPOLATOR = new OvershootInterpolator(4.0f);
    private AnimatorSet animatorSet;
    private boolean iconEnabled;
    /* access modifiers changed from: private */
    public CircleView vCircle;
    /* access modifiers changed from: private */
    public DotsView vDotsView;
    /* access modifiers changed from: private */
    public ImageView vHeart;

    public LikeButtonView(Context context) {
        super(context);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(C1086R.layout.view_like_button, this, true);
        this.vHeart = (ImageView) findViewById(C1086R.C1088id.vHeart);
        this.vDotsView = (DotsView) findViewById(C1086R.C1088id.vDotsView);
        this.vCircle = (CircleView) findViewById(C1086R.C1088id.vCircle);
        this.iconEnabled = false;
        setupAnimation();
    }

    private void setHeartIconOnWithAnimation() {
        this.vHeart.setImageResource(C1086R.C1087drawable.heart_on);
        this.vHeart.animate().cancel();
        this.vHeart.setScaleX(0.0f);
        this.vHeart.setScaleY(0.0f);
        this.vCircle.setInnerCircleRadiusProgress(0.0f);
        this.vCircle.setOuterCircleRadiusProgress(0.0f);
        this.vDotsView.setCurrentProgress(0.0f);
        this.animatorSet.start();
    }

    private void setHeartIconOnWithoutAnimation() {
        this.vHeart.setImageResource(C1086R.C1087drawable.heart_on);
        this.vHeart.invalidate();
    }

    private void setHeartOffWithoutAnimation() {
        this.vHeart.setImageResource(C1086R.C1087drawable.heart_off);
        this.vHeart.invalidate();
    }

    private void setupAnimation() {
        this.animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.vCircle, CircleView.OUTER_CIRCLE_RADIUS_PROGRESS, new float[]{0.1f, 1.0f});
        ofFloat.setDuration(250);
        ofFloat.setInterpolator(DECELERATE_INTERPOLATOR);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.vCircle, CircleView.INNER_CIRCLE_RADIUS_PROGRESS, new float[]{0.1f, 1.0f});
        ofFloat2.setDuration(200);
        ofFloat2.setStartDelay(200);
        ofFloat2.setInterpolator(DECELERATE_INTERPOLATOR);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.vHeart, ImageView.SCALE_Y, new float[]{0.2f, 1.0f});
        ofFloat3.setDuration(350);
        ofFloat3.setStartDelay(250);
        ofFloat3.setInterpolator(OVERSHOOT_INTERPOLATOR);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.vHeart, ImageView.SCALE_X, new float[]{0.2f, 1.0f});
        ofFloat4.setDuration(350);
        ofFloat4.setStartDelay(250);
        ofFloat4.setInterpolator(OVERSHOOT_INTERPOLATOR);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.vDotsView, DotsView.DOTS_PROGRESS, new float[]{0.0f, 1.0f});
        ofFloat5.setDuration(900);
        ofFloat5.setStartDelay(50);
        ofFloat5.setInterpolator(ACCELERATE_DECELERATE_INTERPOLATOR);
        this.animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
        this.animatorSet.addListener(new AnimatorListenerAdapter() {
            public void onAnimationCancel(Animator animator) {
                LikeButtonView.this.vCircle.setInnerCircleRadiusProgress(0.0f);
                LikeButtonView.this.vCircle.setOuterCircleRadiusProgress(0.0f);
                LikeButtonView.this.vDotsView.setCurrentProgress(50.0f);
                LikeButtonView.this.vHeart.setScaleX(1.0f);
                LikeButtonView.this.vHeart.setScaleY(1.0f);
            }
        });
    }

    public boolean isIconEnabled() {
        return this.iconEnabled;
    }

    public void setHeartState(boolean z) {
        AnimatorSet animatorSet2 = this.animatorSet;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            this.animatorSet.cancel();
        }
        if (z) {
            setHeartIconOnWithAnimation();
        } else {
            setHeartOffWithoutAnimation();
        }
        this.iconEnabled = z;
    }

    public void setHeartStateWithoutAnimation(boolean z) {
        AnimatorSet animatorSet2 = this.animatorSet;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            this.animatorSet.cancel();
        }
        if (z) {
            setHeartIconOnWithoutAnimation();
        } else {
            setHeartOffWithoutAnimation();
        }
        this.iconEnabled = z;
    }

    public LikeButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public LikeButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    @TargetApi(21)
    public LikeButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }
}
