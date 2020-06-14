package domainhealth.core.jmx;

import static domainhealth.core.jmx.WebLogicMBeanPropConstants.NAME;

import javax.management.ObjectName;

public class LocalServerRuntimeServiceMBeanConnection extends ServerRuntimeServiceMBeanConnection {

	public LocalServerRuntimeServiceMBeanConnection() throws WebLogicMBeanException {
		try {
			conn = getCachedLocalConn();
			ObjectName serverRuntime = this.getServerRuntime();
			connectionDescription = "LocalMBeanServer:" + getTextAttr(serverRuntime, NAME);
			jmxConnector = null;
		} catch (Exception e) {
			throw new WebLogicMBeanException(e.toString(), e);
		}
	}
	
	public void close() {
		// nop
	}

}
