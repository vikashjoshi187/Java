package dto;
import java.io.Serializable;
public class StateDto implements Serializable{
    private int stateId;
    private String stateName;

    public StateDto() {
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    
}
