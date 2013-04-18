/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#createLayer(CreateLayerRequest) CreateLayer operation}.
 * <p>
 * Creates a layer.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#createLayer(CreateLayerRequest)
 */
public class CreateLayerRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * The layer stack ID.
     */
    private String stackId;

    /**
     * The layer type. A stack cannot have more than one layer of the same
     * type.
     */
    private String type;

    /**
     * The layer name, which is used by the console.
     */
    private String name;

    /**
     * The layer short name, which is used internally by OpsWorks and by Chef
     * recipes. The shortname is also used as the name for the directory
     * where your app files are installed. It can have a maximum of 200
     * characters, which are limited to the alphanumeric characters, '-',
     * '_', and '.'.
     */
    private String shortname;

    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes bag.
     */
    private java.util.Map<String,String> attributes;

    /**
     * The ARN of an IAM profile that to be used for the layer's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     */
    private String customInstanceProfileArn;

    /**
     * An array containing the layer custom security group IDs.
     */
    private java.util.List<String> customSecurityGroupIds;

    /**
     * An array of <code>Package</code> objects that describe the layer
     * packages.
     */
    private java.util.List<String> packages;

    /**
     * A <code>VolumeConfigurations</code> object that describes the layer
     * Amazon EBS volumes.
     */
    private java.util.List<VolumeConfiguration> volumeConfigurations;

    /**
     * Whether to disable auto healing for the layer.
     */
    private Boolean enableAutoHealing;

    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer.
     */
    private Boolean autoAssignElasticIps;

    /**
     * A <code>LayerCustomRecipes</code> object that specifies the layer
     * custom recipes.
     */
    private Recipes customRecipes;

    /**
     * The layer stack ID.
     *
     * @return The layer stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The layer stack ID.
     *
     * @param stackId The layer stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The layer stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The layer stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    
    
    /**
     * The layer type. A stack cannot have more than one layer of the same
     * type.
     *
     * @return The layer type. A stack cannot have more than one layer of the same
     *         type.
     */
    public String getType() {
        return type;
    }
    
    /**
     * The layer type. A stack cannot have more than one layer of the same
     * type.
     *
     * @param type The layer type. A stack cannot have more than one layer of the same
     *         type.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The layer type. A stack cannot have more than one layer of the same
     * type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The layer type. A stack cannot have more than one layer of the same
     *         type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withType(String type) {
        this.type = type;
        return this;
    }
    
    
    /**
     * The layer name, which is used by the console.
     *
     * @return The layer name, which is used by the console.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The layer name, which is used by the console.
     *
     * @param name The layer name, which is used by the console.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The layer name, which is used by the console.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The layer name, which is used by the console.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * The layer short name, which is used internally by OpsWorks and by Chef
     * recipes. The shortname is also used as the name for the directory
     * where your app files are installed. It can have a maximum of 200
     * characters, which are limited to the alphanumeric characters, '-',
     * '_', and '.'.
     *
     * @return The layer short name, which is used internally by OpsWorks and by Chef
     *         recipes. The shortname is also used as the name for the directory
     *         where your app files are installed. It can have a maximum of 200
     *         characters, which are limited to the alphanumeric characters, '-',
     *         '_', and '.'.
     */
    public String getShortname() {
        return shortname;
    }
    
    /**
     * The layer short name, which is used internally by OpsWorks and by Chef
     * recipes. The shortname is also used as the name for the directory
     * where your app files are installed. It can have a maximum of 200
     * characters, which are limited to the alphanumeric characters, '-',
     * '_', and '.'.
     *
     * @param shortname The layer short name, which is used internally by OpsWorks and by Chef
     *         recipes. The shortname is also used as the name for the directory
     *         where your app files are installed. It can have a maximum of 200
     *         characters, which are limited to the alphanumeric characters, '-',
     *         '_', and '.'.
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }
    
    /**
     * The layer short name, which is used internally by OpsWorks and by Chef
     * recipes. The shortname is also used as the name for the directory
     * where your app files are installed. It can have a maximum of 200
     * characters, which are limited to the alphanumeric characters, '-',
     * '_', and '.'.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shortname The layer short name, which is used internally by OpsWorks and by Chef
     *         recipes. The shortname is also used as the name for the directory
     *         where your app files are installed. It can have a maximum of 200
     *         characters, which are limited to the alphanumeric characters, '-',
     *         '_', and '.'.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withShortname(String shortname) {
        this.shortname = shortname;
        return this;
    }
    
    
    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes bag.
     *
     * @return One or more user-defined key/value pairs to be added to the stack
     *         attributes bag.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;

    }
    
    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes bag.
     *
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     *         attributes bag.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes bag.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     *         attributes bag.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }
    
    /**
     * The ARN of an IAM profile that to be used for the layer's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @return The ARN of an IAM profile that to be used for the layer's EC2
     *         instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public String getCustomInstanceProfileArn() {
        return customInstanceProfileArn;
    }
    
    /**
     * The ARN of an IAM profile that to be used for the layer's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @param customInstanceProfileArn The ARN of an IAM profile that to be used for the layer's EC2
     *         instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public void setCustomInstanceProfileArn(String customInstanceProfileArn) {
        this.customInstanceProfileArn = customInstanceProfileArn;
    }
    
    /**
     * The ARN of an IAM profile that to be used for the layer's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customInstanceProfileArn The ARN of an IAM profile that to be used for the layer's EC2
     *         instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withCustomInstanceProfileArn(String customInstanceProfileArn) {
        this.customInstanceProfileArn = customInstanceProfileArn;
        return this;
    }
    
    
    /**
     * An array containing the layer custom security group IDs.
     *
     * @return An array containing the layer custom security group IDs.
     */
    public java.util.List<String> getCustomSecurityGroupIds() {
        
        if (customSecurityGroupIds == null) {
            customSecurityGroupIds = new java.util.ArrayList<String>();
        }
        return customSecurityGroupIds;
    }
    
    /**
     * An array containing the layer custom security group IDs.
     *
     * @param customSecurityGroupIds An array containing the layer custom security group IDs.
     */
    public void setCustomSecurityGroupIds(java.util.Collection<String> customSecurityGroupIds) {
        if (customSecurityGroupIds == null) {
            this.customSecurityGroupIds = null;
            return;
        }

        java.util.List<String> customSecurityGroupIdsCopy = new java.util.ArrayList<String>(customSecurityGroupIds.size());
        customSecurityGroupIdsCopy.addAll(customSecurityGroupIds);
        this.customSecurityGroupIds = customSecurityGroupIdsCopy;
    }
    
    /**
     * An array containing the layer custom security group IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customSecurityGroupIds An array containing the layer custom security group IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withCustomSecurityGroupIds(String... customSecurityGroupIds) {
        if (getCustomSecurityGroupIds() == null) setCustomSecurityGroupIds(new java.util.ArrayList<String>(customSecurityGroupIds.length));
        for (String value : customSecurityGroupIds) {
            getCustomSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * An array containing the layer custom security group IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customSecurityGroupIds An array containing the layer custom security group IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withCustomSecurityGroupIds(java.util.Collection<String> customSecurityGroupIds) {
        if (customSecurityGroupIds == null) {
            this.customSecurityGroupIds = null;
        } else {
            java.util.List<String> customSecurityGroupIdsCopy = new java.util.ArrayList<String>(customSecurityGroupIds.size());
            customSecurityGroupIdsCopy.addAll(customSecurityGroupIds);
            this.customSecurityGroupIds = customSecurityGroupIdsCopy;
        }

        return this;
    }
    
    /**
     * An array of <code>Package</code> objects that describe the layer
     * packages.
     *
     * @return An array of <code>Package</code> objects that describe the layer
     *         packages.
     */
    public java.util.List<String> getPackages() {
        
        if (packages == null) {
            packages = new java.util.ArrayList<String>();
        }
        return packages;
    }
    
    /**
     * An array of <code>Package</code> objects that describe the layer
     * packages.
     *
     * @param packages An array of <code>Package</code> objects that describe the layer
     *         packages.
     */
    public void setPackages(java.util.Collection<String> packages) {
        if (packages == null) {
            this.packages = null;
            return;
        }

        java.util.List<String> packagesCopy = new java.util.ArrayList<String>(packages.size());
        packagesCopy.addAll(packages);
        this.packages = packagesCopy;
    }
    
    /**
     * An array of <code>Package</code> objects that describe the layer
     * packages.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param packages An array of <code>Package</code> objects that describe the layer
     *         packages.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withPackages(String... packages) {
        if (getPackages() == null) setPackages(new java.util.ArrayList<String>(packages.length));
        for (String value : packages) {
            getPackages().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>Package</code> objects that describe the layer
     * packages.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param packages An array of <code>Package</code> objects that describe the layer
     *         packages.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withPackages(java.util.Collection<String> packages) {
        if (packages == null) {
            this.packages = null;
        } else {
            java.util.List<String> packagesCopy = new java.util.ArrayList<String>(packages.size());
            packagesCopy.addAll(packages);
            this.packages = packagesCopy;
        }

        return this;
    }
    
    /**
     * A <code>VolumeConfigurations</code> object that describes the layer
     * Amazon EBS volumes.
     *
     * @return A <code>VolumeConfigurations</code> object that describes the layer
     *         Amazon EBS volumes.
     */
    public java.util.List<VolumeConfiguration> getVolumeConfigurations() {
        
        if (volumeConfigurations == null) {
            volumeConfigurations = new java.util.ArrayList<VolumeConfiguration>();
        }
        return volumeConfigurations;
    }
    
    /**
     * A <code>VolumeConfigurations</code> object that describes the layer
     * Amazon EBS volumes.
     *
     * @param volumeConfigurations A <code>VolumeConfigurations</code> object that describes the layer
     *         Amazon EBS volumes.
     */
    public void setVolumeConfigurations(java.util.Collection<VolumeConfiguration> volumeConfigurations) {
        if (volumeConfigurations == null) {
            this.volumeConfigurations = null;
            return;
        }

        java.util.List<VolumeConfiguration> volumeConfigurationsCopy = new java.util.ArrayList<VolumeConfiguration>(volumeConfigurations.size());
        volumeConfigurationsCopy.addAll(volumeConfigurations);
        this.volumeConfigurations = volumeConfigurationsCopy;
    }
    
    /**
     * A <code>VolumeConfigurations</code> object that describes the layer
     * Amazon EBS volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeConfigurations A <code>VolumeConfigurations</code> object that describes the layer
     *         Amazon EBS volumes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withVolumeConfigurations(VolumeConfiguration... volumeConfigurations) {
        if (getVolumeConfigurations() == null) setVolumeConfigurations(new java.util.ArrayList<VolumeConfiguration>(volumeConfigurations.length));
        for (VolumeConfiguration value : volumeConfigurations) {
            getVolumeConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * A <code>VolumeConfigurations</code> object that describes the layer
     * Amazon EBS volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeConfigurations A <code>VolumeConfigurations</code> object that describes the layer
     *         Amazon EBS volumes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withVolumeConfigurations(java.util.Collection<VolumeConfiguration> volumeConfigurations) {
        if (volumeConfigurations == null) {
            this.volumeConfigurations = null;
        } else {
            java.util.List<VolumeConfiguration> volumeConfigurationsCopy = new java.util.ArrayList<VolumeConfiguration>(volumeConfigurations.size());
            volumeConfigurationsCopy.addAll(volumeConfigurations);
            this.volumeConfigurations = volumeConfigurationsCopy;
        }

        return this;
    }
    
    /**
     * Whether to disable auto healing for the layer.
     *
     * @return Whether to disable auto healing for the layer.
     */
    public Boolean isEnableAutoHealing() {
        return enableAutoHealing;
    }
    
    /**
     * Whether to disable auto healing for the layer.
     *
     * @param enableAutoHealing Whether to disable auto healing for the layer.
     */
    public void setEnableAutoHealing(Boolean enableAutoHealing) {
        this.enableAutoHealing = enableAutoHealing;
    }
    
    /**
     * Whether to disable auto healing for the layer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableAutoHealing Whether to disable auto healing for the layer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withEnableAutoHealing(Boolean enableAutoHealing) {
        this.enableAutoHealing = enableAutoHealing;
        return this;
    }
    
    
    /**
     * Whether to disable auto healing for the layer.
     *
     * @return Whether to disable auto healing for the layer.
     */
    public Boolean getEnableAutoHealing() {
        return enableAutoHealing;
    }
    
    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer.
     *
     * @return Whether to automatically assign an <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address</a> to the layer.
     */
    public Boolean isAutoAssignElasticIps() {
        return autoAssignElasticIps;
    }
    
    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer.
     *
     * @param autoAssignElasticIps Whether to automatically assign an <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address</a> to the layer.
     */
    public void setAutoAssignElasticIps(Boolean autoAssignElasticIps) {
        this.autoAssignElasticIps = autoAssignElasticIps;
    }
    
    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoAssignElasticIps Whether to automatically assign an <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address</a> to the layer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withAutoAssignElasticIps(Boolean autoAssignElasticIps) {
        this.autoAssignElasticIps = autoAssignElasticIps;
        return this;
    }
    
    
    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer.
     *
     * @return Whether to automatically assign an <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address</a> to the layer.
     */
    public Boolean getAutoAssignElasticIps() {
        return autoAssignElasticIps;
    }
    
    /**
     * A <code>LayerCustomRecipes</code> object that specifies the layer
     * custom recipes.
     *
     * @return A <code>LayerCustomRecipes</code> object that specifies the layer
     *         custom recipes.
     */
    public Recipes getCustomRecipes() {
        return customRecipes;
    }
    
    /**
     * A <code>LayerCustomRecipes</code> object that specifies the layer
     * custom recipes.
     *
     * @param customRecipes A <code>LayerCustomRecipes</code> object that specifies the layer
     *         custom recipes.
     */
    public void setCustomRecipes(Recipes customRecipes) {
        this.customRecipes = customRecipes;
    }
    
    /**
     * A <code>LayerCustomRecipes</code> object that specifies the layer
     * custom recipes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customRecipes A <code>LayerCustomRecipes</code> object that specifies the layer
     *         custom recipes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLayerRequest withCustomRecipes(Recipes customRecipes) {
        this.customRecipes = customRecipes;
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
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");    	
        if (getType() != null) sb.append("Type: " + getType() + ",");    	
        if (getName() != null) sb.append("Name: " + getName() + ",");    	
        if (getShortname() != null) sb.append("Shortname: " + getShortname() + ",");    	
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() + ",");    	
        if (getCustomInstanceProfileArn() != null) sb.append("CustomInstanceProfileArn: " + getCustomInstanceProfileArn() + ",");    	
        if (getCustomSecurityGroupIds() != null) sb.append("CustomSecurityGroupIds: " + getCustomSecurityGroupIds() + ",");    	
        if (getPackages() != null) sb.append("Packages: " + getPackages() + ",");    	
        if (getVolumeConfigurations() != null) sb.append("VolumeConfigurations: " + getVolumeConfigurations() + ",");    	
        if (isEnableAutoHealing() != null) sb.append("EnableAutoHealing: " + isEnableAutoHealing() + ",");    	
        if (isAutoAssignElasticIps() != null) sb.append("AutoAssignElasticIps: " + isAutoAssignElasticIps() + ",");    	
        if (getCustomRecipes() != null) sb.append("CustomRecipes: " + getCustomRecipes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getShortname() == null) ? 0 : getShortname().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getCustomInstanceProfileArn() == null) ? 0 : getCustomInstanceProfileArn().hashCode()); 
        hashCode = prime * hashCode + ((getCustomSecurityGroupIds() == null) ? 0 : getCustomSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getPackages() == null) ? 0 : getPackages().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeConfigurations() == null) ? 0 : getVolumeConfigurations().hashCode()); 
        hashCode = prime * hashCode + ((isEnableAutoHealing() == null) ? 0 : isEnableAutoHealing().hashCode()); 
        hashCode = prime * hashCode + ((isAutoAssignElasticIps() == null) ? 0 : isAutoAssignElasticIps().hashCode()); 
        hashCode = prime * hashCode + ((getCustomRecipes() == null) ? 0 : getCustomRecipes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateLayerRequest == false) return false;
        CreateLayerRequest other = (CreateLayerRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getShortname() == null ^ this.getShortname() == null) return false;
        if (other.getShortname() != null && other.getShortname().equals(this.getShortname()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        if (other.getCustomInstanceProfileArn() == null ^ this.getCustomInstanceProfileArn() == null) return false;
        if (other.getCustomInstanceProfileArn() != null && other.getCustomInstanceProfileArn().equals(this.getCustomInstanceProfileArn()) == false) return false; 
        if (other.getCustomSecurityGroupIds() == null ^ this.getCustomSecurityGroupIds() == null) return false;
        if (other.getCustomSecurityGroupIds() != null && other.getCustomSecurityGroupIds().equals(this.getCustomSecurityGroupIds()) == false) return false; 
        if (other.getPackages() == null ^ this.getPackages() == null) return false;
        if (other.getPackages() != null && other.getPackages().equals(this.getPackages()) == false) return false; 
        if (other.getVolumeConfigurations() == null ^ this.getVolumeConfigurations() == null) return false;
        if (other.getVolumeConfigurations() != null && other.getVolumeConfigurations().equals(this.getVolumeConfigurations()) == false) return false; 
        if (other.isEnableAutoHealing() == null ^ this.isEnableAutoHealing() == null) return false;
        if (other.isEnableAutoHealing() != null && other.isEnableAutoHealing().equals(this.isEnableAutoHealing()) == false) return false; 
        if (other.isAutoAssignElasticIps() == null ^ this.isAutoAssignElasticIps() == null) return false;
        if (other.isAutoAssignElasticIps() != null && other.isAutoAssignElasticIps().equals(this.isAutoAssignElasticIps()) == false) return false; 
        if (other.getCustomRecipes() == null ^ this.getCustomRecipes() == null) return false;
        if (other.getCustomRecipes() != null && other.getCustomRecipes().equals(this.getCustomRecipes()) == false) return false; 
        return true;
    }
    
}
    