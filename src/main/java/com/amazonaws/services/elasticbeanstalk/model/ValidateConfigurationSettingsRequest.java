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
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#validateConfigurationSettings(ValidateConfigurationSettingsRequest) ValidateConfigurationSettings operation}.
 * <p>
 * Takes a set of configuration settings and either a configuration
 * template or environment, and determines whether those values are
 * valid.
 * </p>
 * <p>
 * This action returns a list of messages indicating any errors or
 * warnings associated with the selection of option values.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#validateConfigurationSettings(ValidateConfigurationSettingsRequest)
 */
public class ValidateConfigurationSettingsRequest extends AmazonWebServiceRequest {

    /**
     * The name of the application that the configuration template or
     * environment belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The name of the configuration template to validate the settings
     * against. <p> Condition: You cannot specify both this and an
     * environment name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * The name of the environment to validate the settings against. <p>
     * Condition: You cannot specify both this and a configuration template
     * name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * A list of the options and desired values to evaluate.
     */
    private java.util.List<ConfigurationOptionSetting> optionSettings;

    /**
     * Default constructor for a new ValidateConfigurationSettingsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ValidateConfigurationSettingsRequest() {}
    
    /**
     * Constructs a new ValidateConfigurationSettingsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param applicationName The name of the application that the
     * configuration template or environment belongs to.
     * @param optionSettings A list of the options and desired values to
     * evaluate.
     */
    public ValidateConfigurationSettingsRequest(String applicationName, java.util.List<ConfigurationOptionSetting> optionSettings) {
        this.applicationName = applicationName;
        this.optionSettings = optionSettings;
    }
    
    /**
     * The name of the application that the configuration template or
     * environment belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application that the configuration template or
     *         environment belongs to.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application that the configuration template or
     * environment belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application that the configuration template or
     *         environment belongs to.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application that the configuration template or
     * environment belongs to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application that the configuration template or
     *         environment belongs to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidateConfigurationSettingsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * The name of the configuration template to validate the settings
     * against. <p> Condition: You cannot specify both this and an
     * environment name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the configuration template to validate the settings
     *         against. <p> Condition: You cannot specify both this and an
     *         environment name.
     */
    public String getTemplateName() {
        return templateName;
    }
    
    /**
     * The name of the configuration template to validate the settings
     * against. <p> Condition: You cannot specify both this and an
     * environment name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template to validate the settings
     *         against. <p> Condition: You cannot specify both this and an
     *         environment name.
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    /**
     * The name of the configuration template to validate the settings
     * against. <p> Condition: You cannot specify both this and an
     * environment name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template to validate the settings
     *         against. <p> Condition: You cannot specify both this and an
     *         environment name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidateConfigurationSettingsRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    
    
    /**
     * The name of the environment to validate the settings against. <p>
     * Condition: You cannot specify both this and a configuration template
     * name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return The name of the environment to validate the settings against. <p>
     *         Condition: You cannot specify both this and a configuration template
     *         name.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * The name of the environment to validate the settings against. <p>
     * Condition: You cannot specify both this and a configuration template
     * name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment to validate the settings against. <p>
     *         Condition: You cannot specify both this and a configuration template
     *         name.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * The name of the environment to validate the settings against. <p>
     * Condition: You cannot specify both this and a configuration template
     * name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment to validate the settings against. <p>
     *         Condition: You cannot specify both this and a configuration template
     *         name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidateConfigurationSettingsRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    
    
    /**
     * A list of the options and desired values to evaluate.
     *
     * @return A list of the options and desired values to evaluate.
     */
    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        if (optionSettings == null) {
            optionSettings = new java.util.ArrayList<ConfigurationOptionSetting>();
        }
        return optionSettings;
    }
    
    /**
     * A list of the options and desired values to evaluate.
     *
     * @param optionSettings A list of the options and desired values to evaluate.
     */
    public void setOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        java.util.List<ConfigurationOptionSetting> optionSettingsCopy = new java.util.ArrayList<ConfigurationOptionSetting>();
        if (optionSettings != null) {
            optionSettingsCopy.addAll(optionSettings);
        }
        this.optionSettings = optionSettingsCopy;
    }
    
    /**
     * A list of the options and desired values to evaluate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings A list of the options and desired values to evaluate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidateConfigurationSettingsRequest withOptionSettings(ConfigurationOptionSetting... optionSettings) {
        for (ConfigurationOptionSetting value : optionSettings) {
            getOptionSettings().add(value);
        }
        return this;
    }
    
    /**
     * A list of the options and desired values to evaluate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings A list of the options and desired values to evaluate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidateConfigurationSettingsRequest withOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        java.util.List<ConfigurationOptionSetting> optionSettingsCopy = new java.util.ArrayList<ConfigurationOptionSetting>();
        if (optionSettings != null) {
            optionSettingsCopy.addAll(optionSettings);
        }
        this.optionSettings = optionSettingsCopy;

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
        sb.append("ApplicationName: " + applicationName + ", ");
        sb.append("TemplateName: " + templateName + ", ");
        sb.append("EnvironmentName: " + environmentName + ", ");
        sb.append("OptionSettings: " + optionSettings + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    