package com.gever.goa.user.dao;

import com.gever.vo.VOInterface;
import com.gever.exception.DefaultException;
import java.util.List;

/**
 * Comment block is generated by javaClassComment.vsl
 *
 * <p>Title: </p>
 * <p>Description: TUser ??</p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: ${config.company}</p>
 * @Author:		 ${config.author}
 * @Version: ${config.version}
 *
 */
public interface UserDao {

    /** delete
     * @param aryPk   primary key array
     * @param vo 	     current vo object
     * @return        update how many rows,failed to -1
     * @throws        DefaultException
     */
    public int delBySelect(String[] aryPk, VOInterface vo) throws DefaultException;

    /**
     * get the sql for page split
     * @return sql clause
     */
    public String getPageSql();

    /** insert
     * @param vo   current vo object
     * @return     number of inserted rows,failed to -1
     * @throws     DefaultException
     */
    public int insert(VOInterface vo) throws DefaultException;

    /**
     * update
     * @param vo  current vo object
     * @return    number of updated rows,failed to -1
     * @throws    DefaultException
     */
    public int update(VOInterface vo) throws DefaultException;

    /**
     * query all
     * @param vo  current vo object
     * @return    all rows of table [qiqu_user]
     * @throws    DefaultException
     */
    public List queryAll(VOInterface vo) throws DefaultException;

    /**
     * 
     * @param vo     ��ǰvo����
     * @param start  ��ʼ
     * @param        howMany ���ٱ�����
     * @return       ������������б�
     * @throws       DefaultException
     */
    public List queryByPage(VOInterface vo, long start, long howMany) throws DefaultException;

    /**
     * ͳ�Ƶ�ǰ�����
     * @param vo ��ǰvo����
     * @return ͳ������
     * @throws DefaultException
     */
    public long queryByCount(VOInterface vo) throws DefaultException;

    /**
     * ����ѡ�������
     * @param aryPk ��������
     * @param vo ��ǰVO����
     * @return ���Ƴɹ����ٱ�,-1Ϊʧ��
     * @throws DefaultException
     */
    public int copy(String[] keyValue, VOInterface vo) throws DefaultException;

    public List getTreeData() throws DefaultException;

    public List getTreeData(String nodedid) throws DefaultException;
}