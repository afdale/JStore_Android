package com.example.jstore_android_afdalridhoarman;


import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class ItemFetchRequest extends StringRequest {
    private static final String ITEM_URL = "http://10.0.2.2:8080/items";
    public ItemFetchRequest(int id, Response.Listener<String> listener){
        super(Method.GET, ITEM_URL+"/"+id, listener, null);
    }
}
