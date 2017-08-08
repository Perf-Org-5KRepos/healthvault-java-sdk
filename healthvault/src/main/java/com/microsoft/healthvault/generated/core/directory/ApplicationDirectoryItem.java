//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 12:00:41 PM PDT 
//


package com.microsoft.healthvault.generated.core.directory;

import java.util.Date;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import com.microsoft.healthvault.generated.core.application.AppLargeLogoInfo;
import com.microsoft.healthvault.generated.core.location.SupportedInstanceList;
import com.microsoft.healthvault.generated.core.location.SupportedLocationList;
import com.microsoft.healthvault.generated.types.CultureSpecificExtensionItems;
import com.microsoft.healthvault.generated.types.CultureSpecificString;
import com.microsoft.healthvault.generated.types.CultureSpecificString1024Nw;
import com.microsoft.healthvault.generated.types.CultureSpecificString255Nw;
import com.microsoft.healthvault.generated.types.CultureSpecificUrl;
import com.microsoft.healthvault.generated.types.GuidsDeprecated;


/**
 * <p>Java class for ApplicationDirectoryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationDirectoryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:com.microsoft.wc.directory}DirectoryItemBase"/>
 *         &lt;element name="application-logo" type="{urn:com.microsoft.wc.application}AppLargeLogoInfo" minOccurs="0"/>
 *         &lt;element name="privacy-statement-url" type="{urn:com.microsoft.wc.types}CultureSpecificUrl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="terms-of-use-url" type="{urn:com.microsoft.wc.types}CultureSpecificUrl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="connection-description" type="{urn:com.microsoft.wc.types}CultureSpecificString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="screenshots" type="{urn:com.microsoft.wc.directory}Screenshots" minOccurs="0"/>
 *         &lt;element name="supported-record-locations" type="{urn:com.microsoft.wc.location}SupportedLocationList" minOccurs="0"/>
 *         &lt;element name="supported-instances" type="{urn:com.microsoft.wc.location}SupportedInstanceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Root(name="")
@Order(elements = {
    "id",
    "name",
    "companyInformation",
    "categories",
    "dataProviderCategories",
    "shortDescription",
    "longDescription",
    "thingTypes",
    "infoUrl",
    "facebooklikeUrl",
    "mobilePlatformCollection",
    "extensionItems",
    "directoryState",
    "createdDate",
    "updatedDate",
    "migrationSourceInstance",
    "applicationLogo",
    "privacyStatementUrl",
    "termsOfUseUrl",
    "connectionDescription",
    "screenshots",
    "supportedRecordLocations",
    "supportedInstances"
})
public class ApplicationDirectoryItem {

    @Element(required = true)
    protected String id;
    @Element(required = true)
    protected List<CultureSpecificString255Nw> name;
    @Element(name = "company-information")
    protected CompanyInformation companyInformation;
    @Element(required = true)
    protected DirectoryCategories categories;
    @Element(name = "data-provider-categories")
    protected DirectoryDataProviderCategories dataProviderCategories;
    @Element(name = "short-description", required = true)
    protected List<CultureSpecificString1024Nw> shortDescription;
    @Element(name = "long-description")
    protected List<CultureSpecificString> longDescription;
    @Element(name = "thing-types")
    protected GuidsDeprecated thingTypes;
    @Element(name = "info-url")
    protected List<CultureSpecificUrl> infoUrl;
    @Element(name = "facebooklike-url")
    protected List<CultureSpecificUrl> facebooklikeUrl;
    @Element(name = "mobile-platform-collection")
    protected MobilePlatformCollection mobilePlatformCollection;
    @Element(name = "extension-items")
    protected CultureSpecificExtensionItems extensionItems;
    @Element(name = "directory-state", required = true)
    protected BigInteger directoryState;
    @Element(name = "created-date")
    protected Date createdDate;
    @Element(name = "updated-date")
    protected Date updatedDate;
    @Element(name = "migration-source-instance")
    protected String migrationSourceInstance;
    @Element(name = "application-logo")
    protected AppLargeLogoInfo applicationLogo;
    @Element(name = "privacy-statement-url")
    protected List<CultureSpecificUrl> privacyStatementUrl;
    @Element(name = "terms-of-use-url")
    protected List<CultureSpecificUrl> termsOfUseUrl;
    @Element(name = "connection-description")
    protected List<CultureSpecificString> connectionDescription;
    protected Screenshots screenshots;
    @Element(name = "supported-record-locations")
    protected SupportedLocationList supportedRecordLocations;
    @Element(name = "supported-instances")
    protected SupportedInstanceList supportedInstances;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CultureSpecificString255Nw }
     * 
     * 
     */
    public List<CultureSpecificString255Nw> getName() {
        if (name == null) {
            name = new ArrayList<CultureSpecificString255Nw>();
        }
        return this.name;
    }

    /**
     * Gets the value of the companyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformation }
     *     
     */
    public CompanyInformation getCompanyInformation() {
        return companyInformation;
    }

    /**
     * Sets the value of the companyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformation }
     *     
     */
    public void setCompanyInformation(CompanyInformation value) {
        this.companyInformation = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link DirectoryCategories }
     *     
     */
    public DirectoryCategories getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectoryCategories }
     *     
     */
    public void setCategories(DirectoryCategories value) {
        this.categories = value;
    }

    /**
     * Gets the value of the dataProviderCategories property.
     * 
     * @return
     *     possible object is
     *     {@link DirectoryDataProviderCategories }
     *     
     */
    public DirectoryDataProviderCategories getDataProviderCategories() {
        return dataProviderCategories;
    }

    /**
     * Sets the value of the dataProviderCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectoryDataProviderCategories }
     *     
     */
    public void setDataProviderCategories(DirectoryDataProviderCategories value) {
        this.dataProviderCategories = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CultureSpecificString1024Nw }
     * 
     * 
     */
    public List<CultureSpecificString1024Nw> getShortDescription() {
        if (shortDescription == null) {
            shortDescription = new ArrayList<CultureSpecificString1024Nw>();
        }
        return this.shortDescription;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CultureSpecificString }
     * 
     * 
     */
    public List<CultureSpecificString> getLongDescription() {
        if (longDescription == null) {
            longDescription = new ArrayList<CultureSpecificString>();
        }
        return this.longDescription;
    }

    /**
     * Gets the value of the thingTypes property.
     * 
     * @return
     *     possible object is
     *     {@link GuidsDeprecated }
     *     
     */
    public GuidsDeprecated getThingTypes() {
        return thingTypes;
    }

    /**
     * Sets the value of the thingTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuidsDeprecated }
     *     
     */
    public void setThingTypes(GuidsDeprecated value) {
        this.thingTypes = value;
    }

    /**
     * Gets the value of the infoUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CultureSpecificUrl }
     * 
     * 
     */
    public List<CultureSpecificUrl> getInfoUrl() {
        if (infoUrl == null) {
            infoUrl = new ArrayList<CultureSpecificUrl>();
        }
        return this.infoUrl;
    }

    /**
     * Gets the value of the facebooklikeUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facebooklikeUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacebooklikeUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CultureSpecificUrl }
     * 
     * 
     */
    public List<CultureSpecificUrl> getFacebooklikeUrl() {
        if (facebooklikeUrl == null) {
            facebooklikeUrl = new ArrayList<CultureSpecificUrl>();
        }
        return this.facebooklikeUrl;
    }

    /**
     * Gets the value of the mobilePlatformCollection property.
     * 
     * @return
     *     possible object is
     *     {@link MobilePlatformCollection }
     *     
     */
    public MobilePlatformCollection getMobilePlatformCollection() {
        return mobilePlatformCollection;
    }

    /**
     * Sets the value of the mobilePlatformCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilePlatformCollection }
     *     
     */
    public void setMobilePlatformCollection(MobilePlatformCollection value) {
        this.mobilePlatformCollection = value;
    }

    /**
     * Gets the value of the extensionItems property.
     * 
     * @return
     *     possible object is
     *     {@link CultureSpecificExtensionItems }
     *     
     */
    public CultureSpecificExtensionItems getExtensionItems() {
        return extensionItems;
    }

    /**
     * Sets the value of the extensionItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link CultureSpecificExtensionItems }
     *     
     */
    public void setExtensionItems(CultureSpecificExtensionItems value) {
        this.extensionItems = value;
    }

    /**
     * Gets the value of the directoryState property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDirectoryState() {
        return directoryState;
    }

    /**
     * Sets the value of the directoryState property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDirectoryState(BigInteger value) {
        this.directoryState = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setUpdatedDate(Date value) {
        this.updatedDate = value;
    }

    /**
     * Gets the value of the migrationSourceInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrationSourceInstance() {
        return migrationSourceInstance;
    }

    /**
     * Sets the value of the migrationSourceInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrationSourceInstance(String value) {
        this.migrationSourceInstance = value;
    }

    /**
     * Gets the value of the applicationLogo property.
     * 
     * @return
     *     possible object is
     *     {@link AppLargeLogoInfo }
     *     
     */
    public AppLargeLogoInfo getApplicationLogo() {
        return applicationLogo;
    }

    /**
     * Sets the value of the applicationLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppLargeLogoInfo }
     *     
     */
    public void setApplicationLogo(AppLargeLogoInfo value) {
        this.applicationLogo = value;
    }

    /**
     * Gets the value of the privacyStatementUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privacyStatementUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivacyStatementUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CultureSpecificUrl }
     * 
     * 
     */
    public List<CultureSpecificUrl> getPrivacyStatementUrl() {
        if (privacyStatementUrl == null) {
            privacyStatementUrl = new ArrayList<CultureSpecificUrl>();
        }
        return this.privacyStatementUrl;
    }

    /**
     * Gets the value of the termsOfUseUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the termsOfUseUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermsOfUseUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CultureSpecificUrl }
     * 
     * 
     */
    public List<CultureSpecificUrl> getTermsOfUseUrl() {
        if (termsOfUseUrl == null) {
            termsOfUseUrl = new ArrayList<CultureSpecificUrl>();
        }
        return this.termsOfUseUrl;
    }

    /**
     * Gets the value of the connectionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CultureSpecificString }
     * 
     * 
     */
    public List<CultureSpecificString> getConnectionDescription() {
        if (connectionDescription == null) {
            connectionDescription = new ArrayList<CultureSpecificString>();
        }
        return this.connectionDescription;
    }

    /**
     * Gets the value of the screenshots property.
     * 
     * @return
     *     possible object is
     *     {@link Screenshots }
     *     
     */
    public Screenshots getScreenshots() {
        return screenshots;
    }

    /**
     * Sets the value of the screenshots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Screenshots }
     *     
     */
    public void setScreenshots(Screenshots value) {
        this.screenshots = value;
    }

    /**
     * Gets the value of the supportedRecordLocations property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedLocationList }
     *     
     */
    public SupportedLocationList getSupportedRecordLocations() {
        return supportedRecordLocations;
    }

    /**
     * Sets the value of the supportedRecordLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedLocationList }
     *     
     */
    public void setSupportedRecordLocations(SupportedLocationList value) {
        this.supportedRecordLocations = value;
    }

    /**
     * Gets the value of the supportedInstances property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedInstanceList }
     *     
     */
    public SupportedInstanceList getSupportedInstances() {
        return supportedInstances;
    }

    /**
     * Sets the value of the supportedInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedInstanceList }
     *     
     */
    public void setSupportedInstances(SupportedInstanceList value) {
        this.supportedInstances = value;
    }

}