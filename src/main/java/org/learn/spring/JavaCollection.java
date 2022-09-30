package org.learn.spring;

import java.util.*;


public class JavaCollection {
	List addessList;

	Set  addressSet;

	Map  addressMap;

	Properties addressProperties;

	public List getAddessList() {
		System.out.println("List elements => "+addessList);
		return addessList;
	}

	public void setAddessList(List addessList) {
		this.addessList = addessList;
	}

	public Set getAddressSet() {
		System.out.println("Address elements => " + addressSet);
		return addressSet;
	}

	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}

	public Map getAddressMap() {
		System.out.println("Map elements => "+ addressMap);
		return addressMap;
	}

	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	public Properties getAddressProperties() {
		System.out.println("properties elements => "+addressProperties);
		return addressProperties;
	}

	public void setAddressProperties(Properties addressProperties) {
		this.addressProperties = addressProperties;
	}

    
} 
