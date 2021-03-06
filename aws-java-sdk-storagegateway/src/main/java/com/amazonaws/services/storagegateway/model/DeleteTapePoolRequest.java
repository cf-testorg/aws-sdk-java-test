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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteTapePool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTapePoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom tape pool to delete.
     * </p>
     */
    private String poolARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom tape pool to delete.
     * </p>
     * 
     * @param poolARN
     *        The Amazon Resource Name (ARN) of the custom tape pool to delete.
     */

    public void setPoolARN(String poolARN) {
        this.poolARN = poolARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom tape pool to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom tape pool to delete.
     */

    public String getPoolARN() {
        return this.poolARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom tape pool to delete.
     * </p>
     * 
     * @param poolARN
     *        The Amazon Resource Name (ARN) of the custom tape pool to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTapePoolRequest withPoolARN(String poolARN) {
        setPoolARN(poolARN);
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
        if (getPoolARN() != null)
            sb.append("PoolARN: ").append(getPoolARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTapePoolRequest == false)
            return false;
        DeleteTapePoolRequest other = (DeleteTapePoolRequest) obj;
        if (other.getPoolARN() == null ^ this.getPoolARN() == null)
            return false;
        if (other.getPoolARN() != null && other.getPoolARN().equals(this.getPoolARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolARN() == null) ? 0 : getPoolARN().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTapePoolRequest clone() {
        return (DeleteTapePoolRequest) super.clone();
    }

}
