package com.example.likai.getmyphonenumber;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by likai on 15/7/7.
 */
public class GetNum {
    public static List<PhoneInfo> lists = new ArrayList<PhoneInfo>();

    public static String getContact(Context context) {
        Cursor cursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        String contactNum;
        String contactName;
        while (cursor.moveToNext()) {
            contactName = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            contactNum = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            PhoneInfo phoneInfo = new PhoneInfo(contactName, contactNum);
            lists.add(phoneInfo);
            System.out.println(contactName);
            System.out.println(contactNum);
        }
        return null;
    }
}
