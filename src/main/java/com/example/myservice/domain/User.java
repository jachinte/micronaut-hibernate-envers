package com.example.myservice.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@Data
@Entity
@NoArgsConstructor
@Table(
    catalog = "mycatalog",
    name = "users",
    schema = "myschema"
)
public class User implements Serializable {

    private static final long serialVersionUID = -8823535017216909650L;

    @Id
    private @NotNull String id;

}
