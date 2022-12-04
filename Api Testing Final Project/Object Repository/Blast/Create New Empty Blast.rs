<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create New Empty Blast</name>
   <tag></tag>
   <elementGuidId>8f925eb7-82e5-42cd-8242-0cb6e457af13</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;title\&quot;: \&quot;\&quot;,\n    \&quot;content\&quot;: \&quot;\u003cp\u003e\u003c/p\u003e\&quot;,\n    \&quot;subscribers\&quot;: [\n        \&quot;62f63f5d93a55ccbaaaee181\&quot;,\n        \&quot;62f652fa98ae1e904837debf\&quot;\n    ],\n    \&quot;mentionedUsers\&quot;: [],\n    \&quot;isAutoComplete\&quot;: false,\n    \&quot;autoComplete\&quot;: {\n        \&quot;status\&quot;: false,\n        \&quot;date\&quot;: \&quot;2021-09-28T19:39:00+07:00\&quot;\n    }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>387ba403-cc0f-4bfb-9c20-c05f8c54ed9b</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>jwt ${GlobalVariable.token}</value>
      <webElementGuid>471a19b7-5a4e-4967-928c-df25640bcc97</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.base_url}/blasts/6365d2dd2cfead2113e7cef3/posts</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <validationSteps>
      <id>8006fd16-900c-4241-9f45-2e728a0d4ee6</id>
      <name>CreateEmptyBlast</name>
      <type>JSON_SCHEMA</type>
      <dataType>FILE</dataType>
      <target>RESPONSE</target>
      <data>D:\SEKOLAH QA BATCH 15\Final Project Aji Setyawan\JSON Scheme\Blast\CreateEmptyBlast.json</data>
      <activate>true</activate>
   </validationSteps>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
