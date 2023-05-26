package p015cm.aptoide.p016pt.comments;

import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;

/* renamed from: cm.aptoide.pt.comments.CommentNode */
public class CommentNode {
    private final List<CommentNode> childComments;
    private Comment comment;
    private int level;

    public CommentNode() {
        this((Comment) null);
    }

    public void addChild(CommentNode commentNode) {
        this.childComments.add(commentNode);
    }

    public List<CommentNode> getChildComments() {
        return this.childComments;
    }

    public Comment getComment() {
        return this.comment;
    }

    public int getLevel() {
        return this.level;
    }

    public boolean hasChild() {
        return this.childComments.size() > 0;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public CommentNode(Comment comment2) {
        this.level = 1;
        this.comment = comment2;
        this.childComments = new ArrayList();
    }
}
