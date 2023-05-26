package p015cm.aptoide.p016pt.view.recycler.displayable;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.view.recycler.displayable.MessageWhiteBgDisplayable */
public class MessageWhiteBgDisplayable extends Displayable {
    private String message;

    public MessageWhiteBgDisplayable() {
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public String getMessage() {
        return this.message;
    }

    public int getViewLayout() {
        return C1086R.layout.white_message_displayable;
    }

    public MessageWhiteBgDisplayable(String str) {
        this.message = str;
    }
}
