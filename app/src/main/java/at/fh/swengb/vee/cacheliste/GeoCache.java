package at.fh.swengb.vee.cacheliste;

import java.io.Serializable;

/**
 * Created by Vee on 22.11.2016.
 */
public class GeoCache implements Serializable {
    private String name;
    private String owner;
    private String type;
    private String terrainAndDifficulty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTerrainAndDifficulty() {
        return terrainAndDifficulty;
    }

    public void setTerrainAndDifficulty(String terrainAndDifficulty) {
        this.terrainAndDifficulty = terrainAndDifficulty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeoCache geoCache = (GeoCache) o;

        if (name != null ? !name.equals(geoCache.name) : geoCache.name != null) return false;
        if (owner != null ? !owner.equals(geoCache.owner) : geoCache.owner != null) return false;
        if (type != null ? !type.equals(geoCache.type) : geoCache.type != null) return false;
        return terrainAndDifficulty != null ? terrainAndDifficulty.equals(geoCache.terrainAndDifficulty) : geoCache.terrainAndDifficulty == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (terrainAndDifficulty != null ? terrainAndDifficulty.hashCode() : 0);
        return result;
    }

    public GeoCache() {

    }

    public GeoCache(String name, String owner, String type, String terrainAndDifficulty) {
        this.name = name;
        this.owner = owner;
        this.type = type;
        this.terrainAndDifficulty = terrainAndDifficulty;
    }

    @Override
    public String toString() {
        return "GeoCache{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", type='" + type + '\'' +
                ", terrainAndDifficulty='" + terrainAndDifficulty + '\'' +
                '}';
    }
}
