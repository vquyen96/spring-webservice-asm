///**
// * SignInServicePortBindingStub.java
// *
// * This file was auto-generated from WSDL
// * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
// */
//
//package t1708e.webservice.client.service;
//
//public class SignInServicePortBindingStub extends org.apache.axis.client.Stub implements service.SignInService {
//    private java.util.Vector cachedSerClasses = new java.util.Vector();
//    private java.util.Vector cachedSerQNames = new java.util.Vector();
//    private java.util.Vector cachedSerFactories = new java.util.Vector();
//    private java.util.Vector cachedDeserFactories = new java.util.Vector();
//
//    static org.apache.axis.description.OperationDesc [] _operations;
//
//    static {
//        _operations = new org.apache.axis.description.OperationDesc[1];
//        _initOperationDesc1();
//    }
//
//    private static void _initOperationDesc1(){
//        org.apache.axis.description.OperationDesc oper;
//        org.apache.axis.description.ParameterDesc param;
//        oper = new org.apache.axis.description.OperationDesc();
//        oper.setName("findByUsername");
//        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
//        param.setOmittable(true);
//        oper.addParameter(param);
//        oper.setReturnType(new javax.xml.namespace.QName("http://service/", "user"));
//        oper.setReturnClass(service.User.class);
//        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
//        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
//        oper.setUse(org.apache.axis.constants.Use.LITERAL);
//        _operations[0] = oper;
//
//    }
//
//    public SignInServicePortBindingStub() throws org.apache.axis.AxisFault {
//         this(null);
//    }
//
//    public SignInServicePortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
//         this(service);
//         super.cachedEndpoint = endpointURL;
//    }
//
//    public SignInServicePortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
//        if (service == null) {
//            super.service = new org.apache.axis.client.Service();
//        } else {
//            super.service = service;
//        }
//        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
//            Class cls;
//            javax.xml.namespace.QName qName;
//            javax.xml.namespace.QName qName2;
//            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
//            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
//            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
//            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
//            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
//            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
//            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
//            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
//            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
//            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
//            qName = new javax.xml.namespace.QName("http://service/", "category");
//            cachedSerQNames.add(qName);
//            cls = service.Category.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://service/", "commentImage");
//            cachedSerQNames.add(qName);
//            cls = service.CommentImage.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://service/", "commentPlace");
//            cachedSerQNames.add(qName);
//            cls = service.CommentPlace.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://service/", "place");
//            cachedSerQNames.add(qName);
//            cls = service.Place.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://service/", "placeImage");
//            cachedSerQNames.add(qName);
//            cls = service.PlaceImage.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://service/", "ratePlace");
//            cachedSerQNames.add(qName);
//            cls = service.RatePlace.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://service/", "ratePlaceImage");
//            cachedSerQNames.add(qName);
//            cls = service.RatePlaceImage.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//            qName = new javax.xml.namespace.QName("http://service/", "user");
//            cachedSerQNames.add(qName);
//            cls = service.User.class;
//            cachedSerClasses.add(cls);
//            cachedSerFactories.add(beansf);
//            cachedDeserFactories.add(beandf);
//
//    }
//
//    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
//        try {
//            org.apache.axis.client.Call _call = super._createCall();
//            if (super.maintainSessionSet) {
//                _call.setMaintainSession(super.maintainSession);
//            }
//            if (super.cachedUsername != null) {
//                _call.setUsername(super.cachedUsername);
//            }
//            if (super.cachedPassword != null) {
//                _call.setPassword(super.cachedPassword);
//            }
//            if (super.cachedEndpoint != null) {
//                _call.setTargetEndpointAddress(super.cachedEndpoint);
//            }
//            if (super.cachedTimeout != null) {
//                _call.setTimeout(super.cachedTimeout);
//            }
//            if (super.cachedPortName != null) {
//                _call.setPortName(super.cachedPortName);
//            }
//            java.util.Enumeration keys = super.cachedProperties.keys();
//            while (keys.hasMoreElements()) {
//                String key = (String) keys.nextElement();
//                _call.setProperty(key, super.cachedProperties.get(key));
//            }
//            // All the type mapping information is registered
//            // when the first call is made.
//            // The type mapping information is actually registered in
//            // the TypeMappingRegistry of the service, which
//            // is the reason why registration is only needed for the first call.
//            synchronized (this) {
//                if (firstCall()) {
//                    // must set encoding style before registering serializers
//                    _call.setEncodingStyle(null);
//                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
//                        Class cls = (Class) cachedSerClasses.get(i);
//                        javax.xml.namespace.QName qName =
//                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
//                        Object x = cachedSerFactories.get(i);
//                        if (x instanceof Class) {
//                            Class sf = (Class)
//                                 cachedSerFactories.get(i);
//                            Class df = (Class)
//                                 cachedDeserFactories.get(i);
//                            _call.registerTypeMapping(cls, qName, sf, df, false);
//                        }
//                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
//                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
//                                 cachedSerFactories.get(i);
//                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
//                                 cachedDeserFactories.get(i);
//                            _call.registerTypeMapping(cls, qName, sf, df, false);
//                        }
//                    }
//                }
//            }
//            return _call;
//        }
//        catch (Throwable _t) {
//            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
//        }
//    }
//
//    public service.User findByUsername(String arg0) throws java.rmi.RemoteException {
//        if (super.cachedEndpoint == null) {
//            throw new org.apache.axis.NoEndPointException();
//        }
//        org.apache.axis.client.Call _call = createCall();
//        _call.setOperation(_operations[0]);
//        _call.setUseSOAPAction(true);
//        _call.setSOAPActionURI("");
//        _call.setEncodingStyle(null);
//        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
//        _call.setOperationName(new javax.xml.namespace.QName("http://service/", "findByUsername"));
//
//        setRequestHeaders(_call);
//        setAttachments(_call);
// try {        Object _resp = _call.invoke(new Object[] {arg0});
//
//        if (_resp instanceof java.rmi.RemoteException) {
//            throw (java.rmi.RemoteException)_resp;
//        }
//        else {
//            extractAttachments(_call);
//            try {
//                return (service.User) _resp;
//            } catch (Exception _exception) {
//                return (service.User) org.apache.axis.utils.JavaUtils.convert(_resp, service.User.class);
//            }
//        }
//  } catch (org.apache.axis.AxisFault axisFaultException) {
//  throw axisFaultException;
//}
//    }
//
//}
