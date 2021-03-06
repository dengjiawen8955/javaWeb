package com.mbft.smbms.dao.provider;

import com.mbft.smbms.pojo.Provider;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface ProviderDao {
    /**
     * 获取 provider list
     * @param connection
     * @return
     */
    List<Provider> getProviderList(Connection connection );

    /**
     * 通过id，获取Provider
     * @param connection
     * @param id
     * @return
     */
    Provider getProviderById(Connection connection ,String id);

    /**
     * providerlist.jsp 页面展示的条件查询
     * @param connection
     * @param provider
     * @return
     */
    List<Provider> getProviderListByParams(Connection connection,Provider provider);

    /**
     * 修改Provider
     * @param connection
     * @param provider
     * @return
     */
    boolean modifyProvider(Connection connection,Provider provider) throws SQLException;

    /**
     * 删除
     * @param connection
     * @param id
     * @return
     */
    boolean deleteProviderById(Connection connection ,String id) throws SQLException;

    /**
     * add Provider
     * @param connection
     * @param provider
     * @return
     */
    boolean addProvider(Connection connection,Provider provider) throws SQLException;
}
