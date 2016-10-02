package tools.te2m.services.project.entity.schedule;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import tools.te2m.services.project.entity.AbstractNamedEntity;
import tools.te2m.services.project.entity.requirement.UseCase;

/**
 * Iteration A iteration is a certain time box while realizinmg the project. The
 * end point of a iteration is a target milestone. In previous versions this
 * object was named milestone but iteration is more correct.
 *
 * @author ffischer
 */
public class Iteration extends AbstractNamedEntity<Iteration> {

    
    /**
     * The end date
     */
    Date endDate;
    
    /**
     * The start date.
     */
    Date startDate;
    
    /**
     * The state.
     */
    TimeboxState state;
    
    /**
     * DOCUMENT ME!.
     */
    Set<UseCase> usecases;

    /**
     * DOCUMENT ME!.
     *
     * @return DOCUMENT ME!
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Gets the state.
     *
     * @return the state
     */
    public TimeboxState getState() {
        return state;
    }

    /**
     * Sets the state.
     *
     * @param state the new state
     */
    public void setState(TimeboxState state) {
        this.state = state;
    }

    /**
     * DOCUMENT ME!.
     *
     * @return DOCUMENT ME!
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * DOCUMENT ME!.
     *
     * @param endDate DOCUMENT ME!
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * DOCUMENT ME!.
     *
     * @param scheduledDate DOCUMENT ME!
     */
    public void setStartDate(Date scheduledDate) {
        this.startDate = scheduledDate;
    }

    /**
     * DOCUMENT ME!.
     *
     * @param u DOCUMENT ME!
     */
    public void addUsecase(UseCase u) {
        if (null == getUsecases()) {
            setUsecases(new HashSet<UseCase>());
        }

        if (getUsecases().contains(u)) {
            return;
        }

        getUsecases().add(u);
    }

    /**
     * DOCUMENT ME!.
     *
     * @return DOCUMENT ME!
     */

    public Set<UseCase> getUsecases() {
        if(null==usecases)
        {
            this.usecases= new HashSet<>();
        }
        return usecases;
    }

    /**
     * DOCUMENT ME!.
     *
     * @param usecases DOCUMENT ME!
     */
    public void setUsecases(Set<UseCase> usecases) {
        this.usecases = usecases;
    }

    /**
     * The Enum TimeboxState.
     *
     * @author ffischer
     * @version 1.0
     * @since 1.0
     */
    public enum TimeboxState {

        /**
         * The planned.
         */
        PLANNED(false),
        
        /**
         * The started.
         */
        STARTED(true),
        
        /**
         * The finished.
         */
        FINISHED(false),
        
        /**
         * The cancelled.
         */
        CANCELLED(false);

        /**
         * Instantiates a new timebox state.
         *
         * @param isRunning the is running
         */
        private TimeboxState(boolean isRunning) {
            runningState = isRunning;
        }

        /**
         * Checks if is running.
         *
         * @return true, if is running
         */
        public boolean isRunning() {
            return runningState;
        }
        
        /**
         * The running state.
         */
        private boolean runningState;
    }
}
