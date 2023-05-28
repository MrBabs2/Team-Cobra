package p015cm.aptoide.p016pt.comments;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;
import p123rx.C5328b;

/* renamed from: cm.aptoide.pt.comments.ComplexComment */
public class ComplexComment extends Comment {
    private final int level;
    private final C5328b onClickReplyAction;

    public ComplexComment(CommentNode commentNode, C5328b bVar) {
        this.level = commentNode.getLevel();
        Comment comment = commentNode.getComment();
        setAdded(comment.getAdded());
        setBody(comment.getBody());
        setId(comment.getId());
        if (comment.getParent() != null) {
            setParent(comment.getParent());
        }
        setParentReview(comment.getParentReview());
        setUser(comment.getUser());
        this.onClickReplyAction = bVar;
    }

    public int getLevel() {
        return this.level;
    }

    public C5328b observeReplySubmission() {
        return this.onClickReplyAction;
    }
}
