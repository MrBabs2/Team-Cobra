package p015cm.aptoide.p016pt.comments.view;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.store.view.StoreFragment;
import p015cm.aptoide.p016pt.view.FragmentProvider;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.comments.view.CommentDisplayable */
public class CommentDisplayable extends Displayable {
    private final Comment comment;
    private FragmentNavigator fragmentNavigator;
    private FragmentProvider fragmentProvider;

    public CommentDisplayable(Comment comment2, FragmentNavigator fragmentNavigator2, FragmentProvider fragmentProvider2) {
        this.comment = comment2;
        this.fragmentNavigator = fragmentNavigator2;
        this.fragmentProvider = fragmentProvider2;
    }

    public Comment getComment() {
        return this.comment;
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public int getViewLayout() {
        return C1086R.layout.comment_layout;
    }

    public void itemClicked(View view) {
        if (this.comment.getUser().getAccess() == Comment.Access.PUBLIC) {
            this.fragmentNavigator.navigateTo(this.fragmentProvider.newStoreFragment(this.comment.getUser().getId(), "DEFAULT", StoreFragment.OpenType.GetHome), true);
        } else {
            Snackbar.m28075a(view, (int) C1086R.string.stores_message_private_user, -1).mo31972k();
        }
    }

    public CommentDisplayable() {
        this.comment = null;
    }
}
