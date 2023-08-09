package machine_coding_projects.parking_lot.models;

import java.util.Date;

public class BaseModel {
    private int id;
    private Date insertedAt;
    private Date updatedAt;

    public BaseModel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Date getInsertedAt() {
        return insertedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
