/**
 * PlaceImage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class PlaceImage  implements java.io.Serializable {
    private mypackage.CommentImage[] commentImages;

    private long createdAt;

    private int id;

    private mypackage.Place place;

    private mypackage.RatePlaceImage[] ratePlaceImages;

    private float rating;

    private java.lang.String status;

    private long updatedAt;

    private java.lang.String urlIma;

    public PlaceImage() {
    }

    public PlaceImage(
           mypackage.CommentImage[] commentImages,
           long createdAt,
           int id,
           mypackage.Place place,
           mypackage.RatePlaceImage[] ratePlaceImages,
           float rating,
           java.lang.String status,
           long updatedAt,
           java.lang.String urlIma) {
           this.commentImages = commentImages;
           this.createdAt = createdAt;
           this.id = id;
           this.place = place;
           this.ratePlaceImages = ratePlaceImages;
           this.rating = rating;
           this.status = status;
           this.updatedAt = updatedAt;
           this.urlIma = urlIma;
    }


    /**
     * Gets the commentImages value for this PlaceImage.
     * 
     * @return commentImages
     */
    public mypackage.CommentImage[] getCommentImages() {
        return commentImages;
    }


    /**
     * Sets the commentImages value for this PlaceImage.
     * 
     * @param commentImages
     */
    public void setCommentImages(mypackage.CommentImage[] commentImages) {
        this.commentImages = commentImages;
    }

    public mypackage.CommentImage getCommentImages(int i) {
        return this.commentImages[i];
    }

    public void setCommentImages(int i, mypackage.CommentImage _value) {
        this.commentImages[i] = _value;
    }


    /**
     * Gets the createdAt value for this PlaceImage.
     * 
     * @return createdAt
     */
    public long getCreatedAt() {
        return createdAt;
    }


    /**
     * Sets the createdAt value for this PlaceImage.
     * 
     * @param createdAt
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gets the id value for this PlaceImage.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this PlaceImage.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the place value for this PlaceImage.
     * 
     * @return place
     */
    public mypackage.Place getPlace() {
        return place;
    }


    /**
     * Sets the place value for this PlaceImage.
     * 
     * @param place
     */
    public void setPlace(mypackage.Place place) {
        this.place = place;
    }


    /**
     * Gets the ratePlaceImages value for this PlaceImage.
     * 
     * @return ratePlaceImages
     */
    public mypackage.RatePlaceImage[] getRatePlaceImages() {
        return ratePlaceImages;
    }


    /**
     * Sets the ratePlaceImages value for this PlaceImage.
     * 
     * @param ratePlaceImages
     */
    public void setRatePlaceImages(mypackage.RatePlaceImage[] ratePlaceImages) {
        this.ratePlaceImages = ratePlaceImages;
    }

    public mypackage.RatePlaceImage getRatePlaceImages(int i) {
        return this.ratePlaceImages[i];
    }

    public void setRatePlaceImages(int i, mypackage.RatePlaceImage _value) {
        this.ratePlaceImages[i] = _value;
    }


    /**
     * Gets the rating value for this PlaceImage.
     * 
     * @return rating
     */
    public float getRating() {
        return rating;
    }


    /**
     * Sets the rating value for this PlaceImage.
     * 
     * @param rating
     */
    public void setRating(float rating) {
        this.rating = rating;
    }


    /**
     * Gets the status value for this PlaceImage.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PlaceImage.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the updatedAt value for this PlaceImage.
     * 
     * @return updatedAt
     */
    public long getUpdatedAt() {
        return updatedAt;
    }


    /**
     * Sets the updatedAt value for this PlaceImage.
     * 
     * @param updatedAt
     */
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }


    /**
     * Gets the urlIma value for this PlaceImage.
     * 
     * @return urlIma
     */
    public java.lang.String getUrlIma() {
        return urlIma;
    }


    /**
     * Sets the urlIma value for this PlaceImage.
     * 
     * @param urlIma
     */
    public void setUrlIma(java.lang.String urlIma) {
        this.urlIma = urlIma;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlaceImage)) return false;
        PlaceImage other = (PlaceImage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commentImages==null && other.getCommentImages()==null) || 
             (this.commentImages!=null &&
              java.util.Arrays.equals(this.commentImages, other.getCommentImages()))) &&
            this.createdAt == other.getCreatedAt() &&
            this.id == other.getId() &&
            ((this.place==null && other.getPlace()==null) || 
             (this.place!=null &&
              this.place.equals(other.getPlace()))) &&
            ((this.ratePlaceImages==null && other.getRatePlaceImages()==null) || 
             (this.ratePlaceImages!=null &&
              java.util.Arrays.equals(this.ratePlaceImages, other.getRatePlaceImages()))) &&
            this.rating == other.getRating() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.updatedAt == other.getUpdatedAt() &&
            ((this.urlIma==null && other.getUrlIma()==null) || 
             (this.urlIma!=null &&
              this.urlIma.equals(other.getUrlIma())));
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
        if (getCommentImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommentImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommentImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getCreatedAt()).hashCode();
        _hashCode += getId();
        if (getPlace() != null) {
            _hashCode += getPlace().hashCode();
        }
        if (getRatePlaceImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatePlaceImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatePlaceImages(), i);
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
        _hashCode += new Long(getUpdatedAt()).hashCode();
        if (getUrlIma() != null) {
            _hashCode += getUrlIma().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlaceImage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "placeImage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentImages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commentImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "commentImage"));
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
        elemField.setFieldName("ratePlaceImages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratePlaceImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "ratePlaceImage"));
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
        elemField.setFieldName("updatedAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatedAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlIma");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlIma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
