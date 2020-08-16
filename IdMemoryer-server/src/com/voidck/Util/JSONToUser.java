package com.voidck.Util;

import com.google.gson.Gson;
import com.voidck.Entity.Photo;
import com.voidck.Entity.User;

import java.util.ArrayList;
import java.util.Map;


public class JSONToUser {
    //json转为对象
    public User GsonToObject(String stringGson) {
        Gson gson = new Gson();
        User user = gson.fromJson(stringGson, User.class);

        return user;
    }

    //对象转为json
    public String ObjectToGson(User user) {
        Gson gson = new Gson();
        String str = gson.toJson(user);

        return str;
    }

    public String ObjectToGson(Photo photo) {
        Gson gson = new Gson();
        String str = gson.toJson(photo);

        return str;
    }

    public String ListToGson(ArrayList<Map<String, Object>> list){
        Gson gson=new Gson();
        String str=gson.toJson(list);

        return str;
    }

}

