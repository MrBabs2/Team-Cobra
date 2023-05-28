package p015cm.aptoide.p016pt.reactions.data;

/* renamed from: cm.aptoide.pt.reactions.data.TopReaction */
public class TopReaction {
    private final int total;
    private final String type;

    public TopReaction(String str, int i) {
        this.type = str;
        this.total = i;
    }

    public int getTotal() {
        return this.total;
    }

    public String getType() {
        return this.type;
    }
}
