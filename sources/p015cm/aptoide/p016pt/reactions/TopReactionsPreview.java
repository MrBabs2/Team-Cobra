package p015cm.aptoide.p016pt.reactions;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.reactions.data.TopReaction;

/* renamed from: cm.aptoide.pt.reactions.TopReactionsPreview */
public class TopReactionsPreview {
    private ImageView firstReaction;
    private ImageView[] imageView;
    private TextView numberOfReactions;
    private ImageView secondReaction;
    private ImageView thirdReaction;

    public void clearReactions() {
        for (ImageView visibility : this.imageView) {
            visibility.setVisibility(8);
        }
        this.numberOfReactions.setVisibility(8);
    }

    public void initialReactionsSetup(View view) {
        this.firstReaction = (ImageView) view.findViewById(C1086R.C1088id.reaction_1);
        this.secondReaction = (ImageView) view.findViewById(C1086R.C1088id.reaction_2);
        this.thirdReaction = (ImageView) view.findViewById(C1086R.C1088id.reaction_3);
        this.numberOfReactions = (TextView) view.findViewById(C1086R.C1088id.number_of_reactions);
        this.imageView = new ImageView[]{this.firstReaction, this.secondReaction, this.thirdReaction};
    }

    public boolean isReactionValid(String str) {
        return !str.equals("") && ReactionMapper.mapReaction(str) != -1;
    }

    public void onDestroy() {
        this.firstReaction = null;
        this.secondReaction = null;
        this.thirdReaction = null;
        this.numberOfReactions = null;
    }

    public void setReactions(List<TopReaction> list, int i, Context context) {
        ImageView[] imageViewArr = {this.firstReaction, this.secondReaction, this.thirdReaction};
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            if (i3 >= list.size() || !isReactionValid(list.get(i3).getType())) {
                imageViewArr[i3].setVisibility(8);
            } else {
                ImageLoader.with(context).loadWithShadowCircleTransform(ReactionMapper.mapReaction(list.get(i3).getType()), imageViewArr[i3]);
                imageViewArr[i3].setVisibility(0);
                i2++;
            }
        }
        if (i <= 0 || i2 <= 0) {
            this.numberOfReactions.setVisibility(8);
            return;
        }
        this.numberOfReactions.setText(String.valueOf(i));
        this.numberOfReactions.setVisibility(0);
    }
}
