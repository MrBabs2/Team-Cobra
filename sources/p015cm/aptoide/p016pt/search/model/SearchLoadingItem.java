package p015cm.aptoide.p016pt.search.model;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.search.model.SearchItem;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo16641d2 = {"Lcm/aptoide/pt/search/model/SearchLoadingItem;", "Lcm/aptoide/pt/search/model/SearchItem;", "()V", "getId", "", "getType", "Lcm/aptoide/pt/search/model/SearchItem$Type;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.model.SearchLoadingItem */
/* compiled from: SearchLoadingItem.kt */
public final class SearchLoadingItem implements SearchItem {
    public long getId() {
        return (long) SearchItem.Type.LOADING.ordinal();
    }

    public SearchItem.Type getType() {
        return SearchItem.Type.LOADING;
    }
}
