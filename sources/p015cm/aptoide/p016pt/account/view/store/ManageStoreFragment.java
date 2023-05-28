package p015cm.aptoide.p016pt.account.view.store;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.app.C0076d;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.trello.rxlifecycle.p209g.C9008b;
import java.util.Arrays;
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
import p015cm.aptoide.p016pt.themes.StoreTheme;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.view.BackButtonFragment;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p015cm.aptoide.p016pt.view.custom.DividerItemDecoration;
import p015cm.aptoide.p016pt.view.dialog.ImagePickerDialog;
import p050l.p051a.p058o.C4824d;
import p112n.p118g.p119b.C5305c;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.account.view.store.ManageStoreFragment */
public class ManageStoreFragment extends BackButtonFragment implements ManageStoreView, NotBottomNavigationView {
    private static final String EXTRA_GO_TO_HOME = "go_to_home";
    private static final String EXTRA_STORE_MODEL = "store_model";
    private static final float SPACE_BETWEEN = 0.0f;
    private static final float STROKE_SIZE = 0.04f;
    private Button cancelChangesButton;
    private TextView chooseStoreNameTitle;
    private ManageStoreViewModel currentModel;
    private ImagePickerDialog dialogFragment;
    private boolean goToHome;
    private ImagePickerErrorHandler imagePickerErrorHandler;
    @Inject
    ImagePickerPresenter imagePickerPresenter;
    @Inject
    ManageStorePresenter manageStorePresenter;
    @Inject
    ScreenOrientationManager orientationManager;
    private Button saveDataButton;
    private View selectStoreImageButton;
    private EditText storeDescription;
    private ImageView storeImage;
    private EditText storeName;
    @Inject
    ThemeManager themeManager;
    private ThemeSelectorViewAdapter themeSelectorAdapter;
    private RecyclerView themeSelectorView;
    private Toolbar toolbar;
    private ProgressDialog waitDialog;

    /* renamed from: a */
    static /* synthetic */ void m4403a(GenericDialogs.EResponse eResponse) {
    }

    private void attachPresenters() {
        attachPresenter(new CompositePresenter(Arrays.asList(new Presenter[]{this.imagePickerPresenter, this.manageStorePresenter})));
    }

    private String getViewTitle(ManageStoreViewModel manageStoreViewModel) {
        if (!manageStoreViewModel.storeExists()) {
            return getString(C1086R.string.create_store_title);
        }
        return getString(C1086R.string.edit_store_title);
    }

    public static ManageStoreFragment newInstance(ManageStoreViewModel manageStoreViewModel, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(EXTRA_STORE_MODEL, C12420e.m40843a(manageStoreViewModel));
        bundle.putBoolean(EXTRA_GO_TO_HOME, z);
        ManageStoreFragment manageStoreFragment = new ManageStoreFragment();
        manageStoreFragment.setArguments(bundle);
        return manageStoreFragment;
    }

    private void setupViewsDefaultDataUsingCurrentModel() {
        this.storeName.setText(this.currentModel.getStoreName());
        if (!this.currentModel.storeExists()) {
            this.chooseStoreNameTitle.setText(C1086R.string.create_store_name);
            return;
        }
        this.chooseStoreNameTitle.setText(AptoideUtils.StringU.getFormattedString(C1086R.string.description, getResources(), new Object[0]));
        this.storeName.setVisibility(8);
        this.storeDescription.setVisibility(0);
        this.storeDescription.setText(this.currentModel.getStoreDescription());
        loadImageStateless(this.currentModel.getPictureUri());
        this.saveDataButton.setText(C1086R.string.save_edit_store);
        this.cancelChangesButton.setText(C1086R.string.cancel);
    }

    private ManageStoreViewModel updateAndGetStoreModel() {
        ManageStoreViewModel update = ManageStoreViewModel.update(this.currentModel, this.storeName.getText().toString(), this.storeDescription.getText().toString());
        this.currentModel = update;
        update.setStoreTheme(this.themeSelectorAdapter.getSelectedTheme());
        return this.currentModel;
    }

    /* renamed from: b */
    public /* synthetic */ ManageStoreViewModel mo6490b(Void voidR) {
        return updateAndGetStoreModel();
    }

    public void bindViews(View view) {
        this.chooseStoreNameTitle = (TextView) view.findViewById(C1086R.C1088id.create_store_choose_name_title);
        this.selectStoreImageButton = view.findViewById(C1086R.C1088id.create_store_image_action);
        this.storeImage = (ImageView) view.findViewById(C1086R.C1088id.create_store_image);
        this.storeName = (EditText) view.findViewById(C1086R.C1088id.create_store_name);
        this.storeDescription = (EditText) view.findViewById(C1086R.C1088id.edit_store_description);
        this.cancelChangesButton = (Button) view.findViewById(C1086R.C1088id.create_store_skip);
        this.saveDataButton = (Button) view.findViewById(C1086R.C1088id.create_store_action);
        this.themeSelectorView = (RecyclerView) view.findViewById(C1086R.C1088id.theme_selector);
        this.waitDialog = GenericDialogs.createGenericPleaseWaitDialog(getActivity(), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId, getActivity().getApplicationContext().getString(C1086R.string.please_wait_upload));
        this.toolbar = (Toolbar) view.findViewById(C1086R.C1088id.toolbar);
    }

