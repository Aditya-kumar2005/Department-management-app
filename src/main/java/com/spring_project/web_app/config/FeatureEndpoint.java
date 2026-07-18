/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring_project.web_app.config;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

/**
 *
 * @author nanua
 */
@Component
@Endpoint(id="features")
public class FeatureEndpoint {

    public FeatureEndpoint() {
        featureMap.put("Department",new Feature(true));
        featureMap.put("User",new Feature(false));
        featureMap.put("Authentication",new Feature(false));
    }
    private final Map<String,Feature> featureMap=new ConcurrentHashMap<>();
    
    @ReadOperation
    public Map<String,Feature> features(){
        return featureMap;
    }
    
    public Feature feature(@Selector String featureName){
        return featureMap.get(featureName);
    }
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Feature {

        private boolean isEnabled;
    }
}
