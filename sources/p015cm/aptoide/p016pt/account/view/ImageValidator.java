package p015cm.aptoide.p016pt.account.view;

import java.util.ArrayList;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.account.view.exception.InvalidImageException;
import p123rx.C5328b;
import p123rx.C5373h;
import p123rx.p126m.C12495m;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo16641d2 = {"Lcm/aptoide/pt/account/view/ImageValidator;", "", "scheduler", "Lrx/Scheduler;", "imageInfoProvider", "Lcm/aptoide/pt/account/view/ImageInfoProvider;", "(Lrx/Scheduler;Lcm/aptoide/pt/account/view/ImageInfoProvider;)V", "getInfo", "Lcm/aptoide/pt/account/view/ImageInfo;", "imagePath", "", "validate", "", "validateOrGetException", "Lrx/Completable;", "Companion", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.account.view.ImageValidator */
/* compiled from: ImageValidator.kt */
public class ImageValidator {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int MAX_IMAGE_HEIGHT = 10240;
    private static final int MAX_IMAGE_SIZE_IN_BYTES = 5242880;
    private static final int MAX_IMAGE_WIDTH = 10240;
    private static final int MIN_IMAGE_HEIGHT = 600;
    private static final int MIN_IMAGE_WIDTH = 600;
    private final ImageInfoProvider imageInfoProvider;
    private final C5373h scheduler;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo16641d2 = {"Lcm/aptoide/pt/account/view/ImageValidator$Companion;", "", "()V", "MAX_IMAGE_HEIGHT", "", "MAX_IMAGE_SIZE_IN_BYTES", "MAX_IMAGE_WIDTH", "MIN_IMAGE_HEIGHT", "MIN_IMAGE_WIDTH", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.account.view.ImageValidator$Companion */
    /* compiled from: ImageValidator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ImageValidator(C5373h hVar, ImageInfoProvider imageInfoProvider2) {
        C10202j.m34178b(hVar, "scheduler");
        C10202j.m34178b(imageInfoProvider2, "imageInfoProvider");
        this.scheduler = hVar;
        this.imageInfoProvider = imageInfoProvider2;
    }

    private final ImageInfo getInfo(String str) throws InvalidImageException {
        ImageInfo info = this.imageInfoProvider.getInfo(str);
        if (info != null) {
            return info;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(InvalidImageException.ImageError.ERROR_DECODING);
        throw new InvalidImageException(arrayList);
    }

    /* access modifiers changed from: private */
    public final void validate(String str) throws InvalidImageException {
        ImageInfo info = getInfo(str);
        ArrayList arrayList = new ArrayList();
        if (info.getHeight() < 600) {
            arrayList.add(InvalidImageException.ImageError.MIN_HEIGHT);
        } else if (info.getHeight() > 10240) {
            arrayList.add(InvalidImageException.ImageError.MAX_HEIGHT);
        }
        if (info.getWidth() < 600) {
            arrayList.add(InvalidImageException.ImageError.MIN_WIDTH);
        } else if (info.getWidth() > 10240) {
            arrayList.add(InvalidImageException.ImageError.MAX_WIDTH);
        }
        if (info.getSize() > ((long) MAX_IMAGE_SIZE_IN_BYTES)) {
            arrayList.add(InvalidImageException.ImageError.MAX_IMAGE_SIZE);
        }
        if (!arrayList.isEmpty()) {
            throw new InvalidImageException(arrayList);
        }
    }

    public C5328b validateOrGetException(String str) {
        C10202j.m34178b(str, "imagePath");
        return C5328b.m10166b((C12495m<? extends C5328b>) new ImageValidator$validateOrGetException$1(this, str)).mo18600b(this.scheduler);
    }
}
