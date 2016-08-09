/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#updateEnvironment(UpdateEnvironmentRequest) UpdateEnvironment operation}.
 * <p>
 * Updates the environment description, deploys a new application
 * version, updates the configuration settings to an entirely new
 * configuration template, or updates select configuration option values
 * in the running environment.
 * </p>
 * <p>
 * Attempting to update both the release and configuration is not
 * allowed and AWS Elastic Beanstalk returns an
 * <code>InvalidParameterCombination</code> error.
 * </p>
 * <p>
 * When updating the configuration settings to a new template or
 * individual settings, a draft configuration is created and
 * DescribeConfigurationSettings for this environment returns two setting
 * descriptions with different <code>DeploymentStatus</code> values.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#updateEnvironment(UpdateEnvironmentRequest)
 */
public class UpdateEnvironmentRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the environment to update. <p> If no environment with this
     * ID exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     */
    private String environmentId;

    /**
     * The name of the environment to update. If no environment with this
     * name exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * If this parameter is specified, AWS Elastic Beanstalk deploys the
     * named application version to the environment. If no such application
     * version is found, returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * If this parameter is specified, AWS Elastic Beanstalk deploys this
     * configuration template to the environment. If no such configuration
     * template is found, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * If this parameter is specified, AWS Elastic Beanstalk updates the
     * description of this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * If specified, AWS Elastic Beanstalk updates the configuration set
     * associated with the running environment and sets the specified
     * configuration options to the requested value.
     */
    private java.util.List<ConfigurationOptionSetting> optionSettings;

    /**
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this environment.
     */
    private java.util.List<OptionSpecification> optionsToRemove;

    /**
     * Default constructor for a new UpdateEnvironmentRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateEnvironmentRequest() {}
    
    /**
     * The ID of the environment to update. <p> If no environment with this
     * ID exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     *
     * @return The ID of the environment to update. <p> If no environment with this
     *         ID exists, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public String getEnvironmentId() {
        return environmentId;
    }
    
    /**
     * The ID of the environment to update. <p> If no environment with this
     * ID exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     *
     * @param environmentId The ID of the environment to update. <p> If no environment with this
     *         ID exists, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }
    
    /**
     * The ID of the environment to update. <p> If no environment with this
     * ID exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environmentId The ID of the environment to update. <p> If no environment with this
     *         ID exists, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateEnvironmentRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    
    
    /**
     * The name of the environment to update. If no environment with this
     * name exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return The name of the environment to update. If no environment with this
     *         name exists, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * The name of the environment to update. If no environment with this
     * name exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment to update. If no environment with this
     *         name exists, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * The name of the environment to update. If no environment with this
     * name exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment to update. If no environment with this
     *         name exists, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateEnvironmentRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    
    
    /**
     * If this parameter is specified, AWS Elastic Beanstalk deploys the
     * named application version to the environment. If no such application
     * version is found, returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return If this parameter is specified, AWS Elastic Beanstalk deploys the
     *         named application version to the environment. If no such application
     *         version is found, returns an <code>InvalidParameterValue</code> error.
     */
    public String getVersionLabel() {
        return versionLabel;
    }
    
    /**
     * If this parameter is specified, AWS Elastic Beanstalk deploys the
     * named application version to the environment. If no such application
     * version is found, returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel If this parameter is specified, AWS Elastic Beanstalk deploys the
     *         named application version to the environment. If no such application
     *         version is found, returns an <code>InvalidParameterValue</code> error.
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }
    
    /**
     * If this parameter is specified, AWS Elastic Beanstalk deploys the
     * named application version to the environment. If no such application
     * version is found, returns an <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel If this parameter is specified, AWS Elastic Beanstalk deploys the
     *         named application version to the environment. If no such application
     *         version is found, returns an <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateEnvironmentRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }
    
    
    /**
     * If this parameter is specified, AWS Elastic Beanstalk deploys this
     * configuration template to the environment. If no such configuration
     * template is found, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return If this parameter is specified, AWS Elastic Beanstalk deploys this
     *         configuration template to the environment. If no such configuration
     *         template is found, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public String getTemplateName() {
        return templateName;
    }
    
    /**
     * If this parameter is specified, AWS Elastic Beanstalk deploys this
     * configuration template to the environment. If no such configuration
     * template is found, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName If this parameter is specified, AWS Elastic Beanstalk deploys this
     *         configuration template to the environment. If no such configuration
     *         template is found, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    /**
     * If this parameter is specified, AWS Elastic Beanstalk deploys this
     * configuration template to the environment. If no such configuration
     * template is found, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName If this parameter is specified, AWS Elastic Beanstalk deploys this
     *         configuration template to the environment. If no such configuration
     *         template is found, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateEnvironmentRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    
    
    /**
     * If this parameter is specified, AWS Elastic Beanstalk updates the
     * description of this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return If this parameter is specified, AWS Elastic Beanstalk updates the
     *         description of this environment.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * If this parameter is specified, AWS Elastic Beanstalk updates the
     * description of this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description If this parameter is specified, AWS Elastic Beanstalk updates the
     *         description of this environment.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * If this parameter is specified, AWS Elastic Beanstalk updates the
     * description of this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description If this parameter is specified, AWS Elastic Beanstalk updates the
     *         description of this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateEnvironmentRequest withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * If specified, AWS Elastic Beanstalk updates the configuration set
     * associated with the running environment and sets the specified
     * configuration options to the requested value.
     *
     * @return If specified, AWS Elastic Beanstalk updates the configuration set
     *         associated with the running environment and sets the specified
     *         configuration options to the requested value.
     */
    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        if (optionSettings == null) {
            optionSettings = new java.util.ArrayList<ConfigurationOptionSetting>();
        }
        return optionSettings;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk updates the configuration set
     * associated with the running environment and sets the specified
     * configuration options to the requested value.
     *
     * @param optionSettings If specified, AWS Elastic Beanstalk updates the configuration set
     *         associated with the running environment and sets the specified
     *         configuration options to the requested value.
     */
    public void setOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        java.util.List<ConfigurationOptionSetting> optionSettingsCopy = new java.util.ArrayList<ConfigurationOptionSetting>();
        if (optionSettings != null) {
            optionSettingsCopy.addAll(optionSettings);
        }
        this.optionSettings = optionSettingsCopy;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk updates the configuration set
     * associated with the running environment and sets the specified
     * configuration options to the requested value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings If specified, AWS Elastic Beanstalk updates the configuration set
     *         associated with the running environment and sets the specified
     *         configuration options to the requested value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateEnvironmentRequest withOptionSettings(ConfigurationOptionSetting... optionSettings) {
        for (ConfigurationOptionSetting value : optionSettings) {
            getOptionSettings().add(value);
        }
        return this;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk updates the configuration set
     * associated with the running environment and sets the specified
     * configuration options to the requested value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings If specified, AWS Elastic Beanstalk updates the configuration set
     *         associated with the running environment and sets the specified
     *         configuration options to the requested value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateEnvironmentRequest withOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        java.util.List<ConfigurationOptionSetting> optionSettingsCopy = new java.util.ArrayList<ConfigurationOptionSetting>();
        if (optionSettings != null) {
            optionSettingsCopy.addAll(optionSettings);
        }
        this.optionSettings = optionSettingsCopy;

        return this;
    }
    
    /**
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this environment.
     *
     * @return A list of custom user-defined configuration options to remove from the
     *         configuration set for this environment.
     */
    public java.util.List<OptionSpecification> getOptionsToRemove() {
        if (optionsToRemove == null) {
            optionsToRemove = new java.util.ArrayList<OptionSpecification>();
        }
        return optionsToRemove;
    }
    
    /**
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this environment.
     *
     * @param optionsToRemove A list of custom user-defined configuration options to remove from the
     *         configuration set for this environment.
     */
    public void setOptionsToRemove(java.util.Collection<OptionSpecification> optionsToRemove) {
        java.util.List<OptionSpecification> optionsToRemoveCopy = new java.util.ArrayList<OptionSpecification>();
        if (optionsToRemove != null) {
            optionsToRemoveCopy.addAll(optionsToRemove);
        }
        this.optionsToRemove = optionsToRemoveCopy;
    }
    
    /**
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsToRemove A list of custom user-defined configuration options to remove from the
     *         configuration set for this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateEnvironmentRequest withOptionsToRemove(OptionSpecification... optionsToRemove) {
        for (OptionSpecification value : optionsToRemove) {
            getOptionsToRemove().add(value);
        }
        return this;
    }
    
    /**
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsToRemove A list of custom user-defined configuration options to remove from the
     *         configuration set for this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateEnvironmentRequest withOptionsToRemove(java.util.Collection<OptionSpecification> optionsToRemove) {
        java.util.List<OptionSpecification> optionsToRemoveCopy = new java.util.ArrayList<OptionSpecification>();
        if (optionsToRemove != null) {
            optionsToRemoveCopy.addAll(optionsToRemove);
        }
        this.optionsToRemove = optionsToRemoveCopy;

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("EnvironmentId: " + environmentId + ", ");
        sb.append("EnvironmentName: " + environmentName + ", ");
        sb.append("VersionLabel: " + versionLabel + ", ");
        sb.append("TemplateName: " + templateName + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("OptionSettings: " + optionSettings + ", ");
        sb.append("OptionsToRemove: " + optionsToRemove + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    