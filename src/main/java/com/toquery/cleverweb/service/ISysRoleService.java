package com.toquery.cleverweb.service;

import com.toquery.cleverweb.entity.po.TbSysRole;
import com.toquery.cleverweb.entity.po.TbSysUser;

import java.util.List;

public interface ISysRoleService {

    /**
     * 通过角色id获取角色信息
     * @param roleId    角色id
     * @return  角色信息
     */
    TbSysRole findByRoleId(String roleId);

    /**
     * 获取所有权限信息
     * @return
     */
    List<TbSysRole> findList();

    /**
     * 通过父级ID获取所有权限信息
     * @return
     */
    List<TbSysRole> findByParentId(String parentId);

    void save(TbSysRole sysRole);
    public TbSysRole saveAndFlush(TbSysRole sysRole);

    void delete(String role_id);
}
