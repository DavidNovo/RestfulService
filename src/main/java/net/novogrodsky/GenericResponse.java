package net.novogrodsky;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by davidnovogrodsky_wrk on 3/16/15.
 */
@XmlRootElement
public class GenericResponse implements Serializable{
    private boolean success;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
