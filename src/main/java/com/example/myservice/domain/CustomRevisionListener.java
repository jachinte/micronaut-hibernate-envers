package com.example.myservice.domain;

import lombok.NoArgsConstructor;
import org.hibernate.envers.RevisionListener;

@NoArgsConstructor
public class CustomRevisionListener implements RevisionListener {

    @Override
    public final void newRevision(final Object revision) {
        final CustomRevision entity = (CustomRevision) revision;
        entity.setTimestamp(System.nanoTime());
    }

}
