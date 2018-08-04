package com.j.dubbo.common.auth;

import com.j.dubbo.api.auth.IPermission;

import java.util.Map;

/**
 * Created by jerry on 3/11/18.
 */
public class PermissionImpl implements IPermission {

    public Map<String, String> getRolePermission(String roleId) {

        System.out.println("getRolePermission");
        return null;
    }

    public void setRolePermission(Map<String, String> rolePermission) {
        System.out.println("setRolePermission");
    }
}
