/**
 * CategoryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface CategoryService extends java.rmi.Remote {
    public void delete(java.lang.String arg0) throws java.rmi.RemoteException;
    public void save(mypackage.Category arg0) throws java.rmi.RemoteException;
    public mypackage.Category[] findAll() throws java.rmi.RemoteException;
    public mypackage.Category findById(java.lang.String arg0) throws java.rmi.RemoteException;
}
