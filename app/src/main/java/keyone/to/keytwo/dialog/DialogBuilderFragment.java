package keyone.to.keytwo.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogBuilderFragment extends DialogFragment {


    @Override
    public Dialog onCreateDialog( Bundle savedInstanceState) {
        View view = requireActivity().getLayoutInflater().inflate(R.layout.dialog_custom,null);
        EditText editText = view.findViewById(R.id.editText);
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity())
                .setTitle("Билдер Фрагмент Диалог")
                .setView(view)
                .setPositiveButton("Отправить", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String message = editText.getText().toString();
                        ((MainActivity) DialogBuilderFragment.this.requireActivity()).getResult(message);

                    }
                });

        return builder.create();
    }
}
