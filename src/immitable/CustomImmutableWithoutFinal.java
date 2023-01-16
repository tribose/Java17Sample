package immitable;

import java.util.HashMap;
import java.util.Map;

public class CustomImmutableWithoutFinal {

    private int rollNo;
    private String regNo;
    private Map<String, String> metadata;

    private CustomImmutableWithoutFinal(int rollNo, String regNo, Map<String, String> dataMap) {
        this.rollNo = rollNo;
        this.regNo = regNo;

        Map<String, String> tempData = new HashMap<>(dataMap.size());
        for (Map.Entry<String, String> entry : dataMap.entrySet()) {
            tempData.put(entry.getKey(), entry.getValue());
        }
        this.metadata = tempData;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public Map<String, String> getMetadata() {
        Map<String, String> tempMap = new HashMap<>(this.metadata.size());
        for (Map.Entry<String, String> entry: this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

    public static CustomImmutableWithoutFinal buildCustomImmutableWithoutFinal(int rollNo, String regNo, Map<String, String> dataMap) {
        return new CustomImmutableWithoutFinal(rollNo, regNo, dataMap);
    }
}
