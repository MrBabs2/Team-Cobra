package p015cm.aptoide.p016pt.view.custom;

import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TabWidget;
import android.widget.TextView;

/* renamed from: cm.aptoide.pt.view.custom.BadgeView */
public class BadgeView extends TextView {
    private static final int DEFAULT_BADGE_COLOR = -1;
    private static final int DEFAULT_CORNER_RADIUS_DIP = 8;
    private static final int DEFAULT_LR_PADDING_DIP = 5;
    private static final int DEFAULT_MARGIN_DIP = 5;
    private static final int DEFAULT_POSITION = 2;
    private static final int DEFAULT_TEXT_COLOR = Color.parseColor("#CCFF0000");
    public static final int POSITION_BOTTOM_LEFT = 3;
    public static final int POSITION_BOTTOM_RIGHT = 4;
    public static final int POSITION_CENTER = 5;
    public static final int POSITION_TOP_LEFT = 1;
    public static final int POSITION_TOP_RIGHT = 2;
    private ShapeDrawable badgeBg;
    private int badgeColor;
    private int badgeMarginH;
    private int badgeMarginV;
    private int badgePosition;
    private Context context;
    private Animation fadeIn;
    private Animation fadeOut;
    private boolean isShown;
    private View target;
    private int targetTabIndex;

    public BadgeView(Context context2) {
        this(context2, (AttributeSet) null, 16842884);
    }

