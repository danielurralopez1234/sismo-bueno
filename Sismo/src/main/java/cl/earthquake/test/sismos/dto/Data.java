package cl.earthquake.test.sismos.dto;

import java.io.Serializable;

/**
 * Clase que setea data de sismos
 */
public class Data implements Serializable {
    private String type;
    private Metadata metadata;
   private Features[] features;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Features[] getFeatures() {
        return features;
    }

    public void setFeatures(Features[] features) {
        this.features = features;
    }

}
