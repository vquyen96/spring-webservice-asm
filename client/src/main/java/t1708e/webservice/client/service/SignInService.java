/**
 * SignInService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.webservice.client.service;

public interface SignInService extends java.rmi.Remote {
    public java.lang.String login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public t1708e.webservice.client.service.User findByUsername(java.lang.String arg0) throws java.rmi.RemoteException;
}
