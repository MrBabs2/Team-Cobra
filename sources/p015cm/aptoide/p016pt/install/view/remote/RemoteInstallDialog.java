package p015cm.aptoide.p016pt.install.view.remote;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.install.remote.ReceiverDevice;
import p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderListener;
import p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderManager;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment;

/* renamed from: cm.aptoide.pt.install.view.remote.RemoteInstallDialog */
public class RemoteInstallDialog extends BaseDialogFragment implements RemoteInstallationSenderListener {
    private static final String APP_ID_TAG = "appid";
    private ReceiverDeviceAdapter adapter;
    /* access modifiers changed from: private */
    public String app;
    private TextView aptoideTVInstalledText;
    private LinearLayout errorLayout;
    private TextView errorText;
    private LinearLayout listLayout;
    private ListView listView;
    private ProgressBar pBar;
    private ImageButton refreshBtn;
    /* access modifiers changed from: private */
    public RemoteInstallationSenderManager sManager;

    /* renamed from: cm.aptoide.pt.install.view.remote.RemoteInstallDialog$Error */
    private enum Error {
        NO_NETWORK,
        NO_DEVICES_FOUND
    }

    public static RemoteInstallDialog newInstance(long j) {
        RemoteInstallDialog remoteInstallDialog = new RemoteInstallDialog();
        Bundle bundle = new Bundle();
        bundle.putLong(APP_ID_TAG, j);
        remoteInstallDialog.setArguments(bundle);
        return remoteInstallDialog;
    }

    private void populateDeviceList() {
        ReceiverDeviceAdapter receiverDeviceAdapter = new ReceiverDeviceAdapter(getContext(), C1086R.layout.row_remote_install, new ArrayList());
        this.adapter = receiverDeviceAdapter;
        this.listView.setAdapter(receiverDeviceAdapter);
    }

    private void showErrorLayout(Error error) {
        this.pBar.setVisibility(8);
        if (error == Error.NO_DEVICES_FOUND) {
            this.aptoideTVInstalledText.setText(C1086R.string.remote_install_notinstallated);
            this.errorText.setText(C1086R.string.remote_install_nodevices);
        } else if (error == Error.NO_NETWORK) {
            this.aptoideTVInstalledText.setText(C1086R.string.remote_install_nowifi_tip);
            this.errorText.setText(C1086R.string.remote_install_nowifi);
        }
        this.listLayout.setVisibility(8);
        this.errorLayout.setVisibility(0);
    }

    public int getDialogStyle() {
        return C1086R.attr.roundedDialogsTheme;
    }

    public void onAppSendSuccess() {
        if (isAdded()) {
            Toast.makeText(getContext(), C1086R.string.remote_install_success, 1).show();
            dismiss();
        }
    }

    public void onAppSendUnsuccess() {
        if (isAdded()) {
            Toast.makeText(getContext(), C1086R.string.remote_install_fail, 1).show();
            dismiss();
        }
    }

    public void onAptoideTVServiceFound(ReceiverDevice receiverDevice) {
        this.adapter.add(receiverDevice);
    }

    public void onAptoideTVServiceLost(ReceiverDevice receiverDevice) {
        this.adapter.remove(receiverDevice);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.app = "" + getArguments().getLong(APP_ID_TAG);
        this.sManager = new RemoteInstallationSenderManager(getActivity());
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.requestWindowFeature(1);
        return onCreateDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!(getDialog() == null || getDialog().getWindow() == null || getDialog().getWindow().getDecorView() == null)) {
            getDialog().getWindow().getDecorView().getBackground().setAlpha(0);
        }
        final View inflate = layoutInflater.inflate(C1086R.layout.dialog_remote_install, viewGroup, false);
        this.pBar = (ProgressBar) inflate.findViewById(C1086R.C1088id.progressBar);
        this.errorLayout = (LinearLayout) inflate.findViewById(C1086R.C1088id.errorLayout);
        this.errorText = (TextView) inflate.findViewById(C1086R.C1088id.no_connection_text);
        this.listLayout = (LinearLayout) inflate.findViewById(C1086R.C1088id.listLayout);
        this.aptoideTVInstalledText = (TextView) inflate.findViewById(C1086R.C1088id.aptoidetv_installed_text);
        this.refreshBtn = (ImageButton) inflate.findViewById(C1086R.C1088id.refreshButton);
        ((Button) inflate.findViewById(C1086R.C1088id.help_btn)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(RemoteInstallDialog.this.getContext().getString(C1086R.string.remote_install_help_url)));
                intent.setFlags(268435456);
                RemoteInstallDialog.this.startActivity(intent);
            }
        });
        this.refreshBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RemoteInstallDialog.this.onRetryClick(inflate);
            }
        });
        if (this.adapter == null) {
            ListView listView2 = (ListView) inflate.findViewById(C1086R.C1088id.listView);
            this.listView = listView2;
            listView2.setEmptyView(inflate.findViewById(C1086R.C1088id.emptyListLayout));
            this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    ReceiverDevice receiverDevice = (ReceiverDevice) adapterView.getItemAtPosition(i);
                    if (RemoteInstallDialog.this.sManager != null) {
                        RemoteInstallDialog.this.sManager.sendAppId(receiverDevice, RemoteInstallDialog.this.app);
                    }
                }
            });
            populateDeviceList();
            onRetryClick(viewGroup);
        }
        return inflate;
    }

    public void onDiscoveryStarted() {
        this.refreshBtn.setVisibility(8);
        this.pBar.setVisibility(0);
        this.errorLayout.setVisibility(8);
        this.listLayout.setVisibility(0);
    }

    public void onDiscoveryStopped() {
        this.pBar.setVisibility(8);
        this.refreshBtn.setVisibility(0);
        if (this.adapter.getCount() == 0) {
            showErrorLayout(Error.NO_DEVICES_FOUND);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.sManager.stopDiscoveringAptoideTVServices();
        super.onDismiss(dialogInterface);
    }

    public void onNoNetworkAccess() {
        showErrorLayout(Error.NO_NETWORK);
    }

    public void onRetryClick(View view) {
        populateDeviceList();
        this.sManager.discoverAptoideTVServices(this);
    }
}
