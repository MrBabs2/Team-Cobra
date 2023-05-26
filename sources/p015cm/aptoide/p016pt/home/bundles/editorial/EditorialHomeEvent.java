package p015cm.aptoide.p016pt.home.bundles.editorial;

import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;

/* renamed from: cm.aptoide.pt.home.bundles.editorial.EditorialHomeEvent */
public class EditorialHomeEvent extends HomeEvent {
    private final String cardId;
    private final String groupId;

    public EditorialHomeEvent(String str, String str2, HomeBundle homeBundle, int i, HomeEvent.Type type) {
        super(homeBundle, i, type);
        this.cardId = str;
        this.groupId = str2;
    }

    public String getCardId() {
        return this.cardId;
    }

    public String getGroupId() {
        return this.groupId;
    }
}
