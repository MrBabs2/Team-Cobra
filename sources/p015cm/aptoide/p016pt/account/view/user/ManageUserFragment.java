package p015cm.aptoide.p016pt.account.view.user;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.app.C0076d;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.snackbar.Snackbar;
import java.util.Arrays;
import java.util.Calendar;
import javax.inject.Inject;
import org.parceler.C12420e;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.view.ImagePickerErrorHandler;
import p015cm.aptoide.p016pt.account.view.ImagePickerPresenter;
import p015cm.aptoide.p016pt.account.view.exception.InvalidImageException;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.orientation.ScreenOrientationManager;
import p015cm.aptoide.p016pt.presenter.CompositePresenter;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.view.BackButtonFragment;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p015cm.aptoide.p016pt.view.dialog.ImagePickerDialog;
import p050l.p051a.p058o.C4824d;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.account.view.user.ManageUserFragment */
public class ManageUserFragment extends BackButtonFragment implements ManageUserView, NotBottomNavigationView {
    private static final int DEFAULT_IMAGE_PLACEHOLDER = 2131231056;
    private static final String EXTRA_IS_EDIT = "is_edit";
    private static final String EXTRA_USER_MODEL = "user_model";
    private Button cancelUserProfile;
    private Button createUserButton;
    private ViewModel currentModel;
    private ImagePickerDialog dialogFragment;
    private ImagePickerErrorHandler imagePickerErrorHandler;
    @Inject
    ImagePickerPresenter imagePickerPresenter;
    private boolean isEditProfile;
    @Inject
    ManageUserPresenter manageUserPresenter;
    @Inject
    NewsletterManager newsletterManager;
    @Inject
    ScreenOrientationManager orientationManager;
    @Inject
    ThemeManager themeManager;
    private Toolbar toolbar;
    private ProgressDialog uploadWaitDialog;
    private EditText userName;
    private ImageView userPicture;
    private RelativeLayout userPictureLayout;

    /* renamed from: a */
    static /* synthetic */ void m4433a(GenericDialogs.EResponse eResponse) {
    }

    private void attachPresenters() {
        attachPresenter(new CompositePresenter(Arrays.asList(new Presenter[]{this.manageUserPresenter, this.imagePickerPresenter})));
    }

    private void bindViews(View view) {
        this.toolbar = (Toolbar) view.findViewById(C1086R.C1088id.toolbar);
        this.userPictureLayout = (RelativeLayout) view.findViewById(C1086R.C1088id.create_user_image_action);
        this.userName = (EditText) view.findViewById(C1086R.C1088id.create_user_username_inserted);
        this.createUserButton = (Button) view.findViewById(C1086R.C1088id.create_user_create_profile);
        this.cancelUserProfile = (Button) view.findViewById(C1086R.C1088id.create_user_cancel_button);
        this.userPicture = (ImageView) view.findViewById(C1086R.C1088id.create_user_image);
    }

    private static ManageUserFragment newInstance(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(EXTRA_IS_EDIT, z);
        ManageUserFragment manageUserFragment = new ManageUserFragment();
        manageUserFragment.setArguments(bundle);
        return manageUserFragment;
    }

    public static ManageUserFragment newInstanceToCreate() {
        return newInstance(false);
    }

    public static ManageUserFragment newInstanceToEdit() {
        return newInstance(true);
    }

    private void setupCalendar(Calendar calendar, int i, int i2, int i3) {
        calendar.set(1, i);
        calendar.set(2, i2);
        calendar.set(5, i3);
    }

    private void setupToolbar() {
        if (this.isEditProfile) {
            this.toolbar.setTitle((CharSequence) getString(C1086R.string.edit_profile_title));
        } else {
            this.toolbar.setTitle((int) C1086R.string.create_user_title);
        }
        ((C0076d) getActivity()).setSupportActionBar(this.toolbar);
        C0069a supportActionBar = ((C0076d) getActivity()).getSupportActionBar();
        supportActionBar.mo188d(false);
        supportActionBar.mo182a(this.toolbar.getTitle());
    }

    /* renamed from: a */
    public /* synthetic */ ViewModel mo6553a(Void voidR) {
        return updateModelAndGet();
    }

    public C5368e<Void> cancelButtonClick() {
        return C10695a.m36221a(this.cancelUserProfile);
    }

    public C5368e<DialogInterface> dialogCameraSelected() {
        return this.dialogFragment.cameraSelected();
    }

    public C5368e<DialogInterface> dialogGallerySelected() {
        return this.dialogFragment.gallerySelected();
    }

    public void dismissLoadImageDialog() {
        this.dialogFragment.dismiss();
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(ManageUserFragment.class.getSimpleName());
    }

    public void hideProgressDialog() {
        this.uploadWaitDialog.dismiss();
        this.orientationManager.unlock();
    }

