package p015cm.aptoide.p016pt.reactions.p027ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import p015cm.aptoide.p016pt.reactions.data.ReactionType;
import p015cm.aptoide.p016pt.reactions.p027ui.ReactionsView;

/* renamed from: cm.aptoide.pt.reactions.ui.Reaction */
public class Reaction {
    private final ReactionType reactionType;
    private final LottieAnimationView view;

    public Reaction(ReactionType reactionType2, int i, Context context) {
        this.reactionType = reactionType2;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.view = lottieAnimationView;
        lottieAnimationView.setAnimation(this.reactionType.name().toLowerCase() + ".json");
        this.view.mo19337b(true);
        this.view.setPadding(i, i, i, i);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13952a(ReactionsView.Callback callback, View view2) {
        if (callback != null) {
            callback.onReactionItemClicked(this.reactionType);
        }
    }

    public void cancel() {
        this.view.mo19338c();
    }

    public LottieAnimationView getView() {
        return this.view;
    }

    public void play() {
        this.view.mo19340e();
    }

    public void setCallback(ReactionsView.Callback callback) {
        this.view.setOnClickListener(new C3954a(this, callback));
    }

    public void setReactionParams(ViewGroup.LayoutParams layoutParams) {
        this.view.setLayoutParams(layoutParams);
    }
}
