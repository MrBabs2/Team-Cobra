package p015cm.aptoide.p016pt.comments.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C0456c;
import com.google.android.material.snackbar.Snackbar;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.comments.ComplexComment;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.comments.view.CommentWidget */
public class CommentWidget extends Widget<CommentDisplayable> {
    private static final int MARGIN_IN_DIP = 15;
    private TextView comment;
    private TextView datePos1;
    private TextView datePos2;
    private View outerLayout;
    private View replyLayout;
    private ImageView userAvatar;
    private TextView userName;

    public CommentWidget(View view) {
        super(view);
    }

    /* renamed from: a */
    static /* synthetic */ void m5111a(Object obj) {
    }

    /* renamed from: a */
    static /* synthetic */ void m5112a(Void voidR) {
    }

    private void bindComplexComment(ComplexComment complexComment) {
        int i;
        int i2;
        C0456c context = getContext();
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        theme.resolveAttribute(C1086R.attr.widgetBackgroundColorPrimary, typedValue, true);
        theme.resolveAttribute(C1086R.attr.widgetBackgroundColorSecondary, typedValue2, true);
        if (complexComment.getLevel() == 1) {
            i = typedValue.resourceId;
        } else {
            i = typedValue2.resourceId;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = context.getColor(i);
        } else {
            i2 = context.getResources().getColor(i);
        }
        this.outerLayout.setBackgroundColor(i2);
        setLayoutLeftPadding(complexComment);
        if (complexComment.getLevel() == 1) {
            this.replyLayout.setVisibility(0);
            this.compositeSubscription.mo18721a(C10695a.m36221a(this.replyLayout).mo18687f(new C2022x(this, complexComment)).mo18686f().mo18655a(C2026z.f4676f, (C5378b<Throwable>) C2024y.f4673f));
            return;
        }
        this.replyLayout.setVisibility(8);
        this.userAvatar.setScaleX(0.7f);
        this.userAvatar.setScaleY(0.7f);
    }

    private void setLayoutLeftPadding(ComplexComment complexComment) {
        int level = complexComment.getLevel();
        int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(15, getContext().getResources());
        int i = level < 2 ? pixelsForDip : level * pixelsForDip;
        View view = this.outerLayout;
        view.setPadding(i, view.getPaddingTop(), pixelsForDip, this.outerLayout.getPaddingBottom());
    }

    /* renamed from: a */
    public /* synthetic */ void mo7948a(CommentDisplayable commentDisplayable, Void voidR) {
        commentDisplayable.itemClicked(this.itemView);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.userAvatar = (ImageView) view.findViewById(C1086R.C1088id.user_icon);
        this.outerLayout = view.findViewById(C1086R.C1088id.outer_layout);
        this.userName = (TextView) view.findViewById(C1086R.C1088id.user_name);
        this.datePos1 = (TextView) view.findViewById(C1086R.C1088id.added_date_pos1);
        this.datePos2 = (TextView) view.findViewById(C1086R.C1088id.added_date_pos2);
        this.comment = (TextView) view.findViewById(C1086R.C1088id.comment);
        this.replyLayout = view.findViewById(C1086R.C1088id.reply_layout);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7947a(ComplexComment complexComment, Void voidR) {
        return complexComment.observeReplySubmission().mo18590a((C5378b<? super Throwable>) new C1966b0(this)).mo18610e();
    }

    public void bindView(CommentDisplayable commentDisplayable, int i) {
        Comment comment2 = commentDisplayable.getComment();
        C0456c context = getContext();
        ImageLoader.with(context).loadWithCircleTransformAndPlaceHolderAvatarSize(comment2.getUser().getAvatar(), this.userAvatar, C1086R.C1087drawable.layer_1);
        this.userName.setText(comment2.getUser().getName());
        String timeDiffString = AptoideUtils.DateTimeU.getInstance(getContext()).getTimeDiffString((Context) context, comment2.getAdded().getTime(), getContext().getResources());
        this.datePos1.setText(timeDiffString);
        this.datePos2.setText(timeDiffString);
        this.comment.setText(comment2.getBody());
        if (ComplexComment.class.isAssignableFrom(comment2.getClass())) {
            this.datePos2.setVisibility(0);
            bindComplexComment((ComplexComment) comment2);
        } else {
            this.datePos1.setVisibility(0);
        }
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.itemView).mo18664b(new C2020w(this, commentDisplayable)).mo18655a(C1963a0.f4573f, (C5378b<Throwable>) C2018v.f4661f));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7949a(Throwable th) {
        Snackbar.m28075a((View) this.userAvatar, (int) C1086R.string.error_occured, -1);
    }
}
