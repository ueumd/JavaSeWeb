package com.daysun.javase.javaenum.mapset;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/9/26.
 */
enum FontConstant {
    Plain, Bold, Italilc, Hello
}

public class EnumSetDemo {
    public static void main(String[] args) {
        //   创建一个最初包含指定元素的枚举 set。
        EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Bold, FontConstant.Plain);
        showEnumSet(enumSet);

        // 创建一个其元素类型与指定枚举 set 相同的枚举 set，最初包含指定 set 中所不 包含的此类型的所有元素。
        showEnumSet(EnumSet.complementOf(enumSet));
    }

    public static void showEnumSet(EnumSet<FontConstant> enumSet) {
        for (Iterator<FontConstant> iter = enumSet.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }

    }
}
