package p015cm.aptoide.p016pt.store.view;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.app.C0074c;
import androidx.fragment.app.C0456c;
import androidx.fragment.app.Fragment;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.exception.AptoideWsV7Exception;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreMetaRequest;
import p015cm.aptoide.p016pt.store.StoreError;
import p015cm.aptoide.p016pt.store.StoreUtils;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.store.view.PrivateStoreDialog */
public class PrivateStoreDialog extends BaseDialogFragment {
    public static final String TAG = "PrivateStoreDialog";
    private AptoideAccountManager accountManager;
    private BodyInterceptor<BaseBody> bodyInterceptor;
    private Converter.Factory converterFactory;
    private OkHttpClient httpClient;
    private boolean isInsideStore;
    private ProgressDialog loadingDialog;
    private String storeName;
    private String storePassSha1;
    private String storeUser;
    @Inject
    StoreUtilsProxy storeUtilsProxy;
    private TokenInvalidator tokenInvalidator;

    /* renamed from: cm.aptoide.pt.store.view.PrivateStoreDialog$1 */
    static /* synthetic */ class C42561 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$store$StoreError;

        static {
            int[] iArr = new int[StoreError.values().length];
            $SwitchMap$cm$aptoide$pt$store$StoreError = iArr;
            try {
                iArr[StoreError.PRIVATE_STORE_WRONG_CREDENTIALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: cm.aptoide.pt.store.view.PrivateStoreDialog$BundleArgs */
    private enum BundleArgs {
        STORE_NAME
    }

    private GetStoreMetaRequest buildRequest() {
        return GetStoreMetaRequest.m5366of(new BaseRequestWithStore.StoreCredentials(this.storeName, this.storeUser, this.storePassSha1), this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences());
    }

    private void dismissLoadingDialog() {
        this.loadingDialog.dismiss();
    }

    public static PrivateStoreDialog newInstance(Fragment fragment, int i, String str, boolean z) {
        PrivateStoreDialog privateStoreDialog = new PrivateStoreDialog();
        Bundle bundle = new Bundle();
        bundle.putString(BundleArgs.STORE_NAME.name(), str);
        privateStoreDialog.setArguments(bundle);
        privateStoreDialog.setIsInsideStore(z);
        privateStoreDialog.setRetainInstance(true);
        privateStoreDialog.setTargetFragment(fragment, i);
        return privateStoreDialog;
    }

    private void showLoadingDialog() {
        if (this.loadingDialog == null) {
            this.loadingDialog = GenericDialogs.createGenericPleaseWaitDialog(getActivity(), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId);
        }
        this.loadingDialog.show();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14702a(View view, DialogInterface dialogInterface, int i) {
        this.storeUser = ((EditText) view.findViewById(C1086R.C1088id.edit_store_username)).getText().toString();
        this.storePassSha1 = AptoideUtils.AlgorithmU.computeSha1(((EditText) view.findViewById(C1086R.C1088id.edit_store_password)).getText().toString());
        this.storeUtilsProxy.subscribeStore(buildRequest(), new C4269b1(this), new C4272c1(this), this.storeName, this.accountManager, this.storeUser, this.storePassSha1);
        showLoadingDialog();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.tokenInvalidator = ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator();
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.bodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.storeName = arguments.getString(BundleArgs.STORE_NAME.name());
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        C0456c activity = getActivity();
        View inflate = LayoutInflater.from(activity).inflate(C1086R.layout.dialog_add_pvt_store, (ViewGroup) null, false);
        C0074c.C0075a aVar = new C0074c.C0075a(new ContextThemeWrapper(activity, this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId));
        aVar.mo232c(C1086R.string.subscribe_pvt_store);
        aVar.mo229b(inflate);
        aVar.mo233c(17039370, (DialogInterface.OnClickListener) new C4275d1(this, inflate));
        return aVar.mo225a();
    }

    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.isInsideStore) {
            getActivity().onBackPressed();
        }
        super.onDismiss(dialogInterface);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(BundleArgs.STORE_NAME.name(), this.storeName);
    }

    public void setIsInsideStore(boolean z) {
        this.isInsideStore = z;
    }

    /* renamed from: a */
    public /* synthetic */ void mo14703a(GetStoreMeta getStoreMeta) {
        getTargetFragment().onActivityResult(getTargetRequestCode(), -1, (Intent) null);
        dismissLoadingDialog();
        dismiss();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14704a(Throwable th) {
        dismissLoadingDialog();
        if (th instanceof AptoideWsV7Exception) {
            if (C42561.$SwitchMap$cm$aptoide$pt$store$StoreError[StoreUtils.getErrorType(((AptoideWsV7Exception) th).getBaseResponse().getError().getCode()).ordinal()] != 1) {
                getTargetFragment().onActivityResult(getTargetRequestCode(), 22, (Intent) null);
                dismiss();
                return;
            }
            this.storeUser = null;
            this.storePassSha1 = null;
            getTargetFragment().onActivityResult(getTargetRequestCode(), 21, (Intent) null);
            return;
        }
        th.printStackTrace();
        getTargetFragment().onActivityResult(getTargetRequestCode(), 22, (Intent) null);
        dismiss();
    }
}
