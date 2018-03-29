package com.hyb;
import com.hyb.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
/**
 * @author Jacky.gao
 * @since 2017年2月7日
 */
 
@Component
public class TestDataSource {
    public List<Map<String,Object>> loadReportData(String dsName,String datasetName,Map<String,Object> parameters){
        return null;
    }
    public List<Map<String,Object>> buildReport(String dsName,String datasetName,Map<String,Object> parameters){
        return null;
    }
    public List<User> loadData(String dsName, String datasetName, Map<String,Object> parameters){
        return null;
    }
}