package p015cm.aptoide.p016pt.account.view;

import android.content.ContentResolver;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p015cm.aptoide.p016pt.account.view.exception.InvalidImageException;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.permission.AccountPermissionProvider;
import p015cm.aptoide.p016pt.permission.PermissionProvider;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.account.view.ImagePickerPresenter */
public class ImagePickerPresenter implements Presenter {
    private static final int CAMERA_PICK = 6;
    private static final int GALLERY_PICK = 5;
    private final AccountPermissionProvider accountPermissionProvider;
    private final ContentResolver contentResolver;
    private final CrashReport crashReport;
    private final ImageLoader imageLoader;
    private final ImageValidator imageValidator;
    private final C5373h ioScheduler;
    private final ImagePickerNavigator navigator;
    private final PhotoFileGenerator photoFileGenerator;
    private final C5373h uiScheduler;
    private final UriToPathResolver uriToPathResolver;
    private final ImagePickerView view;

    public ImagePickerPresenter(ImagePickerView imagePickerView, CrashReport crashReport2, AccountPermissionProvider accountPermissionProvider2, PhotoFileGenerator photoFileGenerator2, ImageValidator imageValidator2, C5373h hVar, UriToPathResolver uriToPathResolver2, ImagePickerNavigator imagePickerNavigator, ContentResolver contentResolver2, ImageLoader imageLoader2, C5373h hVar2) {
        this.view = imagePickerView;
        this.crashReport = crashReport2;
        this.accountPermissionProvider = accountPermissionProvider2;
        this.photoFileGenerator = photoFileGenerator2;
        this.imageValidator = imageValidator2;
        this.uiScheduler = hVar;
        this.uriToPathResolver = uriToPathResolver2;
        this.navigator = imagePickerNavigator;
        this.contentResolver = contentResolver2;
        this.imageLoader = imageLoader2;
        this.ioScheduler = hVar2;
    }

    /* renamed from: b */
    static /* synthetic */ void m4356b(Void voidR) {
    }

    /* renamed from: c */
    static /* synthetic */ void m4357c(DialogInterface dialogInterface) {
    }

    /* renamed from: d */
    static /* synthetic */ void m4358d(DialogInterface dialogInterface) {
    }

    /* renamed from: f */
    static /* synthetic */ void m4362f(String str) {
    }

