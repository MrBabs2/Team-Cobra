package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.ListComments */
public class ListComments extends BaseV7EndlessDataListResponse<Comment> {
    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof ListComments;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ListComments) && ((ListComments) obj).canEqual(this) && super.equals(obj);
    }

    public int hashCode() {
        return 59 + super.hashCode();
    }

    public String toString() {
        return "ListComments()";
    }
}
