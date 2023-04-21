package org.jude.client.content;

import org.jude.client.content.*;
import org.jude.client.content.autogenerated.*;
import java.awt.datatransfer.*;
import java.util.*;

/**
 * <p> Event fired from Content when there is a change.
 * <p>  !! to update to new design
 *
 * @author $Author: zanibonim $   
 * @version $Revision: 1.2 $   
 */
public class ContentEvent extends EventObject {

    /**
     * @param source 
     * @param id the event type identifier: <ul>
     *             <li> CONTENT_CHANGE if there was an undefinite change in the content
     *             <li> ADD_OR_REMOVE_CHANGE if the there was an ADD or REMOVE of a SubContent
     *        </ul>
     * @param slot the slot added, null if the event doesn't regard add or remove
     */
    public ContentEvent(Content source, int id) {
        super(source);
        this.id = id;
    }

    /**
     * @return the Content that generate the event
     */
    public Object getSource() {
        return super.getSource();
    }

    /**
     * @return the identifier
     */
    public int getId() {
        return id;
    }

    protected int id;

    /**
     * A change of the "direct" state of the Content
     */
    public static int DIRECT_CONTENT_CHANGE = 3;

    /**
     * A change of another direct/indirect sub content with a "indirect" propagation to this Content
     */
    public static int SUBCONTENT_CHANGE = 4;

    /**
        * A sub content was removed or added directly to this Content.
        * @see CompoundContentEvent
        */
    public static int ADD_OR_REMOVE_CHANGE = 5;
}

;