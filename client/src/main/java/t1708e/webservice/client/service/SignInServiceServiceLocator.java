/**
 * SignInServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.webservice.client.service;

public class SignInServiceServiceLocator extends org.apache.axis.client.Service implements service.SignInServiceService {

    public SignInServiceServiceLocator() {
    }


    public SignInServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SignInServiceServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SignInServicePort
    private String SignInServicePort_address = "http://localhost:9000/register";

    public String getSignInServicePortAddress() {
        return SignInServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private String SignInServicePortWSDDServiceName = "SignInServicePort";

    public String getSignInServicePortWSDDServiceName() {
        return SignInServicePortWSDDServiceName;
    }

    public void setSignInServicePortWSDDServiceName(String name) {
        SignInServicePortWSDDServiceName = name;
    }

    public service.SignInService getSignInServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SignInServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSignInServicePort(endpoint);
    }

    public service.SignInService getSignInServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.SignInServicePortBindingStub _stub = new service.SignInServicePortBindingStub(portAddress, this);
            _stub.setPortName(getSignInServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSignInServicePortEndpointAddress(String address) {
        SignInServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.SignInService.class.isAssignableFrom(serviceEndpointInterface)) {
                service.SignInServicePortBindingStub _stub = new service.SignInServicePortBindingStub(new java.net.URL(SignInServicePort_address), this);
                _stub.setPortName(getSignInServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
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
        String inputPortName = portName.getLocalPart();
        if ("SignInServicePort".equals(inputPortName)) {
            return getSignInServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "SignInServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "SignInServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("SignInServicePort".equals(portName)) {
            setSignInServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
