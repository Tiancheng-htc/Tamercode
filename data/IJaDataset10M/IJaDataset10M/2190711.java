package org.nescent.phenoscape.orb.persistentdomain;

import java.util.HashSet;
import java.util.Set;

/**
 * Publication generated by hbm2java
 */
public class Publication implements java.io.Serializable {

    private long publicationId;

    private String publicationTitle;

    private String publicationDoi;

    private String publicationJournal;

    private Set<TermPublication> termPublications = new HashSet<TermPublication>(0);

    public Publication() {
    }

    public Publication(long publicationId, String publicationTitle) {
        this.publicationId = publicationId;
        this.publicationTitle = publicationTitle;
    }

    public Publication(long publicationId, String publicationTitle, String publicationDoi, String publicationJournal, Set<TermPublication> termPublications) {
        this.publicationId = publicationId;
        this.publicationTitle = publicationTitle;
        this.publicationDoi = publicationDoi;
        this.publicationJournal = publicationJournal;
        this.termPublications = termPublications;
    }

    public long getPublicationId() {
        return this.publicationId;
    }

    public void setPublicationId(long publicationId) {
        this.publicationId = publicationId;
    }

    public String getPublicationTitle() {
        return this.publicationTitle;
    }

    public void setPublicationTitle(String publicationTitle) {
        this.publicationTitle = publicationTitle;
    }

    public String getPublicationDoi() {
        return this.publicationDoi;
    }

    public void setPublicationDoi(String publicationDoi) {
        this.publicationDoi = publicationDoi;
    }

    public String getPublicationJournal() {
        return this.publicationJournal;
    }

    public void setPublicationJournal(String publicationJournal) {
        this.publicationJournal = publicationJournal;
    }

    public Set<TermPublication> getTermPublications() {
        return this.termPublications;
    }

    public void setTermPublications(Set<TermPublication> termPublications) {
        this.termPublications = termPublications;
    }
}