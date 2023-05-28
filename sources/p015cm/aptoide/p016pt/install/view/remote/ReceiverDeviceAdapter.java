package p015cm.aptoide.p016pt.install.view.remote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.install.remote.ReceiverDevice;

/* renamed from: cm.aptoide.pt.install.view.remote.ReceiverDeviceAdapter */
public class ReceiverDeviceAdapter extends ArrayAdapter<ReceiverDevice> {
    private Context context;
    private List<ReceiverDevice> devices;
    private int resource;

    public ReceiverDeviceAdapter(Context context2, int i, List<ReceiverDevice> list) {
        super(context2, i, list);
        this.context = context2;
        this.resource = i;
        this.devices = list;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ReceiverDevice receiverDevice = (ReceiverDevice) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(C1086R.layout.row_remote_install, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(C1086R.C1088id.deviceNameText);
        if (receiverDevice != null) {
            textView.setText(receiverDevice.getDeviceName());
        }
        return view;
    }

    public void add(ReceiverDevice receiverDevice) {
        boolean z = false;
        for (int i = 0; i < this.devices.size(); i++) {
            if (this.devices.get(i).isSameDevice(receiverDevice)) {
                this.devices.set(i, receiverDevice);
                notifyDataSetChanged();
                z = true;
            }
        }
        if (!z) {
            super.add(receiverDevice);
        }
    }
}
