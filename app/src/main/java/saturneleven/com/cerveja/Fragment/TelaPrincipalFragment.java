package saturneleven.com.cerveja.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import saturneleven.com.cerveja.R;

public class TelaPrincipalFragment extends android.support.v4.app.Fragment
{
    private View v;

    public static TelaPrincipalFragment newInstance()
    {
        TelaPrincipalFragment fragment = new TelaPrincipalFragment();
        return fragment;
    }

    public TelaPrincipalFragment()
    {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        v =  inflater.inflate(R.layout.fragment_tela_principal, container, false);

        return v;
    }


}
