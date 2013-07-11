package org.renci.gate.plugin.test;

import java.util.Map;

import org.renci.gate.AbstractGATEService;
import org.renci.gate.GATEException;
import org.renci.gate.GlideinMetric;
import org.renci.jlrm.Queue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author jdr0887
 */
public class TestGATEService extends AbstractGATEService {

    private final Logger logger = LoggerFactory.getLogger(TestGATEService.class);

    public TestGATEService() {
        super();
    }

    @Override
    public Map<String, GlideinMetric> lookupMetrics() throws GATEException {
        return null;
    }

    @Override
    public Boolean isValid() throws GATEException {
        logger.info("ENTERING isValid()");
        return true;
    }

    @Override
    public void createGlidein(Queue queue) throws GATEException {
        logger.info("ENTERING createGlidein(Queue)");
        if (!getActiveQueues().contains(queue.getName())) {
            logger.warn("queue name is not in active queue list...see etc/org.renci.gate.plugin.killdevil.cfg");
            return;
        }
    }

    @Override
    public void deleteGlidein(Queue queue) throws GATEException {
        logger.info("ENTERING deleteGlidein(Queue)");

    }

    @Override
    public void deletePendingGlideins() throws GATEException {
    }

}
