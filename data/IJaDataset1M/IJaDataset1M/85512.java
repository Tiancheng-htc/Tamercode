package ejb.bprocess.util;

import javax.ejb.*;

/**
 * Created Jun 6, 2003 2:01:45 PM
 * Code generated by the Sun ONE Studio EJB Builder
 * @author vasu praveen
 */
public interface LocalDispatchEmail extends javax.ejb.EJBLocalObject {

    public boolean dispatchEmail(java.lang.String toEmailId, java.lang.String subject, java.lang.String content);
}