package com.walmartlabs.components.scheduler.model;

import com.walmart.gmp.ingestion.platform.framework.data.core.Entity;
import com.walmartlabs.components.scheduler.model.EventScheduleDO.EventKey;

/**
 * Created by smalik3 on 3/16/16
 */
public interface EventScheduleEntity extends Entity<EventKey> {

    String getState();

    void setState(String state);

    void setError(String error);

    String getError();
}
