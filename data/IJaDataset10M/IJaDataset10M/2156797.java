package saims.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import saims.dao.Iteminlist;
import saims.dao.User;
import saims.dao.map.DailyProfitMapBuilder;
import org.apache.torque.util.Criteria;
import org.zkoss.zul.Label;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Mon Feb 08 11:21:11 PST 2010]
 *
 *  You should add additional methods to this class to meet the
 *  application requirements.  This class will only be generated as
 *  long as it does not already exist in the output directory.
 */
public class DailyProfitPeer extends saims.dao.BaseDailyProfitPeer {

    public static ArrayList<DailyProfit> generateReport(String year, int month, String day) {
        try {
            Criteria criteria = new Criteria();
            criteria.add(DailyProfitPeer.PROFITYEAR, Integer.parseInt(year));
            criteria.add(DailyProfitPeer.PROFITMONTH, month);
            criteria.add(DailyProfitPeer.PROFITDAY, Integer.parseInt(day));
            List tempStore = DailyProfitPeer.doSelect(criteria);
            ArrayList<DailyProfit> dailyProfit = new ArrayList<DailyProfit>();
            for (int i = 0; i < tempStore.size(); i++) dailyProfit.add((DailyProfit) tempStore.get(i));
            return dailyProfit;
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean addItemSold(String userName, Double profit, String itemName, String quantity) {
        try {
            User user = new User();
            Iteminlist item = new Iteminlist();
            String type = user.getUserType(userName);
            Double price = item.getPrice(itemName);
            Date date = new Date();
            String[] items = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            String month = (String) (date.toString()).subSequence(4, 7);
            int Month = 0;
            for (int i = 0; i < items.length; i++) {
                if (items[i].compareTo(month) == 0) {
                    Month = i + 1;
                    break;
                }
            }
            String day = (String) (date.toString()).subSequence(8, 10);
            int Day = Integer.parseInt(day);
            String year = (String) (date.toString()).subSequence(((date.toString()).length()) - 4, (date.toString()).length());
            int Year = Integer.parseInt(year);
            Criteria criteria = new Criteria();
            criteria.add(DailyProfitPeer.NAMEOFTHEITEM, itemName);
            criteria.add(DailyProfitPeer.ITEMPRICE, price);
            criteria.add(DailyProfitPeer.PROFITDAY, Day);
            criteria.add(DailyProfitPeer.PROFITMONTH, Month);
            criteria.add(DailyProfitPeer.PROFITYEAR, Year);
            criteria.add(DailyProfitPeer.QUANTITYSOLD, quantity);
            criteria.add(DailyProfitPeer.SELLERNAME, userName);
            criteria.add(DailyProfitPeer.SELLERTYPE, type);
            criteria.add(DailyProfitPeer.TOTALPROFIT, profit);
            DailyProfitPeer.doInsert(criteria);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}