    public C5368e<ManageStoreViewModel> cancelClick() {
        return C10695a.m36221a(this.cancelChangesButton).mo18694j(new C1213b(this)).mo18664b(new C1221f(this));
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

    public void dismissWaitProgressBar() {
        this.orientationManager.unlock();
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.waitDialog.dismiss();
        }
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(ManageStoreFragment.class.getSimpleName());
    }

    public void hideKeyboard() {
        super.hideKeyboard();
    }

    public void loadImage(String str) {
        loadImageStateless(str);
        this.currentModel.setNewAvatar(true);
    }

    public void loadImageStateless(String str) {
        String str2 = str;
        ImageLoader.with(getActivity()).loadWithShadowCircleTransform(str2, this.storeImage, this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimary).data, SPACE_BETWEEN, STROKE_SIZE);
        this.currentModel.setPictureUri(str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.currentModel = (ManageStoreViewModel) C12420e.m40844a(getArguments().getParcelable(EXTRA_STORE_MODEL));
        this.goToHome = getArguments().getBoolean(EXTRA_GO_TO_HOME, true);
        this.dialogFragment = new ImagePickerDialog.Builder(new C4824d(getContext(), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId), this.themeManager).setViewRes(C1086R.layout.dialog_choose_avatar_source).setTitle(C1086R.string.upload_dialog_title).setNegativeButton(C1086R.string.cancel).setCameraButton(C1086R.C1088id.button_camera).setGalleryButton(C1086R.C1088id.button_gallery).build();
        this.imagePickerErrorHandler = new ImagePickerErrorHandler(getContext(), this.themeManager);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1086R.layout.fragment_manage_store, viewGroup, false);
    }

    public void onDestroyView() {
        dismissWaitProgressBar();
        ImagePickerDialog imagePickerDialog = this.dialogFragment;
        if (imagePickerDialog != null) {
            imagePickerDialog.dismiss();
            this.dialogFragment = null;
        }
        hideKeyboard();
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(EXTRA_STORE_MODEL, C12420e.m40843a(this.currentModel));
        bundle.putBoolean(EXTRA_GO_TO_HOME, this.goToHome);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bindViews(view);
        setupToolbarTitle();
        setupThemeSelector();
        setupViewsDefaultDataUsingCurrentModel();
        attachPresenters();
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            try {
                this.currentModel = (ManageStoreViewModel) C12420e.m40844a(bundle.getParcelable(EXTRA_STORE_MODEL));
            } catch (NullPointerException unused) {
                this.currentModel = new ManageStoreViewModel();
            }
            this.goToHome = bundle.getBoolean(EXTRA_GO_TO_HOME, true);
        }
    }

    public C5368e<ManageStoreViewModel> saveDataClick() {
        return C10695a.m36221a(this.saveDataButton).mo18694j(new C1215c(this)).mo18664b(new C1217d(this));
    }

    public C5368e<Void> selectStoreImageClick() {
        return C10695a.m36221a(this.selectStoreImageButton);
    }

    public void setupThemeSelector() {
        this.themeSelectorView.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        ThemeSelectorViewAdapter themeSelectorViewAdapter = new ThemeSelectorViewAdapter(C5305c.m10045o(), StoreTheme.getThemesFromVersion(8), this.themeManager);
        this.themeSelectorAdapter = themeSelectorViewAdapter;
        this.themeSelectorView.setAdapter(themeSelectorViewAdapter);
        this.themeSelectorAdapter.storeThemeSelection().mo18664b(new C1223h(this)).mo18641a(bindUntilEvent(C9008b.DESTROY_VIEW)).mo18693i();
        this.themeSelectorView.addItemDecoration(new DividerItemDecoration(getContext(), 8.0f, 3));
        this.themeSelectorAdapter.mo6541a(this.currentModel.getStoreTheme());
    }

    public void setupToolbarTitle() {
        this.toolbar.setTitle((CharSequence) getViewTitle(this.currentModel));
        ((C0076d) getActivity()).setSupportActionBar(this.toolbar);
        C0069a supportActionBar = ((C0076d) getActivity()).getSupportActionBar();
        supportActionBar.mo188d(false);
        supportActionBar.mo182a(this.toolbar.getTitle());
    }

    public void showError(String str) {
        Snackbar.m28076a((View) this.saveDataButton, (CharSequence) str, 0).mo31972k();
    }

    public void showIconPropertiesError(InvalidImageException invalidImageException) {
        this.imagePickerErrorHandler.showIconPropertiesError(invalidImageException).mo18641a(bindUntilEvent(View.LifecycleEvent.PAUSE)).mo18655a(C1222g.f3643f, (C5378b<Throwable>) C1219e.f3640f);
    }

    public void showImagePickerDialog() {
        this.dialogFragment.show();
    }

    public void showSuccessMessage() {
        Snackbar.m28076a((android.view.View) this.saveDataButton, (CharSequence) getString(C1086R.string.done), 0).mo31972k();
    }

    public void showWaitProgressBar() {
        this.orientationManager.lock();
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog != null && !progressDialog.isShowing()) {
            this.waitDialog.show();
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo6491b(ManageStoreViewModel manageStoreViewModel) {
        hideKeyboard();
    }

    /* renamed from: a */
    public /* synthetic */ ManageStoreViewModel mo6487a(Void voidR) {
        return this.currentModel;
    }

    /* renamed from: a */
    public /* synthetic */ void mo6488a(ManageStoreViewModel manageStoreViewModel) {
        hideKeyboard();
    }

    /* renamed from: a */
    public /* synthetic */ void mo6489a(StoreTheme storeTheme) {
        this.currentModel.setStoreTheme(storeTheme);
    }
}
