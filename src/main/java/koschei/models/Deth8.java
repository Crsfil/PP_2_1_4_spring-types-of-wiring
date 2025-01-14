package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Deth8 {
    private String deth8 = "";

    public String getDeth8() {
        return deth8;
    }

    @Autowired
    public void setDeth8(Deth8 deth8) { this.deth8 = String.valueOf(deth8); }

    @Override
    public String toString() {
        return deth8;
    }
}
