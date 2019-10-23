/**
 * CategoryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.webservice.client.service;

import java.util.List;

public interface CategoryService extends java.rmi.Remote {
    public void delete(java.lang.String arg0) throws java.rmi.RemoteException;
    public void save(t1708e.webservice.client.service.Category arg0) throws java.rmi.RemoteException;
    public t1708e.webservice.client.service.Category[] findAll() throws java.rmi.RemoteException;
    public t1708e.webservice.client.service.Category findById(java.lang.String arg0) throws java.rmi.RemoteException;
}
