package tools.te2m.services.project.entity.risk;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;
import tools.te2m.services.project.entity.requirement.UseCase;

/**
 * The Class Risk.
 * 
 *
 * @author ffischer
 */
@NodeEntity
public class Risk extends AbstractNamedEntity<Risk> {

    public static final String RELATIONSHIP_AFFECTS_USECASE = "AFFECTS";
    /**
     * The affected usecases.
     */
    @Relationship(type = RELATIONSHIP_AFFECTS_USECASE)
    private Set<UseCase> affectedUsecases;
    
    RiskLevel riskLevel;

    /**
     * Gets the affected usecases.
     */
    public Set<UseCase> getAffectedUsecases() {
        return affectedUsecases;
    }

    /**
     * Sets the affected usecases.
     *
     * @param affectedUsecases the new affected usecases
     */
    public void setAffectedUsecases(Set<UseCase> affectedUsecases) {
        this.affectedUsecases = affectedUsecases;
    }

    /**
     * Adds the affected usecase.
     *
     * @param u the u
     */
    public void addAffectedUsecase(UseCase u) {
        if (null == affectedUsecases) {
            affectedUsecases = new HashSet<UseCase>();

        }
        affectedUsecases.add(u);
    }

    /**
     * Gets the risk level.
     *
     * @return the risk level
     */
    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    /**
     * Sets the risk level.
     *
     * @param riskLevel the new risk level
     */
    public void setRiskLevel(RiskLevel riskLevel) {
        this.riskLevel = riskLevel;
    }
}
