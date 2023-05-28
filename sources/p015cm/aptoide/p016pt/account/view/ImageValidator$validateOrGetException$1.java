package p015cm.aptoide.p016pt.account.view;

import kotlin.C4789l;
import p123rx.C5328b;
import p123rx.p126m.C12495m;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo16641d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.account.view.ImageValidator$validateOrGetException$1 */
/* compiled from: ImageValidator.kt */
final class ImageValidator$validateOrGetException$1<R> implements C12495m<C5328b> {
    final /* synthetic */ String $imagePath;
    final /* synthetic */ ImageValidator this$0;

    ImageValidator$validateOrGetException$1(ImageValidator imageValidator, String str) {
        this.this$0 = imageValidator;
        this.$imagePath = str;
    }

    public final C5328b call() {
        this.this$0.validate(this.$imagePath);
        return C5328b.m10170f();
    }
}
