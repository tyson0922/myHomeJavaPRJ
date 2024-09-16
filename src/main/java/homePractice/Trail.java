import lombok.Data;
import org.locationtech.jts.geom.LineString;

@Data
public class Trail {
    private int secLen;       // sec_len
    private int upMin;        // up_min
    private int downMin;      // down_min
    private String catNam;    // cat_nam
    private String mntnNm;    // mntn_nm
    private LineString agGeom; // ag_geom
}
