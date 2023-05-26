package p015cm.aptoide.p016pt.autoupdate;

import kotlin.C4789l;
import kotlin.jvm.internal.C10204l;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9156e;

@C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.autoupdate.AutoUpdateRepository$loadAutoUpdateModel$1 */
/* compiled from: AutoUpdateRepository.kt */
final /* synthetic */ class AutoUpdateRepository$loadAutoUpdateModel$1 extends C10204l {
    AutoUpdateRepository$loadAutoUpdateModel$1(AutoUpdateRepository autoUpdateRepository) {
        super(autoUpdateRepository);
    }

    public Object get() {
        return AutoUpdateRepository.access$getAutoUpdateModel$p((AutoUpdateRepository) this.receiver);
    }

    public String getName() {
        return "autoUpdateModel";
    }

    public C9156e getOwner() {
        return C10216x.m34186a(AutoUpdateRepository.class);
    }

    public String getSignature() {
        return "getAutoUpdateModel()Lcm/aptoide/pt/autoupdate/AutoUpdateModel;";
    }

    public void set(Object obj) {
        ((AutoUpdateRepository) this.receiver).autoUpdateModel = (AutoUpdateModel) obj;
    }
}
