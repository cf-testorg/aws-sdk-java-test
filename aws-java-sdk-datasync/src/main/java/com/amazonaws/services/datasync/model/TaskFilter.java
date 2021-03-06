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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * You can use API filters to narrow down the list of resources returned by <code>ListTasks</code>. For example, to
 * retrieve all tasks on a source location, you can use <code>ListTasks</code> with filter name <code>LocationId</code>
 * and <code>Operator Equals</code> with the ARN for the location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/TaskFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter being used. Each API call supports a list of filters that are available for it. For
     * example, <code>LocationId</code> for <code>ListTasks</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The values that you want to filter for. For example, you might want to display only tasks for a specific
     * destination location.
     * </p>
     */
    private java.util.List<String> values;
    /**
     * <p>
     * The operator that is used to compare filter values (for example, <code>Equals</code> or <code>Contains</code>).
     * For more about API filtering operators, see <a>query-resources</a>.
     * </p>
     */
    private String operator;

    /**
     * <p>
     * The name of the filter being used. Each API call supports a list of filters that are available for it. For
     * example, <code>LocationId</code> for <code>ListTasks</code>.
     * </p>
     * 
     * @param name
     *        The name of the filter being used. Each API call supports a list of filters that are available for it. For
     *        example, <code>LocationId</code> for <code>ListTasks</code>.
     * @see TaskFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter being used. Each API call supports a list of filters that are available for it. For
     * example, <code>LocationId</code> for <code>ListTasks</code>.
     * </p>
     * 
     * @return The name of the filter being used. Each API call supports a list of filters that are available for it.
     *         For example, <code>LocationId</code> for <code>ListTasks</code>.
     * @see TaskFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter being used. Each API call supports a list of filters that are available for it. For
     * example, <code>LocationId</code> for <code>ListTasks</code>.
     * </p>
     * 
     * @param name
     *        The name of the filter being used. Each API call supports a list of filters that are available for it. For
     *        example, <code>LocationId</code> for <code>ListTasks</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskFilterName
     */

    public TaskFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the filter being used. Each API call supports a list of filters that are available for it. For
     * example, <code>LocationId</code> for <code>ListTasks</code>.
     * </p>
     * 
     * @param name
     *        The name of the filter being used. Each API call supports a list of filters that are available for it. For
     *        example, <code>LocationId</code> for <code>ListTasks</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskFilterName
     */

    public TaskFilter withName(TaskFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The values that you want to filter for. For example, you might want to display only tasks for a specific
     * destination location.
     * </p>
     * 
     * @return The values that you want to filter for. For example, you might want to display only tasks for a specific
     *         destination location.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values that you want to filter for. For example, you might want to display only tasks for a specific
     * destination location.
     * </p>
     * 
     * @param values
     *        The values that you want to filter for. For example, you might want to display only tasks for a specific
     *        destination location.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The values that you want to filter for. For example, you might want to display only tasks for a specific
     * destination location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values that you want to filter for. For example, you might want to display only tasks for a specific
     *        destination location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values that you want to filter for. For example, you might want to display only tasks for a specific
     * destination location.
     * </p>
     * 
     * @param values
     *        The values that you want to filter for. For example, you might want to display only tasks for a specific
     *        destination location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The operator that is used to compare filter values (for example, <code>Equals</code> or <code>Contains</code>).
     * For more about API filtering operators, see <a>query-resources</a>.
     * </p>
     * 
     * @param operator
     *        The operator that is used to compare filter values (for example, <code>Equals</code> or
     *        <code>Contains</code>). For more about API filtering operators, see <a>query-resources</a>.
     * @see Operator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator that is used to compare filter values (for example, <code>Equals</code> or <code>Contains</code>).
     * For more about API filtering operators, see <a>query-resources</a>.
     * </p>
     * 
     * @return The operator that is used to compare filter values (for example, <code>Equals</code> or
     *         <code>Contains</code>). For more about API filtering operators, see <a>query-resources</a>.
     * @see Operator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator that is used to compare filter values (for example, <code>Equals</code> or <code>Contains</code>).
     * For more about API filtering operators, see <a>query-resources</a>.
     * </p>
     * 
     * @param operator
     *        The operator that is used to compare filter values (for example, <code>Equals</code> or
     *        <code>Contains</code>). For more about API filtering operators, see <a>query-resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public TaskFilter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator that is used to compare filter values (for example, <code>Equals</code> or <code>Contains</code>).
     * For more about API filtering operators, see <a>query-resources</a>.
     * </p>
     * 
     * @param operator
     *        The operator that is used to compare filter values (for example, <code>Equals</code> or
     *        <code>Contains</code>). For more about API filtering operators, see <a>query-resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public TaskFilter withOperator(Operator operator) {
        this.operator = operator.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskFilter == false)
            return false;
        TaskFilter other = (TaskFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public TaskFilter clone() {
        try {
            return (TaskFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.TaskFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
