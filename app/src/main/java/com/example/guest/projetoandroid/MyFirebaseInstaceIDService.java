package com.example.guest.projetoandroid;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Guest on 18/02/17.
 */
public class MyFirebaseInstaceIDService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();

        Log.i("TOKEN: ", token);

        //TODO: implementar o envio do token para o servidor0
    }
}
