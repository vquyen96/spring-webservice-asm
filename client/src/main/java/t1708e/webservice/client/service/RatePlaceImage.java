/**
 * RatePlaceImage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.webservice.client.service;

public class RatePlaceImage  implements java.io.Serializable {
    private long createdAt;

    private int id;

    private t1708e.webservice.client.service.PlaceImage placeImage;

    private int rate_point;

    private java.lang.String status;

    private long updatedAt;

    private t1708e.webservice.client.service.User user;

    public RatePlaceImage() {
    }

    public RatePlaceImage(
           long createdAt,
           int id,
           t1708e.webservice.client.service.PlaceImage placeImage,
           int rate_point,
           java.lang.String status,
           long updatedAt,
           t1708e.webservice.client.service.User user) {
           this.createdAt = createdAt;
           this.id = id;
           this.placeImage = placeImage;
           this.rate_point = rate_point;
           this.status = status;
           this.updatedAt = updatedAt;
           this.user = user;
    }


    /**
     * Gets the createdAt value for this RatePlaceImage.
     * 
     * @return createdAt
     */
    public long getCreatedAt() {
        return createdAt;
    }


    /**
     * Sets the createdAt value for this RatePlaceImage.
     * 
     * @param createdAt
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gets the id value for this RatePlaceImage.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this RatePlaceImage.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the placeImage value for this RatePlaceImage.
     * 
     * @return placeImage
     */
    public t1708e.webservice.client.service.PlaceImage getPlaceImage() {
        return placeImage;
    }


    /**
     * Sets the placeImage value for this RatePlaceImage.
     * 
     * @param placeImage
     */
    public void setPlaceImage(t1708e.webservice.client.service.PlaceImage placeImage) {
        this.placeImage = placeImage;
    }


    /**
     * Gets the rate_point value for this RatePlaceImage.
     * 
     * @return rate_point
     */
    public int getRate_point() {
        return rate_point;
    }


    /**
     * Sets the rate_point value for this RatePlaceImage.
     * 
     * @param rate_point
     */
    public void setRate_point(int rate_point) {
        this.rate_point = rate_point;
    }


    /**
     * Gets the status value for this RatePlaceImage.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RatePlaceImage.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the updatedAt value for this RatePlaceImage.
     * 
     * @return updatedAt
     */
    public long getUpdatedAt() {
        return updatedAt;
    }


    /**
     * Sets the updatedAt value for this RatePlaceImage.
     * 
     * @param updatedAt
     */
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }


    /**
     * Gets the user value for this RatePlaceImage.
     * 
     * @return user
     */
    public t1708e.webservice.client.service.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this RatePlaceImage.
     * 
     * @param user
     */
    public void setUser(t1708e.webservice.client.service.User user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RatePlaceImage)) return false;
        RatePlaceImage other = (RatePlaceImage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.createdAt == other.getCreatedAt() &&
            this.id == other.getId() &&
            ((this.placeImage==null && other.getPlaceImage()==null) || 
             (this.placeImage!=null &&
              this.placeImage.equals(other.getPlaceImage()))) &&
            this.rate_point == other.getRate_point() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.updatedAt == other.getUpdatedAt() &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getCreatedAt()).hashCode();
        _hashCode += getId();
        if (getPlaceImage() != null) {
            _hashCode += getPlaceImage().hashCode();
        }
        _hashCode += getRate_point();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += new Long(getUpdatedAt()).hashCode();
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RatePlaceImage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "ratePlaceImage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placeImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "placeImage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate_point");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rate_point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatedAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "user"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
