package com.example.jstore_android_afdalridhoarman;

import com.android.volley.toolbox.StringRequest;
import com.android.volley.Response;

import java.util.HashMap;
import java.util.Map;


public class RegisterRequest extends StringRequest {
    private static final String Regis_URL = "http://10.0.2.2:8080/newcustomer";
    private Map<String,String> params;

    public RegisterRequest(String name,String user,String email, String password,
                           Response.Listener<String> listener) {
        super(Method.POST, Regis_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("email",email);
        params.put("username",user);
        params.put("password", password);
    }
    @Override
    public Map<String, String> getParams(){
        return params;
    }

}