    private void applyLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i = this.badgePosition;
        if (i == 1) {
            layoutParams.gravity = 51;
            layoutParams.setMargins(this.badgeMarginH, this.badgeMarginV, 0, 0);
        } else if (i == 2) {
            layoutParams.gravity = 53;
            layoutParams.setMargins(0, this.badgeMarginV, this.badgeMarginH, 0);
        } else if (i == 3) {
            layoutParams.gravity = 83;
            layoutParams.setMargins(this.badgeMarginH, 0, 0, this.badgeMarginV);
        } else if (i == 4) {
            layoutParams.gravity = 85;
            layoutParams.setMargins(0, 0, this.badgeMarginH, this.badgeMarginV);
        } else if (i == 5) {
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, 0, 0, 0);
        }
        setLayoutParams(layoutParams);
    }

    private void applyTo(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewParent parent = view.getParent();
        FrameLayout frameLayout = new FrameLayout(this.context);
        if (view instanceof TabWidget) {
            View childTabViewAt = ((TabWidget) view).getChildTabViewAt(this.targetTabIndex);
            this.target = childTabViewAt;
            ((ViewGroup) childTabViewAt).addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            setVisibility(8);
            frameLayout.addView(this);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int indexOfChild = viewGroup.indexOfChild(view);
        viewGroup.removeView(view);
        viewGroup.addView(frameLayout, indexOfChild, layoutParams);
        frameLayout.addView(view);
        setVisibility(8);
        frameLayout.addView(this);
        viewGroup.invalidate();
    }

    private int dipToPixels(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    private ShapeDrawable getDefaultBackground() {
        float dipToPixels = (float) dipToPixels(8);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dipToPixels, dipToPixels, dipToPixels, dipToPixels, dipToPixels, dipToPixels, dipToPixels, dipToPixels}, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(this.badgeColor);
        return shapeDrawable;
    }

    private void init(Context context2, View view, int i) {
        this.context = context2;
        this.target = view;
        this.targetTabIndex = i;
        this.badgePosition = 2;
        int dipToPixels = dipToPixels(5);
        this.badgeMarginH = dipToPixels;
        this.badgeMarginV = dipToPixels / 2;
        this.badgeColor = -1;
        setTypeface(Typeface.DEFAULT_BOLD);
        int dipToPixels2 = dipToPixels(5);
        setPadding(dipToPixels2, 0, dipToPixels2, 0);
        setTextColor(DEFAULT_TEXT_COLOR);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.fadeIn = alphaAnimation;
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        this.fadeIn.setDuration(200);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.fadeOut = alphaAnimation2;
        alphaAnimation2.setInterpolator(new AccelerateInterpolator());
        this.fadeOut.setDuration(200);
        this.isShown = false;
        View view2 = this.target;
        if (view2 != null) {
            applyTo(view2);
        } else {
            show();
        }
    }

    public int decrement(int i) {
        return increment(-i);
    }

    public int getBadgeBackgroundColor() {
        return this.badgeColor;
    }

    public int getBadgePosition() {
        return this.badgePosition;
    }

    public int getHorizontalBadgeMargin() {
        return this.badgeMarginH;
    }

    public View getTarget() {
        return this.target;
    }

    public int getVerticalBadgeMargin() {
        return this.badgeMarginV;
    }

    public void hide() {
        hide(false, (Animation) null);
    }

    public int increment(int i) {
        CharSequence text = getText();
        int i2 = 0;
        if (text != null) {
            try {
                i2 = Integer.parseInt(text.toString());
            } catch (NumberFormatException unused) {
            }
        }
        int i3 = i2 + i;
        setText(String.valueOf(i3));
        return i3;
    }

    public boolean isShown() {
        return this.isShown;
    }

    public void setBadgeBackgroundColor(int i) {
        this.badgeColor = i;
        this.badgeBg = getDefaultBackground();
    }

    public void setBadgeMargin(int i) {
        this.badgeMarginH = i;
        this.badgeMarginV = i;
    }

    public void setBadgePosition(int i) {
        this.badgePosition = i;
    }

    public void show() {
        show(false, (Animation) null);
    }

    public void toggle() {
        toggle(false, (Animation) null, (Animation) null);
    }

    public BadgeView(Context context2, AttributeSet attributeSet, int i) {
        this(context2, attributeSet, i, (View) null, 0);
    }

    private void hide(boolean z, Animation animation) {
        setVisibility(8);
        if (z) {
            startAnimation(animation);
        }
        this.isShown = false;
    }

    private void show(boolean z, Animation animation) {
        if (getBackground() == null) {
            if (this.badgeBg == null) {
                this.badgeBg = getDefaultBackground();
            }
            setBackgroundDrawable(this.badgeBg);
        }
        applyLayoutParams();
        if (z) {
            startAnimation(animation);
        }
        setVisibility(0);
        this.isShown = true;
    }

    private void toggle(boolean z, Animation animation, Animation animation2) {
        boolean z2 = true;
        if (this.isShown) {
            if (!z || animation2 == null) {
                z2 = false;
            }
            hide(z2, animation2);
            return;
        }
        if (!z || animation == null) {
            z2 = false;
        }
        show(z2, animation);
    }

    public BadgeView(Context context2, AttributeSet attributeSet, int i, View view, int i2) {
        super(context2, attributeSet, i);
        init(context2, view, i2);
    }

    public void setBadgeMargin(int i, int i2) {
        this.badgeMarginH = i;
        this.badgeMarginV = i2;
    }

    public BadgeView(Context context2, AttributeSet attributeSet) {
        this(context2, attributeSet, 16842884);
    }

    public void hide(boolean z) {
        hide(z, this.fadeOut);
    }

    public void toggle(boolean z) {
        toggle(z, this.fadeIn, this.fadeOut);
    }

    public BadgeView(Context context2, View view) {
        this(context2, (AttributeSet) null, 16842884, view, 0);
    }

    public void hide(Animation animation) {
        hide(true, animation);
    }

    public void toggle(Animation animation, Animation animation2) {
        toggle(true, animation, animation2);
    }

    public BadgeView(Context context2, TabWidget tabWidget, int i) {
        this(context2, (AttributeSet) null, 16842884, tabWidget, i);
    }

    public void show(boolean z) {
        show(z, this.fadeIn);
    }

    public void show(Animation animation) {
        show(true, animation);
    }
}