    /* renamed from: g */
    static /* synthetic */ Boolean m4363g(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: g */
    static /* synthetic */ void m4364g(String str) {
    }

    /* renamed from: g */
    static /* synthetic */ void m4365g(Throwable th) {
    }

    private Single<String> getFileNameFromCameraWithUri(String str) {
        return this.navigator.navigateToCameraWithImageUri(6, Uri.parse(str)).mo18669c().mo18644a(this.ioScheduler).mo18692i(new C1173f0(this, str)).mo18700m();
    }

    /* renamed from: h */
    static /* synthetic */ Boolean m4366h(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    private void handleCameraImageResult() {
        this.view.getLifecycleEvent().mo18681d(C1177h0.f3603f).mo18687f(new C1244u(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1198n0.f3615f, (C5378b<Throwable>) new C1181j0(this));
    }

    private void handleCameraSelection() {
        this.view.getLifecycleEvent().mo18681d(C1203q.f3620f).mo18687f(new C1199o(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1187m0.f3613f, (C5378b<Throwable>) new C1202p0(this));
    }

    private void handleGalleryImageResult() {
        this.view.getLifecycleEvent().mo18681d(C1185l0.f3611f).mo18687f(new C1320y(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1159a0.f3582f, (C5378b<Throwable>) C1183k0.f3609f);
    }

    private void handleGallerySelection() {
        this.view.getLifecycleEvent().mo18681d(C1165c0.f3588f).mo18687f(new C1205r(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1175g0.f3601f, (C5378b<Throwable>) new C1184l(this));
    }

    /* renamed from: i */
    static /* synthetic */ Boolean m4367i(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: j */
    static /* synthetic */ Boolean m4368j(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* access modifiers changed from: private */
    /* renamed from: loadValidImageOrThrowForCamera */
    public C5328b mo6313a(String str) {
        return this.imageValidator.validateOrGetException(str).mo18588a(this.uiScheduler).mo18589a((C5377a) new C1314v(this, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: loadValidImageOrThrowForGallery */
    public C5328b mo6324c(String str) {
        return this.imageValidator.validateOrGetException(str).mo18588a(this.uiScheduler).mo18589a((C5377a) new C1168d0(this, str));
    }

    private Single<String> saveCameraPictureInPublicPhotos(String str) {
        Bitmap loadBitmap = this.imageLoader.loadBitmap(str);
        if (loadBitmap == null) {
            return Single.m10119a(str).mo18563b(this.ioScheduler);
        }
        String insertImage = MediaStore.Images.Media.insertImage(this.contentResolver, loadBitmap, str.substring(str.lastIndexOf(File.pathSeparator)), (String) null);
        loadBitmap.recycle();
        return Single.m10119a(insertImage).mo18563b(this.ioScheduler);
    }

    /* renamed from: a */
    public /* synthetic */ void mo6317a(Void voidR) {
        this.view.showImagePickerDialog();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo6321b(View.LifecycleEvent lifecycleEvent) {
        return this.view.dialogCameraSelected().mo18664b(new C1318x(this));
    }

    /* renamed from: c */
    public /* synthetic */ void mo6326c(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: d */
    public /* synthetic */ void mo6330d(String str) {
        this.view.loadImage(str);
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo6332e(View.LifecycleEvent lifecycleEvent) {
        return this.view.selectStoreImageClick().mo18686f().mo18664b(new C1206r0(this));
    }

    /* renamed from: f */
    public /* synthetic */ void mo6335f(Throwable th) {
        this.crashReport.log(th);
    }

    public void handlePickImageClick() {
        this.view.getLifecycleEvent().mo18681d(C1186m.f3612f).mo18687f(new C1197n(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1182k.f3608f, (C5378b<Throwable>) new C1242t(this));
    }

    public void present() {
        handlePickImageClick();
        handleCameraSelection();
        handleCameraImageResult();
        handleGallerySelection();
        handleGalleryImageResult();
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6312a(String str, Void voidR) {
        return saveCameraPictureInPublicPhotos(str);
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo6325c(View.LifecycleEvent lifecycleEvent) {
        return this.accountPermissionProvider.permissionResultCamera(5).mo18681d(C1171e0.f3596f).mo18664b(new C1162b0(this)).mo18687f(new C1208s0(this)).mo18689g(new C1207s(this)).mo18649a((C5378b<? super Throwable>) new C1316w(this)).mo18686f();
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo6329d(List list) {
        return this.navigator.navigateToGalleryForImageUri(5);
    }

    /* renamed from: a */
    public /* synthetic */ void mo6315a(DialogInterface dialogInterface) {
        this.accountPermissionProvider.requestCameraPermission(6);
    }

    /* renamed from: b */
    public /* synthetic */ void mo6322b(DialogInterface dialogInterface) {
        this.accountPermissionProvider.requestGalleryPermission(5);
    }

    /* renamed from: d */
    public /* synthetic */ void mo6331d(Throwable th) {
        this.crashReport.log(th);
        if (th instanceof InvalidImageException) {
            this.view.showIconPropertiesError((InvalidImageException) th);
        }
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6314a(View.LifecycleEvent lifecycleEvent) {
        return this.accountPermissionProvider.permissionResultCamera(6).mo18681d(C1322z.f3760f).mo18664b(new C1179i0(this)).mo18692i(new C1180j(this)).mo18689g(new C1200o0(this)).mo18649a((C5378b<? super Throwable>) new C1243t0(this)).mo18686f();
    }

    /* renamed from: b */
    public /* synthetic */ Single mo6319b(List list) {
        return this.photoFileGenerator.generateNewImageFileUriAsString();
    }

    /* renamed from: e */
    public /* synthetic */ void mo6333e(String str) {
        this.view.loadImage(str);
    }

    /* renamed from: f */
    static /* synthetic */ Boolean m4360f(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo6320b(String str) {
        return getFileNameFromCameraWithUri(str).mo18556a(this.uiScheduler).mo18566b(new C1201p(this));
    }

    /* renamed from: e */
    public /* synthetic */ void mo6334e(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m4359e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((PermissionProvider.Permission) it.next()).isGranted()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo6328d(View.LifecycleEvent lifecycleEvent) {
        return this.view.dialogGallerySelected().mo18664b(new C1204q0(this));
    }

    /* renamed from: b */
    public /* synthetic */ void mo6323b(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: c */
    public /* synthetic */ void mo6327c(List list) {
        this.view.dismissLoadImageDialog();
    }

    /* renamed from: a */
    public /* synthetic */ void mo6318a(List list) {
        this.view.dismissLoadImageDialog();
    }

    /* renamed from: a */
    public /* synthetic */ void mo6316a(Throwable th) {
        if (th instanceof InvalidImageException) {
            this.view.showIconPropertiesError((InvalidImageException) th);
        } else {
            this.crashReport.log(th);
        }
    }
}
