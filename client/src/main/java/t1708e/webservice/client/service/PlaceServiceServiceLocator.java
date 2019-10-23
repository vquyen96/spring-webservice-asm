/**
 * PlaceServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.webservice.client.service;

public class PlaceServiceServiceLocator extends org.apache.axis.client.Service implements t1708e.webservice.client.service.PlaceServiceService {

    public PlaceServiceServiceLocator() {
    }


    public PlaceServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PlaceServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PlaceServicePort
    private java.lang.String PlaceServicePort_address = "http://localhost:9000/place";

    public java.lang.String getPlaceServicePortAddress() {
        return PlaceServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PlaceServicePortWSDDServiceName = "PlaceServicePort";

    public java.lang.String getPlaceServicePortWSDDServiceName() {
        return PlaceServicePortWSDDServiceName;
    }

    public void setPlaceServicePortWSDDServiceName(java.lang.String name) {
        PlaceServicePortWSDDServiceName = name;
    }

    public t1708e.webservice.client.service.PlaceService getPlaceServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PlaceServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPlaceServicePort(endpoint);
    }

    public t1708e.webservice.client.service.PlaceService getPlaceServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            t1708e.webservice.client.service.PlaceServicePortBindingStub _stub = new t1708e.webservice.client.service.PlaceServicePortBindingStub(portAddress, this);
            _stub.setPortName(getPlaceServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPlaceServicePortEndpointAddress(java.lang.String address) {
        PlaceServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (t1708e.webservice.client.service.PlaceService.class.isAssignableFrom(serviceEndpointInterface)) {
                t1708e.webservice.client.service.PlaceServicePortBindingStub _stub = new t1708e.webservice.client.service.PlaceServicePortBindingStub(new java.net.URL(PlaceServicePort_address), this);
                _stub.setPortName(getPlaceServicePortWSDDServiceName());
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
        if ("PlaceServicePort".equals(inputPortName)) {
            return getPlaceServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "PlaceServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "PlaceServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PlaceServicePort".equals(portName)) {
            setPlaceServicePortEndpointAddress(address);
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
