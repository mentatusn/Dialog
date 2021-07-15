package keyone.to.keytwo.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogCustomFragment extends DialogFragment {



    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View view = requireActivity().getLayoutInflater().inflate(R.layout.dialog_super_custom,null);
        EditText editText = view.findViewById(R.id.editText);
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = editText.getText().toString();
                ((MainActivity) DialogCustomFragment.this.requireActivity()).getResult(message);
                dismiss();
            }
        });
        setCancelable(false);
        return view;
    }

}
