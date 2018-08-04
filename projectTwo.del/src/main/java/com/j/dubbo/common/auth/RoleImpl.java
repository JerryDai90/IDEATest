package com.j.dubbo.common.auth;

import com.j.dubbo.api.auth.IRole;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jerry on 3/11/18.
 */
public class RoleImpl implements IRole {

    public <T> List<T> getUserRole() {
        System.out.println("getUserRole");
        List<T> temp = new ArrayList<T>();
        temp.add((T)"11");
        return temp;
    }

    public void setUserRole(Object obj) {
        System.out.println("setUserRole");
        System.out.println(this.getClass().getName());

    }
}
