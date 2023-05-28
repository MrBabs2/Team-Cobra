package p015cm.aptoide.p016pt.reactions.p027ui;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import java.util.Arrays;
import java.util.List;
import p015cm.aptoide.p016pt.reactions.data.ReactionType;

/* renamed from: cm.aptoide.pt.reactions.ui.ReactionsView */
public class ReactionsView extends LinearLayout {
    public static int HEIGHT_REACTIONS;
    public static int REACTIONS_PADDING;
    public static int WIDTH_REACTIONS;
    private List<Reaction> reactions;

    /* renamed from: cm.aptoide.pt.reactions.ui.ReactionsView$Callback */
    public interface Callback {
        void onReactionItemClicked(ReactionType reactionType);
    }

    public ReactionsView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setReactionOrientation();
        this.reactions = Arrays.asList(new Reaction[]{new Reaction(ReactionType.LIKE, REACTIONS_PADDING, getContext()), new Reaction(ReactionType.LAUGH, REACTIONS_PADDING, getContext()), new Reaction(ReactionType.LOVE, REACTIONS_PADDING, getContext()), new Reaction(ReactionType.THUG, REACTIONS_PADDING, getContext()), new Reaction(ReactionType.DOWN, REACTIONS_PADDING, getContext())});
        setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(WIDTH_REACTIONS, HEIGHT_REACTIONS);
        for (Reaction next : this.reactions) {
            next.setReactionParams(layoutParams);
            addView(next.getView());
            next.play();
        }
    }

    public int getReactionsViewHeight() {
        int i = REACTIONS_PADDING;
        return i + i + HEIGHT_REACTIONS;
    }

    public void setCallback(Callback callback) {
        for (Reaction callback2 : this.reactions) {
            callback2.setCallback(callback);
        }
    }

    public void setReactionOrientation() {
        int i = getResources().getConfiguration().orientation;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        if (i == 1) {
            WIDTH_REACTIONS = Math.round((float) (point.x / 5));
            HEIGHT_REACTIONS = Math.round((float) (point.x / 5));
            REACTIONS_PADDING = Math.round((float) ((WIDTH_REACTIONS / 100) * 7));
            return;
        }
        WIDTH_REACTIONS = Math.round((float) ((point.x / 2) / 5));
        HEIGHT_REACTIONS = Math.round((float) ((point.x / 2) / 5));
        REACTIONS_PADDING = Math.round((float) ((WIDTH_REACTIONS / 100) * 7));
    }

    public ReactionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ReactionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
