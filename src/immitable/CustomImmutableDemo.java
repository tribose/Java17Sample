package immitable;

import java.util.HashMap;
import java.util.Map;

public final class CustomImmutableDemo {
    private final int rollNo;
    private final String regNo;
    private final Map<String, String> metadata;

    public CustomImmutableDemo(int rollNo, String regNo, Map<String, String> dataMap) {
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
}
