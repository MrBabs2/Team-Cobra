package p015cm.aptoide.p016pt.util;

import com.google.android.material.appbar.AppBarLayout;

/* renamed from: cm.aptoide.pt.util.AppBarStateChangeListener */
public abstract class AppBarStateChangeListener implements AppBarLayout.C8416e {
    private State mCurrentState = State.IDLE;

    /* renamed from: cm.aptoide.pt.util.AppBarStateChangeListener$State */
    public enum State {
        EXPANDED,
        MOVING,
        IDLE,
        COLLAPSED
    }

    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        if (i == 0) {
            State state = this.mCurrentState;
            State state2 = State.EXPANDED;
            if (state != state2) {
                onStateChanged(appBarLayout, state2);
            }
            this.mCurrentState = State.EXPANDED;
        } else if (Math.abs(i) - appBarLayout.getTotalScrollRange() == 0) {
            State state3 = this.mCurrentState;
            State state4 = State.COLLAPSED;
            if (state3 != state4) {
                onStateChanged(appBarLayout, state4);
            }
            this.mCurrentState = State.COLLAPSED;
        } else if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
            State state5 = this.mCurrentState;
            State state6 = State.MOVING;
            if (state5 != state6) {
                onStateChanged(appBarLayout, state6);
            }
            this.mCurrentState = State.MOVING;
        } else {
            State state7 = this.mCurrentState;
            State state8 = State.IDLE;
            if (state7 != state8) {
                onStateChanged(appBarLayout, state8);
            }
            this.mCurrentState = State.IDLE;
        }
    }

    public abstract void onStateChanged(AppBarLayout appBarLayout, State state);
}