    public void loadImage(String str) {
        loadImageStateless(str);
        this.currentModel.setNewPicture(true);
    }

    public void loadImageStateless(String str) {
        this.currentModel.setPictureUri(str);
        ImageLoader.with(getActivity()).loadUsingCircleTransformAndPlaceholder(str, this.userPicture, C1086R.C1087drawable.create_user_avatar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        Context context = getContext();
        if (bundle == null || !bundle.containsKey(EXTRA_USER_MODEL)) {
            this.currentModel = new ViewModel();
        } else {
            this.currentModel = (ViewModel) C12420e.m40844a(bundle.getParcelable(EXTRA_USER_MODEL));
        }
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null && arguments.getBoolean(EXTRA_IS_EDIT, false)) {
            z = true;
        }
        this.isEditProfile = z;
        this.imagePickerErrorHandler = new ImagePickerErrorHandler(context, this.themeManager);
        this.dialogFragment = new ImagePickerDialog.Builder(new C4824d(getContext(), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId), this.themeManager).setViewRes(C1086R.layout.dialog_choose_avatar_source).setTitle(C1086R.string.upload_dialog_title).setNegativeButton(C1086R.string.cancel).setCameraButton(C1086R.C1088id.button_camera).setGalleryButton(C1086R.C1088id.button_gallery).build();
        this.uploadWaitDialog = GenericDialogs.createGenericPleaseWaitDialog(context, this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId, context.getString(C1086R.string.please_wait_upload));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1086R.layout.fragment_manage_user, viewGroup, false);
    }

    public void onDestroyView() {
        ProgressDialog progressDialog = this.uploadWaitDialog;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.uploadWaitDialog.dismiss();
        }
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(EXTRA_USER_MODEL, C12420e.m40843a(this.currentModel));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bindViews(view);
        setupToolbar();
        if (bundle == null || !bundle.containsKey(EXTRA_USER_MODEL)) {
            this.currentModel = new ViewModel();
        } else {
            ViewModel viewModel = (ViewModel) C12420e.m40844a(bundle.getParcelable(EXTRA_USER_MODEL));
            this.currentModel = viewModel;
            loadImageStateless(viewModel.getPictureUri());
            setUserName(this.currentModel.getName());
        }
        if (this.isEditProfile) {
            this.createUserButton.setText(getString(C1086R.string.edit_profile_save_button));
            this.cancelUserProfile.setVisibility(0);
        }
        attachPresenters();
    }

    public C5368e<ViewModel> saveUserDataButtonClick() {
        return C10695a.m36221a(this.createUserButton).mo18694j(new C1256d(this));
    }

    public C5368e<Void> selectStoreImageClick() {
        return C10695a.m36221a(this.userPictureLayout);
    }

    public void setUserName(String str) {
        this.currentModel.setName(str);
        this.userName.setText(str);
    }

    public C5328b showErrorMessage(String str) {
        return Single.m10126b(new C1259e(this, str)).mo18566b(C1250b.f3680f);
    }

    public void showIconPropertiesError(InvalidImageException invalidImageException) {
        this.imagePickerErrorHandler.showIconPropertiesError(invalidImageException).mo18641a(bindUntilEvent(View.LifecycleEvent.PAUSE)).mo18655a(C1247a.f3677f, (C5378b<Throwable>) C1253c.f3684f);
    }

    public void showImagePickerDialog() {
        this.dialogFragment.show();
    }

    public void showProgressDialog() {
        this.orientationManager.lock();
        hideKeyboard();
        this.uploadWaitDialog.show();
    }

    public ViewModel updateModelAndGet() {
        return ViewModel.from(this.currentModel, this.userName.getText().toString());
    }

    /* renamed from: a */
    public /* synthetic */ Snackbar mo6554a(String str) throws Exception {
        return Snackbar.m28076a((android.view.View) this.createUserButton, (CharSequence) str, 0);
    }

    /* renamed from: cm.aptoide.pt.account.view.user.ManageUserFragment$ViewModel */
    protected static class ViewModel {
        boolean hasNewPicture;
        String name;
        String pictureUri;

        public ViewModel() {
            this.name = "";
            this.pictureUri = "";
            this.hasNewPicture = false;
        }

        public static ViewModel from(ViewModel viewModel, String str) {
            viewModel.setName(str);
            return viewModel;
        }

        public String getName() {
            return this.name;
        }

        public String getPictureUri() {
            return this.pictureUri;
        }

        public boolean hasNewPicture() {
            return this.hasNewPicture;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setNewPicture(boolean z) {
            this.hasNewPicture = z;
        }

        public void setPictureUri(String str) {
            this.pictureUri = str;
        }

        public ViewModel(String str, String str2) {
            this.name = str;
            this.pictureUri = str2;
            this.hasNewPicture = false;
            this.hasNewPicture = false;
        }
    }
}
