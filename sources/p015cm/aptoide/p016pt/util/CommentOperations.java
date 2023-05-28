package p015cm.aptoide.p016pt.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import p015cm.aptoide.p016pt.comments.CommentNode;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;
import p050l.p066e.C4873d;

/* renamed from: cm.aptoide.pt.util.CommentOperations */
public class CommentOperations {
    public List<CommentNode> flattenByDepth(List<CommentNode> list) {
        LinkedList linkedList = new LinkedList();
        Stack stack = new Stack();
        stack.addAll(list);
        while (!stack.isEmpty()) {
            CommentNode commentNode = (CommentNode) stack.pop();
            linkedList.add(commentNode);
            if (commentNode.hasChild()) {
                for (CommentNode next : commentNode.getChildComments()) {
                    next.setLevel(commentNode.getLevel() + 1);
                    stack.push(next);
                }
            }
        }
        return linkedList;
    }

    public List<CommentNode> transform(List<Comment> list) {
        C4873d dVar = new C4873d();
        for (Comment next : list) {
            Comment.Parent parent = next.getParent();
            if (parent != null) {
                CommentNode commentNode = (CommentNode) dVar.mo16936a(parent.getId());
                if (commentNode == null) {
                    commentNode = new CommentNode();
                }
                commentNode.addChild(new CommentNode(next));
                dVar.mo16937a(parent.getId(), commentNode);
            } else {
                CommentNode commentNode2 = (CommentNode) dVar.mo16936a(next.getId());
                if (commentNode2 == null) {
                    dVar.mo16937a(next.getId(), new CommentNode(next));
                } else {
                    commentNode2.setComment(next);
                }
            }
        }
        ArrayList arrayList = new ArrayList(dVar.mo16942c());
        for (int i = 0; i < dVar.mo16942c(); i++) {
            arrayList.add((CommentNode) dVar.mo16943c(i));
        }
        return arrayList;
    }
}
