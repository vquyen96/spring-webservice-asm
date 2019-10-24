/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class User  implements java.io.Serializable {
    private mypackage.CommentImage[] commentImages;

    private mypackage.CommentPlace[] commentPlaces;

    private long createdAt;

    private java.lang.String email;

    private int id;

    private java.lang.String password;

    private mypackage.Place[] places;

    private mypackage.RatePlaceImage[] ratePlaceImages;

    private mypackage.RatePlace[] ratePlaces;

    private int role;

    private java.lang.String salt;

    private java.lang.String status;

    private long updatedAt;

    private java.lang.String urlImage;

    private java.lang.String username;

    public User() {
    }

    public User(
           mypackage.CommentImage[] commentImages,
           mypackage.CommentPlace[] commentPlaces,
           long createdAt,
           java.lang.String email,
           int id,
           java.lang.String password,
           mypackage.Place[] places,
           mypackage.RatePlaceImage[] ratePlaceImages,
           mypackage.RatePlace[] ratePlaces,
           int role,
           java.lang.String salt,
           java.lang.String status,
           long updatedAt,
           java.lang.String urlImage,
           java.lang.String username) {
           this.commentImages = commentImages;
           this.commentPlaces = commentPlaces;
           this.createdAt = createdAt;
           this.email = email;
           this.id = id;
           this.password = password;
           this.places = places;
           this.ratePlaceImages = ratePlaceImages;
           this.ratePlaces = ratePlaces;
           this.role = role;
           this.salt = salt;
           this.status = status;
           this.updatedAt = updatedAt;
           this.urlImage = urlImage;
           this.username = username;
    }


    /**
     * Gets the commentImages value for this User.
     * 
     * @return commentImages
     */
    public mypackage.CommentImage[] getCommentImages() {
        return commentImages;
    }


    /**
     * Sets the commentImages value for this User.
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
     * Gets the commentPlaces value for this User.
     * 
     * @return commentPlaces
     */
    public mypackage.CommentPlace[] getCommentPlaces() {
        return commentPlaces;
    }


    /**
     * Sets the commentPlaces value for this User.
     * 
     * @param commentPlaces
     */
    public void setCommentPlaces(mypackage.CommentPlace[] commentPlaces) {
        this.commentPlaces = commentPlaces;
    }

    public mypackage.CommentPlace getCommentPlaces(int i) {
        return this.commentPlaces[i];
    }

    public void setCommentPlaces(int i, mypackage.CommentPlace _value) {
        this.commentPlaces[i] = _value;
    }


    /**
     * Gets the createdAt value for this User.
     * 
     * @return createdAt
     */
    public long getCreatedAt() {
        return createdAt;
    }


    /**
     * Sets the createdAt value for this User.
     * 
     * @param createdAt
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gets the email value for this User.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this User.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the id value for this User.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this User.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the password value for this User.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this User.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the places value for this User.
     * 
     * @return places
     */
    public mypackage.Place[] getPlaces() {
        return places;
    }


    /**
     * Sets the places value for this User.
     * 
     * @param places
     */
    public void setPlaces(mypackage.Place[] places) {
        this.places = places;
    }

    public mypackage.Place getPlaces(int i) {
        return this.places[i];
    }

    public void setPlaces(int i, mypackage.Place _value) {
        this.places[i] = _value;
    }


    /**
     * Gets the ratePlaceImages value for this User.
     * 
     * @return ratePlaceImages
     */
    public mypackage.RatePlaceImage[] getRatePlaceImages() {
        return ratePlaceImages;
    }


    /**
     * Sets the ratePlaceImages value for this User.
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
     * Gets the ratePlaces value for this User.
     * 
     * @return ratePlaces
     */
    public mypackage.RatePlace[] getRatePlaces() {
        return ratePlaces;
    }


    /**
     * Sets the ratePlaces value for this User.
     * 
     * @param ratePlaces
     */
    public void setRatePlaces(mypackage.RatePlace[] ratePlaces) {
        this.ratePlaces = ratePlaces;
    }

    public mypackage.RatePlace getRatePlaces(int i) {
        return this.ratePlaces[i];
    }

    public void setRatePlaces(int i, mypackage.RatePlace _value) {
        this.ratePlaces[i] = _value;
    }


    /**
     * Gets the role value for this User.
     * 
     * @return role
     */
    public int getRole() {
        return role;
    }


    /**
     * Sets the role value for this User.
     * 
     * @param role
     */
    public void setRole(int role) {
        this.role = role;
    }


    /**
     * Gets the salt value for this User.
     * 
     * @return salt
     */
    public java.lang.String getSalt() {
        return salt;
    }


    /**
     * Sets the salt value for this User.
     * 
     * @param salt
     */
    public void setSalt(java.lang.String salt) {
        this.salt = salt;
    }


    /**
     * Gets the status value for this User.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this User.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the updatedAt value for this User.
     * 
     * @return updatedAt
     */
    public long getUpdatedAt() {
        return updatedAt;
    }


    /**
     * Sets the updatedAt value for this User.
     * 
     * @param updatedAt
     */
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }


    /**
     * Gets the urlImage value for this User.
     * 
     * @return urlImage
     */
    public java.lang.String getUrlImage() {
        return urlImage;
    }


    /**
     * Sets the urlImage value for this User.
     * 
     * @param urlImage
     */
    public void setUrlImage(java.lang.String urlImage) {
        this.urlImage = urlImage;
    }


    /**
     * Gets the username value for this User.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this User.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
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
            ((this.commentPlaces==null && other.getCommentPlaces()==null) || 
             (this.commentPlaces!=null &&
              java.util.Arrays.equals(this.commentPlaces, other.getCommentPlaces()))) &&
            this.createdAt == other.getCreatedAt() &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.id == other.getId() &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.places==null && other.getPlaces()==null) || 
             (this.places!=null &&
              java.util.Arrays.equals(this.places, other.getPlaces()))) &&
            ((this.ratePlaceImages==null && other.getRatePlaceImages()==null) || 
             (this.ratePlaceImages!=null &&
              java.util.Arrays.equals(this.ratePlaceImages, other.getRatePlaceImages()))) &&
            ((this.ratePlaces==null && other.getRatePlaces()==null) || 
             (this.ratePlaces!=null &&
              java.util.Arrays.equals(this.ratePlaces, other.getRatePlaces()))) &&
            this.role == other.getRole() &&
            ((this.salt==null && other.getSalt()==null) || 
             (this.salt!=null &&
              this.salt.equals(other.getSalt()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.updatedAt == other.getUpdatedAt() &&
            ((this.urlImage==null && other.getUrlImage()==null) || 
             (this.urlImage!=null &&
              this.urlImage.equals(other.getUrlImage()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += getId();
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPlaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        _hashCode += getRole();
        if (getSalt() != null) {
            _hashCode += getSalt().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += new Long(getUpdatedAt()).hashCode();
        if (getUrlImage() != null) {
            _hashCode += getUrlImage().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "user"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentImages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commentImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "commentImage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
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
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("places");
        elemField.setXmlName(new javax.xml.namespace.QName("", "places"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "place"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("ratePlaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratePlaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "ratePlace"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("updatedAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatedAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
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
