package p015cm.aptoide.p016pt;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.C5328b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, mo16641d2 = {"Lcm/aptoide/pt/UpdateLaunchManager;", "", "followedStoresManager", "Lcm/aptoide/pt/FollowedStoresManager;", "(Lcm/aptoide/pt/FollowedStoresManager;)V", "getFollowedStoresManager", "()Lcm/aptoide/pt/FollowedStoresManager;", "runUpdateLaunch", "Lrx/Completable;", "previousVersionCode", "", "currentVersionCode", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.UpdateLaunchManager */
/* compiled from: UpdateLaunchManager.kt */
public final class UpdateLaunchManager {
    private final FollowedStoresManager followedStoresManager;

    public UpdateLaunchManager(FollowedStoresManager followedStoresManager2) {
        C10202j.m34178b(followedStoresManager2, "followedStoresManager");
        this.followedStoresManager = followedStoresManager2;
    }

    public final FollowedStoresManager getFollowedStoresManager() {
        return this.followedStoresManager;
    }

    public final C5328b runUpdateLaunch(int i, int i2) {
        C5328b f = C5328b.m10170f();
        if (i < 10013) {
            f = f.mo18587a(this.followedStoresManager.setDefaultFollowedStores());
        }
        C10202j.m34174a((Object) f, "completable");
        return f;
    }
}
