/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Indicates whether the user requires a password to authenticate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/Authentication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Authentication implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the user requires a password to authenticate.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The number of passwords belonging to the user. The maximum is two.
     * </p>
     */
    private Integer passwordCount;

    /**
     * <p>
     * Indicates whether the user requires a password to authenticate.
     * </p>
     * 
     * @param type
     *        Indicates whether the user requires a password to authenticate.
     * @see AuthenticationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates whether the user requires a password to authenticate.
     * </p>
     * 
     * @return Indicates whether the user requires a password to authenticate.
     * @see AuthenticationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Indicates whether the user requires a password to authenticate.
     * </p>
     * 
     * @param type
     *        Indicates whether the user requires a password to authenticate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public Authentication withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates whether the user requires a password to authenticate.
     * </p>
     * 
     * @param type
     *        Indicates whether the user requires a password to authenticate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public Authentication withType(AuthenticationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The number of passwords belonging to the user. The maximum is two.
     * </p>
     * 
     * @param passwordCount
     *        The number of passwords belonging to the user. The maximum is two.
     */

    public void setPasswordCount(Integer passwordCount) {
        this.passwordCount = passwordCount;
    }

    /**
     * <p>
     * The number of passwords belonging to the user. The maximum is two.
     * </p>
     * 
     * @return The number of passwords belonging to the user. The maximum is two.
     */

    public Integer getPasswordCount() {
        return this.passwordCount;
    }

    /**
     * <p>
     * The number of passwords belonging to the user. The maximum is two.
     * </p>
     * 
     * @param passwordCount
     *        The number of passwords belonging to the user. The maximum is two.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Authentication withPasswordCount(Integer passwordCount) {
        setPasswordCount(passwordCount);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPasswordCount() != null)
            sb.append("PasswordCount: ").append(getPasswordCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Authentication == false)
            return false;
        Authentication other = (Authentication) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPasswordCount() == null ^ this.getPasswordCount() == null)
            return false;
        if (other.getPasswordCount() != null && other.getPasswordCount().equals(this.getPasswordCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPasswordCount() == null) ? 0 : getPasswordCount().hashCode());
        return hashCode;
    }

    @Override
    public Authentication clone() {
        try {
            return (Authentication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
