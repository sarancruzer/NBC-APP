
package quick.kural.quickstart.Retrofit.Objects.MasterCat;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RespMasterCategorie implements Serializable
{

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("message")
    @Expose
    private String message;
    private final static long serialVersionUID = -8716051560839352950L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RespMasterCategorie() {
    }

    /**
     * 
     * @param message
     * @param status
     * @param data
     * @param success
     */
    public RespMasterCategorie(Integer status, Boolean success, List<Datum> data, String message) {
        super();
        this.status = status;
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
