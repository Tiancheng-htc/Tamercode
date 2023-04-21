package org.molgenis.auth.db;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;
import org.molgenis.framework.db.Database;
import org.molgenis.framework.db.QueryRule;
import org.molgenis.framework.db.QueryRule.Operator;
import org.molgenis.framework.db.DatabaseException;
import org.molgenis.framework.db.jdbc.JDBCConnectionHelper;
import org.molgenis.framework.db.jdbc.AbstractJDBCMapper;
import org.molgenis.framework.db.jdbc.JDBCMapper;
import org.molgenis.framework.db.jdbc.ColumnInfo.Type;
import org.molgenis.framework.db.jdbc.JDBCDatabase;
import org.molgenis.framework.db.QueryRule;
import org.molgenis.auth.MolgenisEntityMetaData;

public class MolgenisEntityMetaDataMapper extends AbstractJDBCMapper<MolgenisEntityMetaData> {

    Logger logger = Logger.getLogger(this.getClass());

    public MolgenisEntityMetaDataMapper(JDBCDatabase database) {
        super(database);
    }

    @Override
    public JDBCMapper<MolgenisEntityMetaData> getSuperTypeMapper() {
        return null;
    }

    public List<MolgenisEntityMetaData> createList(int size) {
        return new ArrayList<MolgenisEntityMetaData>(size);
    }

    public MolgenisEntityMetaData create() {
        return new MolgenisEntityMetaData();
    }

    public String createFindSql(QueryRule... rules) throws DatabaseException {
        return "SELECT MolgenisEntityMetaData.id" + ", MolgenisEntityMetaData.name" + ", MolgenisEntityMetaData.className" + " FROM MolgenisEntityMetaData ";
    }

    public String createCountSql(QueryRule... rules) throws DatabaseException {
        return "select count(*) as num_rows " + " FROM MolgenisEntityMetaData ";
    }

    @Override
    public String getTableFieldName(String fieldName) {
        if ("id".equalsIgnoreCase(fieldName)) return "MolgenisEntityMetaData.id";
        if ("name".equalsIgnoreCase(fieldName)) return "MolgenisEntityMetaData.name";
        if ("className".equalsIgnoreCase(fieldName)) return "MolgenisEntityMetaData.className";
        return fieldName;
    }

    @Override
    public Type getFieldType(String fieldName) {
        if ("id".equalsIgnoreCase(fieldName) || "molgenisEntityMetaData.id".equalsIgnoreCase(fieldName)) return Type.INT;
        if ("name".equalsIgnoreCase(fieldName) || "molgenisEntityMetaData.name".equalsIgnoreCase(fieldName)) return Type.STRING;
        if ("className".equalsIgnoreCase(fieldName) || "molgenisEntityMetaData.className".equalsIgnoreCase(fieldName)) return Type.STRING;
        return Type.STRING;
    }

    @Override
    public void resolveForeignKeys(List<MolgenisEntityMetaData> entities) throws DatabaseException, ParseException {
    }

    public void setAutogeneratedKey(int i, MolgenisEntityMetaData entity) {
        entity.setId(i);
    }

    @Override
    public QueryRule rewriteMrefRule(Database db, QueryRule rule) throws DatabaseException {
        {
            return rule;
        }
    }

    @Override
    public int executeAdd(List<MolgenisEntityMetaData> entities) throws SQLException, DatabaseException {
        Connection conn = getDatabase().getConnection();
        StringBuffer sql = new StringBuffer("INSERT INTO MolgenisEntityMetaData (name,className) VALUES ");
        {
            boolean first = true;
            for (MolgenisEntityMetaData e : entities) {
                if (first) first = false; else sql.append(",");
                sql.append("(");
                if (e.getName() != null) {
                    sql.append("'" + StringEscapeUtils.escapeSql(e.getName().toString()) + "'" + ",");
                } else {
                    sql.append("null,");
                }
                if (e.getClassName() != null) {
                    sql.append("'" + StringEscapeUtils.escapeSql(e.getClassName().toString()) + "'");
                } else {
                    sql.append("null");
                }
                sql.append(")");
            }
        }
        Statement stmt = conn.createStatement();
        try {
            int updatedRows = stmt.executeUpdate(sql.toString());
            getGeneratedKeys(entities, stmt, 0);
            return updatedRows;
        } finally {
            JDBCDatabase.closeStatement(stmt);
        }
    }

    @Override
    public int executeUpdate(List<MolgenisEntityMetaData> entities) throws SQLException, DatabaseException {
        Connection conn = getDatabase().getConnection();
        StringBuffer sql = new StringBuffer("INSERT INTO MolgenisEntityMetaData (id,name,className) VALUES ");
        boolean first = true;
        for (MolgenisEntityMetaData e : entities) {
            if (first) first = false; else sql.append(",");
            sql.append("(");
            if (e.getId() != null) sql.append("'" + StringEscapeUtils.escapeSql(e.getId().toString()) + "'" + ","); else sql.append("null,");
            if (e.getName() != null) sql.append("'" + StringEscapeUtils.escapeSql(e.getName().toString()) + "'" + ","); else sql.append("null,");
            if (e.getClassName() != null) sql.append("'" + StringEscapeUtils.escapeSql(e.getClassName().toString()) + "'"); else sql.append("null");
            sql.append(")");
        }
        sql.append(" ON DUPLICATE KEY UPDATE id=LAST_INSERT_ID(id),name=VALUES(name),className=VALUES(className)");
        Statement stmt = conn.createStatement();
        try {
            return stmt.executeUpdate(sql.toString()) / 2;
        } catch (SQLException sqlEx) {
            logger.debug("Query that caused exception:" + sql.toString());
            throw sqlEx;
        } finally {
            JDBCDatabase.closeStatement(stmt);
        }
    }

    @Override
    public int executeRemove(List<MolgenisEntityMetaData> entities) throws SQLException, DatabaseException {
        Connection conn = getDatabase().getConnection();
        StringBuffer sql = new StringBuffer("DELETE FROM MolgenisEntityMetaData WHERE ");
        {
            sql.append("id in (");
            boolean first = true;
            for (MolgenisEntityMetaData e : entities) {
                if (first) first = false; else sql.append(",");
                sql.append("'" + StringEscapeUtils.escapeSql(e.getId().toString()) + "'");
            }
            sql.append(") ");
        }
        Statement stmt = conn.createStatement();
        try {
            return stmt.executeUpdate(sql.toString());
        } finally {
            JDBCDatabase.closeStatement(stmt);
        }
    }

    public void prepareFileAttachements(List<MolgenisEntityMetaData> entities, File baseDir) throws IOException {
    }

    public boolean saveFileAttachements(List<MolgenisEntityMetaData> entities, File baseDir) throws IOException {
        return false;
    }

    public void mapMrefs(List<MolgenisEntityMetaData> entities) throws DatabaseException {
    }

    public void storeMrefs(List<MolgenisEntityMetaData> entities) throws DatabaseException, IOException {
    }

    public void removeMrefs(List<MolgenisEntityMetaData> entities) throws DatabaseException, IOException {
    }
}