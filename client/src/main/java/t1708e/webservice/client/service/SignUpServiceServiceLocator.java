/**
 * SignUpServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.webservice.client.service;

public class SignUpServiceServiceLocator extends org.apache.axis.client.Service implements t1708e.webservice.client.service.SignUpServiceService {

    public SignUpServiceServiceLocator() {
    }


    public SignUpServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SignUpServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SignUpServicePort
    private java.lang.String SignUpServicePort_address = "http://localhost:9000/register";

    public java.lang.String getSignUpServicePortAddress() {
        return SignUpServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SignUpServicePortWSDDServiceName = "SignUpServicePort";

    public java.lang.String getSignUpServicePortWSDDServiceName() {
        return SignUpServicePortWSDDServiceName;
    }

    public void setSignUpServicePortWSDDServiceName(java.lang.String name) {
        SignUpServicePortWSDDServiceName = name;
    }

    public t1708e.webservice.client.service.SignUpService getSignUpServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SignUpServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSignUpServicePort(endpoint);
    }

    public t1708e.webservice.client.service.SignUpService getSignUpServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            t1708e.webservice.client.service.SignUpServicePortBindingStub _stub = new t1708e.webservice.client.service.SignUpServicePortBindingStub(portAddress, this);
            _stub.setPortName(getSignUpServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSignUpServicePortEndpointAddress(java.lang.String address) {
        SignUpServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (t1708e.webservice.client.service.SignUpService.class.isAssignableFrom(serviceEndpointInterface)) {
                t1708e.webservice.client.service.SignUpServicePortBindingStub _stub = new t1708e.webservice.client.service.SignUpServicePortBindingStub(new java.net.URL(SignUpServicePort_address), this);
                _stub.setPortName(getSignUpServicePortWSDDServiceName());
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
        if ("SignUpServicePort".equals(inputPortName)) {
            return getSignUpServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "SignUpServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "SignUpServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SignUpServicePort".equals(portName)) {
            setSignUpServicePortEndpointAddress(address);
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
