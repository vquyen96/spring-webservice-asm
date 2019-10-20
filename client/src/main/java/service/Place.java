/**
 * Place.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class Place  implements java.io.Serializable {
    private service.Category category;

    private service.CommentPlace[] commentPlaces;

    private long createdAt;

    private java.lang.String description;

    private int id;

    private java.lang.String name;

    private service.PlaceImage[] placeImages;

    private service.RatePlace[] ratePlaces;

    private float rating;

    private java.lang.String status;

    private int summary;

    private long updatedAt;

    private service.User user;

    public Place() {
    }

    public Place(
           service.Category category,
           service.CommentPlace[] commentPlaces,
           long createdAt,
           java.lang.String description,
           int id,
           java.lang.String name,
           service.PlaceImage[] placeImages,
           service.RatePlace[] ratePlaces,
           float rating,
           java.lang.String status,
           int summary,
           long updatedAt,
           service.User user) {
           this.category = category;
           this.commentPlaces = commentPlaces;
           this.createdAt = createdAt;
           this.description = description;
           this.id = id;
           this.name = name;
           this.placeImages = placeImages;
           this.ratePlaces = ratePlaces;
           this.rating = rating;
           this.status = status;
           this.summary = summary;
           this.updatedAt = updatedAt;
           this.user = user;
    }


    /**
     * Gets the category value for this Place.
     * 
     * @return category
     */
    public service.Category getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Place.
     * 
     * @param category
     */
    public void setCategory(service.Category category) {
        this.category = category;
    }


    /**
     * Gets the commentPlaces value for this Place.
     * 
     * @return commentPlaces
     */
    public service.CommentPlace[] getCommentPlaces() {
        return commentPlaces;
    }


    /**
     * Sets the commentPlaces value for this Place.
     * 
     * @param commentPlaces
     */
    public void setCommentPlaces(service.CommentPlace[] commentPlaces) {
        this.commentPlaces = commentPlaces;
    }

    public service.CommentPlace getCommentPlaces(int i) {
        return this.commentPlaces[i];
    }

    public void setCommentPlaces(int i, service.CommentPlace _value) {
        this.commentPlaces[i] = _value;
    }


    /**
     * Gets the createdAt value for this Place.
     * 
     * @return createdAt
     */
    public long getCreatedAt() {
        return createdAt;
    }


    /**
     * Sets the createdAt value for this Place.
     * 
     * @param createdAt
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gets the description value for this Place.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Place.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the id value for this Place.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Place.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Place.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Place.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the placeImages value for this Place.
     * 
     * @return placeImages
     */
    public service.PlaceImage[] getPlaceImages() {
        return placeImages;
    }


    /**
     * Sets the placeImages value for this Place.
     * 
     * @param placeImages
     */
    public void setPlaceImages(service.PlaceImage[] placeImages) {
        this.placeImages = placeImages;
    }

    public service.PlaceImage getPlaceImages(int i) {
        return this.placeImages[i];
    }

    public void setPlaceImages(int i, service.PlaceImage _value) {
        this.placeImages[i] = _value;
    }


    /**
     * Gets the ratePlaces value for this Place.
     * 
     * @return ratePlaces
     */
    public service.RatePlace[] getRatePlaces() {
        return ratePlaces;
    }


    /**
     * Sets the ratePlaces value for this Place.
     * 
     * @param ratePlaces
     */
    public void setRatePlaces(service.RatePlace[] ratePlaces) {
        this.ratePlaces = ratePlaces;
    }

    public service.RatePlace getRatePlaces(int i) {
        return this.ratePlaces[i];
    }

    public void setRatePlaces(int i, service.RatePlace _value) {
        this.ratePlaces[i] = _value;
    }


    /**
     * Gets the rating value for this Place.
     * 
     * @return rating
     */
    public float getRating() {
        return rating;
    }


    /**
     * Sets the rating value for this Place.
     * 
     * @param rating
     */
    public void setRating(float rating) {
        this.rating = rating;
    }


    /**
     * Gets the status value for this Place.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Place.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the summary value for this Place.
     * 
     * @return summary
     */
    public int getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this Place.
     * 
     * @param summary
     */
    public void setSummary(int summary) {
        this.summary = summary;
    }


    /**
     * Gets the updatedAt value for this Place.
     * 
     * @return updatedAt
     */
    public long getUpdatedAt() {
        return updatedAt;
    }


    /**
     * Sets the updatedAt value for this Place.
     * 
     * @param updatedAt
     */
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }


    /**
     * Gets the user value for this Place.
     * 
     * @return user
     */
    public service.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this Place.
     * 
     * @param user
     */
    public void setUser(service.User user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Place)) return false;
        Place other = (Place) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.commentPlaces==null && other.getCommentPlaces()==null) || 
             (this.commentPlaces!=null &&
              java.util.Arrays.equals(this.commentPlaces, other.getCommentPlaces()))) &&
            this.createdAt == other.getCreatedAt() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.placeImages==null && other.getPlaceImages()==null) || 
             (this.placeImages!=null &&
              java.util.Arrays.equals(this.placeImages, other.getPlaceImages()))) &&
            ((this.ratePlaces==null && other.getRatePlaces()==null) || 
             (this.ratePlaces!=null &&
              java.util.Arrays.equals(this.ratePlaces, other.getRatePlaces()))) &&
            this.rating == other.getRating() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.summary == other.getSummary() &&
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getCommentPlaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommentPlaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommentPlaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getCreatedAt()).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPlaceImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlaceImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlaceImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRatePlaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatePlaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatePlaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Float(getRating()).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += getSummary();
        _hashCode += new Long(getUpdatedAt()).hashCode();
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Place.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "place"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "category"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentPlaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commentPlaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "commentPlace"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeImages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placeImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "placeImage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratePlaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "ratePlace"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rating");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
