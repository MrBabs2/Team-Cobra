package p015cm.aptoide.p016pt.reactions.p027ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.content.C0394a;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.reactions.data.ReactionType;

/* renamed from: cm.aptoide.pt.reactions.ui.ReactionsPopup */
public class ReactionsPopup {
    private final View anchorView;
    private int gravity = 8388659;
    private OnDismissListener onDismissListener;
    private final PopupWindow popup;
    private OnReactionClickListener reactionClickListener;
    private final ReactionsView reactionsView;

    /* renamed from: cm.aptoide.pt.reactions.ui.ReactionsPopup$OnDismissListener */
    public interface OnDismissListener {
        void onDismiss(ReactionsView reactionsView);
    }

    /* renamed from: cm.aptoide.pt.reactions.ui.ReactionsPopup$OnReactionClickListener */
    public interface OnReactionClickListener {
        void onReactionItemClick(ReactionType reactionType);
    }

    public ReactionsPopup(Context context, View view) {
        this.anchorView = view;
        PopupWindow popupWindow = new PopupWindow();
        this.popup = popupWindow;
        popupWindow.setWindowLayoutMode(-2, -2);
        ReactionsView reactionsView2 = new ReactionsView(context);
        this.reactionsView = reactionsView2;
        reactionsView2.setVisibility(0);
        this.popup.setContentView(this.reactionsView);
        this.popup.setFocusable(true);
        this.popup.setClippingEnabled(true);
        this.popup.setBackgroundDrawable(C0394a.m1917c(context, C1086R.C1087drawable.rounded_corners_reactions));
        if (Build.VERSION.SDK_INT >= 21) {
            this.popup.setElevation(10.0f);
        }
        this.reactionsView.setCallback(new C3955b(this));
        this.popup.setOnDismissListener(new C3956c(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13959a(ReactionType reactionType) {
        OnReactionClickListener onReactionClickListener = this.reactionClickListener;
        if (onReactionClickListener != null) {
            onReactionClickListener.onReactionItemClick(reactionType);
        }
    }

    public void dismiss() {
        this.popup.dismiss();
    }

    public int getGravity() {
        return this.gravity;
    }

    public void setGravity(int i) {
        this.gravity = i;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener2) {
        this.onDismissListener = onDismissListener2;
    }

    public void setOnReactionsItemClickListener(OnReactionClickListener onReactionClickListener) {
        this.reactionClickListener = onReactionClickListener;
    }

    public void show() {
        if (Build.VERSION.SDK_INT >= 19) {
            PopupWindow popupWindow = this.popup;
            View view = this.anchorView;
            popupWindow.showAsDropDown(view, (int) view.getX(), (((int) this.anchorView.getY()) - this.anchorView.getHeight()) - this.reactionsView.getReactionsViewHeight(), this.gravity);
            return;
        }
        PopupWindow popupWindow2 = this.popup;
        View view2 = this.anchorView;
        popupWindow2.showAsDropDown(view2, (int) view2.getX(), (((int) this.anchorView.getY()) - this.anchorView.getHeight()) - this.reactionsView.getReactionsViewHeight());
    }

    /* renamed from: a */
    public /* synthetic */ void mo13958a() {
        OnDismissListener onDismissListener2 = this.onDismissListener;
        if (onDismissListener2 != null) {
            onDismissListener2.onDismiss(this.reactionsView);
        }
    }
}
