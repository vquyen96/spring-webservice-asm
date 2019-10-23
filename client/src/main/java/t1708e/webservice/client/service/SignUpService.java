/**
 * SignUpService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.webservice.client.service;

public interface SignUpService extends java.rmi.Remote {
    public void create(t1708e.webservice.client.service.User arg0) throws java.rmi.RemoteException;
    public t1708e.webservice.client.service.User findByUsername(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String findByEmail(java.lang.String arg0) throws java.rmi.RemoteException;
}
