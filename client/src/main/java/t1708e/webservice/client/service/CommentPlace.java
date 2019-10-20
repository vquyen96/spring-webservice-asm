/**
 * CommentPlace.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.webservice.client.service;

public class CommentPlace  implements java.io.Serializable {
    private String content;

    private long createdAt;

    private int id;

    private service.Place place;

    private String status;

    private String title;

    private long updatedAt;

    private service.User user;

    public CommentPlace() {
    }

    public CommentPlace(
           String content,
           long createdAt,
           int id,
           service.Place place,
           String status,
           String title,
           long updatedAt,
           service.User user) {
           this.content = content;
           this.createdAt = createdAt;
           this.id = id;
           this.place = place;
           this.status = status;
           this.title = title;
           this.updatedAt = updatedAt;
           this.user = user;
    }


    /**
     * Gets the content value for this CommentPlace.
     * 
     * @return content
     */
    public String getContent() {
        return content;
    }


    /**
     * Sets the content value for this CommentPlace.
     * 
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * Gets the createdAt value for this CommentPlace.
     * 
     * @return createdAt
     */
    public long getCreatedAt() {
        return createdAt;
    }


    /**
     * Sets the createdAt value for this CommentPlace.
     * 
     * @param createdAt
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gets the id value for this CommentPlace.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this CommentPlace.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the place value for this CommentPlace.
     * 
     * @return place
     */
    public service.Place getPlace() {
        return place;
    }


    /**
     * Sets the place value for this CommentPlace.
     * 
     * @param place
     */
    public void setPlace(service.Place place) {
        this.place = place;
    }


    /**
     * Gets the status value for this CommentPlace.
     * 
     * @return status
     */
    public String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CommentPlace.
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * Gets the title value for this CommentPlace.
     * 
     * @return title
     */
    public String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CommentPlace.
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Gets the updatedAt value for this CommentPlace.
     * 
     * @return updatedAt
     */
    public long getUpdatedAt() {
        return updatedAt;
    }


    /**
     * Sets the updatedAt value for this CommentPlace.
     * 
     * @param updatedAt
     */
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }


    /**
     * Gets the user value for this CommentPlace.
     * 
     * @return user
     */
    public service.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this CommentPlace.
     * 
     * @param user
     */
    public void setUser(service.User user) {
        this.user = user;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CommentPlace)) return false;
        CommentPlace other = (CommentPlace) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            this.createdAt == other.getCreatedAt() &&
            this.id == other.getId() &&
            ((this.place==null && other.getPlace()==null) || 
             (this.place!=null &&
              this.place.equals(other.getPlace()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
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
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        _hashCode += new Long(getCreatedAt()).hashCode();
        _hashCode += getId();
        if (getPlace() != null) {
            _hashCode += getPlace().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
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
        new org.apache.axis.description.TypeDesc(CommentPlace.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "commentPlace"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("place");
        elemField.setXmlName(new javax.xml.namespace.QName("", "place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "place"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
