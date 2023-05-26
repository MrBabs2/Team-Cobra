package p015cm.aptoide.p016pt.reactions;

import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialHomeEvent;

/* renamed from: cm.aptoide.pt.reactions.ReactionsHomeEvent */
public class ReactionsHomeEvent extends EditorialHomeEvent {
    private final String reaction;

    public ReactionsHomeEvent(String str, String str2, HomeBundle homeBundle, int i, HomeEvent.Type type, String str3) {
        super(str, str2, homeBundle, i, type);
        this.reaction = str3;
    }

    public String getReaction() {
        return this.reaction;
    }
}
