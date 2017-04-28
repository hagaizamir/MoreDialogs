package hagai.edu.moredialogs;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends DialogFragment implements View.OnClickListener {

    private EditText etUserName, etPassword;
    private Button btnCancel, btnLogin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(View v, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(v, savedInstanceState);
        etUserName = (EditText) v.findViewById(R.id.etUserName);
        etPassword = (EditText) v.findViewById(R.id.etPassword);
        btnCancel = (Button) v.findViewById(R.id.btCancel);
        btnLogin = (Button) v.findViewById(R.id.btnLogin);

        btnCancel.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.btnCancel:

                break;
            case R.id.btnLogin:
                String userName = etUserName.getText().toString();
                Toast.makeText(getContext(),userName, Toast.LENGTH_SHORT).show();

                OnUserLoggedInListener activity = (OnUserLoggedInListener) getActivity();
                activity.onUserLoggedIn(userName);
                break;
        }

        dismiss();
    }
    OnUserLoggedInListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof  OnUserLoggedInListener)
            listener = (OnUserLoggedInListener) context;
        else
            throw new RuntimeException(context.toString() + " Must implement " + OnUserLoggedInListener.class.getSimpleName() );
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    public interface OnUserLoggedInListener{
        void onUserLoggedIn(String userName);
    }
}