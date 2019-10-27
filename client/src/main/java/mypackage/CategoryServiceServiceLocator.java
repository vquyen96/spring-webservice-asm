/**
 * CategoryServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class CategoryServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.CategoryServiceService {

    public CategoryServiceServiceLocator() {
    }


    public CategoryServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CategoryServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CategoryServicePort
    private java.lang.String CategoryServicePort_address = "http://localhost:9000/category";

    public java.lang.String getCategoryServicePortAddress() {
        return CategoryServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CategoryServicePortWSDDServiceName = "CategoryServicePort";

    public java.lang.String getCategoryServicePortWSDDServiceName() {
        return CategoryServicePortWSDDServiceName;
    }

    public void setCategoryServicePortWSDDServiceName(java.lang.String name) {
        CategoryServicePortWSDDServiceName = name;
    }

    public mypackage.CategoryService getCategoryServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CategoryServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCategoryServicePort(endpoint);
    }

    public mypackage.CategoryService getCategoryServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.CategoryServicePortBindingStub _stub = new mypackage.CategoryServicePortBindingStub(portAddress, this);
            _stub.setPortName(getCategoryServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCategoryServicePortEndpointAddress(java.lang.String address) {
        CategoryServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.CategoryService.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.CategoryServicePortBindingStub _stub = new mypackage.CategoryServicePortBindingStub(new java.net.URL(CategoryServicePort_address), this);
                _stub.setPortName(getCategoryServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CategoryServicePort".equals(inputPortName)) {
            return getCategoryServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "CategoryServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "CategoryServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CategoryServicePort".equals(portName)) {
            setCategoryServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
